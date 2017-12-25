
package l9q2;

import java.io.IOException;

public class L9Q2 {

    public static void main(String[] args) throws IOException {
        PersonProfile pp = new PersonProfile("Hoopa", "Male", 1998,8,11);
        Student s =  new Student();
        
        pp.display();
        s.displayDetails();
    }
    
}
