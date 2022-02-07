public class hatee {
   public static void main(String[] args) {
      int [] nums = {1,2,3,7,8,9,5};
      for (int r1 =0; r1 < nums.length;r1++)
      {
          int max = r1;
          for(int r2 =r1 +1;r2<nums.length-1;r2++)
          {
              if (nums[r2]>nums[max])
              {
                  max =r2;
              }
          }
          int temp = nums[r1];
          nums[r1]=nums[max];
          nums[max] = temp;
      }

   }
}
