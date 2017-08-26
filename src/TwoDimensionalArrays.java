import java.util.Scanner;
/**
 *
 * @author christian
 */
public class TwoDimensionalArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declaration
        int[][] x = {{1,2,3,4,5,6,8,4},{1,2,3,4,5}};
        
        System.out.println(x.length);
        System.out.println(x[0].length);
        System.out.println(x[1].length);
        
        System.out.println("");
        
        //other ways fo declaration 
        int[][] y = new int[2][7];
        
        y[0] = new int[5];
        
        System.out.println(y[0].length);
        System.out.println(y);
        
        //processing
        
        //standard for loop
        for(int row = 0; row < y.length; row++){
            for(int col = 0; col < y[row].length; col++){
                if (row == 0){
                    y[row][col] = 5;
                }else{
                    y[row][col] = 10;
                }
            }
        }
        
        //enhanced for loop
        for(int[] e: y){
            for(int b: e){
                System.out.print(b + " ");
            }
            System.out.println("");
        }
    }
}
