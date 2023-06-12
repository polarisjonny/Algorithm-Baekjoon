import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] chArr = a.toCharArray();
        String result = "";
        
        for(int i = 0; i < chArr.length; i++) {
            //소문자일 경우
            if(Character.isLowerCase(chArr[i])) {
                result += Character.toUpperCase(chArr[i]);
            } else {
                result += Character.toLowerCase(chArr[i]);
            }
        }
        
        System.out.println(result);
    }
}