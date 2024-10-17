package com.example.adventure_works_search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootTest
@SpringBootApplication(scanBasePackageClasses = AdventureWorksSearchApplicationTests.class, scanBasePackages = "com.example.adventure_works_search")
class AdventureWorksSearchApplicationTests {

	public static void main(String[] args) {
        SpringApplication.run(AdventureWorksSearchApplicationTests.class, args);
    }

}
