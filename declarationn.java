public class declarationn {
    public static void main(String[] args) {
        int[] nums = new int[7];
        nums[0] = 0;
        nums[1] = nums[0]+1;
        nums[2] = nums[1]+1;
        nums[3] = nums[2]+1;
        nums[4] = nums[3]+1;
        nums[5] = nums[4]+1;
        nums[6] = nums[5]+1;
        if (nums[5] ==nums[1]+nums[4])
        {
            System.out.println(2);

        }
        else
        {
            System.out.println(3);

        }

        System.out.print(nums);


    }
}
