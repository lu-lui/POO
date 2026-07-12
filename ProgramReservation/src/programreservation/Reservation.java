/*Fazer um programa para ler os dados de uma reserva de hotel (número do quarto, data de entrada e data de saída) e mostrar os dados da reserva, 
inclusive sua duração em dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva, e mostrar novamente a reserva com os dados atualizados. 
O programa não deve aceitar dados inválidos para a reserva, conforme as seguintes regras:
- Alterações de reserva só podem ocorrer para datas futuras
- A data de saída deve ser maior que a data de entrada*/

//Ajustar os pacotes depois
package programreservation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;
    
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //ajusta formato da data

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException{
        if(checkOut.after(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    
    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime(); //diferença de tempo em milisegundos
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    
    public void updateDates(Date checkIn, Date checkOut) throws DomainException{ //propaga
        Date now  = new Date();
        if(checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException("Reservation dates for update must be future dates");
        }
        //lança a exceção para ser tratada pelo programa principal
        if(checkOut.after(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");
        } 
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    
    @Override
    public String toString(){ //Formata a saída 
        return "Room " + roomNumber + ", check-in: " + sdf.format(checkIn) + ", check-out: " + sdf.format(checkOut) +
                ", " + duration() + " nights";
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }
}

