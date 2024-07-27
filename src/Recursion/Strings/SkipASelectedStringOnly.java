package Recursion.Strings;

class SkipASelectedStringOnly {
    public static void main(String[] args) {
        System.out.println(skipString("bachakapplehg"));
        System.out.println(skipString("bachapappcool"));
    }

    static String skipString(String up){
        if (up.isEmpty()){
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")){
            return skipString(up.substring(3));
        } else {
            return up.charAt(0) + skipString(up.substring(1));
        }
    }
}
