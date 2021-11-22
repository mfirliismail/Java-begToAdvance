public class Car extends Vehicle{
    
    @Override
    public void design(){
        System.out.println("Car Design");
    }

    public void engineStart(){
        System.out.println("Start the engine");
    }

    public void ride(){
        System.out.println("Riding the car");
    }
}
