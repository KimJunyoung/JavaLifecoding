 package basic_section3_7;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Book[] arr = new Book[5];
		Book[] copyArr = new Book[5];
		
		arr[0] = new Book("태백산맥1", "조정래");
		arr[1] = new Book("태백산맥2", "조정래");
		arr[2] = new Book("태백산맥3", "조정래");
		arr[3] = new Book("태백산맥4", "조정래");
		arr[4] = new Book("태백산맥5", "조정래");
		
	
		
		for(int i=0; i<arr.length; i++) {
			copyArr[i] = new Book();
			copyArr[i].setAuthor(arr[i].getAuthor());
			copyArr[i].setTitle(arr[i].getTitle());
		}
		
		copyArr[3].setAuthor("김준영");
		
		for(Book book : copyArr) {
			book.showBookInfo();
		}
	}

}
