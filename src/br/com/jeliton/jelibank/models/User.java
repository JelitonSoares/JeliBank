package br.com.jeliton.jelibank.models;

import java.util.Scanner;

public class User {
    private String userName;
    private String accountType;
    private double sale;
    private String password;

    public User (String userName, String accountType, double sale, String password) {
        this.userName = userName;
        this.accountType = accountType;
        this.sale = sale;
        this.password = password;
    }

    Scanner scanner = new Scanner(System.in);

    public void displayTechnicalSheet () {
        System.out.println("""
                ***********************
                Ficha Tecnica do Cliente:
                Nome: %s
                Tipo de Conta: %s
                Saldo Inicial: %.2f
                ***********************
                """.formatted(userName, accountType, sale));
    }

    public void viewSale () {
        System.out.println("""
                Saldo Atual: %.2f""".formatted(sale));
    }

    private boolean confirmPassword () {
        System.out.println("Digite sua senha: ");
        String password = scanner.nextLine();
        return password.equals(this.password);
    }
    public  void receiveValue() {
        System.out.println("Digite o valor: ");
        double value = scanner.nextDouble();
        confirmPassword();
        if (confirmPassword()) {
            sale += value;
            System.out.println("""
                    Deposito Concluido
                    Novo Saldo: %.2f""".formatted(sale));
        } else {
            System.out.println("Senha incorreta!!");
        }
    }

    public void transferValue() {
        System.out.println("Digite o valor: ");
        double value = scanner.nextDouble();
        if (value <= sale) {
            confirmPassword();
            if (confirmPassword()) {
                sale -= value;
                System.out.println("""
                        Transferencia Concluída!!
                        Saldo atual: %.2f""".formatted(sale));
            } else {
                System.out.println("Senha incorreta!!");
            }
        } else {
            System.out.println("Saldo insuficiente!!");
        }
    }

    }
