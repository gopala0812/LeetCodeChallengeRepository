package Decode_XORed_Array;

import java.util.*;

class DecodeXORedArray {

    public int[] decode(int[] encoded, int first) {
        int arr[] = new int[encoded.length + 1];
        arr[0] = first;

        for(int i = 0; i < encoded.length; i++) {
            arr[i + 1] = arr[i] ^ encoded[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        DecodeXORedArray obj = new DecodeXORedArray();
        int[] encoded = {1,2,3};
        int first = 1;
        System.out.println(Arrays.toString(obj.decode(encoded, first)));
        // Output: [1, 0, 2, 1]
    }
}
