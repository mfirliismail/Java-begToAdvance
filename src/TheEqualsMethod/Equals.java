package TheEqualsMethod;

class Laptop {
    private int id;
    private String brand;
    public Laptop(int id, String brand){
        this.id = id;
        this.brand = brand;
    }

    @Override
    public String toString(){
        return "Laptop [id=]" + id + ", brand = " + brand;
    }

}

public class Equals {
    public static void main(String[] args) {
        
        Laptop laptop1 = new Laptop(1, "ASUS");
        Laptop laptop2 = new Laptop(2, "HP");

        System.out.println(laptop1 == laptop2);

    }
}
