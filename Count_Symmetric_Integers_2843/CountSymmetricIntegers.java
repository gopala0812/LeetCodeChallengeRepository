package Count_Symmetric_Integers_2843;

import java.util.*;

class CountSymmetricIntegers {

    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for(int x = low; x <= high; x++) {
            String s = String.valueOf(x);
            int len = s.length();

            if(len % 2 != 0) {
                continue;
            }

            int mid = len / 2;
            int sum1 = 0, sum2 = 0;

            for(int i = 0; i < mid; i++) {
                sum1 += s.charAt(i) - '0';
                sum2 += s.charAt(i + mid) - '0';
            }

            if(sum1 == sum2) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountSymmetricIntegers obj = new CountSymmetricIntegers();
        System.out.println(obj.countSymmetricIntegers(1, 100));   // 9
        System.out.println(obj.countSymmetricIntegers(1200, 1230)); // 4
    }
}
