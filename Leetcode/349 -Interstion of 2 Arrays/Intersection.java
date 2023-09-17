import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {
        int [] a={4,9,5};
        int [] b={9,4,9,8,4};

        System.out.println("Array 1 -"+ Arrays.toString(a));
        System.out.println("\n Array 2 -"+ Arrays.toString(b));

        System.out.println("\n Intersection -> " + Arrays.toString(intersect(a, b)) );

    }
    private static int[] intersect(int[] a, int[] b){

        Set<Integer>intersectionSet = new HashSet<>();
        for(int i=0 ; i<a.length; i++){
            for (int j=0; j<b.length; j++){
                if(a[i]==b[j]) {
                    intersectionSet.add(a[i]);
                }
            }
        }
        int[] intersectionList = new int[intersectionSet.size()];
        int k=0;
        for(int element: intersectionSet){
            intersectionList[k]=element;
            k++;
        }
        return intersectionList;
    }
}
