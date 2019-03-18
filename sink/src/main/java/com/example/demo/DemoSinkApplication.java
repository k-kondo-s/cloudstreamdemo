package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
public class DemoSinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSinkApplication.class, args);
	}

	@StreamListener(Sink.INPUT)
	public void print(String tweet){
		System.out.println("Received " + tweet);
	}

	public static class Tweet {
		public String text;
	}

}
