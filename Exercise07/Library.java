
public class Library {

	public static void main(String[] args) {
		Book hamster = new Book ();
		Book test1 = new Book ();
		Book test2 = new Book ();
		
		hamster.setPages(4);
		test1.setPages(100);
		test2.setPages(1000);
		
		hamster.setTitle("Hamster");
		test1.setTitle("Test1");
		test2.setTitle("Test2");
		
		hamster.setAuthor("Die Blassnasen");
		test1.setAuthor("Die Blassnasen");
		test2.setAuthor("Die Blassnasen");
		
		hamster.setIsbn("187");
		test1.setIsbn("188");
		test1.setIsbn("189");

		hamster.setPublisher("Suhrkamp");
		test1.setPublisher("Suhrkamp");
		test2.setPublisher("Suhrkamp");

		hamster.setPrice(25.99);
		test1.setPrice(35.99);
		test2.setPrice(45.99);

		System.out.println(hamster.getAuthor());
		System.out.println(test1.getPrice() + " €");
		System.out.println(test2.getTitle());

	}

}
