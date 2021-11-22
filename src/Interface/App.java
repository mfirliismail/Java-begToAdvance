package Interface;

public class App {
    public static void main(String[] args) {
        
        Computer computer1 = new Computer();
        computer1.start();

        Vehicle vehicle1 = new Vehicle("Car");
        vehicle1.drive();

        // cannot inisiasi interface bisanya object  atau class yang diatas

        Information info = new Computer();
        info.displayInformation();

        Information info1 = vehicle1;
        info1.displayInformation();

        System.out.println();
        showInformation(computer1);
        showInformation(vehicle1);


    }

    public static void showInformation(Information type){
        type.displayInformation();
    }
}
