package com.agni.practice;

public class Sudoku {
	final int N=9;
	final int UNASSIGNED =0;
	//int row =0,col=0;
	static class Rowcol{
		int row,col;
		public Rowcol(int r, int c) {
		row=r;
		col=c;
		}
	}
	
	public boolean solve(int grid[][] ,Rowcol cur){
		if (cur == null)
			   return true;

		if (grid[cur.row][cur.col] != 0) {
			   return solve(grid,getNextCell(cur));
			  }
		
		for(int i=0;i<N;i++){
			boolean valid = isSafe(grid,i,cur);

			   if (!valid)
			    continue;

			   
			   grid[cur.row][cur.col] = i;
			   this.printGrid(grid);
			   System.out.println();
			  
			   boolean solved = solve(grid,getNextCell(cur));
			   
			   if (solved)
			    return true;
			   else
			    grid[cur.row][cur.col] = 0; 
			   
			   
			      }    
		return false;

	}
	public boolean isSafe(int grid[][], int num, Rowcol cell){
		
		
		//used in Row
	    for (int x = 0; x < N; x++)
	        if (grid[cell.row][x] == num)
	            return false;
	    
	//System.out.println("me");
	    for (int y = 0; y < N; y++)
	        if (grid[y][cell.col] == num)
	            return false;
	    
	    //System.out.println("me2");
	    int startrow = 3 * (cell.row / 3);
	    int startcol = 3 * (cell.col / 3);
	    int endrow = startrow + 2;
	    int endcol = startcol + 2;

	    for (int x = startrow; x <= endrow; x++)
	     for (int y = startcol; y <= endcol; y++)
	      if (grid[x][y] == num)
	       return false;

	    //System.out.println("me3");
	    return true;
	}
	 static Rowcol getNextCell(Rowcol cur) {

		  int row = cur.row;
		  int col = cur.col;
		  col++;

		  if (col > 8) {
		   col = 0;
		   row++;
		  }

		  if (row > 8)
		   return null; 
		  
		  Rowcol next = new Rowcol(row, col);
		  return next;
		 }


	void printGrid(int grid[][]){
		 for (int i = 0; i < N; i++)
	        {
	            for (int j = 0; j < N; j++)
	                System.out.print(" " + grid[i][j]
	                                 + " ");
	            System.out.println();
	        }
	}
	public static void main(String[] args) {
		Sudoku sudoku = new Sudoku();
		int grid[][] = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}};

		sudoku.printGrid(grid);
		System.out.println();
		if (sudoku.solve(grid,new Rowcol(0, 0)) == true)
			sudoku.printGrid(grid);
else
   System.out.println("No solution exists");

	}

}
