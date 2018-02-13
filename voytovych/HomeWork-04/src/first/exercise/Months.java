package first.exercise;

public enum Months {
	January(31), 
	February(28), 
	March(31), 
	April(30), 
	May(31), 
	June(30), 
	July(31), 
	August(31), 
	September(30), 
	October(31), 
	November(30), 
	December(31);
	
	private int amountOfDays;

	private Months(int amountOfDays) {
		this.amountOfDays = amountOfDays;
	}

	public int getAmountOfDays() {
		return amountOfDays;
	}
	
	
}
