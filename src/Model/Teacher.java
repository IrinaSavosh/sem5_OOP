package Model;

public class Teacher extends Person implements Comparable<Teacher>{
    int id;
  
    public Teacher(String firstName, String secondName, int age, int id) {
      super(firstName, secondName, age);
      this.id = id;
    }
  
    /**
     * @return id
     */
    public int getId() {
      return id;
    }
  
    /**
     * @param id присваевает уник. номер
     */
    public void setId(int id) {
      this.id = id;
    }
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + super.firstName + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", age=" + super.getAge() +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        System.out.println(super.getFirstName()+" - "+o.getFirstName());
        if(this.getAge()==o.getAge())
        {
            if(this.getId()==o.getId())
            {
                return 0;
            }
            if(this.getId()<o.getId())
            {
                return -1;
            }
            return 1;
        }
        if(this.getAge()<o.getAge())
        {
        return -1;
        }        
        return 1;
    }
  }