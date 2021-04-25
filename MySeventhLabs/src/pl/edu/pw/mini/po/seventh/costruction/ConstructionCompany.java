package pl.edu.pw.mini.po.seventh.costruction;

import pl.edu.pw.mini.po.seventh.costruction.constructionteam.welderteam.UkradliSpawarkeException;

public class ConstructionCompany {
	
	private ConstructionManager constructionManager = new ConstructionManager();
	
	public void runProject() throws ConstructionManagerException{
		constructionManager.runConstruction();
	}
	
}
