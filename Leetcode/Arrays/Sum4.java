package Leetcode.Arrays;
import java.util.*;

public class Sum4 {
    public static void main(String[] args) {
        
        int[] nums= {-1,0,-5,-2,-2,-4,0,1,-2};
        int target =-9;
        System.out.println("Array - "+Arrays.toString(nums) +" \n target = "+ target);
        // System.out.println("4 sums -> \n"+ fourSum(nums, target ));
        System.out.println("4 sums -> \n"+ fourSum2(nums, target ));
        // System.out.println("4 sums -> \n"+ fourSum3(nums, target ));


    }

    private static List<List<Integer>> fourSum(int[] nums, int target){

        int n =nums.length;
        Set<List<Integer>> st= new HashSet<>();
        for(int i=0 ;i<n ; i++){
            for(int j=i+1; j< n ;j++){
                Set<Long> hs = new HashSet<>();
                for(int k = j+1 ; k<n; k++){
                    long sum = nums[i] + nums[j];
                    sum += nums[k];
                    long fourth = target -sum;
                    if(hs.contains(fourth)){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k],(int) fourth);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                    hs.add((long)nums[k]);
                }
                // System.out.println(hs);
            }
        }
        // System.out.println(st);
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }


private static List<List<Integer>> fourSum2(int[] nums, int target){

    int n= nums.length; 
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums);

    for(int i=0; i< n; i++){
        if(i > 0   &&  nums[i]==nums[i-1])
            continue;
        for(int j= i+1; j<n; j++){
            if(j> i+1 && nums[j]== nums[j-1])
                continue;
            int k= j+1; 
            int l = n-1; 

            while(k<l ){
                long sum= nums[i]+ nums[j];
                sum+=nums[k];
                sum+=nums[l];
                if(sum == target){
                    // ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    temp.add(nums[l]);
                    ans.add(temp);
                    k++;
                    l--;
                    while(k < l && nums[k]== nums[k-1])
                        k++;
                    while(k < l && nums[l] == nums[l+1])
                        l--;
                }
                else if(sum < target) k++;
                else
                    l--;
            }
        }
    }
    return ans; 
}


}




// private static List<List<Integer>> fourSum3(int[] nums, int target){
//     int n = nums.length; // size of the array
//     List<List<Integer>> ans = new ArrayList<>();

//     // sort the given array:
//     Arrays.sort(nums);

//     // calculating the quadruplets:
//     for (int i = 0; i < n; i++) {
//         // avoid the duplicates while moving i:
//         if (i > 0 && nums[i] == nums[i - 1]) continue;
//         for (int j = i + 1; j < n; j++) {
//             // avoid the duplicates while moving j:
//             if (j > i + 1 && nums[j] == nums[j - 1]) continue;

//             // 2 pointers:
//             int k = j + 1;
//             int l = n - 1;
//             while (k < l) {
//                 long sum = nums[i];
//                 sum += nums[j];
//                 sum += nums[k];
//                 sum += nums[l];
//                 if (sum == target) {
//                     List<Integer> temp = new ArrayList<>();
//                     temp.add(nums[i]);
//                     temp.add(nums[j]);
//                     temp.add(nums[k]);
//                     temp.add(nums[l]);
//                     ans.add(temp);
//                     k++;
//                     l--;

//                     // skip the duplicates:
//                     while (k < l && nums[k] == nums[k - 1]) k++;
//                     while (k < l && nums[l] == nums[l + 1]) l--;
//                 } else if (sum < target) k++;
//                 else l--;
//             }
//         }
//     }

//     return ans;


// }


// }
