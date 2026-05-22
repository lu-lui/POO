package sistemabanco;

public class Conta {
    private int codigo;
    private String dono;
    private double saldo;
    private String nomeBanco;
    private double limite = 1000;
    
    public Conta(int c, String d, double s, double l, String b){
        this.codigo = c;
        this.dono = d;
        this.saldo = s;
        this.nomeBanco = b;
        this.limite = l;
    }
    
    public String pegaBanco(){
        return this.nomeBanco;
    }
    
    public void alteraBanco(String b){
        this.nomeBanco = b;
    }
    
    public void saca(double valor){
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
    
    public void deposita(double quantidade){
        this.saldo += quantidade;
    }
    
    public int pegaCodigo(){
        return this.codigo;
    }
      
    public void imprimeSaldo(){
        System.out.println("Saldo atual: " + this.saldo);
    }
    
    public void imprimeDados(){
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.dono);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
    }
    
    public void transfere(Conta destino, double valor){
        if(valor <= this.limite && valor <= saldo){
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferência realizada com sucesso!");
        }else {
            System.out.println("A transferência não foi realizada. Verifique seu saldo ou limite e tente novamente.");
        }         
    }
}
