package sistemabanco;

public class Conta {
    int numero;
    String dono;
    double saldo;
    double limite = 1000;
    
    boolean saca(double valor){
        if(this.limite < valor){
            System.out.println("Valor excede o limite de saque. \nO limite e de R$" + limite);
            return false;
        }
        
        if(this.saldo < valor){
            System.out.println("Saldo insuficiente");
            return false;
        }else{
            this.saldo = this.saldo - valor;
            return true;
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
}
