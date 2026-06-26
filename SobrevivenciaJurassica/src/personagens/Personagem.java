package personagens;

import sobrevivenciajurassica.Posicao;

public class Personagem {
    protected int saude;       
    protected Posicao posicao;
    
    public Personagem(int saude, Posicao posicao){
        this.saude = saude;
        this.posicao = posicao;
    }

    public boolean estaVivo(){
        return saude > 0;
    }
    
    public void recebeDano(int dano){
        saude -= dano;
    }
    
    public int getSaude(){ 
        return saude; 
    }
    
    public Posicao getPosicao(){ 
        return posicao; 
    }
}