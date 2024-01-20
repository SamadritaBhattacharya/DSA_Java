package Searching.BinarySearch;
import java.util.*;

// num[]= {5,7,7,7,7,8,8,10}

public class FirstAndLastOccurrence {

    public static int []searchRange(int num[], int target){
        int ans[]= {-1,-1};
        int startInd = search(num, target,true);
        int lastInd = search(num, target, false);
        ans[0] = startInd;
        ans[1] = lastInd;
        return ans;
    }

    static int search(int nums[], int target, boolean startInd){
        int start = 0;
        int end = nums.length -1;
        int ans =0 ;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid-1;
            }
            else if (target > nums[mid]){
                start = mid + 1;
            }
            else{
                ans = mid;
                if(startInd == true){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int num[] = {5,7,7,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(num,target)));
    }
}
