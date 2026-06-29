package sobrevivenciajurassica;

import itens.ArmaDardos;
import static java.lang.System.exit;
import java.util.Scanner;
import personagens.Ataque;
import personagens.Compsognato;
import personagens.Jogador;

public class Jogo {
    private Jogador jogador;
    private Tabuleiro tabuleiro;
    private Scanner scanner;
    private int opcao, percepcao;
    private int dinossaurosMortos;
    
    public Jogo(){
        this.scanner = new Scanner(System.in);
        this.dinossaurosMortos = 0;
    }
    
    public void iniciar(){
        System.out.println("1. Fácil (Percepção 3)");
        System.out.println("2. Médio (Percepção 2)");
        System.out.println("3. Difícil (Percepção 1)");
        System.out.println("Escolha a dificuldade: ");
        opcao = scanner.nextInt();
        
        while(opcao < 1 || opcao > 3){
            System.out.println("Opção inválida, digite novamente: ");
            opcao = scanner.nextInt();
        }
        
        switch(opcao){
            case 1:
                percepcao = 3;
                System.out.println("Dificuldade: Fácil");
                break;
            case 2:
                percepcao = 2;
                System.out.println("Dificuldade: Médio");
                break;
            case 3:
                percepcao = 1;
                System.out.println("Dificuldade: Difícil");
                break;
        }
        
        tabuleiro = new Tabuleiro();
        jogador = new Jogador(percepcao, new Posicao(0, 0));
        tabuleiro.getCelula(0, 0).setJogador(jogador);
  
        primeiroTurno();
    }

    public void primeiroTurno(){
        tabuleiro.tabuleiroPrimeiroTurno();
        
        System.out.println("");
        
        System.out.println("Saúde: " + jogador.getSaude());
        System.out.println("Percepção: " + jogador.getPercepcao());
        
        menuContinuar();
    }

    public void menuContinuar(){
        scanner = new Scanner(System.in);
        int acaoRealizada = 0;
         
        do{

            System.out.println("1. Cura - Usar Kit Médico");
            System.out.println("2. Debug - Ver Mapa Completo");
            System.out.println("3. Movimentar");
            System.out.println("4. Sair");
            System.out.println("Digite o que deseja fazer: ");

            int opcao = scanner.nextInt();

            switch(opcao){
                case 1: //usar kitMédico
                    if(jogador.getQtdKitsMedicos() == 0){
                        System.out.println("Você não possui nenhum kit médico.");
                    } else if (jogador.getSaude() == 5){
                        System.out.println("Sua saúde já está cheia.");
                    } else {
                        jogador.usarKitMedico();
                        acaoRealizada = 1;
                    }
                    break;
                case 2: //ver mapa
                    tabuleiro.mostraTabuleiro();
                    System.out.println("");
                    acaoRealizada = 1;
                    break;
                case 3: //movimentar
                    int temp = movimentaJogador();
                    
                    if(temp == 1){
                        checarCaixa();
                        acaoRealizada = 1;
                    } else {
                        System.out.println("Movimento inválido.");
                    }
                    
                    break;
                case 4:
                    System.out.println("Até Logo!");
                    exit(0);
            }
            checarDinossauro();
        
        }while(acaoRealizada == 0);
        
        executarTurno();
    }
    
    public int movimentaJogador(){
        int linha, coluna;
        Posicao p = jogador.getPosicao();
        coluna = p.getColuna();
        linha = p.getLinha();
        
        System.out.println("w - pra cima");
        System.out.println("s - pra baixo");
        System.out.println("a - pra esquerda");
        System.out.println("d - pra direita");
        System.out.println("Digite pra onde deseja se movimentar: ");
                    
        char entrada = scanner.next().charAt(0);
        
        while(entrada != 'w' && entrada != 's' && entrada != 'a' &&  entrada != 'd'){
            System.out.println("Opção inválida, digite novamente");
            entrada = scanner.next().charAt(0);
        }
        
        switch(entrada){
            case 'w' -> linha--;
                
            case 's' -> linha++;
            
            case 'a' -> coluna--;
                
            case 'd' -> coluna++;
        }
        
        checarDinossauro();
        
        if(tabuleiro.posicaoValida(linha, coluna) && !tabuleiro.getCelula(linha, coluna).ehParede()){
            tabuleiro.getCelula(jogador.getPosicao().getLinha(), jogador.getPosicao().getColuna()).setJogador(null);
            
            jogador.getPosicao().setColuna(coluna);
            jogador.getPosicao().setLinha(linha);
            
            tabuleiro.getCelula(linha, coluna).setJogador(jogador);
            return 1;
        }
        
        return 0;
    }
    
    public void executarTurno(){
        checarDinossauro();
        
        scanner = new Scanner(System.in);
       
        if(dinossaurosMortos == 12){
            System.out.println("Você venceu!");
            System.out.println("1. Novo Jogo");
            System.out.println("2. Sair");
            
            int op = scanner.nextInt();
            if(op == 1){
                iniciar();
            }
            if(op == 2){
                System.out.println("Até Logo!");
                exit(0);
            }       
        }
        
        tabuleiro.moverTodosDinossauros();
        
        tabuleiro.mostraTabuleiro(jogador);
        
        System.out.println("");
        
        System.out.println("Saúde: " + jogador.getSaude());
        System.out.println("Percepção: " + jogador.getPercepcao());
        
        menuContinuar();
    }
    
    public void checarDinossauro(){
        Ataque ataqueDino = new Ataque();
        Scanner scanner = new Scanner(System.in);
        
        int linha, coluna, op;
        linha = jogador.getPosicao().getLinha();
        coluna = jogador.getPosicao().getColuna();
        
        if(tabuleiro.getCelula(linha, coluna).temDinossauro()){
            
            do{
                ataqueDino.atacar(jogador, tabuleiro.getCelula(linha, coluna).getDinossauro());

                int verDinoMorreu = tabuleiro.getCelula(linha, coluna).getDinossauro().checarSaude();
                if(verDinoMorreu == 1){
                    tabuleiro.getCelula(linha, coluna).setDinossauro(null);
                    dinossaurosMortos++;
                    return;
                }

                tabuleiro.getCelula(linha, coluna).getDinossauro().atacarJogador(jogador);
                int gameOver = jogador.checarSaude();
                if(gameOver == 1){
                    exit(0);
                }
                
                tabuleiro.mostraTabuleiro(jogador);
                System.out.println("1. Fugir");
                System.out.println("2. Continuar Ataque");
                System.out.println("Digite sua escolha: ");
                op = scanner.nextInt();
                
            }while(op == 2);
            
            movimentaJogador();
        }
    }
    
    public void checarCaixa(){
        int linha, coluna;
        linha = jogador.getPosicao().getLinha();
        coluna = jogador.getPosicao().getColuna();
        
        if(tabuleiro.getCelula(linha, coluna).temCaixa()){
            System.out.println("O Jogador encontrou uma caixa com " + tabuleiro.getCelula(linha, coluna).getCaixa().getItem().getNome());
            
            if(tabuleiro.getCelula(linha, coluna).getCaixa().getItem().getNome().equals("Bastão Elétrico")){
                jogador.addBastao();
                
            } else if(tabuleiro.getCelula(linha, coluna).getCaixa().getItem().getNome().equals("Kit Médico")){
                jogador.addKitMedico();
                
            } else if(tabuleiro.getCelula(linha, coluna).getCaixa().getItem().getNome().equals("Arma de Dardos")){
                if(jogador.temArma()){
                    jogador.addMunicao();
                } else {
                    ArmaDardos arma = new ArmaDardos();
                    jogador.addArma(arma);
                }
            }
            
            if(tabuleiro.getCelula(linha, coluna).getCaixa().temCompsognato()){
                System.out.println("A CAIXA TEM UM COMPSOGNATO!");
                Compsognato compCaixa = tabuleiro.getCelula(linha, coluna).getCaixa().getComp();
                tabuleiro.getCelula(linha, coluna).setCaixa(null);
                tabuleiro.getCelula(linha, coluna).setDinossauro(compCaixa);
                checarDinossauro();
            } else {
                tabuleiro.getCelula(linha, coluna).setCaixa(null);
            }
            
        }
    }

}
