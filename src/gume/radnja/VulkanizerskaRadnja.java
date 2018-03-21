package gume.radnja;

import java.util.LinkedList;

import gume.AutoGuma;

/**
 * Klasa koja opisuje Vulkanizesku radnju i neke njene funkcionalnosti.
 * 
 * @author Nikola Madic
 * @version 0.0.2
 */
public class VulkanizerskaRadnja {
	/**
	 * Lista guma dostupnih na stanju.
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Dodaje gumu u postojecu listu.
	 * 
	 * @param a objekat Autoguma koji dodajemo na stanje
	 * @throws java.lang.RuntimeException baca izuzetak u slucaju da guma vec postoji na stanju.
	 * @throws java.lang.NullPointerException baca izuzetak u slucajnu unosa nedozvoljenih vrednosti.
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}

	/**
	 * Pronalazi gume odredjenog modela i vraca ih kao novu listu.
	 * 
	 * @param markaModel ime marke i modela
	 * @return {@link LinkedList} listu guma odredjene marke i modela.
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}
}
