import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;


public class Ex1 {
    private static final Logger logger = Logger.getLogger("Ex1.class");
    
    
    public Ex1() {
        
       
    }

    public void LogSmtx(String msg){
        logger.info(msg);
        logger.warning(msg);
        logger.severe(msg);
        
    }

    public ArrayList<String> GetInfoLog(){
        var list = new ArrayList<String>();
        try {
            File file = new File("log.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                if(line.startsWith("INFO"))
                    list.add(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            logger.severe(e.toString());
        } catch (IOException e) {
            logger.severe(e.toString());
        }
        return list;
    }
    
    public void printToConsole(ArrayList<String> lst){
        for(String item : lst)
        System.out.println(item);
    }


}