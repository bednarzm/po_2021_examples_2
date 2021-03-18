package pl.edu.pw.mini.po.fourth.mail.letter;

public class AnonymousLetter  extends Letter {

	public AnonymousLetter(String text) {
		super(text);
	}

	@Override
	public String getAuthor() {
		return "Anonymous";
	}
	
}
