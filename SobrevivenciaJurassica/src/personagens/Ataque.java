package personagens;

public class Ataque {
    public void atacar(Jogador jogador, Dinossauro dino){
        int jogada = Dado.dado6();
        
        if(jogador.temArma){
            dino.recebeDano(2);
            jogador.usouMunicao();
        } else if (jogador.temBastao){
            if(jogada > 5)
                dino.recebeDano(2);
            else if (jogada == 1)
                dino.recebeDano(0);
            else
                dino.recebeDano(1);
        } else { //ataques com mão
             if(jogada == 6)
                dino.recebeDano(2);
            else if (jogada <= 2)
                dino.recebeDano(0);
            else
                dino.recebeDano(1);
        }
    }
}
