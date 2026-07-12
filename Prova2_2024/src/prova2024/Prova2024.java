package prova2024;

public class Prova2024 {
    public static void main(String[] args) {
        ContaPoupanca n = new ContaPoupanca(123, 2000);
        
        System.out.println(n.getSalto());
        System.out.println(n.calculaRendimentoMensal(10));
        n.sacar(200);
        n.depositar(1000);
        System.out.println(n.getSalto());
        System.out.println(n.calculaRendimentoMensal(10));
    }
    
}
