class Solution {
    public boolean isPalindrome(int x) {
        int rev =0;
        if(x<0)
        {
            return false;
        }
        else
        {
            for(int i=x;i>0;i=i/10)
            {
                int digit = i%10;
                rev = rev*10+digit;
            }
            return x==rev? true:false;
        }
    }
}