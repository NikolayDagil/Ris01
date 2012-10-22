package org.Nick.action;

import java.util.ArrayList;
import java.util.List;

import org.Nick.Sist.Moon;

public class MoonAction {

	private List<Moon> moons = new ArrayList<Moon>();

	public void delete(Moon moon) {
		moons.remove(moon);
	}

	public void add(Moon moon) {
		moons.add(moon);
	}

	public List<Moon> readAll() {
		return moons;
	}

}