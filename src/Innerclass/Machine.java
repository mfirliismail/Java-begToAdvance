package Innerclass;

public class Machine {
    private int id;

    public Machine(int id) {
        this.id = id;
    }

    public void run(){
        System.out.println("Run Machine " + id);
    }
}
