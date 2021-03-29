package pl.edu.pw.mini.po.fourth.mail.components.postman;

import pl.edu.pw.mini.po.fourth.components.mailbox.Mailbox;

public class Courier extends GradedPostman {
	
	public Courier(Mailbox[] mailboxes) {
		super(mailboxes);
		postManType = PostManType.COURIER;//Tak nie robimy!!!
	}

}
