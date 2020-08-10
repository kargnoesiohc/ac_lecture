package com.test;

public class Systime_Test {

	public static void main(String[] args) {
		Systime_Test t = new Systime_Test();
		t.aaa();		
		t.bbb();
		t.ccc();
		
	}
	public  void ccc() {
		long start=System.currentTimeMillis();
		String x= "";
		for (int i = 0; i < 10000; i++) {
			x=x.concat("aaaaaaaaaaaaa");
		}
		System.out.println("x.length()="+x.length());
		System.out.println("aaa()"+((System.currentTimeMillis()-start)/1000.0));
		
	}
	public  void bbb() {
		long start=System.currentTimeMillis();
		StringBuffer x= new StringBuffer();
		for (int i = 0; i < 10000; i++) {
			x.append("aaaaaaaaaaaaa");
		}
		System.out.println("x.length()="+x.length());
		System.out.println("aaa()"+((System.currentTimeMillis()-start)/1000.0));
		
	}
	public  void aaa() {
		long start=System.currentTimeMillis();
		String x= "";
		for (int i = 0; i < 10000; i++) {
			x+="aaaaaaaaaaaaa";
		}
		System.out.println("x.length()="+x.length());
		System.out.println("aaa()"+((System.currentTimeMillis()-start)/1000.0));
		
	}

}
