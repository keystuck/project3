package com.udacity.course3.reviews;

import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class ReviewsApplication {

	public static void main(String[] args) {

		SpringApplication.run(ReviewsApplication.class, args);
	}

}