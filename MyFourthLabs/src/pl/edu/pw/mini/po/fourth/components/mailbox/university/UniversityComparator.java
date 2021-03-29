package pl.edu.pw.mini.po.fourth.components.mailbox.university;

import pl.edu.pw.mini.po.fourth.components.mailbox.Universities;

public class UniversityComparator {
	public void compareUniversity(Universities university) {
		
		switch(university) {
			case PW:
					System.out.println(Universities.PW.getValue());
				break;
			case AGH:
				break;
				
		}
		
	}
}
