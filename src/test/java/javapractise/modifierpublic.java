package javapractise;

public class modifierpublic {
	
	public int j=100;
	public static int k=200;
	
	public void methhod2() {
		System.out.println("i am from method 2");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		modifierpublic m= new modifierpublic();
		m.methhod2();
		System.out.println(m.j);
		System.out.println(modifierpublic.k);
		
		
	}

}
