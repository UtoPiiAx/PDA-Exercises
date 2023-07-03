public class Account {
	private String owner = "";
	private double balance = 0.00;
	
	//Konstruktor
	public Account(String owner) {
		this.owner = owner;
	}
	
	//Ein- und Auszahlungen,  �berweisungen
	public boolean withdraw (double amount) {
			if (balance >= amount) {
				balance -= amount;
				return true;
			} else {
				System.out.println("Sie haben nicht genug Guthaben um " + amount + " Euro abzuheben.");
				return false;
			}
		}
	public boolean deposit (double amount) {
			if (amount >= 0) {
				balance += amount;
				return true;
			} else {
				System.out.println("Bitte nur positive Werte einzahlen!");
				return false;
			}
		}
	public boolean transfer(double amount, Account other) {
		if((this.getBalance() - amount) >= 0 ) {
			this.withdraw(amount);
			other.deposit(amount);
			return true;
			} else {
				System.out.println("Sie haben nicht genug Guthaben um " + amount + " Euro zu �berweisen.");
				return false;
			}
		}
		
	//Getter-Methoden
	public String getOwner () {
		return owner;
	}
	public double getBalance () {
		return balance;
	}
	
	//Setter-Methoden
	public void setOwner (String owner) {
		this.owner = owner;
	}
}
