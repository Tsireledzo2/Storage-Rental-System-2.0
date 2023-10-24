//package za.ac.cput.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@EnableWebSecurity
//@Configuration
//public class SecurityConfig {
//
//    @Autowired
//    private UserDetailsService uds;
//
//    @Autowired
//    private BCryptPasswordEncoder encoder;
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//http.cors().and();
//        http.authorizeHttpRequests()
//                .requestMatchers("/getStoragesBySize/{description}","/register","/saveUser","/driver/*","/createEmployee").permitAll()
//                .requestMatchers("/Booking").authenticated()
//                .requestMatchers("/adminHome").authenticated()
//                .requestMatchers("/driverHome").authenticated()
//                .requestMatchers("/admin").hasAuthority("Admin")
//                .requestMatchers("/customer").hasAuthority("Customer")
//                .requestMatchers("/driver").hasAuthority("Driver")
//                .requestMatchers("/common").hasAnyAuthority("Employeee", "Manager", "Admin")
//                .anyRequest().authenticated()
//
//                .and()
//                .logout()
//                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//
//                .and()
//                .exceptionHandling()
//                .accessDeniedPage("/accessDenied")
//
//                .and()
//                .authenticationProvider(authenticationProvider());
//
//        return http.build();
//
//    }
//
//    @Bean
//    public AuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
//        authenticationProvider.setUserDetailsService(uds);
//        authenticationProvider.setPasswordEncoder(encoder);
//        return authenticationProvider;
//    }
//}