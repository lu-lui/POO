package personagens;

import sobrevivenciajurassica.Posicao;

public class Jogador extends Personagem{
    private int percepcao;
    protected boolean temBastao;
    protected boolean temArma;
    private int qtdMunicaoDardos;
    private int qtdKitsMedicos;
    
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
        qtdMunicaoDardos--;
    }
}
