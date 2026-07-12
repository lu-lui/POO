package programreservation;

//criação de uma classe de tratamento de exceções
public class DomainException extends Exception{ //Obriga o compilador a tratar
    private static final long serialVersionUID = 1L; //versão 1
    
    public DomainException(String msg) {
        super(msg);
    }
}
