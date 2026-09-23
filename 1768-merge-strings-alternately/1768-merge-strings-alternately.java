class Solution {
    public String mergeAlternately(String word1, String word2) {
        String merged = "";
        int countword1 = 0;
        int countword2 = 0;

        while(countword1<word1.length() || countword2<word2.length())
        {
            if(countword1<word1.length())
            {
                merged = merged + word1.charAt(countword1);
                countword1++;
            }
            if(countword2<word2.length())
            {
                merged = merged + word2.charAt(countword2);
                countword2++;

            }
        }
        return merged;
    }
}