public class LeapYear{
    public static void main(String[] args){
        int year = 2000;
        if (year % 400 == 0 || ((year % 4 == 0) && (year % 4 != 0)))
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + "is NOT a leap year.");

        year = 2004;
        if (year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is NOT a leap year.");
        year = 1900;
        if (year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is NOT a leap year.");
        year = 2003;
        if (year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is NOT a leap year.");

    }
}
