package pl.edu.pw.mini.po.fourth.mail.components.postman;

import pl.edu.pw.mini.po.fourth.components.mailbox.Mailbox;

public class ErrandBoy extends Postman {

	public ErrandBoy(Mailbox[] mailboxes) {
		super(mailboxes);
		postManType = PostManType.ERRAN_BOY;;//Tak nie robimy!!!
	}
	
}
