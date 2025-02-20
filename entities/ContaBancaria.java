package entities;

public class ContaBancaria {
    private int numero;
    private double saldo;
    private double valor;

    //Criacao padrao dos contrutores
    public ContaBancaria() {
    }

    public ContaBancaria(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    //Metodos de transacao bancaria
    public double sacar(double valor){
        if (valor > 0 && valor < saldo){
            return saldo -= valor;
        } else {
            System.out.println("Saque indisponivel");
        }
        return saldo ;
    }

    public double depositar(double valor){
        if (valor > 0 ){
            return saldo += valor;
        }
        System.out.println("Valor invalido");
        return  saldo;
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferencia foi realizada com sucesso" );
        } else {
            System.out.println("Saldo insuficinte ou valor invalido");
        }
    }

    public String exibeDados(){
        return "Numero : " + numero + " , " + " saldo: " + saldo;
    }

    //Para baixo comeca os metodos acessores

    public double getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
