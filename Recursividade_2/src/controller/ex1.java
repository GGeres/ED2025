package controller;

public class ex1 {
	public static int multSoma(int a, int b, int c) {
		if(c == 0) {
			return 0;
		} else {
			return a + multSoma(a, b, c - 1);
		}
	}
}
