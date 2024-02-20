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
public class NhanVien {
    private String manv;
    private String hoten;
    private double luong;
    
    public NhanVien(){
    }

    public NhanVien(String manv, String hoten, double luong) {
        this.manv = manv;
        this.hoten = hoten;
        this.luong = luong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    public double getThuNhap(){
        return this.luong;
    }
    
    public double getThueThuNhap(){
        double thunhap = getThuNhap();
        if(thunhap < 9000000){
            return 0;
        }
        else if (thunhap <= 15000000){
            return 0.1 * (thunhap - 9000000);
        }
        else{
            return 0.12 * (thunhap - 9000000);
        }
    }
    
    
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ma nhan vien: ");
        this.manv = scanner.nextLine();
        System.out.println("Ten nhan vien: ");
        this.hoten = scanner.nextLine();
        System.out.println("Luong nhan vien: ");
        this.luong = scanner.nextDouble();
    }
    
    public void xuat(){
        System.out.println("Ma nhan vien: " + this.manv);
        System.out.println("Ho va ten nhan vien: " + this.hoten);
        System.out.println("Luong cung: " + this.luong);
        System.out.println("Thu nhap: " + this.getThuNhap());
        System.out.println("Thue thu nhap: " + this.getThueThuNhap());
    }   
}

