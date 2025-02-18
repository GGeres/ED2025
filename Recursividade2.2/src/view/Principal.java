package view;

import java.util.Scanner;

import controller.ex2;

public class Principal {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		int x = sca.nextInt();
		int y = sca.nextInt();
		
		
		System.out.println("Resto: " + ex2.divSub(x, y));
		sca.close();

	}

}
