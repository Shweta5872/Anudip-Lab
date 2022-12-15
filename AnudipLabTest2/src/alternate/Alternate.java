package alternate;

public class Alternate {

	public static void main(String[] args) {
		int[] array1= {5,10,15,20,25,30,35,40,45,50};
		int[] array2= new int[5];
		int index=0;
		int sum=0;
		
		for( int i=0; i<array1.length; i=i+2) {
			array2[index++]=array1[i];
				}
		
		for(int i=0; i<array2.length; i++) {
			sum+=array2[i];
			}
		System.out.println( array2);
		System.out.println( "Addition of values stored in second array " +sum);
 	}
}
