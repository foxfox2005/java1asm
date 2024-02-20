/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm.function;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class TiepThi extends NhanVien {
    private double doanhSo;
    private double hoaHong;

    public TiepThi(){
    }
    
    public TiepThi(String manv, String hoten, double luong,double doanhSo, double hoaHong) {
        super(manv, hoten, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }
    
    

   @Override
    public double getThuNhap(){
        return super.getLuong() + this.doanhSo + this.hoaHong;
    }
    
   @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Doanh so: ");
        this.doanhSo = sc.nextDouble();
        System.out.println("Hoa hong: ");
        this.hoaHong = sc.nextDouble();
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Doanh so: " + this.doanhSo);
        System.out.println("Hoa hong: " + this.hoaHong);
    }


}

