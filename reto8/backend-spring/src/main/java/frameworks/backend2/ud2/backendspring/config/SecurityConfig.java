package frameworks.backend2.ud2.backendspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    @SuppressWarnings({"removal", "deprecation"})
    SecurityFilterChain filterChain(HttpSecurity http) {
		try {
			http.authorizeRequests(
					request -> request.requestMatchers("/restringido**")
									  .authenticated()
									  .requestMatchers("/**", "/clientes**", "/animales**")
									  .permitAll()
			)
			.httpBasic(Customizer.withDefaults())
			.csrf(csrf -> csrf.disable());
			return http.build();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
    
    @Bean
    UserDetailsService testUser(PasswordEncoder passwordEncoder) {
    	User.UserBuilder user = User.builder();
    	UserDetails userPrueba = user.username("ainara")
    								 .password(passwordEncoder.encode("1234"))
    								 .roles()
    								 .build();	
    	return new InMemoryUserDetailsManager(userPrueba);
    }
    
    @Bean
    PasswordEncoder passwordEncoder() {
    	return new BCryptPasswordEncoder();
    }
}
