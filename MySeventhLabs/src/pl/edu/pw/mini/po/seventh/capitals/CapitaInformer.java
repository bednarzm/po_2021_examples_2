package pl.edu.pw.mini.po.seventh.capitals;

public class CapitaInformer {

	void meth() {

	}

	protected String getCapitalName(String country) {
		String result;
		country = country.toUpperCase();
		switch (country) {
			case "POLAND":
				result = "WARSAW";
				break;
			case "GERMANY":
				result = "BERLIN";
				break;
			case "FRANCE":
				result = "PARIS";
				break;
			default:
				result = "UNKNOWN";
		}
		
		return result;
	}

	/**
	 * Three countries supported only.
	 * 
	 * @param country
	 * @return name of the capital of ...
	 */
	public String getCapital(String country) throws CapitalUnknownException {
		String result = "";

		if (country != null) {
			if("UNKNOWN".equals(result = getCapitalName(country))){
				throw new CapitalUnknownException();
			}
		}

		return result;
	}

}
