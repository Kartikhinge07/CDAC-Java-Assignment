
public class Array3x3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		      int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

		   
		      int[] rowSum = new int[3];
		      int[] colSum = new int[3];

		      
		      for (int i = 0; i < 3; i++) 
			  {
		         for (int j = 0; j < 3; j++) 
				 {
		            rowSum[i] += arr[i][j];
		            colSum[j] += arr[i][j];
		         }
		      }

		     
		      System.out.println("Original Array : ");
		      for (int i = 0; i < 3; i++) {
		         for (int j = 0; j < 3; j++) {
		            System.out.print(arr[i][j] + " ");
		         }
		         System.out.println();
		      }

		     
		      System.out.println("Row-wise sums:");
		      for (int i = 0; i < 3; i++) {
		         System.out.println("Row " + (i+1) + " sum: " + rowSum[i]);
		      }


		      System.out.println("Column-wise sums:");
		      for (int i = 0; i < 3; i++) {
		         System.out.println("Column " + (i+1) + " sum: " + colSum[i]);
		      }
		   }
		

	}


