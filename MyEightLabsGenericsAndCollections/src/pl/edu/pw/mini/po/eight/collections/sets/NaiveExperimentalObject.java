package pl.edu.pw.mini.po.eight.collections.sets;

public class NaiveExperimentalObject extends ExperimentalObject {
	
	private int hashcodeDisturbFactor;
	
	public void setHashcodeDisturbFacotr(int hashcodeDisturbFacotr) {
		this.hashcodeDisturbFactor = hashcodeDisturbFacotr;
	}

	@Override
	public int hashCode() {//Tak nie robimy, implementacja na potrzebe eksperymentu
		return id + hashcodeDisturbFactor;//Naprawde tak nie robimy!
	}

	@Override
	public boolean equals(Object obj) {//Tak nie robimy, implementacja na potrzebe eksperymentu
		return this.id == ((ExperimentalObject)obj).id;
	}
	
}
