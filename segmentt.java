import java.lang.Math;
public class segmentt {
    public static void main(String[] args) {
        int size = 10;
        int[] nums = new int[size];
        for (int lcv =0;lcv<nums.length;lcv++)
        {
            nums[lcv]= (int)(Math.random()*25-15);

        }
        for (int lcv = 0; lcv <nums.length;lcv++)
        {
            System.out.print(nums[lcv]+ " ");
        }

    }
}
