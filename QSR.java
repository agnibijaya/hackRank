import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class QSR {
    
    static int arr[];
    
    static int partition(int l, int r) {
        int smaller,larger,help,pivot;
        smaller=l;
        larger=r-1;
        pivot = arr[r-1];
        
while ( larger > smaller )
      {
       	 if ( arr[larger -1] > pivot )
	 {  /* ==================================================
	       Put a[larger_I -1] in the hole and move hole down
	       ================================================== */        
            arr[larger] = arr[larger-1];
            larger--;
	 }
         else
         {
            /* =================================================
               a[larger_I -1] <= pivot, so:
         	  Swap a[smaller_I] with a[larger_I -1] and
         	  move smaller_I up
               ================================================= */
             help = arr[larger -1];
             arr[larger -1] = arr[smaller];
             arr[smaller] = help;
             smaller++;
         }
      }

      arr[larger] = pivot;   // Put pivot in the "hole"
        

      return larger;
    }
    
    
    
    
    
    
    
    static void qsr(int l, int r) {
        if (r - l <= 0) {
            return;
        } else {
            int partition = partition(l, r);
            qsr(l, partition - 1);
            qsr(partition + 1, r);

        }
        printArray(arr);
    }
    
    
    static void quickSort(int[] ar) {
        arr = ar;
        qsr(0, ar.length);

    }

    static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
    

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        quickSort(ar);
    }
}