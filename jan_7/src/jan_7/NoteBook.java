package jan_7;

public class NoteBook extends Product {
	private double inch;
	
	public void setInch(double inch) {
		this.inch = inch;
	}
	public double getInch() {
		return this.inch;
	}
	@Override
	public String getDetails() {
		return super.getDetails() + " inch: " + inch;
	}
}
