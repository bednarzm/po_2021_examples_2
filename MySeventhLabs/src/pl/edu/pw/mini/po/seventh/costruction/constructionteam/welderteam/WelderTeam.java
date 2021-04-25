package pl.edu.pw.mini.po.seventh.costruction.constructionteam.welderteam;

import pl.edu.pw.mini.po.seventh.costruction.constructionteam.ConstructionTeam;
import pl.edu.pw.mini.po.seventh.costruction.constructionteam.Welder;

public class WelderTeam extends ConstructionTeam {

	@Override
	public void work() throws WelderTeamException {
		Welder welder = toolStorage.getWelder();
		if(welder != null) {
			throw new UkradliSpawarkeException("Nie ma wiec ukradli!");
		} else {
			welder.weld();
		}
		
	}

}
