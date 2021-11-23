package ArrayList;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        ArrayList<Integer> values = new ArrayList<Integer>();
        // [0][1][2][3][4]

        
        values.add(20);
        values.add(50);
        values.add(200);

        System.out.println(values.get(2));

        for( int i = 0; i < values.size(); i++){
            System.out.println(values.get(i));
        }
        values.remove(0);

        for(Integer myValues: values){
            System.out.println(myValues);
        }

    }
}
