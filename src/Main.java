import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> data = MyReader.read("data/text.txt");

//        for (Map.Entry<String, Integer> pair : data.entrySet()) {
//            System.out.println(pair);
//        }
        MyWritter.write(data);


    }
}
