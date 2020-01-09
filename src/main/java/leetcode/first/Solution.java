package leetcode.first;

/*
 *  Roman To Int
 *  Referral URL : https://leetcode.com/problems/roman-to-integer/
 *
 */

import java.util.Stack;

public class Solution {
    private static final int M = 1000;
    private static final int D = 500;
    private static final int C = 100;
    private static final int L = 50;
    private static final int X = 10;
    private static final int V = 5;
    private static final int I = 1;

    public static int romanToInt(String s) {
        int nums[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M':
                    nums[i] = M;
                    break;
                case 'D':
                    nums[i] = D;
                    break;
                case 'C':
                    nums[i] = C;
                    break;
                case 'L':
                    nums[i] = L;
                    break;
                case 'X':
                    nums[i] = X;
                    break;
                case 'V':
                    nums[i] = V;
                    break;
                case 'I':
                    nums[i] = I;
                    break;
            }
        }
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1])
                sum -= nums[i];
            else
                sum += nums[i];
        }
        return sum + nums[nums.length - 1];
    }
}
