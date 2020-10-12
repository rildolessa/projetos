package br.com.netbyweb.springBoot;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassSimpleDateFormat {

	public static void main(String[] args) {

		Date agora = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy HH:MM:SS");
		String dataFormatada = formato.format(agora);
		System.out.println(agora);
		System.out.println(dataFormatada);
		
	}

}
