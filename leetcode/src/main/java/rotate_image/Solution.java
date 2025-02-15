package rotate_image;

/*
https://leetcode.com/problems/rotate-image/submissions/1305324484
*/

class Solution {
    public void rotate(int[][] A) {
        int n = A.length;
        for (int layer = 0; layer < n/2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = A[first][i];
                A[first][i] = A[last - offset][first];
                A[last - offset][first] = A[last][last - offset];
                A[last][last - offset] = A[i][last];
                A[i][last] = top;
            }
        }

    }
}