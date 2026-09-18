public class Date {
	
	private int day;
	private int month;
	private int year;
	
	public void setDate(int d, int m, int y) {
		 
		if(m < 1 || m > 12) {
			month = 1;
		}else
			month = m;
		
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			
			if(d < 1 || d > 31) {
				 day = 1;
			 }else {
				 day = d;
			 }
			
		}else if(month == 2) {
			if(isLeapYear(y)) {
				
				if(d < 1 || d > 29){
					 day = 1;
				 }else {
					 day = d;
				 }
			}else {
				if(d < 1 || d > 28){
					 day = 1;
				 }else {
					 day = d;
				 }
			}

		}else {
				if(d < 1 || d > 30) {
					 day = 1;
				 }else {
					 day = d;
				 }
		}
		
		
		if(y > 2026 || y < 1990) {
			year = 2026;
		}else {
			year = y; 
		}
		 
	}
	
	public boolean isLeapYear(int year) {
		if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int getDaysInMonth(int month, int year) {

	    if (month == 2) {
	    	if(isLeapYear(year)) {
				return 29;
			}else {
				return 28;
			}

	    } else if (month == 4 || month == 6 || month == 9 || month == 11) {

	        return 30;

	    } else {

	        return 31;
	    }
	}
	
	public void addDays(int daysToAdd) {

	    while (daysToAdd > 0) {

	        int daysInMonth = getDaysInMonth(month, year);

	        int remainingDays = daysInMonth - day;

	        if (daysToAdd <= remainingDays) {

	            day = day + daysToAdd;
	            daysToAdd = 0;

	        } else {

	        	daysToAdd = daysToAdd - remainingDays;

	            day = 1;
	            month++;

	            if (month > 12) {
	                month = 1;
	                year++;
	            }
	        }
	    }
	}
	
	public void addMonths(int months) {

	    int daysToAdd = 0;

	    for (int i = 0; i < months; i++) {

	        daysToAdd = daysToAdd + getDaysInMonth(month, year);

	        month++;

	        if (month > 12) {
	            month = 1;
	            year++;
	        }
	    }

	    addDays(daysToAdd);
	}
	
	
	public void addYears(int years) {

	    year = year + years;

	    if (month == 2 && day == 29 && !isLeapYear(year)) {
	        day = 28;
	    }
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}

}