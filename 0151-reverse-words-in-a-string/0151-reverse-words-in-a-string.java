class Solution {
    public String reverseWords(String s) {
        String [] str = s.trim().split("\\s+");
        
        StringBuilder rev = new StringBuilder();

        for(int i=str.length-1;i>=0;i--)
        {
            rev.append(str[i]);
            if(i!=0)
            {
                rev.append(" ");
            }
        }
        return rev.toString();
    }
}