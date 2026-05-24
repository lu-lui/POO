package exercicio4;

public class Relogio {
    private int horas;
    private int minutos;
    
    public Relogio(int h, int m){
        horas = h;
        minutos = m;
    }
    
    public void eventoDoRelogio(){
        this.minutos++;
        
        if(this.minutos > 59){
            this.minutos = 0;
            this.horas++;
        }
        
        if(this.horas > 23){
            this.horas = 0;
        }
    }
    
    public void atualizaVisor(){
        System.out.println(this.horas + ":" + this.minutos);
    }
}
