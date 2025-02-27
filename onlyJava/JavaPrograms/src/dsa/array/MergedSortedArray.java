package dsa.array;

public class MergedSortedArray {

        public void swap(int a, int b){
            int temp = a;
            a = b;
            b = temp;
        }
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            for (int i=0; i<n; i++){
                nums1[m+i] = nums2[i];
            }
            int i=0, j=m;
            while(j < m+n){
                if(nums1[i] > nums1[m+j]){
                    swap(nums1[i],nums1[m+j]);
                    i++;
                    j++;
                }
            }
        }

}
