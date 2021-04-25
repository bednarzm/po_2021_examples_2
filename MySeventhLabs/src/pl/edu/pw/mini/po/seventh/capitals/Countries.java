package pl.edu.pw.mini.po.seventh.capitals;

public enum Countries {

	POLAND, GERMANY, FRANCE;

	public static Countries fromString(String countryName) throws CapitalEnumDoesNotExistException {
		Countries result;
		countryName = countryName.toUpperCase();

		switch (countryName) {
		case "POLAND":
			result = POLAND;
			break;
		case "GERMANY":
			result = GERMANY;
			break;
		case "FRANCE":
			result = FRANCE;
			break;
		default:
			throw new CapitalEnumDoesNotExistException("There is no exception for value: " + countryName);
		}

		return result;
	}
}
