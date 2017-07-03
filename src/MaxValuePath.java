Public class MaxValuePath {
    	public static void main(String[] args) {
    		int[][] grid = {{1,2,1},
                        	{4,6,5},
                        	{7,6,9}};

    		// Dynamic programming
		for (int i = grid.length - 1; i >= 0; i--) {
	    		for (int j = grid[i].length - 1; j >= 0; j--) {
	        		int temp;
				if (i + 1 < grid.length && j + 1 < grid[i].length)
		    			temp = Math.max(grid[i + 1][j], grid[i][j + 1]);
				else if (i + 1 < grid.length)
		    			temp = grid[i + 1][j];
				else if (j + 1 < grid[i].length)
		    			temp = grid[i][j + 1];
				else
		    			temp = 0;
		    			grid[i][j] += temp;
		    	}
		}
		System.out.println(Integer.toString(grid[0][0]));
    	}
}
