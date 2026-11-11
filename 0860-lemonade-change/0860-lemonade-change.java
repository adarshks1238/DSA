class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int five = 0;
        int ten = 0;

        for(int a : bills)
        {
            if(a==5)
            {
                five ++;
            }
            else if(a==10)
            {
                if(five == 0)
                {
                    return false;
                }
                five--;
                ten++;
            }
            else if(a == 20)
            {
                if(five>0 && ten >0)
                {
                    five--;
                    ten--;
                }
                else if(five>=3)
                {
                    five = five -3;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}