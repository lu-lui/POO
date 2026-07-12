/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecoes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author felipe
 */
public class Time {
    private final String nome;
    private final List<Jogador> equipe;
    
    public Time(String nome) {
        this.nome = nome;
        this.equipe = new ArrayList<>();
    }
    
    public void inserir(Jogador j) {
        equipe.add(j);
    }
    
    public Jogador remover(int indice) {
        return equipe.remove(indice);
    }
    
    public void imprimir() {
        System.out.println("Time: " + nome);
        System.out.println("Equipe:");
        // for-each
        for (Jogador j : equipe)
            System.out.println(j);
    }
}
