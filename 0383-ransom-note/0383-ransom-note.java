class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char container [] = magazine.toCharArray();
        char contain [] = ransomNote.toCharArray();
        Arrays.sort(container);
        Arrays.sort(contain);
        int pointer1 = 0;
        int pointer2 = 0;

        while(pointer1<container.length && pointer2<contain.length)
        {
            if(container[pointer1]==contain[pointer2])
            {
                pointer2++;
            }
            pointer1++;
        }
        return pointer2 == ransomNote.length();
    }
}