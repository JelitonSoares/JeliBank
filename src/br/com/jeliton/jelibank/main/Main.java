package br.com.jeliton.jelibank.main;

import br.com.jeliton.jelibank.models.User;

import java.util.Scanner;


public class Main {
    public static void main (String [] args) {
        User newUser = new User("Jeliton Soares", "Poupança", 1400, "12345");

        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual sua senha ? ");
        String password = scanner.nextLine();
        System.out.println("Qual valor que você deseja Transeferir ? ");
        double value = scanner.nextDouble();

        newUser.completeTransfer(value, password);
    }
}
