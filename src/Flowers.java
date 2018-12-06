
public class Flowers {
	private String name;
	private int amount;
	private double money;
	private String color;
	public Flowers(String n, int a, String c, int m) {
		// TODO Auto-generated constructor stub
		setName(n);
		setAmount(a);
		setColor(c);
		setMoney(m, m);
	}
	private void setName(String n) {
		name = n; 

}
	public String getName() { 
		return name; 
	}
	private void setAmount(int a) { 
		if(a<0) { 
			amount = 10; 
		}
	}
	public int getAmount() { 
		return amount; 
	}
	private void setColor(String c) { 
		color = c; 
	}
	public String getColor() { 
		return color; 
	}
	public void setMoney(int m, int a) { 
		money = (a*10); 
	}
	public double getMoney() { 
		return money; 
	}
}

