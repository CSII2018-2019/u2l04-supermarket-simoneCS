
public class Produce extends Groceries {
	private String name; 
	private int amount; 
	private double weight; 
	private double money;
	
	public Produce(String n, int a, int w, int m) {
		setName(n);
		setAmount(a);
		setWeight(w);
		setMoney(m);
	}

	private void setName(String n) {
		if (name == "fruits") {
			name = "fruits";
		}else if (name == "veggies") {
			name = "veggies";
		}else {
			System.out.println("We do not have that ");
		}
	}
			

		public String getName() { 
			return name; 
		}
		private void setAmount(int a) {
			if(a >= 0) {
				amount = a;
			}else {
				System.out.println("Sorry, but we do not have that number of " + name + "in stock."
						+ "\nNo change will be made.");
			}
		}
		public int getAmount() {
			return amount;
		}
		
		private void setWeight(double w) {
			if (w >= 0) {
				weight = w;
			}		
		}
		public double getWeight() {
			return weight;
		}
		
		public void setMoney(int q) {
			if (amount >= 0) {
				money = (weight * 3)*.15;
				
			}
		}
		public double getPrice() {
			return money;
		}

	
	}
		
