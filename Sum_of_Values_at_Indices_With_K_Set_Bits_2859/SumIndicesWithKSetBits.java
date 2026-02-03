package Sum_of_Values_at_Indices_With_K_Set_Bits_2859;

import java.util.*;

class SumIndicesWithKSetBits {

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;

        for(int i = 0; i < nums.size(); i++) {
            int count = 0;
            int j = i;

            while(j != 0) {
                int b = j % 2;
                if(b == 1) {
                    count += 1;
                }
                j /= 2;
            }

            if(count == k) {
                sum += nums.get(i);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        SumIndicesWithKSetBits obj = new SumIndicesWithKSetBits();
        List<Integer> nums = Arrays.asList(5, 10, 1, 5, 2);
        int k = 1;
        System.out.println(obj.sumIndicesWithKSetBits(nums, k)); // 13
    }
}
