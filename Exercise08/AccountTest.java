
public class AccountTest {

	public static void main(String[] args) {
		
		Account accountDagobert = new Account ("Dagobert Duck");
		Account accountDonald = new Account("Donald Duck");
		Account accountScrooge = new Account("Scrooge McDuck");
		
		accountDonald.deposit(50);
		accountDonald.deposit(1);
		accountDonald.withdraw(51);

		accountDagobert.deposit(50);
		accountDagobert.withdraw (50);
		accountDagobert.withdraw(1); // Meldung
		
		accountDonald.deposit(100);
		accountDonald.deposit(-100); // Meldung
		accountDonald.withdraw(5000);
		accountDonald.withdraw(-5000); // Meldung
		
		accountDonald.transfer(800, accountScrooge);
		accountDonald.transfer(50, accountScrooge);
		accountDonald.transfer(-50, accountScrooge); 
		accountDonald.transfer(50000,accountScrooge);

		accountDonald.transfer(50000, accountDonald); // Meldung
		accountDonald.transfer(5, accountDonald); // Balance unverändert

		
		System.out.println("Der Kontostand von Dagobert Duck betraegt " + accountDagobert.getBalance() + " Euro."); // 0
		System.out.println("Der Kontostand von Donald Duck betraegt " + accountDonald.getBalance() + " Euro."); // 4300
		System.out.println("Der Kontostand von Donald Duck betraegt " + accountScrooge.getBalance() + " Euro."); // 850

	}

}
