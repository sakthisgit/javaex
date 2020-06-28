package practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {
	public static void main(String[]args)
	{
		LocalDate Date=LocalDate.now();
		System.out.println(Date);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalDateTime d=LocalDateTime.now();
		System.out.println(d);
	}

}
