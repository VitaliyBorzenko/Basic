import java.util.ArrayList;
/*
public class LeetCode {

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if((j-i+1) % 2 == 1){
                    int curSum = 0;
                    for(int k = i; k <= j; k++){
                    curSum += arr[k];
                    }
                    sum += curSum;
                }
            }
        }
        return sum;
    }
}

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";

        for(int i=0;i<word1.length;i++){
            s1 += word1[i];
        }

        for(int i=0;i<word2.length;i++){
            s2 += word2[i];
        }

        return s1.equals(s2);
    }
}

   double num = 14;
           int count = 0;
            while (num!=0){
                if (num%2 == 0) {
                    num = num / 2;
                } else num--;
                    count++;
                }
        return count;


    class Solution {
        public boolean isPalindrome(int x) {
            int i = x;
            int num = 0;
            while(i>=1) {
                int rem = i%10;
                num = num*10+rem;
                i=i/10;
            }
            return num==x;
        }
    }


    class Solution {
        public String restoreString(String s, int[] indices) {
            char[] charArray = new char[indices.length];
            for(int i=0;i<indices.length;i++){
                charArray[indices[i]] = s.charAt(i);
            }
            return new String(charArray);
        }
    }
*/