/*Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio.
 A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo), capacidade do 
elevador equantas pessoas estão presentes nele. A classe deve também disponibilizar os seguintes métodos:
● Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores 
sempre começam no térreo e vazio);
● Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
● Sai : para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
● Sobe : para subir um andar (não deve subir se já estiver no último andar);
● Desce : para descer um andar (não deve descer se já estiver no térreo).*/

package exercicio2;

public class Main {
    public static void main(String[] args) {
        Elevador elev = new Elevador();
        
        elev.inicializa(6, 2);
        elev.imprime();
        elev.entra();
        elev.sobe();
        elev.sobe();
        elev.imprime();
        elev.desce();
        elev.sobe();
        elev.sai();
        elev.sai();
        elev.imprime();
    }
}
