package basic_section3_8;



public class TwoDimensionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {{1,2},{3,4},{5,6}};
		
		
		for(int i=0; i<arr.length; i++) {
			for(int l=0; l<arr[i].length ; l++) {
			System.out.println("배열 : " + arr[i][l]);
				}
			}
	}

}
