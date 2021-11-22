package Enum;

public class App {



    public static void main(String[] args) {
        
        Color color = Color.BLUE;


        switch(color){
            case GREEN:
                System.out.println("Warnanya hijau");
                break;
            case RED:
                System.out.println("Warnanya merah");
                break;
            case BLUE:
                System.out.println("Warnanya biru");
                break;
            default:
                break;
            
        }

        System.out.println(Color.RED);
        System.out.println(Color.GREEN.getMeaning());
    }
}
