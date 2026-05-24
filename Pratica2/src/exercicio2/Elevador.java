package exercicio2;

public class Elevador {
    private int andarAtual; 
    private int totalAndares;
    private int capacidade;
    private int pessoasAgora;
    
    public void inicializa(int capacidade, int totalAndares){
        this.andarAtual = 0;
        this.pessoasAgora = 0;
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
    }
    
    public void entra(){
        if(this.pessoasAgora < this.capacidade){
            this.pessoasAgora++;
        } else {
            System.out.println("Elevador cheio!");
        }
    }
    
    public void sai(){
        if(this.pessoasAgora > 0){
            this.pessoasAgora--;
        } else {
            System.out.println("Nao ha pessoas no elevador");
        }
    }
    
    public void sobe(){
        if(this.andarAtual < this.totalAndares){
            this.andarAtual++;
        } else {
            System.out.println("Nao ha mais andares acima!");
        }          
    }
    
    public void desce(){
        if(this.andarAtual > 0){
            this.andarAtual--;
        } else {
            System.out.println("O elevador esta no terreo!");
        }          
    }
    
    public void imprime(){
        System.out.println("Andar atual: " + this.andarAtual);
        System.out.println("Pessoas no elevador: " + this.pessoasAgora);
    }
}
