package br.com.jeliton.jelibank.main;

import br.com.jeliton.jelibank.models.User;

import java.util.Scanner;


public class Main {
    public static void main (String [] args) {
        boolean sair = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao JeliBank!! Primeiramente faça o seu cadastro!!");
        System.out.println("Digite seu nome: ");
        String name = scanner.nextLine();
        System.out.println("Digite o tipo de conta: ");
        String account = scanner.nextLine();
        System.out.println("Cadastre a senha: ");
        String firstPassword = scanner.nextLine();
        System.out.println("Digite um valor para realizar o depósito inicial: ");
        double firstSale = scanner.nextDouble();


        User newUser = new User(name, account, firstSale,firstPassword);


        while (!sair) {
            System.out.println("""
                    Operações:
                    
                    1 - Exibir Fica Tecnica
                    2 - Consultar Saldo
                    3 - Depositar
                    4 - Transferir
                    5 - Sair""");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    newUser.displayTechnicalSheet();
                    break;
                case 2:
                    newUser.viewSale();
                    break;
                case 3:
                    newUser.receiveValue();
                    break;
                case 4:
                    newUser.transferValue();
                    break;
                case 5:
                    System.out.println("Obrigado por usar o JeliBank! Volte sempre ;)");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção Inválida!!");
            }

        }

    }
}
