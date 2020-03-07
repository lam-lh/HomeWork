package Date20200306.Main;

import Date20200306.Model.BaoVe;
import Date20200306.Model.KeToan;
import Date20200306.Model.LeTan;
public class MainTinhLuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gioCongBV = 200;
		int gioCongKT = 160;
		int gioCongLT = 180;
		
		int luongBV = BaoVe.luongBaoVe(gioCongBV);
		int luongKT = KeToan.luongKeToan(gioCongKT);
		int luongLT = LeTan.luongLeTan(gioCongLT);
		
		System.out.println("Bảng lương nhân viên trung tâm Java tháng 2/2020");
		System.out.println("Lương bảo vệ: " + luongBV);
		System.out.println("Lương bảo vệ: " + luongKT);
		System.out.println("Lương bảo vệ: " + luongLT);
		
	}

}
