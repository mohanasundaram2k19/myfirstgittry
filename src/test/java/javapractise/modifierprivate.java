package javapractise;

public class modifierprivate {
	
	private int j1=1000;
	private static int k1=2000;
	
	private void method3() {
		
		System.out.println("i am from method 3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		modifierprivate mp = new modifierprivate();
		modifierpublic m = new modifierpublic();
		mp.method3();
		System.out.println(mp.j1);
		System.out.println(modifierprivate.k1);
		System.out.println(m.j);
		m.methhod2();
		System.out.println(m.k);

	}

}
