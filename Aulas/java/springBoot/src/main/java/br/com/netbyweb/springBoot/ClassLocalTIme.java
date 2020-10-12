package br.com.netbyweb.springBoot;

import java.time.LocalTime;

public class ClassLocalTIme {

	public static void main(String[] args) {

		LocalTime hora = LocalTime.now();
		System.out.println(hora);
		LocalTime umaHoraMaisTarde = hora.plusHours(1);
		System.out.println(umaHoraMaisTarde);
	}

}
