public class Solution {
    public static String replaceSpace(StringBuffer str) {
        String s = "";
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)==' ') {
                s+="%20";
            }
            else {
                s += str.charAt(i);
            }
        }
        return s;
    }

    public static void main(String args[]) {
        StringBuffer str = new StringBuffer("This is a word");
        System.out.print(Solution.replaceSpace(str));
    }
}