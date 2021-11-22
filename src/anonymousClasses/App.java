package anonymousClasses;

class Computer{

    public void shutDown(){
        System.out.println("Computer is shuting down"); 
    }
}

interface Phone {
    public void call();
}

public class App {
    public static void main(String[] args) {
        
        Computer computer1 = new Computer(){
            @Override
            public void shutDown(){
                System.out.println("MacBook is shutting down");
            }
        };
        computer1.shutDown();


        Phone phone1 = new Phone(){
            @Override
            public void call(){

                System.out.println("Calling ...");
            }
        };

        phone1.call();

    }
}
