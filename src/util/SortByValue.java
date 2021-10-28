package util;

import java.util.*;

public class SortByValue {
    public static<K extends Comparable<K>, V extends Comparable<V>> Map<K, V> sortByValue(Map<K, V> unsortedMap) {

        Comparator<Map.Entry<K, V>> valueComparator = new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
                V v1 = e1.getValue();
                V v2 = e2.getValue();
                int result = v1.compareTo(v2);
                if (result == 0) {
                    K k1 = e1.getKey();
                    K k2 = e2.getKey();
                    result = k1.compareTo(k2);
                }
                return -result;
            }
        };

        List<Map.Entry<K, V>> listOfEntries = new ArrayList<Map.Entry<K, V>>(unsortedMap.entrySet());
        Collections.sort(listOfEntries, valueComparator);

        Map<K, V> sortedMap = new LinkedHashMap<>(listOfEntries.size());

        for (Map.Entry<K, V> entry : listOfEntries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}
