import java.util.Scanner;

public class switchstatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter The Intructions: ");
        String text = input.nextLine();

        switch(text){
            case "run":
                System.out.println("Program running.. (type 'stop' to Stop the Program) ");
                break;
            case "stop":
                System.out.println("Program Stopped");
                break;
            default:
                System.out.println("Intruction cannot be recognized");
        }
    }

}
