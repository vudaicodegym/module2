package th1_trien_khai_list_simple;

import java.util.Arrays;

public class Mylist<E> {
    private int size;
    private  static final int DEFAULT_CAPACITY = 10;
   private Object elements[];
   public Mylist(){
       elements = new  Object[DEFAULT_CAPACITY];
   }
    //Tăng gấp đôi kích thước mảng chứa các phần tử
   private void ensureCapa(){
       int newSize = elements.length * 2;
       elements = Arrays.copyOf(elements, newSize);
   }
   //thêm một phần tử vào cuối của danh sách
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
    //trả về phần tử vừa ở vị trí thứ i trong danh sách.
    public E get(int i){
       if (i >= size || i < 0 ){
           throw new IndexOutOfBoundsException("index:" + i + ", size" + i);
       }
       return (E) elements[i];
   }
}
