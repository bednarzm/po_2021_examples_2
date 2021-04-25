package pl.edu.pw.mini.po.seventh.capitals;

public class HumanCapitaInformer extends CapitaInformer {
	
	 void meth() {
		
	}
	
	@Override
	public String getCapital(String country) {
		/* Mniej elegancko
		try {
			result = super.getCapital(country);
		} catch(CapitalUnknownException capitalUnknownException) {
			capitalUnknownException.printStackTrace();
			result = "UNKNOWN";
		}
		*/
		return getCapitalName(country);
	}
	
}
