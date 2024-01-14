package Searching.BinarySearch;

public class BinSearch {

        static int bsearch(int arr[], int target){
            int start=0;
            int end = arr.length-1;

            while(start<= end){
                int mid = start + (end-start)/2;
                if(arr[mid] == target){
                    return mid;
                }
                else if(arr[mid]<target){
                    start = mid+1;
                }
                else{
                    end = mid -1;
                }
            }
            return -1;
        }

        public static void main(String[]args){
            int arr[]= {3,4,6,8,9,23,45};
            int target = 9;
            int ans = bsearch(arr,target);
            System.out.println(ans);
        }

}
