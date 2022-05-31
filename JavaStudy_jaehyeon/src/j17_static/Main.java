package j17_static;

public class Main {
	public static void main(String[] args) {
		//일반 메소드
		Test test= new Test();
		Test test1 = new Test();
		Test test2 = new Test();
	
		test.count = 10;
		test1.count = 20;
		test2.count = 30;
		test.method();
		test1.method();
		test2.method();

		
		
		//static 메소드
		StaticTest staticTest = new StaticTest();
		StaticTest staticTest1 = new StaticTest();
		StaticTest staticTest2 = new StaticTest();
		
		staticTest.count = 10;
		staticTest1.count = 20;
		staticTest2.count = 30;
		StaticTest.count = 100;
		
		
		staticTest.staticmethodTest();
		staticTest1.staticmethodTest();
		staticTest2.staticmethodTest();
		
	}
}
