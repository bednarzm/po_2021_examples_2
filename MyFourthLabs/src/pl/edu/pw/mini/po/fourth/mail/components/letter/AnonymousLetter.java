package pl.edu.pw.mini.po.fourth.mail.components.letter;

public class AnonymousLetter  extends Letter {

	public AnonymousLetter(String text, Address address) {
		super(text, address);
	}

	@Override
	public String getAuthor() {
		return "Anonymous";
	}
	
}
