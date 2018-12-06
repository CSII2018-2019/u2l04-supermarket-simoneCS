
public class Cans extends Groceries{
	private double money; 
	private String name; 
	private int amount; 
	
	public Cans(int m, String n, int a) {
		// TODO Auto-generated constructor stub
		setMoney(m); 
		setName(n); 
		setAmount(a); 
	}
	private void setAmount() { 
		if(amount < 0 ) { 
			amount = 10; 
		}
	}
	private void setName(String n) {
		if(n == "soup") {
			n = "soup"; 
		}
		if(n == " peas ") { 
			n = "peas"; 
		}
		if(n == " corn ") { 
			n = "corn"; 
		}else { 
			System.out.println(" We don't have that"
					+ " canned item try soup, peas, or corn  ");	
		}
		public String getName() {
			return name; 
		}
		public int getAmount() {
			return amount; 
		}
		private void setMoney(int m) {
			if( stock >=0) {
				money = m *2
			}
		}
	public double getMoney() { 
		return money; 
	}
	}	
	
}
