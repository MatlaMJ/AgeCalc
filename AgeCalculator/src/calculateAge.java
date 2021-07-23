import java.time.LocalDate;
import java.time.Period;
import java.text.SimpleDateFormat;
import java.util.*;

public class calculateAge {

	public static void main(String[] args) {
		System.out.println( "Please your day of birth");
	    Scanner scanner = new Scanner(System.in);
	    int day = scanner.nextInt();
	    
	    System.out.println( "Please your Month of birth");
	   
	    int month = scanner.nextInt();
	    System.out.println( "Please your Month of birth");
		   
	    int yr = scanner.nextInt();
        LocalDate birthdate = LocalDate.of(yr,month,day);
	    
		LocalDate currentDate= LocalDate.now();
		
		 int Days =Period.between(birthdate, currentDate).getDays();
		 int Months=Period.between(birthdate, currentDate).getDays();
		
	   
	     System.out.println("Your Birth date is : " + birthdate);
	     
	     System.out.println("Current date : " + currentDate);
	    System.out.println("Your days on Earth : " + Period.between(birthdate, currentDate).getYears() + " Years old");
	    

		
		
	
}
}
