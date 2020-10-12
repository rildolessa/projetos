package br.com.netbyweb.springBoot;

public class ClassException {

	public static void main(String[] args) {

		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (java.io.FileNotFoundException e) {
			System.out.println("tratado");
		} finally {
			System.out.println("3333"); //Esse é opcionai
		}
	}

}
