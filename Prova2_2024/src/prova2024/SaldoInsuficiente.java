package prova2024;

public class SaldoInsuficiente extends RuntimeException{
   
    public SaldoInsuficiente(){
        super();
    }
    
    public SaldoInsuficiente(String mensagem){
        super(mensagem);
    }
}