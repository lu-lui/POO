package despertador;

public class Despertador {
    public static void main(String[] args) {
        Alarme a = new Alarme();
        
        a.setHoraAtual(15, 52, 20);
        a.setAlarme(23, 52, 56);
        
        System.out.println("Hora atual: " + a.getHoraAtual());
        System.out.println("Alarme: " + a.getAlarme());
    }
}
