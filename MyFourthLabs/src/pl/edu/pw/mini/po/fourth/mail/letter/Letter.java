package pl.edu.pw.mini.po.fourth.mail.letter;

public abstract class Letter {
	
	protected String text;
	
	public abstract String getAuthor(); 
	
	void test() {
		
	}
	
	public Letter(String text) {
		this.text = text;
	}
	
	public void readMe() {
		System.out.println("Letter read: " + text);
	}
	
}
