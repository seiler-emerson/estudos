package curso.api.rest.security;

import curso.api.rest.service.ImplementacaoUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

//Mapeia URL, enderecos, aturiza ou bloqueia acesso a URL
@Configuration
@EnableWebSecurity
public class WebConfigSecurity extends WebSecurityConfigurerAdapter {

    @Autowired
    private ImplementacaoUserDetailsService implementacaoUserDetailsService;

    // Configura as solicitacoes de acesso por http
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Ativando a protecao contra usuarios que nao estao validados por token
        http.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())

        // Ativando a permissao para acesso a pagina inciial do sistema
                .disable().authorizeRequests().antMatchers("/").permitAll().antMatchers("/index").permitAll()

        // URL de Logout - Redireciona após o user deslogar do sistema
                .anyRequest().authenticated().and().logout().logoutSuccessUrl("/index")

        // Mapeia URL de Logout e invalida o usuario
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))

        // Filtra as requisições de login para autenticaçao
                .and().addFilterBefore(new JWTLoginFilter("/login", authenticationManager()),
                        UsernamePasswordAuthenticationFilter.class)

        // Filtra demais requisções para verificar a presença do TOKEN JWT
                .addFilterBefore(new JWTAPIAutenticacaoFilter(), UsernamePasswordAuthenticationFilter.class);

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        //Service que ira consultar o usuario no banco de dados
        auth.userDetailsService(implementacaoUserDetailsService)
                // Padrao de codificação de senha do usuario
                .passwordEncoder(new BCryptPasswordEncoder());
    }


}
