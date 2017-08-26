
package ReadingFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author christian
 */
public class FileInputOutput {
    public static void main(String[] args) throws IOException {
        File file;
        FileReader reader = null;
        PrintWriter writer = null;
        FileOutputStream imageWriter = null;
        try{
            file = new File("hey.txt");
            reader = new FileReader(file);
            writer = new PrintWriter("output.txt");
            imageWriter = new FileOutputStream("image.jpg");
            while(true){
                int code = reader.read();
                if(code == -1){
                    break;
                }
                writer.print(code);
            }
            
            
//            reader = new FileInputStream("output.txt");
            
            /*
            while(true){
                int code = reader.read();
                if(code == -1){
                    break;
                }
                imageWriter.write(code);
            }
            */
//            for(int i = 0; i < 200; i++){
//                int code = reader.read();
//                imageWriter.write(code);
//            }
            
            
            
            
        }
        catch(FileNotFoundException e){
            System.out.println("File not Found!!");
        } catch (IOException e) {
            System.out.println("SoME KIND OF ERROR I DONT KNOW");
        }
        finally{
            if(reader != null){
                reader.close();
            }
            if(writer != null){
                writer.close();
            }
        }
    }
}
