package them_sua_xoa_nv;

import java.util.Scanner;

public class Controller {
    public static void show(NhanVien[] nhanViens) {
        for (NhanVien nv : nhanViens) {
            System.out.println(nv.toString());
        }
    }

    public static NhanVien[] createNhanVien(NhanVien[] nhanViens) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập name");
        String name = scanner.nextLine();
        System.out.println("nhập gender");
        String gender = scanner.nextLine();
        System.out.println("nhập age");
        int age = scanner.nextInt();

        NhanVien nhanVien = new NhanVien(name, age, gender);

        NhanVien[] newNV = new NhanVien[nhanViens.length + 1];
        for (int i = 0; i < nhanViens.length; i++) {
            newNV[i] = nhanViens[i];
        }
        newNV[newNV.length - 1] = nhanVien;
        return newNV;

    }
    public static NhanVien[] delete(NhanVien[] nhanViens){
        int idDelete;
        int index =0 ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id nhân viên cần xóa: ");
        idDelete = scanner.nextInt();
        for (int i = 0; i < nhanViens.length; i++){
            if (nhanViens[i].getId()==idDelete){
                index=i;
                break;
            }
        }
        NhanVien[] newNV = new NhanVien[nhanViens.length-1];
//        System.arraycopy(nhanViens,0,newNV,0,index);
//        System.arraycopy(nhanViens,(index+1),newNV,0,newNV.length-index);
        for (int j = 0; j < newNV.length; j++){
            if (j < index){
                newNV[j] = nhanViens[j];
            }else {
             newNV[j] = nhanViens[j+1];
            }
        }
        return nhanViens = newNV;
    }
    public static NhanVien[] eddit(NhanVien[] nhanViens){
        int idEddit;
        int index =0 ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id nhân viên cần xóa: ");
        idEddit = scanner.nextInt();
        System.out.println("nhập name");
        String name = scanner.nextLine();
        System.out.println("nhập gender");
        String gender = scanner.nextLine();
        System.out.println("nhập age");
        int age = scanner.nextInt();
        for (int i = 0; i < nhanViens.length; i++){
            if (nhanViens[i].getId()==idEddit){
                index=i;
            }
        }
        nhanViens[index].setAll(name,age,gender);
        return nhanViens;
//        return null ;
    }
}
