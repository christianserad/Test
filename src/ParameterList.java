
/**
 *
 * @author christian
 */
public class ParameterList {
    public static void total(int ... number){
        System.out.println(number.length);
        System.out.println("My Number: " + number[3]);
        System.out.println("ALL THE NUMBERS:");
        for(int e: number){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Here is the number: ");
        total(1,2,3,4,5);
    }
}
