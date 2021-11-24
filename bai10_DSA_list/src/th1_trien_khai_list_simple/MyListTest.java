package th1_trien_khai_list_simple;

public class MyListTest {
    public static void main(String[] args) {
        Mylist<Integer> listInterger = new Mylist<Integer>();
        listInterger.add(2);
        listInterger.add(3);
        listInterger.add(3);
        listInterger.add(3);
        listInterger.add(4);
        listInterger.add(4);
        listInterger.add(1000);

        System.out.println("element 1: "+listInterger.get(0));
        System.out.println("element 1: "+listInterger.get(1));
        System.out.println("element 2: "+listInterger.get(2));

        listInterger.get(6);
        System.out.println("phần tử thứ 6 là: " + listInterger.get(6));
    }
}
