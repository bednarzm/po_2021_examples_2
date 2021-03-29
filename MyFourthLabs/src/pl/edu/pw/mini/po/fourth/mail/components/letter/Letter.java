package pl.edu.pw.mini.po.fourth.mail.components.letter;

public abstract class Letter {
	
	protected String text;
	protected Address address;
	
	public abstract String getAuthor(); 
	
	void test() {
		
	}
	
	public Letter(String text, Address address) {
		super();
		this.text = text;
		this.address = address;
	}

	public void readMe() {
		System.out.println("Letter read: " + text);
	}

	public Address getAddress() {
		return address;
	}
	
}
