package pl.edu.pw.mini.po.eight.generic;

public class GenericPostmanDemonstrator {

	public static void main(String[] args) {
		
		Postman<SpecificMail> postman = new Postman<>();
		
		Object o = Integer.valueOf(1);
		Postman.method(o);
	}

}

class SpecificMail {
	
}
