import java.util.LinkedHashMap;
import java.util.TreeSet;

class KTimesRep {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        int nums[] = { 3, 1, 3, 1, 0, 2, 3, 2, 2, 1,1 };
        int n = 11, k = 3;
        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }
        for (Integer x : hm.keySet()) {
            if (hm.get(x) == k) {
                ts.add(x);
            }
        }
        int x = ts.first();
        System.out.println(x);
        System.out.println("Thank you!");

    }
}
