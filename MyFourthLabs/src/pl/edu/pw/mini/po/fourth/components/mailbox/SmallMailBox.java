package pl.edu.pw.mini.po.fourth.components.mailbox;

import pl.edu.pw.mini.po.fourth.mail.components.letter.Letter;

public class SmallMailBox extends Mailbox {

	@Override
	public void putMail(Letter letter) {
		System.out.println("Uwaga uwaga: ");
		letter.readMe();
	}
	
}
