
import java.util.Random;



/**
 *
 * @author christian
 */
public class Student {
    public static void main(String[] args) throws InterruptedException {
        Random hey = new Random();
        
        while(true){
            System.out.println(1+hey.nextInt(5));
            Thread.sleep(300);
        }
        
    }
    
}
