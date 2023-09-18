import java.util.Arrays;

public class MissingNo {
    public static void main(String[] args){
        int[] arr= {9,6,4,2,3,5,7,0,1};
        // int[] arr= {2,1};


        System.out.println("Array -> "+Arrays.toString(arr));
        System.out.println("missing no - "+ findMissingNo(arr));
    }

    //  O(n+ nlogn)
    //  sc- O(1)

    // private static int findMissingNo(int[] nums){
    //     int l=nums.length;
    //     Arrays.sort(nums);       //o(nlogn)
    //     for(int i=0; i<l; i++){     //o(n)
    //         if(nums[i]!=i){
    //             return i;
    //         }
    //     }
    //     return l;
    // }


    //  O(2n)
    //  sc- O(N)

    // private static int findMissingNo(int[] nums){
    //     boolean []hash=new boolean[nums.length+1];
    //     for(int i:nums){
    //         hash[i]=true;
    //     }
    //     for(int i =0; i<hash.length; i++){
    //         if(hash[i]==false){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // private static int findMissingNo(int[] nums){
    //     int n= nums.length;
    //     int sum= n*(n+1)/2;
    //     int sum2=0;
    //     for(int i:nums){
    //         sum2+=i;
    //     }
    //     return sum-sum2;
    // }
    


    // private static int findMissingNo(int[] nums){
    //     int a=0;
    //     for(int i=0; i<nums.length+1; i++){
    //         a=a^i;
    //     }
    //     int b=0;
    //     for(int i:nums){
    //         b^=i;
    //     }
    //     return a^b;
    // }

    private static int findMissingNo(int[] nums){
        int xor1=0, xor2=0;
        for(int i=0; i<nums.length; i++){
            xor1=xor1^nums[i];
            xor2^=(i+1);
        }    
        return xor1^xor2;
    }
}
