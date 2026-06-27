package personagens;

import sobrevivenciajurassica.Dado;
import sobrevivenciajurassica.Posicao;
import sobrevivenciajurassica.Tabuleiro;

public class TRex extends Dinossauro{
   public TRex(Posicao posicao){
       super(3, posicao ); //saude == 3
   }
   
   @Override
   public void mover(Tabuleiro tabuleiro){
        //nn se move
   }
   
   @Override
   public void atacarJogador(Jogador jogador){
        int dado = Dado.dado3();
        if (dado > jogador.getPercepcao()) {
            jogador.recebeDano(2); 
        }
    }
}