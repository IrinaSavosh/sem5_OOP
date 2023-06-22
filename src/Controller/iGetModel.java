package Controller;

import java.util.HashMap;
import java.util.List;


import Model.Student;

public interface iGetModel {
   public List<Student> getAllStudents();


   public HashMap<Integer, Student> delete(HashMap<Integer, Student> allStudents, Integer key);

   public HashMap<Integer, Student> getAllStudentsHash();
}
