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
		return x*y;
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        System.out.println("sum is ::" + app.sum(10, 20));
        System.out.println("sub is ::" + app.sub(10, 20));
    }
}
