package pl.edu.pw.mini.po.fourth.mail.components.letter;

public class LoveLetter extends Letter {

	public LoveLetter(String text, Address address) {
		super(text, address);
	}

	@Override
	public String getAuthor() {
		return "Piotrek";
	}
	
}
