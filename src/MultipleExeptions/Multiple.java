package MultipleExeptions;

import java.io.IOException;
import java.text.ParseException;

public class Multiple {
    public void start() throws IOException, ParseException {
        
        throw new ParseException("error at line 10", 2);


    }

    public void example() throws IOException, ParseException{

        

    }
}
