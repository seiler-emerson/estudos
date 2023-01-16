package curso.api.rest.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

//Filtro onde todas as requisicoes sera capturadas para autenticar
public class JWTAPIAutenticacaoFilter extends GenericFilterBean {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        //Estabelece a autenticacao para a requisicao
        Authentication authentication = new JWTTokenAutenticacaoService()
                .getAuthentication((HttpServletRequest) request);

        // Coloca o processo de autenticacao no spring security
        SecurityContextHolder.getContext().setAuthentication(authentication);

        //Continua o processo
        chain.doFilter(request, response);

    }
}
