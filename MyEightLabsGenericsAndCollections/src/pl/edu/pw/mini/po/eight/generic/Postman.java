package pl.edu.pw.mini.po.eight.generic;

import java.util.List;



public class Postman <T> {
	
	private List<T> list;
	
	public void getMail(T t) {
		list.add(t);
	}
	
	public static <P> void method(P p){
		
	}
	
}

class OldPostman <S> extends Postman<S>{
	
}

class Mail{
	
}