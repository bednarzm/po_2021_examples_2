package pl.edu.pw.mini.po.fourth.mail.components.postman;

import pl.edu.pw.mini.po.fourth.components.mailbox.Mailbox;

public class NormalPostman extends GradedPostman {
	 
	public NormalPostman(Mailbox[] mailboxes) {
		super(mailboxes);
		postManType = PostManType.NORMAL_POSTMAN;;//Tak nie robimy!!!
	}
	
}
