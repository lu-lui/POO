package exercicio3;

public class Televisao {
    public static void main(String[] args) {
        Controle c = new Controle(30,1);
        
        c.aumentaCanal();
        c.consulta();
        c.baixaCanal();
        c.baixaCanal();
        c.consulta();
        c.trocaCanal(3);
        c.aumentaVolume();
        c.consulta();
    }
    
}
