package pl.edu.pw.mini.po.fourth.mail;

import java.text.Normalizer;

import pl.edu.pw.mini.po.fourth.mail.letter.Letter;
import pl.edu.pw.mini.po.fourth.mail.letter.LoveLetter;
import pl.edu.pw.mini.po.fourth.mail.letter.NormalLetter;
import pl.edu.pw.mini.po.fourth.mail.letter.Postcard;

public class PostofficeSimulator {

	public static void main(String[] args) {
		
		Mailbox mailbox = new Mailbox();
		Letter letter = new Postcard("Hello how are u?");
		letter.getAuthor();
		
		letter.readMe();
		Letter myNormalLetter = new NormalLetter("This is letter");
		NormalLetter check = new NormalLetter("");
		check.readMe();
		NormalLetter normalLetter = new NormalLetter("This is normal letter");
		
		
		
		mailbox.putMail(myNormalLetter);
		mailbox.putMail(normalLetter);
		
		Postcard postcard = new Postcard("Greetings frm Warsaw");
		
		mailbox.putMail(postcard);
		
		LoveLetter loveLetter = new LoveLetter("I love u");
		
		mailbox.putMail(loveLetter);
		
		
		
	}

}
