package view;

import java.util.Scanner;

import controller.ex3;

public class Principal {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		
		System.out.println("De o tamanho do vetor: ");
		int i = 0;
		int size = sca.nextInt();
		int vet[] = new int[size];
		for(i=0; i < vet.length; i++) {
			vet[i] = sca.nextInt();
		}
		int result = 0;
		
		System.out.println("A quantidade de números páres no vetor é igual a: "+ ex3.vetFunct(vet, vet.length - 1, result));
		sca.close();
	}

}
