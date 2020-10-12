package br.com.netbyweb.springBoot;

public class ClassArray {

	public static void main(String[] args) {

		int[] [] arrayCarro2 = {{1,2,3},{4,5,6}};
		for (int i = 0; i < arrayCarro2.length; i++) {
			for (int j = 0; j < arrayCarro2[i].length; j++) {
				System.out.println(arrayCarro2[i][j]);
			}
		}
	}

}
