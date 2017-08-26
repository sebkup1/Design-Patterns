
public class Program {

	static void getObject(Integer a)
	{
		a = 45;
		//System.out.println(a);
	}
	
	static void getObject(RefClass obj)
	{
		obj.a = 5;
		obj.b = 6;
		obj.str = "c";
	}
	
	public static void main(String[] args) {

		Integer s = 9;
		getObject(s);
		
		System.out.println(s);
		
		RefClass refObject = new RefClass();
		
		System.out.println(refObject.a);
		System.out.println(refObject.b);
		System.out.println(refObject.str);
		
		refObject.a = 3;
		refObject.b = 4;
		refObject.str = "b";
		
		System.out.println(refObject.a);
		System.out.println(refObject.b);
		System.out.println(refObject.str);
		
		getObject(refObject);
		
		System.out.println(refObject.a);
		System.out.println(refObject.b);
		System.out.println(refObject.str);

	}

}
