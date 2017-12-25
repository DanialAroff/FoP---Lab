
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
    }
}

class Lecturer extends PersonProfile {
    
    
}
