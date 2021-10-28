import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> data = MyReader.read("data/text.txt");

        MyWritter.write(data);
        Calculating cl = new Calculating(data);
        cl.getMinMax();
        cl.getAvgLength();

    }
}
