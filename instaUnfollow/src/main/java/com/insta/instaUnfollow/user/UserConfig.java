package com.insta.instaUnfollow.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return args ->{
            UserAccount john = new UserAccount("JohnDoe", "password");
            UserAccount Alex = new UserAccount("AlexDoe", "password");
            repository.saveAll(
                    List.of(john,Alex)
            );
        };

    }
}
