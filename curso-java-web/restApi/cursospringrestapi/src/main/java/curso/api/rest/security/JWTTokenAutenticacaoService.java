package curso.api.rest.security;

import curso.api.rest.ApplicationContextLoad;
import curso.api.rest.model.Usuario;
import curso.api.rest.repository.UsuarioRepository;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;

@Service
@Component
public class JWTTokenAutenticacaoService {

    // Tempo de validade do token
    private static final long EXPIRATION_TIME = 172800000;

    // Uma senha unica para compor a autenticação e ajudar na segurança
    private static final String SECRET = "SenhaExtremamenteSecreta";

    // Prefixo padrao de TOKEN
    private static final String TOKEN_PREFIX = "Bearer";

    // Identificação do cabecalho do TOKEN
    private static final String HEADER_STRING = "Authorization";

    // Gerando Token de autenticacao e adicionando o cabeçalho e resposta http;
    public void addAuthentication(HttpServletResponse response, String username) throws IOException {

        // Montagem do Token
        String JWT = Jwts.builder() // Chama o gerador de token
                .setSubject(username) // Adiciona o usuario
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME)) // Tempo de expiração
                .signWith(SignatureAlgorithm.HS512, SECRET).compact(); // Compactação e algoritmo de geracao de senha

        // Junta o token com o prefixo
        String token = TOKEN_PREFIX + " " + JWT;

        //Adiciona o cabeçalho http
        response.addHeader(HEADER_STRING, token);

        // Escreve Token como resposta no corpo do http
        response.getWriter().write("{\"Authorization\": \""+token+"\"}");
    }

    // Retorna o usuario validado com o token e caso nao seja validado retorna null
    public Authentication getAuthentication(HttpServletRequest request) {

        // Pega o token enviado no cabeçalho http
        String token = request.getHeader(HEADER_STRING);

        if(token != null) {

            // Faz a validacao do token do usuario na requisicao
            String user = Jwts.parser().setSigningKey(SECRET)
                    .parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
                    .getBody().getSubject(); // Retorna o usuario

            if(user != null) {

                Usuario usuario = ApplicationContextLoad.getApplicationContext()
                        .getBean(UsuarioRepository.class).findUserByLogin(user);

                if(usuario != null) {

                    //Retornar o usuario logado
                    return new UsernamePasswordAuthenticationToken(
                            usuario.getLogin(),
                            usuario.getSenha(),
                            usuario.getAuthorities());
                }
            }
        }

        return null; // Nao autorizado
    }

}
