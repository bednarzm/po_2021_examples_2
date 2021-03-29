package pl.edu.pw.mini.po.fourth.mail;

import pl.edu.pw.mini.po.fourth.components.mailbox.BigMailBox;
import pl.edu.pw.mini.po.fourth.components.mailbox.Mailbox;
import pl.edu.pw.mini.po.fourth.components.mailbox.SmallMailBox;
import pl.edu.pw.mini.po.fourth.mail.components.letter.Address;
import pl.edu.pw.mini.po.fourth.mail.components.letter.AnonymousLetter;
import pl.edu.pw.mini.po.fourth.mail.components.letter.Letter;
import pl.edu.pw.mini.po.fourth.mail.components.letter.LoveLetter;
import pl.edu.pw.mini.po.fourth.mail.components.letter.NormalLetter;
import pl.edu.pw.mini.po.fourth.mail.components.letter.Postcard;
import pl.edu.pw.mini.po.fourth.mail.components.postman.Courier;
import pl.edu.pw.mini.po.fourth.mail.components.postman.ErrandBoy;
import pl.edu.pw.mini.po.fourth.mail.components.postman.NormalPostman;
import pl.edu.pw.mini.po.fourth.mail.components.postman.Postman;

public class PostofficeSimulator {
	
	public static final int MAILBOX_SIZE = 4;
	
	public static void main(String[] args) {
		simulate();
	}

	public void method() {
		
	}
	
	private static void simulate() {
		
		Postman[] postmans = createPostmans();
		
		postmans[0].addLetter(new NormalLetter("This is letter", new Address(0)));
		postmans[0].addLetter(new NormalLetter("This is normal letter", new Address(1)));
		postmans[1].addLetter(new Postcard("Greetings frm Warsaw", new Address(2)));
		postmans[1].addLetter(new LoveLetter("I love u", new Address(0)));
		postmans[2].addLetter(new AnonymousLetter("I kill u!", new Address(3)));
		
		for(Postman postman : postmans) {
			postman.deliver();
		}
		
	}
	
	private static Postman[] createPostmans() {
		Postman[] result = new Postman[3];
		Mailbox[] mailboxes = createMailboxes();
		
		result[0] = new NormalPostman(mailboxes);
		result[1] = new ErrandBoy(mailboxes);
		result[2] = new Courier(mailboxes);
		
		return result;
	}
	
	private static Mailbox[] createMailboxes() {
		Mailbox[] result = new Mailbox[MAILBOX_SIZE]; 
		
		result[0] = new SmallMailBox();
		result[1] = new BigMailBox();
		result[2] = new SmallMailBox();
		result[3] = new BigMailBox();
		
		return result;
	}
	
}
