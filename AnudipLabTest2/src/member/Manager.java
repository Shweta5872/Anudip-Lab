package member;

public class Manager extends Member {
	String department;
	Manager(String name, int age, int phoneno, String address, int salary, String department){
		super(name,age,phoneno,address,salary);
		this.department=department;
		
	}
	public void print() {
		super.print();
		System.out.println(department);
	}

}
