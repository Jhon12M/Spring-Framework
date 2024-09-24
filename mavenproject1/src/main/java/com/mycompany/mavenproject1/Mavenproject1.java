/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Netec
 */
@SpringBootApplication
public class Mavenproject1 implements CommandLineRunner{

    public static void main(String[] args) {
        System.out.println("Bienvenido!");
        SpringApplication.run(Mavenproject1.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       System.out.println("Bienvenido a mi aplicativo con Sprint Boot");
    }
}
