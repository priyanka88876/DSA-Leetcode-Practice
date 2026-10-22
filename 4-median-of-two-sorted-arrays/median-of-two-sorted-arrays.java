class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
             if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int left = 0;
        int right = m;

        while (left <= right) {
            int i = (left + right) / 2;
            int j = (m + n + 1) / 2 - i;
                        int a = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int b = (i == m) ? Integer.MAX_VALUE : nums1[i];

            int c = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int d = (j == n) ? Integer.MAX_VALUE : nums2[j];

            if (a <= d && c <= b) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(a, c) + (double) Math.min(b, d)) / 2;
                } else {
                    return Math.max(a, c);
                                    }
            } else if (a > d) {
                right = i - 1;
            } else {
                left = i + 1;
            }
        }
        return 0;


   
        
    }
}