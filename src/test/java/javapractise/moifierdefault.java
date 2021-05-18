package javapractise;

public class moifierdefault extends modifierprotect{
	static int k21=20000;
	
	void method5() {
		System.out.println("i am from method 5");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
modifierprotect mt =new  modifierprotect();
		
		mt.method4();
		System.out.println(mt.j2);
		System.out.println(mt.k2);
		
		modifierprivate mp = new modifierprivate();
		modifierpublic m = new modifierpublic();
		
		
		System.out.println(m.j);
		m.methhod2();
		System.out.println(m.k);


	}

}
