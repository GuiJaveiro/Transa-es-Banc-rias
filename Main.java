import entities.ContaBancaria;

public class Main {
    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria();
        ContaBancaria contaBancaria2 = new ContaBancaria();

        contaBancaria.depositar(800);
       /* contaBancaria.sacar(250);
        contaBancaria.sacar(50);*/
        contaBancaria.setNumero(10011);
        System.out.println(contaBancaria.exibeDados());

      System.out.println("**** Transferencia ****");


       contaBancaria.transferir(contaBancaria2,400);
        System.out.println("o saldo da conta destino e " + contaBancaria2.getSaldo());
        System.out.println(contaBancaria2.exibeDados());
        System.out.println("Saldo da conta 1 e : " + contaBancaria.getSaldo());




    }
}