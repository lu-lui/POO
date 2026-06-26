package personagens;

import sobrevivenciajurassica.Posicao;
import sobrevivenciajurassica.Tabuleiro;

public class Troodonte extends Dinossauro{
    public Troodonte(Posicao posicao){
        super(2, posicao); //saude == 2
    }    
    
    @Override
    public void mover(Tabuleiro tabuleiro){
        moveAleatorio(tabuleiro);
    }
}
