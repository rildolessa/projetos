package br.com.netbyweb.springBoot;

import java.time.LocalDate;

public class ClassLocalDate {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		LocalDate ontem = hoje.minusDays(1);
		System.out.println(hoje);
		System.out.println(ontem);
	}

}
