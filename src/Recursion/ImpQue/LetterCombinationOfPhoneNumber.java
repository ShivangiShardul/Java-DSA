package Recursion.ImpQue;

import java.util.ArrayList;

class LetterCombinationOfPhoneNumber {
    public static void main(String[] args) {
        phonePad("","12");
//        System.out.println(phonePadList("","1"));
//        System.out.println(phonePadCount("","1"));
    }

    static void phonePad(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);

            phonePad(p+ch,up.substring(1));
        }
    }

//    static ArrayList<String> phonePadList(String p, String up){
//        if (up.isEmpty()){
//            ArrayList<String> list = new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//
//        int digit = up.charAt(0) - '0';
//
//        ArrayList<String> list = new ArrayList<>();
//
//        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
//            char ch = (char) ('a' + i);
//            list.addAll(phonePadList(p+ch,up.substring(1)));
//        }
//
//        return list;
//    }
//
//    static int phonePadCount(String p, String up){
//        if (up.isEmpty()){
//            return 1;
//        }
//
//        int count = 0;
//        int digit = up.charAt(0) - '0';
//
//        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
//            char ch = (char) ('a' + i);
//
//            count = count + phonePadCount(p+ch,up.substring(1));
//        }
//        return count;
//    }
}
