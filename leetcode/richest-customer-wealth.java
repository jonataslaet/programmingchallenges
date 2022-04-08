//Fonte: https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxSum = 0, currentSum = 0;
        int len = accounts.length;
        for(int i = 0; i < len; i++){
            currentSum = Arrays.stream(accounts[i]).sum();
            if (currentSum > maxSum) maxSum = currentSum;
        }
        return maxSum;
    }
}