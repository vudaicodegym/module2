package ontap;

import java.util.ArrayList;

public class Control_human extends Human {
   ArrayList<String> person = new ArrayList<>();
   int idPerson = 0;

   public void show() {
      for (String p : person
      ) {
         System.out.println(person.toString());
      }
   }
}
