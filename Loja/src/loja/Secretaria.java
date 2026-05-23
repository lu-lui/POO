package loja;

public class Secretaria extends Empregada{
    private String[] clientes;
    private int pos_livre = 0;
    
    public Secretaria(String nome, float salario, int anoContratacao){
        super(nome, salario, anoContratacao);
        this.clientes = new String[5]; //aloca memoria p vetor de 5 posições
    }
    
    public void guardaNome(String nome){
        if(pos_livre < 5){
            this.clientes[pos_livre] = nome;
            pos_livre++;
        }else {
            for (int i=0; i<pos_livre-1; i++) {
                this.clientes[i] = this.clientes[i+1];
            }
            this.clientes[pos_livre-1] = nome;
        }    
    }
    
    public String toString() {
        return "Secretaria";
    }
}
