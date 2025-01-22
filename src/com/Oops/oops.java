package com.Oops;
//	inherntance 
public class oops {

	public static void main(String[] args) {
	// calling varbible in grandchlid class
	GrandChlid grandchlid = new GrandChlid();
	int x=grandchlid.num4;
	System.out.println(x);

	
	int rev=0;
	while(x!=10) {
		int last=x%10;
		rev=rev*10+last;
		x=x/10;
	}
	System.out.print(rev);
	}
	

}
