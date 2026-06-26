package personagens;

import sobrevivenciajurassica.Posicao;
import sobrevivenciajurassica.Tabuleiro;

public class Compsognato extends Dinossauro{
    public Compsognato(Posicao posicao){
        super(1, posicao); //saude == 1
    }    
    
    @Override
    public void mover(Tabuleiro tabuleiro){
        moveAleatorio(tabuleiro);
    }
}
