/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhquan_59131988_bt1;
import List.GiaoVien;
import List.HocSinh;
import List.LopHoc;
        
/**
 *
 * @author quan
 */
public class Main {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh("Pham Tan Minh Quan", 21, "Khanh Hoa", "084898746", "59cntt2", "LapTrinh");
        HocSinh hs2 = new HocSinh("Tran Thanh Hai", 21, "Khanh Hoa", "06516515", "59cntt2", "LapTrinh");
        HocSinh hs3 = new HocSinh("Ngo Quoc Luong", 21, "Nghe An", "9648468", "59cntt2", "LapTrinh");

        GiaoVien gv1 = new GiaoVien("Tran Van B", 40, "Nghe An", "058765811", "KyThuatLapTrinh", "CongNgheThongTin");
        GiaoVien gv2 = new GiaoVien("Nguyen Thi C", 45, "Khanh Hoa", "01750700", "NhapMonLapTrinh", "CongNgheThongTin");
        GiaoVien gv3 = new GiaoVien("Huynh Van A", 55, "Ha Tinh", "07507505", "ThietKeWeb", "CongNgheThongTin");

        LopHoc lopHoc = new LopHoc();
        lopHoc.themHS(hs1);
        lopHoc.themHS(hs2);
        lopHoc.themHS(hs3);
        lopHoc.themHS(hs1);

        lopHoc.themGV(gv1);
        lopHoc.themGV(gv2);
        lopHoc.themGV(gv3);
        lopHoc.themGV(gv1);

        System.out.println("\nDanh sach hoc sinh:");
        lopHoc.inDSHS();
        System.out.println("\nDanh sach giao vien:");
        lopHoc.inDSGV();
    }
}