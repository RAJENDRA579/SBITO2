//import java.util.ArrayList;
import java.util.LinkedList;

public class objectArrayTest {

	public static void main(String[] args) {
//		employee e1=new employee(106,"remo",85000);
//		employee e2=new employee(107,"nishan",185000);
//		employee e3=new employee(108,"moorthy",65000);


		//ArrayList<employee> staff =new ArrayList<employee>();
		LinkedList<employee> staff=new 	LinkedList<employee>();
		//HashList<employee> staff=new 	HashList<employee>();

		
		//employee staff[]=new employee[5];
//		
//		staff[0]=new employee(101,"raj",75000);
//		staff[1]=new employee(102,"jhon",80000);
//		staff[2]=new employee(103,"jake",65000);
//    	staff[3]=new employee(104,"killbill",100000);
//		staff[4]=new employee(105,"pandey",2000000);
		
//		for(int i=0;i<staff.length;i++) {
//			System.out.println("staff : "+staff[i]);
//		}
		staff.add(new employee(101,"raj",75000));
		staff.add(new employee(102,"jhon",80000));
		staff.add(new employee(103,"jake",65000));
		staff.add(new employee(104,"killbill",100000));
		staff.add(new employee(105,"pandey",2000000));
	

		
//		System.out.println("employee :"+e1);
//		System.out.println("employee :"+e2);
//		System.out.println("employee :"+e3);
		System.out.println("adding 9th employee");
		staff.add(new employee(109,"remo",85000));
		for(int i=0; i<staff.size();i++) {
			
				System.out.println("9th employee is: "+staff.get(i));
			
			
		}
		

	}
}

	class employee{
		
	int employeeNumber;
	String employeeName;
	int salary;
	public employee(int employeeNumber, String employeeName, int salary) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "[employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", salary="
				+ salary + "]";
	}
	
}
