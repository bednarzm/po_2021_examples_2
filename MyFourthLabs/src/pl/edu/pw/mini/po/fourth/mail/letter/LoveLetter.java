package pl.edu.pw.mini.po.fourth.mail.letter;

public class LoveLetter extends Letter {

	public LoveLetter(String text) {
		super(text);
	}

	@Override
	public String getAuthor() {
		return "Piotrek";
	}
	
}
