package august.aug_0806_inheritance.classTest.test03.test03_1;

import august.aug_0806_inheritance.classTest.test03.test03_1.Emp;

public class Prob1 {
	
	public static void main(String[] args) {
		
		Emp emp = new Emp();
		emp.setId("12345");
		emp.setName("홍길동");
		emp.setBaseSalary(50000);
		System.out.println( emp.toString() );
		System.out.println( "봉급 = " + emp.getSalary( 30 ) );
		
	}

}
