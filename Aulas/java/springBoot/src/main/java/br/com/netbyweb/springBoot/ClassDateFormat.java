package br.com.netbyweb.springBoot;

import java.text.DateFormat;
import java.util.Date;

public class ClassDateFormat {

	public static void main(String[] args) {

		Date agora = new Date();
		String dataFormatada = DateFormat.getInstance().format(agora);
		
		System.out.println(agora);
		System.out.println(dataFormatada);
		
		dataFormatada = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(agora);
		System.out.println(dataFormatada);
		dataFormatada = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG).format(agora);
		System.out.println(dataFormatada);
	}

}
