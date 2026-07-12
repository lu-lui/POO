/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecoes;

/**
 *
 * @author felipe
 */
public class Jogador {
    private final String nome;
    private final int numero;
    
    public Jogador(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }
    
    public String toString() {
        return numero + " - " + nome;
    }
}
