class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character,Integer> m = new HashMap<>();

        for(char a:s.toCharArray())
        {
            m.put(a,m.getOrDefault(a,0)+1);
        }

        for(char a:t.toCharArray())
        {
            m.put(a,m.getOrDefault(a,0)-1);
        }

        boolean result = true;

        for(int value:m.values())
        {
            if(value!=0)
            {
                result = false;
                break;
            }
        }
        return result;
    }
}