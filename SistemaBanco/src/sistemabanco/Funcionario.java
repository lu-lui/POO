package sistemabanco;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String RG;
    
    public Funcionario(String n, String d, double s, String e, String rg){
        this.nome = n;
        this.departamento = d;
        this.salario = s;
        this.dataEntrada = e;
        this.RG = rg;
    }
    
    public void recebeAumento(double valor){
        System.out.println("Salario anterior: R$" + this.salario);
        this.salario += valor;
        System.out.println("Novo salario: R$" + this.salario);
    }
    
    public double calculaGanhoAnual(){
        return this.salario * 12;
    }
    
    public void imprime(){
        System.out.println("---FUNCIONARIOS--- \nNome: "+ this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salario: R$" + this.salario);
        System.out.println("Data de entrada: " + this.dataEntrada);
        System.out.println("RG: " + this.RG);
    }
    
}