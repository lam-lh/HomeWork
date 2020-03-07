package Date20200302;

public class StringFormat {

	
	 //* StringFormat: tạo hàm main khởi chạy mạc định trong java. 
	 //* cho 2 biến int x = 10, int y = 11; tính tổng hiệu tich thương và system ra các String như sau,
	 //* ++ "tổng của " + x + " và " + y + " là: " + tong 
	 //* ++ "tích của " + x + " và " + y + " là: " + tich 
	 //* ++ "thương  của " + x + " và " + y + " là: " + thuong
	 //* ++ "hiệu của " + x + " và " + y + " là: " + hieu
	
	public static void main(String[] args) {
		int x = 10;
		int y = 11;
		
		int tong = x + y;
		int hieu = x - y;
		int tich = x * y;
		int thuong = x/y;
		
		System.out.println("Tổng của " + x + " và " + y + " là: " + tong);
		System.out.println("Tích của " + x + " và " + y + " là: " + tich);
		System.out.println("Thương của " + x + " và " + y + " là: " + thuong);
		System.out.println("Hiệu của " + x + " và " + y + " là: " + hieu);

	}
}
