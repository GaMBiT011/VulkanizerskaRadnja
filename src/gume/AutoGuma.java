package gume;
/**
 * Klasa koja dodaje auto gumu sa nekim funkcijonalnostima.
 * @author Nikola Madic
 * @version 0.0.1
 * 
 * 
 */
public class AutoGuma {

	/**
	 *	 Ime marke i modela.
	 */
	private String markaModel = null;
	/**
	 * Precnik gume u incima.
	 */
	private int precnik = 0;
	/**
	 * Sirina gume u cm.
	 */
	private int sirina = 0;
	/**
	 * Visina gume u cm.
	 */
	private int visina = 0;
/**
 * Craca ime marke i modela kao string.
 * @return ime marke i modela.
 */
	public String getMarkaModel() {
		return markaModel;
	}
/**
 * postavlja ime marke i modela na z`adatu vrednost.
 * @param markaModel ime marke i modela gume.
 * @throws java.lang.RuntimeException baca izuzetak u slucaju unosa nedozvoljenih vrednosti za ime marke i modela.
 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}
/**
 * Vraca precnik gume.
 * @return precnik gume.
 */
	public int getPrecnik() {
		return precnik;
	}
/**
 * Postavlja precnik gume na zadatu vrednost.
 * @param precnik duzina precnika u incima.
 * @throws java.lang.RuntimeException baca izuzetak u slucaju unosa nedozvoljenih vrednosti za precnik gume.
 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}
/**
 * vraca sirinu gume.
 * @return sirinu gume.
 */
	public int getSirina() {
		return sirina;
	}
/**
 * Postavlja sirinu gume na zadatu vrednost.
 * @param sirina nova vrednost za sirinu gume
 * @throws java.lang.RuntimeException baca izuzetak u slucaju unosa nedozvoljenih vrednosti za sirinu gume.
 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}
/**
 * vraca visinu gume.
 * @return visina gume.
 */
	public int getVisina() {
		return visina;
	}
/**
 * Postavlja visinu gume na zadatu vrednost.
 * @param visina nova vrednost za visinu gume.
 * @throws java.lang.RuntimeException baca izuzetak u slucaju unosa nedozvoljenih vrednosti za visinu gume.
 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}
/**
 * Pretvara klasu AutoGuma u String.
 * @return AutoGuma kao string.
 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}
/**
 * proverava da li su dve gume jednake.
 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}

}
