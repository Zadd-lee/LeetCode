class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";

        int len1 = word1.length();
        int len2 = word2.length();
        int minlen;
        if (len1 >= len2) {
            minlen = len2;
        } else {
            minlen = len1;
        }

        for (int ind = 0; ind < minlen; ind++) {
            result += word1.charAt(ind);
            result += word2.charAt(ind);
        }
        if (len1 == minlen) {
            result += word2.substring(minlen);
        } else {
            result += word1.substring(minlen);

        }

        return result;
    }
}