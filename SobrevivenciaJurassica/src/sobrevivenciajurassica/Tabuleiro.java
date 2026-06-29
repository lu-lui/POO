package sobrevivenciajurassica;

import itens.ArmaDardos;
import itens.BastaoEletrico;
import itens.CaixaSuprimentos;
import itens.KitMedico;
import personagens.Compsognato;
import personagens.Jogador;
import personagens.TRex;
import personagens.Troodonte;
import personagens.Velociraptor;

//o mapa tem 4 caixas de suprimentos. 
//Uma delas contendo um kit médico (para recuperar saúde), 
//uma contendo um bastão elétrico, 
//duas contendo uma arma de dardos tranquilizantes (com uma munição) e um Compsognato surpresa

// Distribua: 2 Compsognatos, 2 Velociraptors, 5 Troodontes, 1 Tiranossauro
//Rex e 4 Caixas.

public class Tabuleiro {
    protected Celula[][] tabuleiro;
    
    public Tabuleiro(){
        tabuleiro = new Celula[20][20];
        int i, j;
        
        for(i = 0; i < 20; i++){
            for(j = 0; j < 20; j++){
                tabuleiro[i][j] = new Celula();
            }
        }
        
        //a posicao 0, 0 é o jogador
        //criando paredes - 20% chance de ter uma parede na posicao(i, j)
        for(i = 0; i < 20; i++){
            for(j = 0; j < 20; j++){
                if(i != 0 || j != 0){
                    int num = Dado.dado100();
                    if(num <= 20){
                        tabuleiro[i][j].setParede(true);
                    }
                }
            }
        }
        
        //Caixas Suprimento
        //caixa1 = kit médico
        KitMedico kit = new KitMedico();
        CaixaSuprimentos caixa1 = new CaixaSuprimentos(kit, null);
        do{
            i = Dado.dado20();
            j = Dado.dado20();
        }while(!tabuleiro[i][j].estaVazia() || (i == 0 && j == 0));
        tabuleiro[i][j].setCaixa(caixa1);
        
        //caixa2 = bastão elétrico
        BastaoEletrico bastao = new BastaoEletrico();
        CaixaSuprimentos caixa2 = new CaixaSuprimentos(bastao, null);
        do{
            i = Dado.dado20();
            j = Dado.dado20();
        }while(!tabuleiro[i][j].estaVazia() || (i == 0 && j == 0));
        tabuleiro[i][j].setCaixa(caixa2);
        
        //caixa3 = arma e compsognato
        ArmaDardos arma1 = new ArmaDardos();
        do{
            i = Dado.dado20();
            j = Dado.dado20();
        }while(!tabuleiro[i][j].estaVazia() || (i == 0 && j == 0));
        Posicao pCaixa3 = new Posicao(i, j);
        Compsognato compCaixa3 = new Compsognato(pCaixa3);
        CaixaSuprimentos caixa3 = new CaixaSuprimentos(arma1, compCaixa3);
        tabuleiro[i][j].setCaixa(caixa3);
        
        //caixa4 = arma e compsognato
        ArmaDardos arma2 = new ArmaDardos();
        do{
            i = Dado.dado20();
            j = Dado.dado20();
        }while(!tabuleiro[i][j].estaVazia() || (i == 0 && j == 0));
        Posicao pCaixa4 = new Posicao(i, j);
        Compsognato compCaixa4 = new Compsognato(pCaixa4);
        CaixaSuprimentos caixa4 = new CaixaSuprimentos(arma2, compCaixa4);
        tabuleiro[i][j].setCaixa(caixa4);
        
        //2 compsognatos
        do{
            i = Dado.dado20();
            j = Dado.dado20();
        }while(!tabuleiro[i][j].estaVazia() || (i == 0 && j == 0));
        Posicao p1 = new Posicao(i, j);
        Compsognato c1 = new Compsognato(p1);
        tabuleiro[i][j].setDinossauro(c1);
        
        do{
            i = Dado.dado20();
            j = Dado.dado20();
        }while(!tabuleiro[i][j].estaVazia() || (i == 0 && j == 0));
        Posicao p2 = new Posicao(i, j);
        Compsognato c2 = new Compsognato(p2);
        tabuleiro[i][j].setDinossauro(c2);
        
        //2 velociraptors
        do{
            i = Dado.dado20();
            j = Dado.dado20();
        }while(!tabuleiro[i][j].estaVazia() || (i == 0 && j == 0));
        Posicao p3 = new Posicao(i, j);
        Velociraptor v1 = new Velociraptor(p3);
        tabuleiro[i][j].setDinossauro(v1);
        
        do{
            i = Dado.dado20();
            j = Dado.dado20();
        }while(!tabuleiro[i][j].estaVazia() || (i == 0 && j == 0));
        Posicao p4 = new Posicao(i, j);
        Velociraptor v2 = new Velociraptor(p4);
        tabuleiro[i][j].setDinossauro(v2);
        
        //5 troodontes
        do{
            i = Dado.dado20();
            j = Dado.dado20();
        }while(!tabuleiro[i][j].estaVazia() || (i == 0 && j == 0));
        Posicao p5 = new Posicao(i, j);
        Troodonte t1 = new Troodonte(p5);
        tabuleiro[i][j].setDinossauro(t1);
        
        do{
            i = Dado.dado20();
            j = Dado.dado20();
        }while(!tabuleiro[i][j].estaVazia() || (i == 0 && j == 0));
        Posicao p6 = new Posicao(i, j);
        Troodonte t2 = new Troodonte(p6);
        tabuleiro[i][j].setDinossauro(t2);
        
        do{
            i = Dado.dado20();
            j = Dado.dado20();
        }while(!tabuleiro[i][j].estaVazia() || (i == 0 && j == 0));
        Posicao p7 = new Posicao(i, j);
        Troodonte t3 = new Troodonte(p7);
        tabuleiro[i][j].setDinossauro(t3);
        
        do{
            i = Dado.dado20();
            j = Dado.dado20();
        }while(!tabuleiro[i][j].estaVazia() || (i == 0 && j == 0));
        Posicao p8 = new Posicao(i, j);
        Troodonte t4 = new Troodonte(p8);
        tabuleiro[i][j].setDinossauro(t4);
        
        do{
            i = Dado.dado20();
            j = Dado.dado20();
        }while(!tabuleiro[i][j].estaVazia() || (i == 0 && j == 0));
        Posicao p9 = new Posicao(i, j);
        Troodonte t5 = new Troodonte(p9);
        tabuleiro[i][j].setDinossauro(t5);
        
        //1 trex
        do{
            i = Dado.dado20();
            j = Dado.dado20();
        }while(!tabuleiro[i][j].estaVazia() || (i == 0 && j == 0));
        Posicao p10 = new Posicao(i, j);
        TRex tR1 = new TRex(p10);
        tabuleiro[i][j].setDinossauro(tR1);
        
    }
    
    public boolean posicaoValida(int linha, int coluna){
        if((linha >= 0 && linha < 20) && (coluna >= 0 && coluna < 20))
            return true;
        return false;
    }
    
    public Celula getCelula(int linha, int coluna){
        return tabuleiro[linha][coluna];
    }
    
    public void mostraTabuleiro(){
        int i, j;
        for(i = 0; i < 20; i++){
            for(j = 0; j < 20; j++){
                System.out.print(tabuleiro[i][j].mostraConteudo() + " ");
            }
            System.out.println();
        }
    }
    
    public void tabuleiroPrimeiroTurno(){
        int i, j, marcadorI = 0, marcadorJ = 0;
        for(i = 0; i < 20; i++){
            for(j = 0; j < 20; j++){
                
                if(i == 0 && j == 0){
                    System.out.print(tabuleiro[i][j].mostraConteudo());
                }
                
                if(marcadorI == 0 && i == 0 && j != 0 && tabuleiro[i][j].estaVazia()){
                    System.out.print(" ");
                } else {
                    System.out.print("");;
                }
                if(marcadorI == 0 && i == 0 && j != 0 && !tabuleiro[i][j].estaVazia()){
                    System.out.print(tabuleiro[i][j].mostraConteudo());
                    marcadorI = 1;
                }
                
                if(marcadorJ == 0 && j == 0 && i != 0 && tabuleiro[i][j].estaVazia()){
                    System.out.print(" ");
                } else {
                    System.out.print("");;
                }
                if(marcadorJ == 0 && j == 0 && i != 0 && !tabuleiro[i][j].estaVazia()){
                    System.out.print(tabuleiro[i][j].mostraConteudo());
                    marcadorJ = 1;
                }
                
            }
            System.out.println();
        }
    }
    
    public void mostraTabuleiro(Jogador jogador){
        int linha = jogador.getPosicao().getLinha();
        int coluna = jogador.getPosicao().getColuna();
        int percepcao = jogador.getPercepcao();
        int TAM = 20;

        boolean[][] visivel = new boolean[TAM][TAM];
        visivel[linha][coluna] = true; //a posicao do jogador é smp visivel

        for(int i = linha - 1; i >= linha - percepcao && i >= 0; i--){ // cima
            visivel[i][coluna] = true;
            if(!tabuleiro[i][coluna].estaVazia()){
                visivel[i][coluna] = true;
                break;
            }
        }

        for(int i = linha + 1; i <= linha + percepcao && i < TAM; i++){ // baixo 
            visivel[i][coluna] = true;
            if(!tabuleiro[i][coluna].estaVazia()){
                visivel[i][coluna] = true;
                break;
            }
        }

        for(int j = coluna - 1; j >= coluna - percepcao && j >= 0; j--){ // esquerda 
            visivel[linha][j] = true;
            if(!tabuleiro[linha][j].estaVazia()){
                visivel[linha][j] = true;
                break;
            }
        }

        for(int j = coluna + 1; j <= coluna + percepcao && j < TAM; j++){ // direita
            visivel[linha][j] = true;
            if(!tabuleiro[linha][j].estaVazia()){
                visivel[linha][j] = true;
                break;
            }
        }

        for(int i = 0; i < TAM; i++){
            for(int j = 0; j < TAM; j++){
                if(visivel[i][j])
                    System.out.print(tabuleiro[i][j].mostraConteudo() + " ");
                else
                    System.out.print("- ");
            }
            System.out.println();
        }
    }

    public void moverTodosDinossauros(){
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                if(tabuleiro[i][j].temDinossauro())
                    tabuleiro[i][j].getDinossauro().mover(this); //move o dinossauro dessa celula
            }
        }
    } 
    
    public boolean posicaoOcupada(int i, int j){
        return !tabuleiro[i][j].estaVazia();
    }
}
