package ArrayList;

import java.util.ArrayList;

public class pairSum1 {
    public static void main(String args[]) {
        int target = 11;
        ArrayList<Integer> pair = new ArrayList<>();
        pair.add(1);
        pair.add(2);
        pair.add(3);
        pair.add(4);
        pair.add(5);
        pair.add(6);
        pair.add(7);
        pair.add(8);    
        pairsum(pair, target);
    }

    static void pairsum(ArrayList<Integer> pair, int target) {
        int l = 0, r = pair.size() - 1;
        while (l < r) {
            int sum = pair.get(l) + pair.get(r);
            if (sum == target) {
                System.out.println(pair.get(l) + " + " + pair.get(r) + " = " + target);
                return;
            } else if (sum < target) {
                l++; 
            } else {
                r--; 
            }
        }
        System.out.println("Pair not found");
    }
}
