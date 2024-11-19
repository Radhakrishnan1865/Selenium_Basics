package testNG_Practices;

import org.testng.annotations.Test;

public class Child_Class {

	@Test
	public void method() {
		
		
		Integer a=100;
		Integer b=100;
		
		System.out.println(a==b);
		
		Integer c=200;
		Integer d=200;
		
		System.out.println(c==d);
		
		System.out.println(c.equals(d));
	}
}
