import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Union{
    public static void main(String [] args){
        int [] arr1=  {2,4,4,5,6,6,8,9,23};
        int [] arr2= {2,3,4,4,5,6};

        System.out.println("\n array 1-> "+Arrays.toString(arr1)+"\n array 2->"+Arrays.toString(arr2));
         System.out.println("Union of 2 arrays using set is -> \n"+ Arrays.toString(findUnionUsingSet(arr1,arr2)));

        System.out.println("\n Union of 2 arrays is -> \n"+ findUnion(arr1,arr2));

    }

    private static int[] findUnionUsingSet(int[] arr1, int[] arr2) {
        //since set will also maintain the order
        Set<Integer> set= new HashSet<>();
        for(int element:arr1){
            // O(n1logn)
            set.add(element);
        }

        for(int element:arr2){
            //O(n2logn)
            set.add(element);
        }

        int [] unionArray= new int[set.size()];
        
        int j=0;
        for(int element:set){
            unionArray[j]=element;
            j++;
        }        
        return unionArray;

        //T.C. O(n1logn+ n2logn ) +o(n1+n2)
        // SC - O(n1+n2) + O(n1+n2)

    }


    private static List<Integer> findUnion(int[] a, int[] b){

        List <Integer>union = new ArrayList<>();

        int i=0,j=0; 
        while(i<a.length && j<b.length){
            if (a[i]<= b[j]){
                if(union.size()==0 || a[i] !=union.get(union.size()-1)){
                    union.add(a[i]);
                }
                i++;
            }
            
            else {
                if(union.size()==0 || b[j]!=union.get(union.size()-1)){
                    union.add(b[j]);
                }
                j++;
            }
        }
        while(i<a.length){
            if(union.size()==0 || a[i] !=union.get(union.size()-1)){
                    union.add(a[i]);
                    i++;
                }
        }
        while (j<b.length){
            if(union.isEmpty() || b[j]!=union.get(union.size()-1)){
                    union.add(b[j]);
                    j++;
                }
        }
        return union;
    }

    
}