package javapractise;

public class variablesdeclare {
	
	static int c = 100;
	int r=60;
	
	public void method1() {
		int k=1800;
		System.out.println(k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(variablesdeclare.c);
		
		variablesdeclare v = new variablesdeclare();
		System.out.println(v.r);
		v.method1();
		

	}

}
