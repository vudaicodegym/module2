package test2;

import java.util.Scanner;

public class Controller {
    static  Scanner scanner = new Scanner(System.in);
    //3. hiển thị
    public static Staff[] display(Staff[] listStaff){
        for (int i = 0; i < listStaff.length; i++) {
            System.out.println(listStaff[i].toString());
        }
        return listStaff;
    }
    //1 thêm
    public static Staff[] addStaff(Staff[] listStaff){
        Staff newStaff = create();
        Staff[] newList = new Staff[listStaff.length + 1];
        for (int i = 0; i < listStaff.length; i++) {
            newList[i] = listStaff[i];
        }
        newList[newList.length-1] = newStaff;
        return newList;
    }
    public static Staff create(){
        System.out.println("nhập tên");
        String newName = scanner.nextLine();
        System.out.println("nhập số điện thoại: ");
        String newPhoneNumber = scanner.nextLine();
        System.out.println("nhập địa chỉ");
        String newAddress = scanner.nextLine();
        Staff newStaff = new Staff(newName, newPhoneNumber,newAddress);
        return newStaff;
        }
        //2 xóa
    public static int findIndexById(Staff[] listStaff) {
        System.out.println("nhập id thằng muốn xử");
        int searchedId = Integer.parseInt(scanner.nextLine());
        int index = -1;
        for (int i = 0; i < listStaff.length; i++) {
            if (searchedId == listStaff[i].getId()) {
                index = listStaff[i].getId();
                break;
            }

        }  System.out.println(index);
        return index;
    }
    public static Staff[] delete(Staff[] listStaff){
        int index = findIndexById(listStaff);
        Staff[] newListStaff = new Staff[listStaff.length-1];
        for (int i = 0; i < newListStaff.length; i++) {
            if ( i < index){
                newListStaff[i] = listStaff[i];
            }else {
                newListStaff[i] = listStaff[i + 1];
            }
        }
        return listStaff = newListStaff;
    }
    //4. sửa
    public static Staff[] editStaff(Staff[] listStaff){
        int index = findIndexById(listStaff);
        System.out.println("nhập tên mới");
        String newName = scanner.nextLine();
        System.out.println("nhập số điện thoại mới: ");
        String newPhoneNumber = scanner.nextLine();
        System.out.println("nhập địa chỉ mới");
        String newAddress = scanner.nextLine();

        for (int i = 0; i < listStaff.length ; i++) {
            if (listStaff[i].getId() == index){
                listStaff[i].setName(newName);
                listStaff[i].setPhoneNumber(newPhoneNumber);
                listStaff[i].setAddress(newAddress);
                break;
            }
        }
        return listStaff;
    }
    }


