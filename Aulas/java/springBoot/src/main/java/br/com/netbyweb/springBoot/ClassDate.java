package br.com.netbyweb.springBoot;

import java.time.Instant;
import java.util.Date;

public class ClassDate {

	public static void main(String[] args) {
		
		Date novaDataInstant = new Date();
		Date novaData = new Date();
		Long currentLong = System.currentTimeMillis();
		Date dataAtual = new Date(currentLong);
		Boolean isAfter = novaData.after(dataAtual);
		Boolean isBefore = novaData.before(dataAtual);
		int compareTO = novaData.compareTo(dataAtual);
		Instant instant = novaDataInstant.toInstant();
		
		System.out.println(novaData);
		System.out.println(currentLong);
		System.out.println(dataAtual);
		System.out.println(isAfter);
		System.out.println(isBefore);
		System.out.println(compareTO);
		System.out.println(instant);
		
	}

}
