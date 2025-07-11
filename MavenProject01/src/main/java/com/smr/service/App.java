package com.smr.service;


public class App 
{
	public int sum(int x, int y) {
		return x+y;
	}
	
	public int sub(int x, int y) {
		return x-y;
	}
	
	public int mul(int x, int y) {
		System.out.println("mul() method");
		System.out.println("Hello");
		int c=x*y;
		return c;
	}
	
	public int div(int x , int y) {
		System.out.println("Div() method");
		return x/y;
		
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        System.out.println("sum is ::" + app.sum(10, 20));
        System.out.println("sub is ::" + app.sub(10, 20));
    }
}
