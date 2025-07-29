package ArrayList;

import java.util.ArrayList;

public class pairSum2 {
    public static void main(String args[]) {
        int target = 17;
        ArrayList<Integer> pair = new ArrayList<>();
        pair.add(11);
        pair.add(12);
        pair.add(13);
        pair.add(1);
        pair.add(5);
        pair.add(6);
        pair.add(7);
        pair.add(8);    
        System.out.println(pairsum(pair, target));
    }

    static boolean pairsum(ArrayList<Integer> pair, int target) {
        int n = pair.size();
        int br = -1;

        // Find breaking point (pivot)
        for (int i = 0; i < n - 1; i++) {
            if (pair.get(i) > pair.get(i + 1)) {
                br = i;
                break;
            }
        }

        int l = (br + 1) % n; // smallest
        int r = br;           // largest

        // Two pointer approach
        while (l != r) {
            int sum = pair.get(l) + pair.get(r);
            if (sum == target)
                return true;
            else if (sum < target)
                l = (l + 1) % n;
            else
                r = (n + r - 1) % n;
        }

        return false;
    }
}
