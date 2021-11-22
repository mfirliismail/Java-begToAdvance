package Innerclass;

public class Machine {
    private int id;

    // inner class
    class ArtificialIntelligence {
        public void activate(){
            System.out.println("Machine " + id + " is Activated");
        }
    }

    static class Tire {
        public void repair() {
            System.out.println("Tires are repaired ");
        }
    }

    public Machine(int id) {
        this.id = id;
    }

    public void run(){
        System.out.println("Run Machine " + id);

        ArtificialIntelligence ai = new ArtificialIntelligence();

        ai.activate();

        final String type = "electric";

        class Test {

            public void example(){
                System.out.println("id is " + id);
                System.out.println("type is " + type);
            }
        }

        Test test = new Test();
        test.example();
    }
}
