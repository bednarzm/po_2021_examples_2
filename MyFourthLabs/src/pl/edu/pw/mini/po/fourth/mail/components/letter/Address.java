package pl.edu.pw.mini.po.fourth.mail.components.letter;

import pl.edu.pw.mini.po.fourth.mail.PostofficeSimulator;

public class Address {

	private int index;

	public Address(int index) {
		super();
		if(index >= PostofficeSimulator.MAILBOX_SIZE) {
			this.index = PostofficeSimulator.MAILBOX_SIZE-1;
		} else {
			this.index = index;
		}
		
	}

	public int getIndex() {
		return index;
	} 
	
}
