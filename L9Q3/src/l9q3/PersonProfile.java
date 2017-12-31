
package l9q3;

import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
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
    
    public void displayPerson(){
        System.out.printf("Name : %s\n",name);
        System.out.printf("Gender : %s\n",gender);
        System.out.printf("Date of birth : %s\n",DoB); 
    }
}

class Lecturer extends PersonProfile {
    
    private static NumberFormat df =  new DecimalFormat("##.#");
    
    private String cCodes[];
    private String cNames[];
    private int session[];
    private int semester[];
    private int creditHour[];
    private int students[];
    private double totalCredit[];
    private int size; //total amount of data in each category(Course codes, course names,...)
    
    public Lecturer() throws FileNotFoundException, IOException{
        Scanner in = new Scanner(new FileReader("lecturer.txt"));
        LineNumberReader lnr =  new LineNumberReader(new FileReader("lecturer.txt"));
        
        String ln = "";
        
        while((ln = lnr.readLine())!= null){     
        }
        size = lnr.getLineNumber()/6;
        
        cCodes = new String[size];
        cNames = new String[size];
        session = new int[size];
        semester = new int[size];
        creditHour = new int[size];
        students =  new int[size];
        totalCredit = new double[size];
        
        for(int i = 0; i < size; i++){
            cCodes[i] = in.nextLine();
            cNames[i] = in.nextLine();
            semester[i] = Integer.parseInt(in.nextLine());
            session[i] = Integer.parseInt(in.nextLine());
            creditHour[i] = Integer.parseInt(in.nextLine());
            students[i] = Integer.parseInt(in.nextLine());
        }
    }
    
    public void getCreditHour(){
        for(int x = 0; x < size; x++){
            if(students[x] < 50){
                totalCredit[x] = creditHour[x]*1;
            }
            else if(students[x] < 100){
                totalCredit[x] = creditHour[x]*1.5;
            }
            else if(students[x] < 150){
                totalCredit[x] = creditHour[x]*2;
            }
            else if(students[x] >= 150){
                totalCredit[x] = creditHour[x]*3;
            }
        }
    }
    public void displayCourse(){
        System.out.println("Course Name   Course Course                        Session    Semester    Credit Hour  Number of students");
        for(int x = 0; x < size; x++){            
            System.out.printf("%-13s %-38s %-12d %-8d",cCodes[x],cNames[x],session[x],semester[x]);
            System.out.printf("%11s %19d",df.format(totalCredit[x]),students[x]);
            System.out.println("");
        }
    }
}
