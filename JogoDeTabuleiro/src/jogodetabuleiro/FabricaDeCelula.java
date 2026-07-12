/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodetabuleiro;

import java.awt.Color;
import javax.swing.BorderFactory;

/**
 *
 * @author Felipe Marques
 */
public final class FabricaDeCelula {
    public static Celula fabrica(char tipo) {
        switch(tipo) {
            case 'I' :  return FabricaDeCelula.inicio();
            case 'F' :  return FabricaDeCelula.fim();
            case 'S' :  return FabricaDeCelula.simples();
            case 'V' :  return FabricaDeCelula.vazio();
            case '?' :  return FabricaDeCelula.interrogacao();
        }
        return null;
    }
    
    private static Celula inicio() {
        Celula celula = new Celula('I');
        celula.setBackground(new Color(0, 255, 0));
	celula.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        return celula;
    }
    
    private static Celula fim() {
        Celula celula = new Celula('F');
        celula.setBackground(new Color(255, 0, 0));
	celula.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        return celula;
    }

    private static Celula simples() {
        Celula celula = new Celula('S');
        celula.setBackground(new Color(170, 170, 170));
	celula.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        return celula;
    }
    
    private static Celula vazio() {
        Celula celula = new Celula('V');
        celula.setBackground(new Color(0, 0, 0));
	celula.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        return celula;
    }
    
    private static Celula interrogacao() {
        Celula celula = new Celula('?');
        celula.setBackground(new Color(247, 217, 23));
	celula.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        return celula;
    }
}
