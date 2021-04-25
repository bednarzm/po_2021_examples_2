package pl.edu.pw.mini.po.seventh.costruction.constructionteam;

import java.util.Random;

public class Welder {
	
	public void weld() throws SpawarkaZepsutaException {
		if((new Random()).nextInt() == 0) {
			throw new SpawarkaZepsutaException("Transformator poszedl...");
		}
	}
	
}
