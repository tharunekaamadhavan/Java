public class MedianOfTwoSortedArrays {

        public double findMedianSortedArrays(int[] nums1, int[] nums2) {

            if (nums1.length > nums2.length) {
                return findMedianSortedArrays(nums2, nums1);
            }

            int m = nums1.length, n = nums2.length;
            int leftSize = (m + n + 1) / 2;
            int low = 0, high = m;

            while (low <= high) {
                int i = (low + high) / 2;
                int j = leftSize - i;

                int left1 = (i > 0) ? nums1[i - 1] : Integer.MIN_VALUE;
                int right1 = (i < m) ? nums1[i] : Integer.MAX_VALUE;
                int left2 = (j > 0) ? nums2[j - 1] : Integer.MIN_VALUE;
                int right2 = (j < n) ? nums2[j] : Integer.MAX_VALUE;

                if (left1 <= right2 && left2 <= right1) {

                    if ((m + n) % 2 == 0) {
                        return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                    } else {
                        return Math.max(left1, left2);
                    }
                } else if (left1 > right2) {
                    high = i - 1;
                } else {
                    low = i + 1;
                }
            }
            return 0.0;
        }


        public static void main(String[] args) {
            MedianOfTwoSortedArrays sol = new MedianOfTwoSortedArrays();
            System.out.println(sol.findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
            System.out.println(sol.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
        }
    }


