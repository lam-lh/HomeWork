package Date20200302;

public class ToanHoc {
	/*
	 * ToanHoc: tạo hàm main, cho 3 biến int x = 10, long y = 100, double k = 4.5;
	 * Tính tổng, hiệu, tính thương và sys ra màn hình kết qua
	 */
	public static void main(String[] args) {

		int x = 10;
		long y = 100;
		double k = 4.5;

		double tong = (x + y + k);
		double hieu = (x - y - k);
		double tich = (x * y * k);
		double thuong = (x / y / k);

		System.out.println("Tổng x + y + k = " + tong);
		System.out.println("Hiệu x - y - k = " + hieu);
		System.out.println("Tích x * y * k = " + tich);
		System.out.println("Thương x / y / k = " + thuong);

	}

}
