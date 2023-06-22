package Controller;

import java.util.HashMap;


import Model.Student;

public interface iGetViewHash {
   void printAllStudents(HashMap<Integer, Student> students);
   Integer prompt2(String message);
}
