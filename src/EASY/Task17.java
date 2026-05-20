package EASY;

import java.util.Arrays;

public class Task17 {
    public static void main(String[] args){



        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1,m,nums2,n);
     }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n -1;
        while (i >=0 && j >= 0){
            if(nums1[i] < nums2[j]){
                nums1[k] = nums2[j];
                j=j-1;
            }
            else {nums1[k] = nums1[i]; i = i -1;}
            k=k-1;
        }
        while (j>=0){
            nums1[k] = nums2[j];
            k=k-1;
            j=j-1;
        }
        System.out.println(Arrays.toString(nums1));
//        int[] news = new int[n+m];
//        int[] num1 = new int[m];
//        int[] num2 = new int[n];
//        int j = 0, i = 0, c = 0;
//        for (int k = 0; k < m; k++) {
//            num1[k] = nums1[k];
//        }
//        for (int k = 0; k < n; k++) {
//            num2[k] = nums2[k];
//        }
//        while (i < n+m){
//            if(c >= m){
//                news[i++] = num2[j++];
//            }
//            else if(j >= n){
//                news[i++] = num1[c++];
//
//            }
//            else if(num1[c] < num2[j]){
//                news[i++] = num1[c++];
//            }
//            else  {
//                news[i++] = num2[j++];
//
//            }
//        }
//        System.out.println(Arrays.toString(news));
    }
}
