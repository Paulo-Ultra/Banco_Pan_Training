package datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataFormatada {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		Date data = c.getTime();
	
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("Data brasileira " + f.format(data));
		
		f = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("Data sem o dia escrito " + f.format(data));
		
		f = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("Data média 1 " + f.format(data));
		
		f = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("Data curta 2 " + f.format(data));
		
		SimpleDateFormat datinha = new SimpleDateFormat("MM/dd/YYYY");
		System.out.println("Data Formatada " + datinha.format(data));
	}

}
