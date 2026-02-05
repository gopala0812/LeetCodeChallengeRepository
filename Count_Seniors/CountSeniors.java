package Count_Seniors;

import java.util.*;

class CountSeniors {

    public int countSeniors(String[] details) {
        int s = 0;

        for(int i = 0; i < details.length; i++) {
            String a = "" + details[i].charAt(11) + details[i].charAt(12);
            int age = Integer.parseInt(a);

            if(age > 60) {
                s++;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        CountSeniors obj = new CountSeniors();
        String[] details = {
            "7868190130M7522",
            "5303914400F9211",
            "9273338290F4010"
        };
        System.out.println(obj.countSeniors(details)); // 2
    }
}
