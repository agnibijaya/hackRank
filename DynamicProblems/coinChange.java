import java.util.Scanner;


public class QSR {
    
	static int count( int S[], int m, int n )
	{
	    int i, j, x, y;
	 
	    // We need n+1 rows as the table is consturcted in bottom up manner using 
	    // the base case 0 value case (n = 0)
	    int table[][]=new int [n+1][m];
	    
	    // Fill the enteries for 0 value case (n = 0)
	    for (i=0; i<m; i++)
	        table[0][i] = 1;
	 
	    // Fill rest of the table enteries in bottom up manner  
	    for (i = 1; i < n+1; i++)
	    {
	        for (j = 0; j < m; j++)
	        {
	            // Count of solutions including S[j]
	            x = (i-S[j] >= 0)? table[i - S[j]][j]: 0;
	 
	            // Count of solutions excluding S[j]
	            y = (j >= 1)? table[i][j-1]: 0;
	 
	            // total count
	            table[i][j] = x + y;
	        }
	    }
	    return table[n][m-1];
	}
	 
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        
        String _a_size = in.nextLine();
    String[] firstSplit=_a_size.split(" ");
    int n=Integer.parseInt(firstSplit[0]);
    int m=Integer.parseInt(firstSplit[1]);
        int[] _a = new int[m];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < m; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
       
        
	System.out.println(count(_a, m, n) );
}

}import java.util.Scanner;


public class QSR {
    
	static int count( int S[], int m, int n )
	{
	    int i, j, x, y;
	 
	    // We need n+1 rows as the table is consturcted in bottom up manner using 
	    // the base case 0 value case (n = 0)
	    int table[][]=new int [n+1][m];
	    
	    // Fill the enteries for 0 value case (n = 0)
	    for (i=0; i<m; i++)
	        table[0][i] = 1;
	 
	    // Fill rest of the table enteries in bottom up manner  
	    for (i = 1; i < n+1; i++)
	    {
	        for (j = 0; j < m; j++)
	        {
	            // Count of solutions including S[j]
	            x = (i-S[j] >= 0)? table[i - S[j]][j]: 0;
	 
	            // Count of solutions excluding S[j]
	            y = (j >= 1)? table[i][j-1]: 0;
	 
	            // total count
	            table[i][j] = x + y;
	        }
	    }
	    return table[n][m-1];
	}
	 
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        
        String _a_size = in.nextLine();
    String[] firstSplit=_a_size.split(" ");
    int n=Integer.parseInt(firstSplit[0]);
    int m=Integer.parseInt(firstSplit[1]);
        int[] _a = new int[m];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < m; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
       
        
	System.out.println(count(_a, m, n) );
}

}