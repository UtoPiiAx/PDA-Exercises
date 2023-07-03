public class Account {
	private String owner = "";
	private double balance = 0.00;
	
	//Konstruktor
	public Account(String owner) {
		this.owner = owner;
	}
	
	//Ein- und Auszahlungen
		public boolean withdraw (double amount) {
			if (balance >= amount) {
			balance -= amount;
			return true;
			} else {
				System.out.println("Sie haben nicht genug Guthaben um " + amount + " Euro abzuheben.");
				return false;
			}
		}
		public void deposit (double amount) {
			if (amount >= 0) {
				balance += amount;
			} else {
				System.out.println("Bitte nur positive Werte einzahlen!");
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
	public void setOwner (String owner2) {
		owner = owner2;
	}
	
	// Ausf�hrungen zur Klasse 
	public static void main(String[] args) {
		Account donald = new Account ("Donald Duck");
		Account dagobert = new Account ("Dagobert Duck");
		
		donald.deposit(50);
		donald.deposit(1);
		donald.withdraw(51);

		dagobert.deposit(50);
		dagobert.withdraw (45);
		dagobert.withdraw(47);
		
		System.out.println("Der Kontostand von Dagobert Duck betraegt " + dagobert.getBalance() + " Euro.");
		System.out.println("Der Kontostand von Donald Duck betraegt " + donald.getBalance() + " Euro.");
	}
}
