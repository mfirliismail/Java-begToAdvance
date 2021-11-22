package Innerclass;

public class App {
    public static void main(String[] args) {
        
        Machine machine1 = new Machine(12);

        machine1.run();

        Machine.Tire tire = new Machine.Tire();

        tire.repair();

    }
}
