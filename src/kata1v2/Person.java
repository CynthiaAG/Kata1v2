package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private String name;
    private Calendar birthdate;
    private static final long MILLISECOND_PER_YEAR= (long)(1000*60*60*24*365.25);

    public String getName() {
        return name;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }

    public static long getMILLISECOND_PER_YEAR() {
        return MILLISECOND_PER_YEAR;
    }

    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    
    public int GetAge(){
        Calendar today;
        today= GregorianCalendar.getInstance();
        return (int) (milliSecondsToYear(today.getTimeInMillis()- birthdate.getTimeInMillis()));
    }
    private long milliSecondsToYear(long milles){
        return milles/MILLISECOND_PER_YEAR;
    }
    }
           
