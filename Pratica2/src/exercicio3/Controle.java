/* Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume e trocar os canais da televisão. 
O controle de volume permite:
● aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
● aumentar e diminuir o número do canal em uma unidade;
● trocar para um canal indicado;
● consultar o valor do volume de som e o canal selecionado.
*/
package exercicio3;

public class Controle {
    private int volume;
    private int canal; //4 canais
    
    public Controle (int v, int c){
        this.volume = v;
        this.canal = c;
    }
    
    public void aumentaVolume(){
        this.volume++;
        if(this.volume > 100) {
            this.volume = 100;
        }
    }
    
    public void baixaVolume(){
        this.volume--;
        if(this.volume < 0) {
            this.volume = 0;
        }
    }
    
    public void aumentaCanal(){
        this.canal++;
        if(this.canal > 4) {
            this.canal = 1; //ciclo
        }
    }
    
    public void baixaCanal(){
        this.canal--;
        if(this.canal <= 0) {
            this.canal = 4; //ciclo
        }
    }
    
    public void trocaCanal(int c){
        if(c <= 4 && c >=0) {
            this.canal = c;
        } else {
            System.out.println("Canal inexistente");
        }
    }
    
    public void consulta(){
        System.out.println("Volume: " + this.volume);
        System.out.println("Canal: " + this.canal);
    }
}
