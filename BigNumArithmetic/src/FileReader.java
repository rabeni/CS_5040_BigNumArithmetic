
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    
    
    /**
     * Constructor for the file reader.
     * @param FileName
     *                  name of the file
     * @throws FileNotFoundException
     */
    public FileReader (String FileName) throws FileNotFoundException{
        
        File newFile = new File(FileName);
        
        
        try {
            Scanner newScan = new Scanner(newFile);
            
            
            
            
            
        }
        catch (FileNotFoundException e) {
            System.out.println("Invalid File");
            e.printStackTrace();
        }
    }
    
    
}
