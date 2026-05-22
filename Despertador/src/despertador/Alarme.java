package despertador;

public class Alarme {
    boolean ligado;
    Hora alarme, horaAtual;
    
    public Alarme(){
        this.alarme = new Hora();
        this.horaAtual = new Hora();
    }
    
    public void setAlarme(int h, int m, int s){
        this.alarme.setH(h);
        this.alarme.setM(m);
        this.alarme.setS(s);
    }
    
    public void setHoraAtual(int h, int m, int s){
        this.horaAtual.setH(h);
        this.horaAtual.setM(m);
        this.horaAtual.setS(s);
    }
    
    public String getAlarme(){
        return this.alarme.toString();
    }
    
    public String getHoraAtual(){
        return this.horaAtual.toString();
    }
}