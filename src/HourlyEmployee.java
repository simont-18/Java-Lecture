public class HourlyEmployee extends Employee{
	private double rate;
	private int hour;
	
	public HourlyEmployee(String first, String last, String ssn, double r, int h) {
		super(first, last, ssn);
		this.rate = r;
		this.hour = h;
	}

	@Override
	public double earnings() {
		return this.rate * this.hour;
	}

	@Override
	public String toString() {
		return String.format(super.toString() +  "\nrate: $%.02f \nhour: %d", rate, hour);	
	}
}
