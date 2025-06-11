package com.example.posttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class PosttestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosttestApplication.class, args);
	}

	@GetMapping("/books")
	public String getBooks(@RequestParam String book){
		return String.format("Buku ini berjudul: %s", book);
	}

	@PostMapping("/books")
	public String postBooks(@RequestBody BookRequest request){
		return String.format("Buku %s telah ditambahkan", request.getBook());
	}

	@PutMapping("/books/001")
	public String putBooks(@RequestBody BookRequest request){
		return String.format("Buku %s dengan telah diperbarui", request.getBook());
	}

	@DeleteMapping("/books/001")
	public String deleteBooks(@RequestParam String book){
		return String.format("Buku %s telah dihapus", book);
	}

}
