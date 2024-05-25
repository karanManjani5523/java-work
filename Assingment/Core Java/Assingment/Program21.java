package Assingment;

class User{
	int datamember;
	String name;
	int age;
	int phonenumber;
	String address;
	int salary;
	public User() {
		System.out.println("default cons");
	}
	public User(int datamember,String name,int age,int phonenumber, String address,int salary) {
		this.datamember = datamember;
		this.name = name;
		this.age = age;
		this.phonenumber = phonenumber;
		this.address = address;
		this.salary = salary;
		System.out.println("para cons : "+datamember);
	}
		public void setDatamember(int datamember) {
		this.datamember = datamember;
		System.out.println("datamember : "+datamember);
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("name : "+name);
	}
	public void setAge(int age) {
		this.age = age;
		System.out.println("age : "+age);
	}	
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
		System.out.println("phonenumber : "+phonenumber);
	}
	public void setAddress(String address) {
		this.address = address;
		System.out.println("address : "+address);
	}
	public void setSalary(int salary) {
		this.salary = salary;
		System.out.println("salary : "+salary);
	}
		
	public int getDatamember() {
		return datamember;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public String getAddress() {
		return address;
	}
	public int getSalary() {
		return salary;
	}
	
}

public class Program21 {
	public static void main(String[] args) {
		User u1 = new User(1,"karan",22,123456789,"ahmedabad",20000);
		//u1.setDatamember(1);
//		u1.setName("karan");
//		u1.setAge("22");
//		u1.setPhonenumber("1234567890");
//		u1.setAddress("ahmedabad"); 
//		u1.setSalary("200000"); 
//		System.out.println(u1.getDatamember());
		System.out.println(u1.getName());
		System.out.println(u1.getAge());
		System.out.println(u1.getPhonenumber());
		System.out.println(u1.getAddress());
		System.out.println(u1.getSalary());		
	}
}