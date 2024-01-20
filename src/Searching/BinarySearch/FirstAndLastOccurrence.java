package Searching.BinarySearch;

// num[]= {5,7,7,7,7,8,8,10}

public class FirstAndLastOccurrence {

    public int []searchRange(int num[], int target){
        int ans[]= {-1,-1};
        int startInd = search(nums, target,true);
        int lastInd = search(nums, target, false);
        ans[0] = startInd;
        ans[1] = lastInd;
        return ans;
    }
}
