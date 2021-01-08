package nihao;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			calc();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("我怎么这么命苦啊");
		}
	}
	static void calc() {
		int a = 6;
		int b = 0;
		try {
			float r = a/b;
			System.out.println("a / b = " + r);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("我怎么这么命苦啊");
		}
	}
}
