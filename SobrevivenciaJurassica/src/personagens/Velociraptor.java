package personagens;

import sobrevivenciajurassica.Posicao;
import sobrevivenciajurassica.Tabuleiro;

public class Velociraptor extends Dinossauro{
    public Velociraptor(Posicao posicao){
        super(2, posicao); //saude == 1
    }    
    
    @Override
    public void mover(Tabuleiro tabuleiro){
        moveAleatorio(tabuleiro);
        moveAleatorio(tabuleiro);
    }
}
