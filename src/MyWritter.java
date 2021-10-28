import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Map;

public class MyWritter {
    public static void write(Map<String, Integer> data) {
        BufferedWriter bw = null;
        try{
            File file = new File("./data/output.txt");

            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);

            for (Map.Entry<String, Integer> pair : data.entrySet()) {
                bw.write(String.valueOf(pair).concat("\n"));

            }
            System.out.println("File written Successfully");
        }catch (Exception e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }finally
        {
            try{
                if(bw!=null)
                    bw.close();
            }catch(Exception ex){
                System.out.println("Error in closing the BufferedWriter"+ex);
            }
        }
    }
}
