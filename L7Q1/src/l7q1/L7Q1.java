
package l7q1;

import java.io.*;
import java.util.Scanner;

public class L7Q1 {

    public static void main(String[] args){
        
        String[] code = {"WXES1116","WXES1115","WXES1110","WXES1112"};
        String[] name = {"Programming I", "Data Structure", "Operating System","Computing Mathematics I"};
                
        try{     
            FileOutputStream fis = new FileOutputStream("course.txt");
            ObjectOutputStream obj = new ObjectOutputStream(fis); 
    
            for(int i=0;i<code.length; i++){
                obj.writeUTF(code[i]);
                obj.writeUTF(name[i]);
            }
            
            obj.close();
            
        }catch (IOException e){
            System.out.println("Problem with file output");
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter code : ");
        String course_code  = sc.next();
        
        try{
            
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("course.dat"));
            while(true){
                if(course_code.equals(in.readUTF())){
                    System.out.println(in.readUTF());
                    break;
                }
            }
                      
            in.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("Problem with file output");
        }
        
    }
    
}
