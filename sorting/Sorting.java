package sorting;


public class Sorting{

    static void selectionSort(int[] arr){
        for(int i =0; i<arr.length-1; i++){
            int mini = i; 
            for(int j=i; j<arr.length ; j++ ){
                if(arr[j]< arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini]= temp; 
        }
        for(int i : arr){

            System.out.print(i+"  ");
        }
    }



    static void bubble(int[] arr){
        int n =arr.length; 
        for(int i =n-1 ; i>=0; i-- ){
            boolean didSwap = false; 
            for(int j =0; j<=i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp; 
                    didSwap = true; 
                }
                if(didSwap)
                    break;
            }
        }
        for(int i : arr){

            System.out.print(i+"  ");
        }
        
    }



    static void insertion(int[] arr){
        int n = arr.length; 
        for (int i= 0; i<=n-1; i++){
            int j =i; 
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp ; 

                j--;

            }
        }

        for(int i : arr){

            System.out.print(i+"  ");
        }


    }





    public static void main(String[] args) {
        int arr[] = {6,4,34,3,6,8,86,6,5,432,21,1};

        selectionSort(arr);
        System.out.println();
        bubble(arr);
        System.out.println();
        insertion(arr);
    }

}