package pl.edu.pw.mini.po.fourth.mail.components.postman;

import pl.edu.pw.mini.po.fourth.components.mailbox.Mailbox;

public abstract class GradedPostman extends Postman {
	
	protected int grade;

	public GradedPostman(Mailbox[] mailboxes) {
		super(mailboxes);
	}
	
}
