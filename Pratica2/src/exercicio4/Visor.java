/* Crie uma (ou mais) classe(s) para implementar um relógio “digital”, que exibe horas e minutos separados por dois pontos
no sistema europeu (24hs). São requisitos a implementação de dois métodos:
● autalizaVisor() : para mostrar a hora atualizar após um evento do relógio;
● eventoDoReloo() : realiza o imcremento da unidade mais básica do relógio, neste caso, os minutos.*/

package exercicio4;

public class Visor {
public static void main(String[] args) {
        Relogio digital = new Relogio(23, 58);
        
        digital.atualizaVisor();
        digital.eventoDoRelogio();
        digital.atualizaVisor();
        digital.eventoDoRelogio();
        digital.atualizaVisor();
        digital.eventoDoRelogio();
        digital.atualizaVisor();
        digital.eventoDoRelogio();
    } 
}
