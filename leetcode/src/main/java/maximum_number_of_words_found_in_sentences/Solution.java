package maximum_number_of_words_found_in_sentences;

/*
Description: https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
Runtime: 11 ms, faster than 11.74% of Java online submissions for Maximum Number of Words Found in Sentences.
Memory Usage: 44.1 MB, less than 19.99% of Java online submissions for Maximum Number of Words Found in Sentences.
Time Submitted: 02/22/2022 23:00
*/

class Solution {
    public int mostWordsFound(String[] sentences) {
        Long countMax = 0L, currentCount = 0L;

        for (String sentence : sentences) {
            currentCount = 1 + sentence.chars().filter(ch -> ch == ' ').count();
            if (currentCount > countMax) {
                countMax = currentCount;
            }
        }
        return countMax.intValue();
    }
}
