package member;

public class Member {
	private String name;
	private int age;
	private int phoneno;
	private String address;
	private int salary;
	
	Member(String name, int age, int phoneno, String address, int salary){
		this.name=name;
		this.age=age;
		this.phoneno=phoneno;
		this.address=address;
		this.salary=salary;
		}
	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(phoneno);
		System.out.println(address);
		System.out.println(salary);
		}

}
