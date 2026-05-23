package loja;

public class Empregada {
    private String nome;
    private float salario;
    private int anoContratacao;
    
    public Empregada(String nome, float salario, int anoContratacao){
        this.nome = nome;
        this.salario = salario;
        this.anoContratacao = anoContratacao;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void alteraNome(String n){
        this.nome = n;
    }
    
    public float getSalario(){
        return this.salario;
    }
    
    public float getAno(){
        return this.anoContratacao;
    }
    
    public void aumentarSalario(float valor){
        this.salario += valor;
    }
    
    public String toString(){
        return "Empregada";
    }
    
    public void imprimeDados(){
            System.out.println("-----EMPREGADA(O)-----");
            System.out.println("Nome: " + this.nome);
            System.out.println("Salario: " + this.salario);
            System.out.println("Ano de Contratacao: " + this.anoContratacao);
    }
}