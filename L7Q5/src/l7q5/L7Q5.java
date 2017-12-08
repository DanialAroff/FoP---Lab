
package l7q5;

import java.io.*;

public class L7Q5 {

    public static void main(String[] args) {
        
        try{
            ObjectInputStream r = new ObjectInputStream(new FileInputStream("person.dat"));
            String h;
            
//            while((h=r.readLine())!=null){
//                System.out.println(h);   
//            }
            
            //System.out.println(r.readInt());
//           
//            System.out.println(r.readLine());
            
            
            
            
            r.close();
        }catch(IOException e){
            System.out.println("Problem with output");
        }catch(NumberFormatException e){
            
        }
            
    }
    
}
