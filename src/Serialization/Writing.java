package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Writing {
    public static void main(String[] args) {
        System.out.println("Writing objects..");

        Vehicle car = new Vehicle(501, "Toyota");
        Vehicle truck = new Vehicle(219, "Ford");

        System.out.println(car);
        System.out.println(truck);

       try ( FileOutputStream fileOutput = new FileOutputStream("vehicle.data")) {
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);

            objectOutput.writeObject(car);
            objectOutput.writeObject(truck);

            objectOutput.close();

       } catch (Exception e) {
           //TODO: handle exception
           e.printStackTrace();
       }


    }
    
}
