package exercicio1;

public class Pessoa {
    private String nome;
    private Data dataNascimento;
    private double altura;
    
    public Pessoa(String n, Data d, double a){
        this.nome = n;
        this.dataNascimento = d;
        this.altura = a;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public Data getDataNascimento(){
        return this.dataNascimento;
    }
    
    public double getAltura (){
        return this.altura;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public void setDataNascimento(Data d){
        this.dataNascimento = d;
    }
    
    public int calcularIdade(Data atual){
        return dataNascimento.calcularDiferenca(atual);
    }
    
    public void imprimir(){
        System.out.println("######################################");
        System.out.println("Nome: "+nome);
        System.out.println("Altura: "+altura);
        System.out.println("Data de Nascimento: "+ dataNascimento.getData());
   
    }
}
