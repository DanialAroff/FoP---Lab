
package l7q2;

import java.io.*;
import java.util.Scanner;
import java.net.URL;
import java.net.URLConnection;

public class L7Q2 {

    public static void main(String[] args) {
        try {
            URL u = new URL("http://www.fsktm.um.edu.my");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            
            File file = new File("index.htm");
            PrintWriter out = new PrintWriter(file);
            while(in.hasNextLine()) {
                String s = in.nextLine();
                out.write(s);
        }

        }catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }
//        try{
//            
//            out.close();
//            
//        }catch (IOException e){
//            System.out.println("Problem with output");
//        }
    }
    
}
