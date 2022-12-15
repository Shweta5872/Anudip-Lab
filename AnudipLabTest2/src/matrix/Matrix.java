package matrix;

public class Matrix {
     
	public static void main(String[] args) {
	       int [][] array1 = { {20, 30, 40},
	    		              {50, 60, 70},
	                          {80, 90, 100} };
	       
	       int [][] array2 = { {1, 2, 3},
	    		              {4, 5, 6},
	    		              {7, 8, 9} };
	       int[][] resultantArr = new int [3][3];
	       addMatrix(array1,array2,resultantArr);
	       displayMatrix(resultantArr);
	       
	       }
	public static int[][] addMatrix(int[][] array1,int[][] array2,int[][] resultantArr){
	   
	       for(int i=0;i<array1.length;i++) {
	    	   for(int j=0;j<array2.length;j++) {
	    		   resultantArr[i][j]=array1[i][j]+array2[i][j];
	    	   }
	       }
	       return resultantArr;
	    	   }
       public static void displayMatrix(int [][] resultantArr) {
    	   for(int i=0;i<resultantArr.length; i++) {
    		   for(int j=0;j<resultantArr.length; j++) {
    			   System.out.print(resultantArr[i][j]+" ");
    		   }
    		   System.out.println();
    		   }
    	   }
              
	}
	

