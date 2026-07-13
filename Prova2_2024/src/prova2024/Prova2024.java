package prova2024;

public class Prova2024 {
    public static void main(String[] args) {
        ContaPoupanca conta = new ContaPoupanca(123, 2000);
        
        try {
            conta.sacar(1000);
        }
        catch(SaldoInsuficiente si){
            System.out.println(si.getMessage());
        }
    }    
}