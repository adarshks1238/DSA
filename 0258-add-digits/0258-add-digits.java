
class Solution {
    public int addDigits(int num) {
        int n = sum(num);

        while (n > 9) {
            n = sum(n);
        }

        return n;
    }

    public int sum(int a) {
        int sum = 0;

        while (a > 0) {
            int digit = a % 10;
            sum = sum + digit;
            a = a / 10;
        }

        return sum;
    }
}
