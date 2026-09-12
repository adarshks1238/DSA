class Solution {
    public String mergeAlternately(String word1, String word2) {
        String merged="";
        int pword1 = 0;
        int pword2 = 0;

        while(pword1 < word1.length() || pword2 < word2.length())
        {
            if(pword1 < word1.length())
            {
                merged = merged + word1.charAt(pword1);
                pword1++;
            }
            if(pword2 < word2.length())
            {
                merged = merged + word2.charAt(pword2);
                pword2++;
            }
        }
        return merged;
    }
}