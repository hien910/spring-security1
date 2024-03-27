package com.example.springsecurity1.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(
        securedEnabled = true,
        jsr250Enabled = true
)
@RequiredArgsConstructor
public class SecurityConfig {
    private final PasswordEncoder passwordEncoder;
    private final CustomUserDetailService customUserDetailService;

    @Bean
    public AuthenticationProvider authenticationProvider (){
        DaoAuthenticationProvider provider  = new DaoAuthenticationProvider();
        provider.setPasswordEncoder(passwordEncoder);
        provider.setUserDetailsService(customUserDetailService);
        return provider;
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(authorizeRequests -> {
                    authorizeRequests.anyRequest().permitAll();
//                            .requestMatchers("/").permitAll()
//                            .requestMatchers("/sale").hasRole("SALE")
//                            .requestMatchers("/author").hasRole("AUTHOR")
//                            .requestMatchers("/user").hasRole("USER")
//                            .requestMatchers("/admin").hasRole("ADMIN")
//                            .requestMatchers("/dashboard").hasAnyRole("ADMIN","SALE")
//                            .requestMatchers("GET", "POST","PUT","/admin/user/**").hasAnyRole("ADMIN")
//                            .requestMatchers("GET", "POST","PUT","DELETE","/category/**").hasAnyRole("ADMIN", "SALE")
//                            .requestMatchers("GET", "POST","PUT","DELETE","/product/**").hasAnyRole("ADMIN", "SALE")
//                            .requestMatchers("GET", "POST","PUT","DELETE","/brand/**").hasAnyRole("ADMIN", "SALE")
//                            .requestMatchers("GET", "POST","PUT","/order/**").hasAnyRole("ADMIN", "SALE")
//                            .requestMatchers("GET", "POST","PUT","DELETE","/blog/**").hasAnyRole("ADMIN", "SALE","AUTHOR")
//                            .requestMatchers("GET","PUT","/profile/**").hasRole("USER")
//                            .anyRequest().authenticated();

                }
        );

        // Cấu hình form login
        httpSecurity.formLogin(formLogin -> {
            formLogin.loginPage("/login");
            formLogin.loginProcessingUrl("/login-handle");
            formLogin.usernameParameter("name");
            formLogin.passwordParameter("pass");
            formLogin.defaultSuccessUrl("/", true); // Nếu đăng nhập thành công thì chuyển hướng về trang chủ
            formLogin.permitAll(); // Cho phép tất cả mọi người truy cập vào form login mà không cần xác thực
        });

        // Cấu hình logout
        httpSecurity.logout(logout -> {
            logout.logoutSuccessUrl("/"); // Nếu logout thành công thì chuyển hướng về trang chủ
            logout.deleteCookies("JSESSIONID"); // Xóa cookie
//            logout.invalidateHttpSession(true); // Hủy session
//            logout.clearAuthentication(true); // Xóa thông tin đăng nhập của user hiện tại trong SecurityContext
            logout.permitAll(); // Cho phép tất cả mọi người truy cập vào logout mà không cần xác thực
        });


        return httpSecurity.build();
    }
}
