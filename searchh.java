public class searchh {
    public static void main(String[] args) {
        int[] nums1 = {60,67,93,70,40};

        int[] nums2 = new int[nums1.length +1];

        
        
        for(int lcv = nums1.length -1; lcv>nums1.length/2; lcv--)
        {
            nums2[lcv] = nums1[lcv]+5;
            nums2[nums1.length/2] =99;
        }
        for(int lcv= nums1.length/2-1;lcv>=0;lcv--)
        {
            nums2[lcv] = nums1[lcv]-5;
        }
        System.out.print(nums2[5]);
        System.out.println((int)(Math.random()*15));
    }
}
