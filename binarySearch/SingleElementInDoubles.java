// LC 540: https://leetcode.com/problems/single-element-in-a-sorted-array/description/
// CN : https://www.naukri.com/code360/problems/unique-element-in-sorted-array_1112654?leftPanelTabValue=SUBMISSION


import java.util.ArrayList;
class Solution
{
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        //    Write your code here.
        int n = arr.size(); 
        // if only one element is present then return the 1st element 
        if(n==1)
            return arr.get(0);

        // if first element != 2nd element then return  the 1st element 
        if(arr.get(0) != arr.get(1))
            return arr.get(0);

        // if last element != 2nd last element then return last element 
        if(arr.get(n-1) != arr.get(n-2)){
            return arr.get(n-1);
        }


        //  ALL THE PRECHECKS ARE DONE FOR BOTH EDGES NOW WE WONT CHECK FOR THEM AND SEE ARRAY WITH ARR[1] TO ARR[N-2]

        int low = 1;
        int high = n-2; 

        while (low <= high ){
            int mid = low + (high - low)/2; 

            // if mid element does not match with its adjecents then thats the single element
            if(arr.get(mid) != arr.get(mid-1)  && arr.get(mid) != arr.get(mid +1)  )
                return arr.get(mid);

                // if mid element is equal to its left adj. and mid is even then we are on the left side of array, and ans is in the right part 
//  similarly(OR) -> if mid element is equal to its right adj. and mid is at odd index then too we  are on the left side of array, and ans is in the right part 

            if((arr.get(mid) == arr.get(mid-1) && mid%2 != 0) || arr.get(mid) == arr.get(mid+1) && mid%2 == 0){
                low = mid+1; 
            }else{
                high = mid -1; 
            }
        }
        return -1; 
    }
}















