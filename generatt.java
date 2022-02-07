public class generatt {
    public static void main(String[] args) {
        int[] nums1 = {50,57,83,60,30};
        int[] nums2 = new int[nums1.length+1];

        for (int lcv = nums1.length-1; lcv > nums1.length/2; lcv--)
        {
            nums2[lcv+1] = nums1[lcv];
 
        }
        nums2[nums1.length/2] = nums1[nums1.length-4];
        for (int lcv = 1 ;lcv>=0;lcv++)
        {
            nums2[lcv] = nums1[lcv] +lcv;

        }


    }
    
}
