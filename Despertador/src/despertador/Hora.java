package despertador;
public class Hora {
    private int h, m, s;
 
    public Hora(){
        this(0, 0, 0);
    }
 
    public Hora(int h, int m, int s){
        this.setH(h);
        this.setM(m);
        this.setS(s);
    }
    
    public Hora (Hora h){
        this(h.getH(), h.getM(), h.getS());
    }
    
    public int getH() {
        return h;
    }
   
    public void setH(int hora) {
        if (hora>=0 & hora<24) //h = hora>=0 & hora<24 ? hora : 0;
            this.h = hora;
        else
            this.h = 0;
    }
    
    public int getM() {
        return m;
    }
    
    public void setM(int minutos) {
        if (minutos>=0 & minutos<60)
            this.m = minutos;
           else
        this.m = 0;
    }
    
    public int getS() {
        return s;
    }
    
    public void setS(int segundos) {
        if (segundos >=0 & segundos<60)
            this.s = segundos;
           else
        this.s = 0;
    }
    
    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d", h, m, s);
    }
}