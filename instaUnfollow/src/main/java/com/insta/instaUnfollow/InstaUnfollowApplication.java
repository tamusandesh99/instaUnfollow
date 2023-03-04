package com.insta.instaUnfollow;

import com.insta.instaUnfollow.user.UserAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@SpringBootApplication
@RestController
public class InstaUnfollowApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstaUnfollowApplication.class, args);
	}
}
