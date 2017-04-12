
package example;

import com.opencsv.*;
import java.io.*;
import org.apache.commons.lang.WordUtils;
import java.util.*;
import java.lang.*;

public class Hello {
    public static void main(String[] args) {
        String  message = "hello ivy !";
        System.out.println("standard message : " + message);
        System.out.println("capitalized by " + WordUtils.class.getName() 
                                + " : " + WordUtils.capitalizeFully(message));
    	try{
          int monmax=0;
          CSVReader csvReader = new CSVReader(new FileReader("data.csv"));
          //System.out.println("test 1");
          List content = csvReader.readAll();
          //System.out.println("test 2");
          String[] row;
          for (Object object : content) {
            //System.out.println("test "+monmax);
              row = (String[]) object;
              //System.out.println(row[0] + " # " + row[1] + " #  " + row[2]);
              monmax++;
          }
          csvReader.close();
          System.out.println("Nombre lu : "+monmax);
        }
        catch(FileNotFoundException e){}
        catch(IOException e){}
    }
}