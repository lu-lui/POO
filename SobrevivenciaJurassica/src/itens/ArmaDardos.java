package itens;

public class ArmaDardos extends Item{
    private int qtdMunicao;
    
     public ArmaDardos(){
        super("Arma de Dardos");
        this.qtdMunicao = 1;
    }
    
    public int getQtdMunicao(){ 
        return qtdMunicao; 
    }
    
    public void addMunicao(){
        qtdMunicao++; 
    }
    
    public void usarMunicao(){
        qtdMunicao--; 
    }
}
