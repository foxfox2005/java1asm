package asm.function;
import java.util.Scanner;

public class main {
    static NhanVien[] danhSachNV = new NhanVien[100];
    static int soLuongNV = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chon = 0;
        int nhap;
        
        do {
            hienThiMenu();
            System.out.print("nhap chuc nang: ");
            nhap = scanner.nextInt();
            switch (nhap) {
                case 1:
                    Y1();
                    break;
                case 2:
                    Y2();
                    break;
                case 3:
                    Y3();
                    break;
                case 4:
                    Y4();
                    break;
                case 5:
                    Y5();
                    break;
                case 6:
                    Y6();
                    break;
                case 7:
                    Y7();
                    break;
                case 8:
                    Y8();
                    break;
                case 9:
                    Y9();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.Vui long nhap lai.");
                    break;
            }
        } while (nhap != 0);
    }
    
    public static void hienThiMenu() {
        System.out.println("\t\t|-------------------------------------------------|");
        System.out.println("\t\t|       1. Nhap danh sach nhan vien               |");
        System.out.println("\t\t|       2. Xuat danh sach nhan vien               |");
        System.out.println("\t\t|       3. Tim nhan vien theo ma                  |");
        System.out.println("\t\t|       4. Xoa nhan vien theo ma                  |");
        System.out.println("\t\t|       5. Cap nhat thong tin nhan vien           |");
        System.out.println("\t\t|       6. Tim nhan vien theo khoang luong        |");
        System.out.println("\t\t|       7. Sap xep nhan vien theo ho va ten       |");
        System.out.println("\t\t|       8. Sap xep nhan vien theo thu nhap        |");
        System.out.println("\t\t|       9. Xuat 5 nhan vien co thu nhap cao nhat  |");
        System.out.println("\t\t|       0. Thoat                                  |");
        System.out.println("\t\t|-------------------------------------------------|");
    }
    
    public static void Y1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuc nang 1: Nhap danh sach nhan vien");
        System.out.print("Nhap so luong nhan vien: ");
        int soluong = scanner.nextInt();
        for (int i = 0; i < soluong; i++) {
            System.out.println("1.Nhan Vien 2.Tiep thi 3.Truong phong");
            int a = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (a) {
                case 1:
                    NhanVien nv = new NhanVien();
                    nv.nhap();
                    danhSachNV[soLuongNV++] = nv;
                    break;
                case 2:
                    TiepThi tiep = new TiepThi();
                    tiep.nhap();
                    danhSachNV[soLuongNV++] = tiep;
                    break;
                case 3:
                    Truongphong truong = new Truongphong();
                    truong.nhap();
                    danhSachNV[soLuongNV++] = truong;
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long nhap lai.");
                    break;
            }
        }
    }

    public static void Y2() {
        System.out.println("Chuc nang 2: Xuat danh sach nhan vien");
        for (int i = 0; i < soLuongNV; i++) {
            danhSachNV[i].xuat();
        }
    }

    public static void Y3() {
        System.out.println("Chuc nang 3: Tim nhan vien theo ma");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can tim: ");
        String maNV = scanner.nextLine();
        boolean timThay = false;
        for (int i = 0; i < soLuongNV; i++) {
            if (danhSachNV[i].getManv().equals(maNV)) {
                danhSachNV[i].xuat();
                timThay = true;
                break;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay nhan vien co ma " + maNV);
        }
    }

    public static void Y4() {
        System.out.println("Chuc nang 4: Xoa nhan vien theo ma");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can xoa: ");
        String maNV = scanner.nextLine();
        boolean xoaThanhCong = false;
        for (int i = 0; i < soLuongNV; i++) {
            if (danhSachNV[i].getManv().equals(maNV)) {
                for (int j = i; j < soLuongNV - 1; j++) {
                    danhSachNV[j] = danhSachNV[j + 1];
                }
                soLuongNV--;
                xoaThanhCong = true;
                break;
            }
        }
        if (xoaThanhCong) {
            System.out.println("Da xoa nhan vien co ma " + maNV);
        } else {
            System.out.println("Khong tim thay nhan vien co ma " + maNV + " de xoa.");
        }
    }

    public static void Y5() {
        System.out.println("Chuc nang 5: Cap nhat thong tin nhan vien");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can cap nhat: ");
        String maNV = scanner.nextLine();
        boolean capNhatThanhCong = false;
        for (int i = 0; i < soLuongNV; i++) {
            if (danhSachNV[i].getManv().equals(maNV)) {
                danhSachNV[i].nhap();
                capNhatThanhCong = true;
                break;
            }
        }
        if (capNhatThanhCong) {
            System.out.println("Da cap nhat thong tin cho nhan vien co ma " + maNV);
        } else {
            System.out.println("Khong tim thay nhan vien co ma " + maNV + " de cap nhat thong tin.");
        }
    }

    public static void Y6() {
        System.out.println("Chuc nang 6: Tim nhan vien theo khoang luong");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap luong thap nhat: ");
        double luongThapNhat = scanner.nextDouble();
        System.out.print("Nhap luong cao nhat: ");
        double luongCaoNhat = scanner.nextDouble();
        boolean timThay = false;
        for (int i = 0; i < soLuongNV; i++) {
            double luongNV = danhSachNV[i].getLuong();
            if (luongNV >= luongThapNhat && luongNV <= luongCaoNhat) {
                danhSachNV[i].xuat();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay nhan vien nao trong khoang luong " + luongThapNhat + " - " + luongCaoNhat);
        }
    }

    public static void Y7() {
        System.out.println("Chuc nang 7: Sap xep nhan vien theo ho va ten");
        for (int i = 0; i < soLuongNV - 1; i++) {
            for (int j = i + 1; j < soLuongNV; j++) {
                if (danhSachNV[i].getHoten().compareTo(danhSachNV[j].getHoten()) > 0) {
                    NhanVien temp = danhSachNV[i];
                    danhSachNV[i] = danhSachNV[j];
                    danhSachNV[j] = temp;
                }
            }
        }
        System.out.println("Danh sach nhan vien sau khi sap xep theo ho va ten:");
        for (int i = 0; i < soLuongNV; i++) {
            danhSachNV[i].xuat();
        }
    }

    public static void Y8() {
        System.out.println("Chuc nang 8: Sap xep nhan vien theo thu nhap");
        for (int i = 0; i < soLuongNV - 1; i++) {
            for (int j = i + 1; j < soLuongNV; j++) {
                if (danhSachNV[i].getThuNhap() < danhSachNV[j].getThuNhap()) {
                    NhanVien temp = danhSachNV[i];
                    danhSachNV[i] = danhSachNV[j];
                    danhSachNV[j] = temp;
                }
            }
        }
        System.out.println("Danh sach nhan vien sau khi sap xep theo thu nhap:");
        for (int i = 0; i < soLuongNV; i++) {
            danhSachNV[i].xuat();
        }
    }

    public static void Y9() {
        System.out.println("Chuc nang 9: Xuat 5 nhan vien co thu nhap cao nhat");
        for (int i = 0; i < soLuongNV - 1; i++) {
            for (int j = i + 1; j < soLuongNV; j++) {
                if (danhSachNV[i].getThuNhap() < danhSachNV[j].getThuNhap()) {
                    NhanVien temp = danhSachNV[i];
                    danhSachNV[i] = danhSachNV[j];
                    danhSachNV[j] = temp;
                }
            }
        }
        int count = Math.min(5, soLuongNV);
        for (int i = 0; i < count; i++) {
            danhSachNV[i].xuat();
        }
    }
}
