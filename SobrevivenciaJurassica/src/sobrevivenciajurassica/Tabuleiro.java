package sobrevivenciajurassica;

import itens.ArmaDardos;
import itens.BastaoEletrico;
import itens.CaixaSuprimentos;
import itens.Item;
import itens.KitMedico;
import personagens.Compsognato;
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
    private Celula[][] tabuleiro;
    private final int TAM = 20;
    private int l, c;
    
    public Tabuleiro(){
        this.tabuleiro = new Celula[TAM][TAM];
        for(l = 0; l < TAM; l++){
            for(c = 0; c < TAM; c++){
                tabuleiro[l][c] = new Celula();
            }
        }
        
        //criando paredes - 20% chance de ter uma parede na posicao(i, j)
        for(l = 0; l < TAM; l++){
            for(c = 0; c < TAM; c++){
                int num = Dado.dado100();
                if(num <= TAM){
                    tabuleiro[l][c].setParede(true);
                }
            }
        }
        
        //Caixas Suprimento
        //caixa1 = kit médico
        KitMedico kit = new KitMedico();
        CaixaSuprimentos caixa1 = new CaixaSuprimentos(kit, false);
        do{
            l = Dado.dado20();
            c = Dado.dado20();
        }while(!tabuleiro[l][c].estaVazia());
        tabuleiro[l][c].setCaixa(caixa1);
        
        //caixa2 = bastão elétrico
        BastaoEletrico bastao = new BastaoEletrico();
        CaixaSuprimentos caixa2 = new CaixaSuprimentos(bastao, false);
        do{
            l = Dado.dado20();
            c = Dado.dado20();
        }while(!tabuleiro[l][c].estaVazia());
        tabuleiro[l][c].setCaixa(caixa2);
        
        //caixa3 = arma e compsognato
        ArmaDardos arma1 = new ArmaDardos();
        CaixaSuprimentos caixa3 = new CaixaSuprimentos(arma1, true);
        do{
            l = Dado.dado20();
            c = Dado.dado20();
        }while(!tabuleiro[l][c].estaVazia());
        tabuleiro[l][c].setCaixa(caixa3);
        
        //caixa4 = arma e compsognato
        ArmaDardos arma2 = new ArmaDardos();
        CaixaSuprimentos caixa4 = new CaixaSuprimentos(arma2, true);
        do{
            l = Dado.dado20();
            c = Dado.dado20();
        }while(!tabuleiro[l][c].estaVazia());
        tabuleiro[l][c].setCaixa(caixa4);
        
        //2 compsognatos
        do{
            l = Dado.dado20();
            c = Dado.dado20();
        }while(!tabuleiro[l][c].estaVazia());
        Posicao p1 = new Posicao(l, c);
        Compsognato c1 = new Compsognato(p1);
        tabuleiro[l][c].setDinossauro(c1);
        
        do{
            l = Dado.dado20();
            c = Dado.dado20();
        }while(!tabuleiro[l][c].estaVazia());
        Posicao p2 = new Posicao(l, c);
        Compsognato c2 = new Compsognato(p2);
        tabuleiro[l][c].setDinossauro(c2);
        
        //2 velociraptors
        do{
            l = Dado.dado20();
            c = Dado.dado20();
        }while(!tabuleiro[l][c].estaVazia());
        Posicao p3 = new Posicao(l, c);
        Velociraptor v1 = new Velociraptor(p3);
        tabuleiro[l][c].setDinossauro(v1);
        
        do{
            l = Dado.dado20();
            c = Dado.dado20();
        }while(!tabuleiro[l][c].estaVazia());
        Posicao p4 = new Posicao(l, c);
        Velociraptor v2 = new Velociraptor(p4);
        tabuleiro[l][c].setDinossauro(v2);
        
        //5 troodontes
        do{
            l = Dado.dado20();
            c = Dado.dado20();
        }while(!tabuleiro[l][c].estaVazia());
        Posicao p5 = new Posicao(l, c);
        Troodonte t1 = new Troodonte(p5);
        tabuleiro[l][c].setDinossauro(t1);
        
        do{
            l = Dado.dado20();
            c = Dado.dado20();
        }while(!tabuleiro[l][c].estaVazia());
        Posicao p6 = new Posicao(l, c);
        Troodonte t2 = new Troodonte(p6);
        tabuleiro[l][c].setDinossauro(t2);
        
        do{
            l = Dado.dado20();
            c = Dado.dado20();
        }while(!tabuleiro[l][c].estaVazia());
        Posicao p7 = new Posicao(l, c);
        Troodonte t3 = new Troodonte(p7);
        tabuleiro[l][c].setDinossauro(t3);
        
        do{
            l = Dado.dado20();
            c = Dado.dado20();
        }while(!tabuleiro[l][c].estaVazia());
        Posicao p8 = new Posicao(l, c);
        Troodonte t4 = new Troodonte(p8);
        tabuleiro[l][c].setDinossauro(t4);
        
        do{
            l = Dado.dado20();
            c = Dado.dado20();
        }while(!tabuleiro[l][c].estaVazia());
        Posicao p9 = new Posicao(l, c);
        Troodonte t5 = new Troodonte(p9);
        tabuleiro[l][c].setDinossauro(t5);
        
        //1 trex
        do{
            l = Dado.dado20();
            c = Dado.dado20();
        }while(!tabuleiro[l][c].estaVazia());
        Posicao p10 = new Posicao(l, c);
        TRex tR1 = new TRex(p10);
        tabuleiro[l][c].setDinossauro(tR1);
    }    
        public int getTamanho(){ 
            return TAM;
        } 
        
        public Celula getCelula(int linha, int coluna){
            return tabuleiro[linha][coluna];
        }
        
        public boolean posicaoValida(int linha, int coluna){
        if (linha < 0 || coluna < 0 || linha >= TAM || coluna >= TAM)
            return false;
        if (tabuleiro[linha][coluna].ehParede())
            return false;
        
        return true;
        }
        
        public void mostraTabuleiro(){
        for(l = 0; l < TAM; l++){
            for(c = 0; c < TAM; c++)
                System.out.print(tabuleiro[l][c].mostraConteudo() + " ");
            System.out.println();
        }
    }
}
