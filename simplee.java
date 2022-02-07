public class simplee {
    public static void main(String[] args) {
        
        int[] nums1 = {28,5,30,37,12};
        
        int[] nums2 = new int[nums1.length+1];

        for (int lcv = 0; lcv < nums1.length/2;lcv++)
        {
            nums2[lcv] = nums1[lcv]+3;

        }
        nums2[nums1.length/2] = nums1[3]+2;

        for (int lcv = nums1.length/2+1; lcv < nums1.length; lcv++)
        {
            nums2[lcv+1] = -nums1[lcv];
        }
        nums2[5] = 28;

        System.out.println(nums2[4]);
        System.out.println(nums2[5]);
        System.out.println(nums2[1]);

        



    }
        
}