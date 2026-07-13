package prova2024;

public class ContaBancaria implements TransacaoBancaria{
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor){
        if(valor > saldo) {
            throw new SaldoInsuficiente("Erro. Saldo insuficiente");
        } else {
            saldo -= valor;
        }
    }
    public double getSaldo(){
        return saldo;
    }
}
