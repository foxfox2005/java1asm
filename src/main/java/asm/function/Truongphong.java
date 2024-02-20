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
public class Truongphong extends NhanVien {
    
    private double trachNhiem;
    
    public Truongphong(){
    }

    public Truongphong(String manv, String hoten, double luong,double trachNhiem) {
        super(manv, hoten, luong);
        this.trachNhiem = trachNhiem;
    }
    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }
    
    
    
    @Override
    public double getThuNhap(){
        return super.getLuong() + this.trachNhiem;
    }
    
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Luong trach nhiem: ");
        this.trachNhiem = sc.nextDouble();               
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Trach nhiem: " + this.trachNhiem);
    }   
}
