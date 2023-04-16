
public class Demo {
	public static void main(String[] args) {
		Student s=new Student();
		s.setName("Vaibhav Mojidra");
		s.setRollNo(101);
		
		Student s1=new Student();
		s1.setName("Riya");
		s1.setRollNo(102);
		
		System.out.println("Student 1 Name: "+s.getName());
		System.out.println("Student 1 Roll No: "+s.getRollNo());
		
		System.out.println("\nStudent 2 Name: "+s1.getName());
		System.out.println("Student 2 Roll No: "+s1.getRollNo());
		
	}
}
