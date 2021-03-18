package pl.edu.pw.mini.po.fourth.mail.letter;

public class Postcard  extends Letter {

	public Postcard(String text) {
		super(text);
	}

	@Override
	public String getAuthor() {
		return "Holiday friend";
	}

}
