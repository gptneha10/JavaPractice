//how to find duplicate number in integer element in java

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 2, 5};

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
