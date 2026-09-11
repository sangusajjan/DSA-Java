class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int tank = 0;
        int start = 0;
        for(int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            //1. Calculate fuel difference
            tank += gas[i] - cost[i];

            //2. If tank becomes negative
            if(tank < 0) {
                tank = 0;
                start = i + 1;
            }
        }
        //3. Check whether completing the entire circle is possible
        if(totalGas < totalCost) {
            return -1;
        }
        return start;
        
    }
}

/*If total gas is less than total cost → -1;
 otherwise, whenever the tank becomes negative, move the starting point to i + 1.*/

 //