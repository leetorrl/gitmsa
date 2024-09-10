package com.example.ex04;

import com.example.ex04.User.BookRepository;
import com.example.ex04.User.user;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class Ex04ApplicationTests {

	@Autowired
	BookRepository bookRepository;

	@Test
	void contextLoads() {
		System.out.println("실행");
		//save = insert실행..
		user u = user.builder()
		.name("오길동").age(520).email("aaa@gmail.com")
				.password("1234")
				.wdate(LocalDateTime.now())
				.build();

		bookRepository.save(u);
	}

	@Test
	void selectTset(){
		bookRepository.findAll()
				.stream()
				.forEach(System.out::println);
	}

}
