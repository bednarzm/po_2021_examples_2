package pl.edu.pw.mini.po.fourth.components.mailbox;

import pl.edu.pw.mini.po.fourth.mail.components.letter.Letter;

public abstract class Mailbox {
	
	public void putMail(Letter letter) {
		letter.readMe();
	}
	
}
