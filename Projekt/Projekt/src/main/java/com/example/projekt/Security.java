package com.example.projekt;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class Security extends WebSecurityConfigurerAdapter {
@Autowired
    private  UserDetailsServiceImp userDetailsService;

    public Security(UserDetailsServiceImp userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public Security(boolean disableDefaults, UserDetailsServiceImp userDetailsService) {
        super(disableDefaults);
        this.userDetailsService = userDetailsService;
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
       // UserDetails userDetails = User.withDefaultPasswordEncoder()
           //     .username("admin")
          //      .password ("admin")
          //      .roles("admin")
          //      .build();
       // return new InMemoryUserDetailsManager(userDetails);
        auth.userDetailsService()
    }

    @Override


    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/Strona").hasRole("admin")
                .and()
                .authorizeRequests().antMatchers("/console/**").permitAll()
                        .and().formLogin()
                        .and().logout().permitAll();

        http.csrf().disable();
        http.headers().frameOptions().disable();
    }



    }


