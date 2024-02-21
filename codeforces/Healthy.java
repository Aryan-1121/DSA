import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        while (t-- > 0){
            
            int noOfJudges = sc.nextInt(); 
            
            int[] score = new int[noOfJudges];
            
            for(int i = 0; i<noOfJudges; i++){
                score[i] = sc.nextInt();
            }
            
            System.out.println(isGood(score));
        //  boolean flag = false; 
	    // for(int element : score ){
	    //     if(element<=4)
	    //         flag = true; 
	    // }
        // if(flag == true)
        //     System.out.println("NO");
        // else 
        //     System.out.println("YES");
        
        }

	}
	
	public static String isGood(int [] score){
	    boolean flag = false; 
        System.out.println("helloo ");
	    for(int element : score ){
	        if(element<=4)
	            flag = true; 
	    }
	    return (flag == true)? "NO" : "YES";
	    
	}
	
}
