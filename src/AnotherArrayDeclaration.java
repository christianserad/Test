
/**
 *
 * @author christian
 */
public class AnotherArrayDeclaration {
    public static void main(String[] args) {
        String x = "Hello";
        
        System.out.println(x.substring(1,2));
        char y = x.charAt(1);
        System.out.println("here is some char: " + y);
        
        char[] p = x.toCharArray();
        
        for(char e: p){
            System.out.print(e);
        }
        System.out.println("");
    }
}
