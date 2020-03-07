package Date20200306.Main;

import java.text.DecimalFormat;

import Date20200306.HinhHoc.HinhVuong;
import Date20200306.HinhHoc.HinhChuNhat;
import Date20200306.HinhHoc.HinhTron;
import Date20200306.HinhHoc.HinhTamGiac;

public class MainHinhHoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 15;
		int b = 20;
		int d = 30;
		int h = 10;
				
		int cvHinhVuong = HinhVuong.chuVi(a); // HinhVuong = Tên class; chuVi = Tên hàm
		int dtHinhVuong = HinhVuong.dienTich(a);
		int cvHCN = HinhChuNhat.chuVi(a, b);
		int dtHCN = HinhChuNhat.dienTich(a, b);
		
		
		System.out.println("Kết quả:");
		System.out.println("- Chu vi hình vuông là: " + cvHinhVuong);
		System.out.println("- Diện tích hình vuông là: " + dtHinhVuong);
		System.out.println("- Chu vi hình CN là: " + cvHCN);
		System.out.println("- Diện tích hình CN là: " + dtHCN);
		
		//Diện tích và chu vi hình tròn
		double banKinh = 3;
		
		double cvHinhTron = HinhTron.chuVi(banKinh);
		double dtHinhTron = HinhTron.dienTich(banKinh);
		
		///Làm tròn 2 chữ số thập phân
		DecimalFormat lamTron = new DecimalFormat("##.##");
		
		System.out.println("Kết quả:");
		System.out.println("- Chu vi hình tròn là: " + lamTron.format(cvHinhTron));
		System.out.println("- Diện tích hình tròn là: " + lamTron.format(dtHinhTron));
		
		//Diện tích và chu vi hình tam giác
		
		int cvTamGiac = HinhTamGiac.chuVi(a, b, d);
		int dtTamGiac = HinhTamGiac.dienTich(h, d);
		
		System.out.println("Kết quả:");
		System.out.println("- Chu vi hình tam giác là: " + cvTamGiac);
		System.out.println("- Diện tích hình tam giác là: " + dtTamGiac);

	}

}
