package pl.edu.pw.mini.po.seventh.costruction.constructionteam;

import pl.edu.pw.mini.po.seventh.costruction.constructionteam.storage.ToolStorage;
import pl.edu.pw.mini.po.seventh.costruction.constructionteam.welderteam.WelderTeamException;

public abstract class ConstructionTeam {
	
	protected ToolStorage toolStorage = new ToolStorage();
	
	public abstract void work() throws WelderTeamException;
	
}
