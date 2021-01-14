/*
https://leetcode.com/problems/climbing-stairs/
https://www.geeksforgeeks.org/count-ways-reach-nth-stair/

Note: either climb 1 or 2 steps
*/

import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}