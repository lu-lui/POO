package prova2024;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(int numeroConta, double saldo) {
        super(numeroConta, saldo);
    }
    
    public double calculaRendimentoMensal(double percentual){
        return super.getSalto() * (1 + percentual / 100);
    }
}
