public class AppLoop {
    public static void main(String[] args) {
       whileLoop();

       forLoop();

       ifStatement();
    }

    public static void whileLoop(){
        int i = 0;

        while(i < 10){
            System.out.println(i);
            i++;
        }

        int number = 23;

        while(number < 34){
            
            if(number % 2 == 0){
                System.out.println("ini Okay genap : "+ number);
                number++;
            }else {
                System.out.println("Okay" + number );
            number++;
            }
        }
    }

    public static void forLoop(){
       int num = 20;
       for(int i = 1; i < num; i= i*2){
        System.out.println(i);
       }
    }

    public static void ifStatement(){
        for(int i =1; i <= 15; i++){
            if( i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0 && i % 5 != 0){
                System.out.println(("Fizz"));
            } else if(i % 3 != 0 && i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

}
