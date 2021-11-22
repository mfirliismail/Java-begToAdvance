package MultipleExeptions;
import java.io.IOException;
import java.text.ParseException;

public class App {
    
    public static void main(String[] args) {
        Multiple me = new Multiple();

        // try {
        //     me.start();
        // } catch (IOException e) {
        //     //TODO: handle exception
        //     e.printStackTrace();
        // } catch (ParseException e){
        //     System.out.println("Incorect format");
        // }

        // try {
        //     me.start();
            
        // } catch (IOException | ParseException e) {
        //     //TODO: handle exception
        //     e.printStackTrace();
        // }

        try {
            me.start();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    
}
