package personagens;

import sobrevivenciajurassica.Dado;

public class Ataque {
    public void atacar(Jogador jogador, Dinossauro dino){
        int jogada = Dado.dado6();
        System.out.println("O jogador tirou " + jogada + " no dado.");
        
        if(jogador.temArma && (!dino.getNomeDino().equals("V") || dino.getSaude() > 2)){
            System.out.println(dino.getNomeDino() + " recebeu 2 de dano com a arma.");
            dino.recebeDano(2);
            jogador.usouMunicao();
            
        }else if(jogador.temBastao && !dino.getNomeDino().equals("R")){
            if(jogada > 5){
                System.out.println(dino.getNomeDino() + " recebeu 2 de dano com o bastão.");
                dino.recebeDano(2);
            }else if(jogada == 1) {
                System.out.println(dino.getNomeDino() + " não recebeu dano.");
                dino.recebeDano(0);
            }else{
                System.out.println(dino.getNomeDino() + " recebeu 1 de dano com o bastão.");
                dino.recebeDano(1);
            }
            
        } else if(!dino.getNomeDino().equals("R")){ //ataques com a mão
            if(jogada == 6){
                System.out.println(dino.getNomeDino() + " recebeu 2 de dano com a mão.");
                dino.recebeDano(2);
            }else if(jogada <= 2){
                System.out.println(dino.getNomeDino() + " não recebeu dano.");
                dino.recebeDano(0);
            }else{
                System.out.println(dino.getNomeDino() + " recebeu 1 de dano com a mão.");
                dino.recebeDano(1);
            }
        }
    }
}

