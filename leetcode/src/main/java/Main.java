import longest_common_prefix.Solution;

class Main {
    public static void main(String[] args) {
//        String[] input = {"a","b"};
//        String[] input = {"reflower","flow","flight"};
//        String[] input = {"", "b"};
//        String[] input = {"a"};
//        String[] input = {"flower", "flow", "flight"};
//        String[] input = {"dog","racecar","car"};
//        String[] input = {"abc"};
        String[] input = {"abc", "ab"};
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(input));
    }
}