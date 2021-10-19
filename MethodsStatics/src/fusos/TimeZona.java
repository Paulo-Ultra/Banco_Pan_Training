package fusos;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;

public class TimeZona {

	public static void main(String[] args) {
		
		Calendar euroCal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Tiraspol"));
		
		System.out.println(euroCal.get(Calendar.HOUR_OF_DAY)
);

	}


}
