class Program {
    int value;
    String text;
    public Program(){
        this(5);
       
        System.out.println("first controctur");

        value = 12;
    }

    public Program(int value){
        this(2, "test");
        this.value = value;;

        System.out.println("Second constractor");
    }

    public Program(int value, String text){
        this.value = value;
        this.text = text;

        System.out.println("Third Constructor");
    }

}

public class Constructor {
    
  public static void main(String[] args) {
      Program myProgram = new Program();

      Program myProgram1= new Program(2);

      Program myProgram2 = new Program(5, "This is string");

  }
    
}