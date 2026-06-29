package sobrevivenciajurassica;

import java.util.Scanner;

public class SobrevivenciaJurassica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        Jogo jogo;
        
        System.out.println("----- Bem-vindo ao Sobrevivência Jurássica -----");
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Jogar");
        System.out.println("2 - Sair");
        
        opcao = scanner.nextInt();
        
        if (opcao == 1) {
            jogo = new Jogo();
            jogo.iniciar();
        } else {
            System.out.println("Até logo!");
        }
    }
    
}
