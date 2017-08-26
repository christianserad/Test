
import java.util.Scanner;

/**
 * A class that stores, and returns or display employee name
 *
 * @author Christian Romar Paul Serad
 */
public class Employee {

    

    /**
     * The main method inputs and outputs employee name A method to test the
     * Employee Object
     *
     * @param args unused
     */
    public static void main(String[] args) throws InterruptedException {
        
        String[] b = {"","","",""};
        
        for(int i = 0; i < b.length; i++){
            switch(i){
                case 0:
                    b[i] = "hello ";
                    break;
                case 1:
                    b[i] = "everyone ";
                    break;
                case 2:
                    b[i] = "whats ";
                    break;
                case 3:
                    b[i] = "up ";
            }
            System.out.print(b[i]);
        }
        
        System.out.println("");
        
        for(String e: b){
            System.out.print(e);
        }
        
        System.out.println("");
        int[] x = new int[4];
        for(int i = 0; i < x.length; i++){
            x[i] = 5;
        }
        int[] c = x;
        
        for(int element: c){
            System.out.println(element);
        }
        
        System.out.println("");
        
        for(int i = 0; i < c.length; i++){
            c[i] = 10;
        }
        
        System.out.println("");
        
        for(int t: x){
            System.out.println(t);
        }
        
         
    }

}
