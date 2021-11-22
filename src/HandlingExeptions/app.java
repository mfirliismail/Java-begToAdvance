package HandlingExeptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class app{
    public static void main(String[] args){
        

        File file = new File("example.txt");

        try {
            Scanner readFile = new Scanner(file);
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }
      


    }
}