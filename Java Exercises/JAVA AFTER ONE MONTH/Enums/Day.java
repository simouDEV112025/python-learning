package oop_projects;

public enum Day {
	MONDAY(1),
	TUESDAY(2),
	WENSDAY(3),
	TUERSDAY(4),
	FRIDAY(5),
	SATURDAY(6),
	SUNDAY (7);
	
	final int numoOfDay;
	private Day(int numOfDay) {
		this.numoOfDay = numOfDay;
	}
	public int getNumOfDay() {
		return this.numoOfDay;
	}

}
