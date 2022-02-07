public class largestt {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,6,7,8,9};
        int maxSpot = 0;
        int maxValue = nums[0];

        for(int lcv = 0; lcv < nums.length; lcv++)
        {
            if(nums[lcv]> maxValue)
            {
                maxSpot = lcv;
                maxValue = nums[lcv];
            }
        }
        
        System.out.println("The largest values is "+ maxValue);
        System.out.println(" and is at index "+ maxSpot);
    }
}
