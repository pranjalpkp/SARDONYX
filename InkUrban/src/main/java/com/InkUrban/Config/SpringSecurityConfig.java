package com.InkUrban.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SpringSecurityConfig {
	@Autowired
	AuthenticationSuccessHandler successHandler;
	
	@Bean
    public static PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
     
                .authorizeHttpRequests((authorize) ->
                authorize.requestMatchers("/", "/index").permitAll()
                .requestMatchers("/admin_dashboardUrl","/view/**").hasAnyRole("ADMIN")
                .requestMatchers("/vbps_dashboardUrl").hasAnyRole("VBPS")
                .anyRequest().permitAll()
                )
                .formLogin(
                        form -> form
                                .loginPage("/login")
                                .loginProcessingUrl("/login")
                                .failureUrl("/login-error")
                                .successHandler(successHandler)
                                .permitAll()
                ).logout(
                        logout -> logout
                                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                                .permitAll()
                );
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService(){

        UserDetails admin = User.builder()
                .username("pranjalpkp")
                .password(passwordEncoder().encode("Piku1122"))
                .roles("ADMIN")
                .build();
        UserDetails vbps = User.builder()
                .username("vbps")
                .password(passwordEncoder().encode("vbps"))
                .roles("VBPS")
                .build();

        return new InMemoryUserDetailsManager(admin,vbps);
    }

}
