package pl.edu.pw.mini.po.seventh.costruction;

import java.util.List;

import pl.edu.pw.mini.po.seventh.costruction.constructionteam.ConcreteTeam;
import pl.edu.pw.mini.po.seventh.costruction.constructionteam.ConstructionTeam;
import pl.edu.pw.mini.po.seventh.costruction.constructionteam.SpawarkaZepsutaException;
import pl.edu.pw.mini.po.seventh.costruction.constructionteam.welderteam.UkradliSpawarkeException;
import pl.edu.pw.mini.po.seventh.costruction.constructionteam.welderteam.WelderTeam;
import pl.edu.pw.mini.po.seventh.costruction.constructionteam.welderteam.WelderTeamException;

public class ConstructionManager {
	
	private List<ConstructionTeam> constructionTeams = List.of(new WelderTeam(), new ConcreteTeam());
	
	public void runConstruction() throws ConstructionManagerException {
		try {
			for(ConstructionTeam constructionTeam : constructionTeams) {
				constructionTeam.work();
			}
		} catch(UkradliSpawarkeException ukradliSpawarkeException) {
			ukradliSpawarkeException.printStackTrace();
			System.out.println("Ubolewam!!!");
			throw new ConstructionManagerException("Problemy na budowie", ukradliSpawarkeException);
		} catch(SpawarkaZepsutaException spawarkaZepsutaException) {
			
		} catch(WelderTeamException welderTeamException) {
			welderTeamException.printStackTrace();
		}
	}
}
