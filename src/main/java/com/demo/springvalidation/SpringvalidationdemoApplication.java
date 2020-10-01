/*
 *
 */
package com.demo.springvalidation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * The Class SpringvalidationdemoApplication.
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.demo.springvalidation.repository" })
@EntityScan(basePackages = { "com.demo.springvalidation.domain" })
@ComponentScan({ "com.demo.springvalidation" })
public class SpringvalidationdemoApplication {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
	SpringApplication.run(SpringvalidationdemoApplication.class, args);
    }

}
