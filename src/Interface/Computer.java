package Interface;

public class Computer implements Information{
    private int serialNumber = 58192;
    
    public void start(){
        System.out.println("Computer Started");
    }

    public void displayInformation(){

        System.out.println("Computer serial number is : "  + serialNumber);
    }
}
