package View;

import java.util.List;

import Controller.iGetView;
import Model.Student;

public class ViewEng implements iGetView{
   public void printAllStudents(List<Student> students){
      System.out.println("--------List of students---------");
      for (Student stud : students) {
         System.out.println(stud);
      }
      System.out.println("--------End of list---------");
   }

   @Override
   public String prompt(String message) {
      return "ggg";
   }
}
