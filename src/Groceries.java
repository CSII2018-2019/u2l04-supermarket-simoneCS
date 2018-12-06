
public class Groceries {
	private double cost; 

	public void Groceries(double c) {
		// TODO Auto-generated constructor stub
		setCost(c); 
	}

	private void setCost(double c) { 
		if(c < 0) {
			System.out.println(" can't have negative cost "
					+ " defaulting to 20$");
			cost = 20; 
		}
	public double getCost() { 
		return Cost; 
	}
		
	public String toString() { 
		return " The final cost is " + cost +
				" $ "; 
	}
	}
}
