package com.aceleradora.conversor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        Conversor conversor = new Conversor();
        Scanner leitor = new Scanner(System.in);

        System.out.print("> ");

        String entrada = leitor.nextLine();

        String resultado = conversor.converter(entrada);

        System.out.println(resultado);






    }
}

