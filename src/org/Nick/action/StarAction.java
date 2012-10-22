package org.Nick.action;

import java.util.ArrayList;
import java.util.List;

import org.Nick.Sist.Star;

public class StarAction {
	
	private List<Star> stars = new ArrayList<Star>();

	public void delete(Star stars) {
		stars.remove(stars);
	}

	public void add(Star stars) {
		stars.add(stars);
	}

	public List<Star> readAll() {
		return stars;
	}


}