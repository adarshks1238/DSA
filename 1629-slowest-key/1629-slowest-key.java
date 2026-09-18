class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char longchar = keysPressed.charAt(0);
        int longtime = releaseTimes[0];
        for(int i = 1; i < keysPressed.length(); i++) {
            int time = releaseTimes[i] - releaseTimes[i - 1];
            if(time > longtime || (time == longtime && keysPressed.charAt(i) > longchar)) {
                longtime = time;
                longchar = keysPressed.charAt(i);
            }
        }
        return longchar;
    }
}