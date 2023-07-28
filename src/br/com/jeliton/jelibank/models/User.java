package br.com.jeliton.jelibank.models;

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

    public double getSale () {
        return sale;
    }

    private double receiveValue (double value) {
            sale += value;
            return sale;
    }

    public  void completeTransfer (double value, String password) {
        if (password.equals(this.password)) {
            double newSale = receiveValue(value);
            System.out.println(String.format("""
                    Transferencia Concluída!!
                    Novo Saldo: %.2f""", newSale));
        } else {
            System.out.println("Senha inválida!!");
        }
    }


}
