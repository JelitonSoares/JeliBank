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
                    
                    1 - Exibir Ficha
                    2 - Consultar Saldo
                    3 - Receber
                    4 - Transferir
                    5 - Sair""");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    newUser.displayTechnicalSheet();
                    break;
                case 2:
                    System.out.println("""
                            Saldo Atual: %.2f
                            """.formatted(newUser.getSale()));
                    break;
                case 3:
                    String senha = newUser.pegaSenha();
                    double valor = newUser.pegaValor();
                    newUser.receiveValue(valor, senha);
                    break;
                case 4:
                    String password = newUser.pegaSenha();
                    double value = newUser.pegaValor();
                    newUser.trasferValue(value, password);
                    break;
                case 5:
                    System.out.println("Obrigado por usar o JeliBank!!");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida!!");
            }
        }

    }
}
