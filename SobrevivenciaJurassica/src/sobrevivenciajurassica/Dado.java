package sobrevivenciajurassica;

import java.util.Random;

public class Dado {
    private static Random random = new Random();
    
    public static int dado6(){
        return random.nextInt(5) + 1;
    }
    
    public static int dado3(){
        return random.nextInt(2) + 1;
    }
    
    public static int dado4(){
    return random.nextInt(3) + 1; 
    }
}
