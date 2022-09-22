package net.seyfe.GitHubCICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubCicdApplication {

	@GetMapping("/greeting")
	public String welcome(){
		return "Welcome to Seyfe's docker";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitHubCicdApplication.class, args);
	}

}
