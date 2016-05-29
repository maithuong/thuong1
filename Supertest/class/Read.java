/**
 * 
 */
package count.example;

/**
 * @author Maithuong
 *
 */
import java.io.*;

public class Read {
 
    public static void main(String[] args) {
         
        try(FileInputStream fin=new FileInputStream("G://s.csv"))
        {
            System.out.println("Размер файла: " + fin.available() + " байт(а)");
             
            int i=-1;
            while((i=fin.read())!=-1){
             
                System.out.print((char)i);
            }   
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    } 
}