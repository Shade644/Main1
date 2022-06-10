package com.example.projekt;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class userDetailsServiceImp  implements userDetailsService {

    @Override
    public UserDetails loadUserByUsername(String a) throws UsernameNotFoundException{
        return  null;
    }
}
