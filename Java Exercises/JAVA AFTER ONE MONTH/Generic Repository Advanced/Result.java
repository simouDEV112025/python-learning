package oop_projects;

import java.util.ArrayList;

public class Result<P> {
	private ArrayList<P> results = new ArrayList<>();

	public void add(P result) {
		results.add(result);
	}

	public ArrayList<P> getResult() {
		return results;
	}

}
