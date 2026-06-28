package personagens;

import sobrevivenciajurassica.Posicao;
import itens.ArmaDardos;

public class Jogador extends Personagem{
    private int percepcao;
    protected boolean temBastao;
    protected boolean temArma;
    private int qtdMunicaoDardos;
    private int qtdKitsMedicos;
    private ArmaDardos arma;
    
    public Jogador (int percepcao, Posicao posicao){
        super(5, posicao); //saude comeca em 5
        this.percepcao = percepcao;
    }
    
    public void usarKitMedico(){
        qtdKitsMedicos--;
    }
    
    public void addMunicao(){
        qtdMunicaoDardos++;
    }
    
    public void usouMunicao(){
        arma.usarMunicao();
    }
    
    public int getPercepcao(){ 
        return percepcao; 
    }
    
    public boolean temBastao(){ 
        return temBastao; 
    }
    
    public boolean temArma(ArmaDardos arma){ 
        this.arma = arma;
        return temArma; 
    }
    
    public int getQtdMunicao(){ 
        return qtdMunicaoDardos; 
    }
    
    public int getQtdKitsMedicos(){ 
        return qtdKitsMedicos; 
    }
    
    public void setBastao(boolean temBastao){ 
        this.temBastao = temBastao; 
    }
   
    public void setArma(boolean temArma){ 
        this.temArma = temArma; 
    }
    
    public void addBastao(){
        temBastao = true;
    }
    
    public void addArma(){
        temArma = true;
    }
}
