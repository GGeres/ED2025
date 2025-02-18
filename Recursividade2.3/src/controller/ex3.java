package controller;

public class ex3 {
	public static int vetFunct(int[] tam, int tam2, int res) {
		if(tam2 == 0) {
			return res;
		} else if( tam[tam2 - 1] % 2 == 0) {
			res ++;
		}
		return vetFunct(tam, tam2 - 1, res);
	}	
}
