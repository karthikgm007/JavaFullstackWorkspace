package com.ClassWork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DemoOnDateNTime {

	public static void main(String[] args) throws ParseException {

		//Using DATE - Depreciated
		Date d = new Date("07/18/24");  //mm/dd/yy
		System.out.println(d);
		
		//Using SimpleDateFormat 
		SimpleDateFormat sdfObj = new SimpleDateFormat("dd-MMM-yyyy", Locale.US); //M - month, m - milli second
		String myDate = "18-JUL-2024";
		String myDate1 = "dd-MMM-yyyy";
		Date d1 = sdfObj.parse(myDate);
		System.out.println(d1);
		
		//LocalDate 
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalDate ld1 =  LocalDate.of(2024, 7, 18);  //Returns LocalDate object
		System.out.println(ld1);
		
//		NOT working
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(myDate1);
//		ld1  = LocalDate.parse(myDate, dtf);  
//		System.out.println(ld1);
		
		String pattern = "2024-07-18";
		LocalDate date = LocalDate.now();
		date = LocalDate.parse(pattern);
		System.out.println(date);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String myDate11 = date.format(dtf);
		System.out.println(myDate11);
		
		//LocalTime
		LocalTime lt = LocalTime.now();  //Why not new if its a class ??
		System.out.println(lt);
		
		//Methods available
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonthValue());
		
		System.out.println(lt.getMinute());
		System.out.println(lt.getHour());
		
		
		//LocalDateTime
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		String myJoining = "2022-03-22";
		LocalDate doj= LocalDate.parse(myJoining);
		String myLeaving = "2024-07-18";
		LocalDate dol = LocalDate.parse(myLeaving);
		System.out.println(myLeaving);
		
		//Period Class
		Period p = Period.between(doj, dol);
		System.out.println(p);
		System.out.println("Total period of work " + p.getYears() + " years " + p.getMonths() + " months");
		
		
	}

}
