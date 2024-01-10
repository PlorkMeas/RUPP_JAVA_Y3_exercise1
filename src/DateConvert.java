import java.util.Scanner;

public class DateConvert {
    public DateConvert(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter date(YYYY-MM-DD): ");
        String date = input.next();
        String result = formatDate(date);
        System.out.println("full date representation: "+result);
    }
    private String formatDate(String text){
        String[] parts = text.split("-");
        if(parts.length < 3) return "Wrong";
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        String monthN = "";
        switch (month){
            case 1: monthN = "January"; break;
            case 2: monthN = "February"; break;
            case 3: monthN = "March"; break;
            case 4: monthN = "April"; break;
            case 5: monthN = "May"; break;
            case 6: monthN = "June"; break;
            case 7: monthN = "July"; break;
            case 8: monthN = "August"; break;
            case 9: monthN = "September"; break;
            case 10: monthN = "October"; break;
            case 11: monthN = "November"; break;
            case 12: monthN = "December"; break;
        }
        return monthN + " " + day + ", "+ year;
    }
}
