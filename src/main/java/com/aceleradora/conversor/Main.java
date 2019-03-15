package com.aceleradora.conversor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitoraDeEntrada = new Scanner(System.in);

        System.out.print("> ");
        String entrada = leitoraDeEntrada.nextLine();

        System.out.println(entrada);
    }
}
