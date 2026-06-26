package personagens;

import sobrevivenciajurassica.Posicao;
import sobrevivenciajurassica.Tabuleiro;        

public abstract class Dinossauro extends Personagem implements Movimentos{
    public Dinossauro(int saude, Posicao posicao){
        super(saude, posicao);
    }
    
    public abstract void mover(Tabuleiro tabuleiro);
    
    public void moverAleatorio(Tabuleiro tabuleiro){
        
    }
}
