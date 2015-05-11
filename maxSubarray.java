import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	static int max(int x, int y) { return (y > x) ? y : x; }
	

	static int maxSubarrayContiguous(int[] arr, int indexMax) {
		
		int maxSoFar = arr[0];
		int currMax = arr[0];
		 
		   for (int i = 1; i < indexMax; i++) {
		        currMax = max(arr[i], currMax + arr[i]);
		        maxSoFar = max(maxSoFar, currMax);
		   }
		   return maxSoFar;
		}
	
	static int maxSubarrayNonContiguous(int[] arr, int indexMax) {
		int sumMax = 0;
		int max = arr[0];
		boolean negArray = true;
		int res = 0;
		for (int i = 0; i < indexMax; i++) {
			if (arr[i] >= 0) {
				sumMax += arr[i];
				negArray = false;
			}
			
			if (arr[i] >= max) { max = arr[i];}
		}
	
		if (negArray == false)
			res = sumMax;

		if (negArray)
			res = max;
		
		return res;
		
	}
	

    public static void main(String[] args) {
    	
    	Scanner in = new Scanner(System.in);
    	
    	int[] testSolutionsC = new int[10];

    	int[] testSolutionsNC = new int[10];
        int resC;
        int resNC;
        int runs;
        runs = Integer.parseInt(in.nextLine());
        
       
        for (int i = 0; i < runs; i++) {
        	String inputString;
        	int[] arr = new int[100000];
        	int indexMax = Integer.parseInt(in.nextLine());
        	
        	
        	inputString = in.nextLine();
        	int arrIndex=0;
    		StringTokenizer st = new StringTokenizer(inputString);
    		while(st.hasMoreTokens()) {
    			arr[arrIndex] = Integer.parseInt(st.nextToken());
    			arrIndex++;
    		}
    		
    		//continuous solution
        	resC = maxSubarrayContiguous(arr, indexMax);
        	//non-continuous solution
        	resNC = maxSubarrayNonContiguous(arr, indexMax);
        	
        	
        	testSolutionsC[i] = resC;
        	
        	testSolutionsNC[i] = resNC;
        	
        }
        
        
    	for(int i = 0; i < runs; i++) {
    		System.out.print(testSolutionsC[i] + " ");
    		System.out.print(testSolutionsNC[i]);
    		System.out.println();
    	}
    	
    }
}