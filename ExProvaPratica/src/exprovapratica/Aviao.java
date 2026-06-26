package exprovapratica;

public class Aviao {
    protected Data data;
    protected int capacidade;
    protected int ocupacao;
    protected int numero;
    
    public Aviao(int numero, Data data){
        this.numero = numero;
        this.data = data;
        this.capacidade = 300;
        this.ocupacao = 0;
    }
   
    public int proximoLivre(){
        if(this.ocupacao < this.capacidade){
            return this.ocupacao + 1;   
        }else {
            System.out.println("Nao ha assentos livres");
            return -1;
        }
    }
   
    public boolean verifica(int n){
        if(n > this.ocupacao && n < this.capacidade) {
           return true;
        } else {
           return false;
        }
    }
   
    public boolean ocupa(int n){
        if(n > this.ocupacao && n < this.capacidade) {
           this.ocupacao++;
           return true;
        } else {
           return false;
        }
    }
   
    public int vagas(){
        return this.capacidade - this.ocupacao;
    }
   
    public int getNumeroDoVoo(){
        return this.numero;
   }
    
    public String getData(){
        return this.data.toString();
    }

}
