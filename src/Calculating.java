import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Calculating {
    Map<String,Integer> data;

    public Calculating(Map<String,Integer> data) {
        this.data = data;

    }
    public String getMinMax(){
        Comparator<String> strLenCmp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };
        String maxStr = Collections.max(data.keySet(), strLenCmp);
        String minStr = Collections.min(data.keySet(), strLenCmp);

        System.out.println("The smaller word in this text is: '" + minStr + "'");
        System.out.println("The biggest word in this text is: '" + maxStr + "'");
        return maxStr;
    }

    public int getAvgLength(){
        int avgLength;
        int tmp = 0;
        for (Map.Entry<String, Integer> pair : data.entrySet()) {
            tmp += pair.getKey().length();
        }
        avgLength = tmp/data.size();
        System.out.println("The average length of words in this text is: " + avgLength);
        return avgLength;
    }




}
