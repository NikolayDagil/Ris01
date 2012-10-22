package org.Nick.Sist;

public class Planet {

	private Long kol;
	private Moon moon;

	/**
	 * 
	 */
	public Planet() {
	}

	/**
	 * @param kol
	 * @param moon
	 */
	public Planet(Long kol, Moon moon) {
		this.kol = kol;
		this.moon = moon;
	}

	/**
	 * @return the kol
	 */
	public Long getKol() {
		return kol;
	}

	/**
	 * @param kol
	 *            the kol to set
	 */
	public void setKol(Long kol) {
		this.kol = kol;
	}

	/**
	 * @return the moon
	 */
	public Moon getMoon() {
		return moon;
	}

	/**
	 * @param moon
	 *            the moon to set
	 */
	public void setMoon(Moon moon) {
		this.moon = moon;
	}

}