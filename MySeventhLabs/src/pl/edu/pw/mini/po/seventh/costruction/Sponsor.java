package pl.edu.pw.mini.po.seventh.costruction;

public class Sponsor {
	
	private ConstructionCompany constructionCompany = new ConstructionCompany();

	public void go() {
		try {
			constructionCompany.runProject();
		} catch (ConstructionManagerException constructionManagerException) {
			constructionManagerException.printStackTrace();
			constructionManagerException.getCause();
		}
	}
	
}
