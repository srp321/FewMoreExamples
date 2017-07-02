class B {
    public void m1() {
        System.out.println("Base");
    }
    public void m2() {
        System.out.println("Base");
    }
    public void m3() {
        System.out.println("Base");
    }
    protected B() {}
}

interface I1 {
    public void m4() ;
    public void m5();
    public void m6();
}
class Try extends B implements I1 {
    public static void main (String argv[] ) {
        Try t = new Try();
        Integer i = new Integer(99);
        i = 10;
        System.out.println(i);
    }

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m6() {
		// TODO Auto-generated method stub
		
	}
}