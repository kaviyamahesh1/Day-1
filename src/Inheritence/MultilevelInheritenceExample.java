package Inheritence;
class A{
	int num1;
	int add(int a,int b) {
		return a+b;
	}
}
class B extends A{
	int num2;
	int mul(int a,int b) {
		return a*b;
	}
}
class C extends B{
	void calc() {
		super.num1=10;
		super.num2=20;
		System.out.println("Addition:"+super.add(num2, num1));
		System.out.println("Multiplication:"+super.mul(num2, num1));
	}
}

public class MultilevelInheritenceExample {

	public static void main(String[] args) {
//		B obj2=new B();
//		obj2.num1
		C obj=new C();
		obj.calc();

	}

}
