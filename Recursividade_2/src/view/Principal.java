package view;

import java.util.Scanner;

import controller.ex1;

public class Principal {

	public static void main(String[] args) {
		 Scanner sca = new Scanner(System.in);
		 
		 int x = sca.nextInt();
		 int y = sca.nextInt();
		 int z = y;
		 
		 
		 System.out.println("Multiplicação: " + ex1.multSoma(x, y, z));
		 sca.close();
	}

}
