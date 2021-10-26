import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class MyReader {
    public static Map<String, Integer> read(String path) {
        String row;
        String[] rowData;
        String[] words;
        Map<String, Integer> data = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((row = reader.readLine()) != null) {
                rowData = row.split("\\s+");
                for (int i = 0; i < rowData.length; i++) {
                    if (data.containsKey(rowData[i])) {
                        int count = data.get(rowData[i]);
                        count++;
                        data.put(rowData[i], count);
                    } else {
                        data.put(rowData[i], 1);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

}
