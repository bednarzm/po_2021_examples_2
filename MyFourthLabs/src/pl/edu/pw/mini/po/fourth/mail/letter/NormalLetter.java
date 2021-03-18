package pl.edu.pw.mini.po.fourth.mail.letter;

public class NormalLetter extends Letter {
	
	public NormalLetter(String text) {
		super(text);
	}
	public String getAuthor() {
		return "Maciek";
	}
	public void readMe() {
		System.out.println("This is normal letter: " + text);
	}
	@Override
	public void test() {
		super.test();
	}
	
}
