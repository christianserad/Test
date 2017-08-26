
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Christian Romar Paul Serad
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();
        user.setNumber(2);
        objectuser user2 = (objectuser)user.clone();
        
        
        System.out.println("user " + user.getNumber());
        System.out.println("user2 " + user2.getNumber());
        
        user.setNumber2(100);
        System.out.println("");
        
        System.out.println("user " + user.getNumber());
        System.out.println("user2 " + user2.getNumber());
    }


}

        
