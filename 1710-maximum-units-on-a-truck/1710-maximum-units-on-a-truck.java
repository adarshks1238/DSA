class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));

        int totalunits = 0;
        for(int[] box:boxTypes)
        {
            int noofboxes = box[0];
            int noofunits = box[1];

            int boxToTaken = Math.min(noofboxes,truckSize);
            
            totalunits = totalunits +(boxToTaken*noofunits);

            truckSize = truckSize - boxToTaken;

            if(truckSize <= 0)
            {
                break;
            }
        }
        return totalunits;
    }
}