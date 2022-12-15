package member;

public class Employee extends Member {
        String specialization;
        
      Employee(String name, int age, int phoneno, String address, int salary, String specialization){
        super (name,age,phoneno,address,salary);
        this.specialization=specialization;
        
        }
      public void print() {
    	  super.print();
    	  System.out.println(specialization);
      }
}
