public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        
        // declare current max as min possible value in java.lang

        int max = Integer.MIN_VALUE;


        // if current number exceeds current max, reset a new max to current number
        for (int num : arr) {
            if (num > max) max = num;
        }

        return max;
    }
}
