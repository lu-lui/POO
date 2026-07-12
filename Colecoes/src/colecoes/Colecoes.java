/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecoes;

/**
 *
 * @author felipe
 */
public class Colecoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Time t = new Time("Gremio");
        
        Jogador j = new Jogador("Paulo Nunes", 7);
        t.inserir(j);
        t.inserir(new Jogador("Carlos Miguel", 11));
        t.inserir(new Jogador("Adilson", 10));
        
        t.imprimir();
    }
    
}
