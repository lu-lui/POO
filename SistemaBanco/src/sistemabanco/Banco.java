package sistemabanco;

public class Banco {
    private static int prox_banco = 1;
    private int MAX_CONTAS = 10; 
    private String nome;
    private int codigo, prox_conta, ind_array;
    private Conta[] contas;
    
    public Banco (String n) {
        this.nome = n;
        this.codigo = prox_banco++;
        this.prox_conta = 1;
        this.contas = new Conta[MAX_CONTAS];
        this.ind_array = 0;
    }
    
    public int pegaCodB(){
        return this.codigo;
    }
    
    public String pegaNomeB(){
        return this.nome;
    }
    
    public void alteraNome(String n){
        this.nome = n;
    }
    
    public Conta criaConta(String nome){
        Conta c;
        
        if(prox_conta == MAX_CONTAS)
            c = null;
        else {
              c = new Conta(prox_conta++, nome, 0.0, 0.0, this.nome);
            this.contas[ind_array++] = c;
        }
        return c;
    }
    
    Conta buscaConta(int cod){
        int i;
        for(i=0; i<ind_array; i++){
            if(contas[i].pegaCodigo()==cod)
                return contas[i];
        }
         return null;
    }
}