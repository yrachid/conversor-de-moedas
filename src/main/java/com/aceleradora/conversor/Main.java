package com.aceleradora.conversor;

import com.aceleradora.conversor.entrada.Interpretador;
import com.aceleradora.conversor.entrada.Tokenizador;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitoraDeEntrada = new Scanner(System.in);

        try {
            Conversor conversor = new Conversor(new Interpretador(new Tokenizador()));

            System.out.print("> ");
            String entrada = leitoraDeEntrada.nextLine();

            System.out.println(conversor.converter(entrada));

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }
}
