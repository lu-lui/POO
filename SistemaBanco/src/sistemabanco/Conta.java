package sistemabanco;

public class Conta {
    int numero;
    String dono;
    double saldo;
    double limite = 1000;
    
    public Conta(int n, String d, double s, double l){
        this.numero = n;
        this.dono = d;
        this.saldo = s;
        this.limite = l;
    }
    
    void saca(double valor){
        if(this.limite < valor){
            System.out.println("Valor excede o limite de saque. \nO limite e de R$" + limite);
        }
        
        if(this.saldo < valor){
            System.out.println("Saldo insuficiente");
        }else{
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado com sucesso!");
        }
    }
    
    void deposita(double quantidade){
        this.saldo += quantidade;
    }
      
    void imprimeSaldo(){
        System.out.println("Saldo atual: " + this.saldo);
    }
    
    void imprimeDados(){
        System.out.println("Numero: " + this.numero);
        System.out.println("Nome: " + this.dono);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
    }
    
    void transfere(Conta destino, double valor){
        if(valor <= this.limite && valor <= saldo){
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferência realizada com sucesso!");
        }else {
            System.out.println("A transferência não foi realizada. Verifique seu saldo ou limite e tente novamente.");
        }         
    }
}
