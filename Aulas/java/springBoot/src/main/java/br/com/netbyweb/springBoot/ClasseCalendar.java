package br.com.netbyweb.springBoot;

import java.util.Calendar;

public class ClasseCalendar {

	public static void main(String[] args) {

		Calendar agora = Calendar.getInstance();
//		System.out.println(agora); 
//		System.out.println(agora.getTime()); 
//		agora.add(Calendar.DATE, 1);
//		System.out.println(agora.getTime());
//		agora.add(Calendar.MONTH, 1);
//		System.out.println(agora.getTime());
//		agora.add(Calendar.YEAR, 1);
//		System.out.println(agora.getTime());
		System.out.printf("%tc\n", agora);
		System.out.printf("%tF\n", agora);
		System.out.printf("%tD\n", agora);
		System.out.printf("%tR\n", agora);
		System.out.printf("%tT\n", agora);

	}

}
