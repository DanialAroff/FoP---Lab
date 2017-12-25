
package l9q2;

import java.io.*;
import java.util.Scanner;

public class PersonProfile {
    
    private String name;
    private String gender;
    private String DoB;  //date of birth
    
    public PersonProfile(){}
    
    public void display(){
        //System.out.printf(name);
        //System.out.printf("");
        System.out.printf("");
        for(int x = 0; x < 5; x++){
            //System.out.println(cNames+);
        }
    }
}

class Student extends PersonProfile {
    
    private String cCodes[];
    private String cNames[];
    private String session[];
    private int semester[];
    private int mark[];
    
    public Student() throws FileNotFoundException, IOException{
        Scanner in = new Scanner(new FileReader("course.txt"));
        LineNumberReader liner = new LineNumberReader(new FileReader("course.txt"));
        
        String fileName;
        
        String l = "";
        while((l = liner.readLine())!= null){         
        }
        int size = liner.getLineNumber()/5;
        
        cCodes = new String[size];
        cNames = new String[size];
        session = new String[size];
        semester = new int[size];
        mark = new int[size];
        
        for(int i = 0; i < size; i++){
            cCodes[i] = in.nextLine();
            cNames[i] = in.nextLine().replaceAll("[^0-9A-Za-z]", "");
            session[i] = in.nextLine().replaceAll("[^0-9]", "");
            semester[i] = in.nextInt();
            mark[i] = in.nextInt();
        }
        
        
    }
    public void display1(){
        for(int x = 0; x < 5; x++){
            System.out.println(cNames+"\n");
        }
    }
    
}
