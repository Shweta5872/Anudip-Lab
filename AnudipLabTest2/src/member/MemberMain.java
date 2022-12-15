package member;

public class MemberMain {
	public static void main(String[] args) {
		Employee em = new Employee("Manish", 20, 34657898,"Noida", 30000,"Software eng");
		Manager mn = new Manager("Ram", 30,38567898, "Noida", 40000,"Computer Science");
		em.print();
		mn.print();
	}

}
