package polymorphiosm;

public class MethodOverloading {

	
	public int add(int a,int b) {
		return a+b;		
	}
	
	public String add(int a,String name) {
		return name;
		
	}
	public double add(int a,int b,double c) {
		return a+b+c;
		
	}
	public void add(String str) {
		System.out.println(str);
		
	}
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.add(1,2,3.4);
		obj.add("hi");
		obj.add(1, 2);
		System.out.println(obj.add(1,"test Overloading"));

	}

}
