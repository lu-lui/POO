package loja;

public class Gerente extends Empregada{
    Empregada[] subordinadas;
    Secretaria secret;
    
    public Gerente (String nome, float salario, int anoContratacao, Secretaria sec, Empregada s1, Empregada s2){
        super(nome, salario, anoContratacao);
        this.secret = sec;
        this.subordinadas = new Empregada[2];
        this.subordinadas[0] = s1;
        this.subordinadas[1] = s2;
    }
    
    public void aumento(float sec, float sub){
        this.secret.aumentarSalario(sec);
        for(int i=0; i < subordinadas.length; i++){
            this.subordinadas[i].aumentarSalario(sub);
        }
    }
    
    public void imprimeDados(){
        System.out.println("Imprime (do gerente)");
        super.imprimeDados();
        System.out.println("\t");
        for(int i=0; i < subordinadas.length; i++){
            this.subordinadas[i].imprimeDados();
        }
    }
    
    public String toString(){
        return "Gerente";
    }
}
