package personagens;

import sobrevivenciajurassica.Posicao;
import sobrevivenciajurassica.Tabuleiro;

public class Velociraptor extends Dinossauro{
    public Velociraptor(Posicao posicao){
        super("V", 2, posicao); //saude começa em 2
    }   
    
    @Override
    public void mover(Tabuleiro tabuleiro){
        moveAleatorio(tabuleiro);
        moveAleatorio(tabuleiro);
    }
}
