package controller;

public class ex2 {
	
	public ex2() {super();}
	
	public static int divSub(int a, int b) {
		if(a < b) {
			return a;
		} else {
			a = a - b;
			return divSub(a, b);
		}
	}
}
