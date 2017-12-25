
package l9q2;

import java.io.*;
import java.util.Scanner;

public class PersonProfile {
    
    private String name;
    private String gender;
    private String DoB;  //date of birth
    
    public PersonProfile(String name, String gender,int year, int month, int day){
        this.name = name;
        this.gender = gender;
        String year1 = Integer.toString(year);
        String month1 = Integer.toString(month);
        String day1 =  Integer.toString(day);
        this.DoB = day1+"/"+month1+"/"+year1;
    }
    public PersonProfile(){}
    
    public void display(){
        System.out.printf("Name : %s\n",name);
        System.out.printf("Gender : %s\n",gender);
        System.out.printf("Date of birth : %s\n",DoB);
        System.out.println("Course Name   Course Course                        Session    Semester    Grade");
//        System.out.printf("");
//        System.out.printf("");
//        System.out.printf("");        
        for(int x = 0; x < 5; x++){
            //System.out.println(cNames+);
        }
    }
}

class Student extends PersonProfile {
    
    private String cCodes[];
    private String cNames[];
    private int session[];
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
        session = new int[size];
        semester = new int[size];
        mark = new int[size];
        
        for(int i = 0; i < size; i++){
            cCodes[i] = in.nextLine();
            cNames[i] = in.nextLine();
            session[i] = Integer.parseInt(in.nextLine());
            semester[i] = Integer.parseInt(in.nextLine());
            mark[i] = Integer.parseInt(in.nextLine());
        }
        
        
    }
    public void displayDetails(){
        for(int x = 0; x < 5; x++){
//            System.out.println(cCodes[x]);
//            System.out.println(cNames[x]);
//            System.out.println(session[x]);
//            System.out.println(semester[x]);
//            System.out.println(mark[x]+"\n");
            String grade = getGrade(mark[x]);
            System.out.printf("%-13s %-38s %-12d %-8d %s\n",cCodes[x],cNames[x],session[x],semester[x],grade);
        }
    }
    public String getGrade(int mark){
        if(mark < 35){
            return "F";
        }
        else if(mark < 44){
            return "E";
        }
        else if(mark < 49){
            return "D";
        }
        else if(mark < 54){
            return "C";
        }
        else if(mark < 59){
            return "C+";
        }
        else if(mark < 64){
            return "B-";
        }
        else if(mark < 69){
            return "B";
        }
        else if(mark < 74){
            return "B+";
        }
        else if(mark < 84){
            return "A-";
        }
        else
            return "A";
    }
    
}
