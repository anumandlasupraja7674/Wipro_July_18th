package labsession21;

public class dayodtheweek {
	
	public static void main(String[] args) {
		int dayNo=2;
		String days;
		switch(dayNo) {
		case 1:
			days = "Monday";
			break;
		case 2:
			days = "Tuesday";
			break;
		case 3:
			days = "Wednesday";
			break;
		case 4:
			days = "Thursday";
			break;
		case 5:
			days = "Friday";
			break;
		case 6:
			days = "Saturday";
			break;
		case 7:
			days = "Sunday";
			break;
		default:
			days = "none";
		}
		System.out.println(days);
	}
}