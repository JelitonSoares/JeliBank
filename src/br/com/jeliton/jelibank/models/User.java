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

    public String getUserName () {
        return userName;
    }

    public String getAccountType () {
        return accountType;
    }

    public double getSale () {
        return  sale;
    }

    private double completeReceive(double value) {
            sale += value;
            return sale;
    }

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
    public  void receiveValue(double value, String password) {
        if (password.equals(this.password)) {
            double newSale = completeReceive(value);
            System.out.println(String.format("""
                    Valor Recebido!!
                    Novo Saldo: %.2f""", newSale));
        } else {
            System.out.println("Senha inválida!!");
        }
    }

    public void trasferValue (double value, String password) {
        if (password.equals(this.password)) {
            double newSale = completeTransfer(value);
            System.out.println("""
                    Transferência Concluida!!
                    Novo saldo: %.2f""".formatted(newSale));
        } else {
            System.out.println("Senha Inválida!!");

        }
    }

    public double completeTransfer (double value) {
        sale -= value;
        return sale;
    }

    Scanner scanner = new Scanner(System.in);
    public String pegaSenha () {
        System.out.println("Digite a sua senha: ");
        String senha = scanner.nextLine();
        return senha;
    }

    public double pegaValor () {
        System.out.println("Digite o valor: ");
        double valor = scanner.nextDouble();
        return valor;
    }



}
