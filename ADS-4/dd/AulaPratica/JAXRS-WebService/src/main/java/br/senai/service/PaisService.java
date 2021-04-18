package br.senai.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.senai.modelo.Pais;

public class PaisService {
	static HashMap<Integer, Pais> PaisIdMap = getPaisIdMap();

	public PaisService() {
		super();

		if (PaisIdMap == null) {
			PaisIdMap = new HashMap<Integer, Pais>();

			Pais indiaPais = new Pais(1, "India", 10000);
			Pais chinaPais = new Pais(4, "China", 20000);
			Pais nepalPais = new Pais(3, "Nepal", 8000);
			Pais bhutanPais = new Pais(2, "Bhutan", 7000);

			PaisIdMap.put(1, indiaPais);
			PaisIdMap.put(4, chinaPais);
			PaisIdMap.put(3, nepalPais);
			PaisIdMap.put(2, bhutanPais);
		}
	}

	public List getAllCountries() {
		List countries = new ArrayList(PaisIdMap.values());
		return countries;
	}

	public Pais getPais(int id) {
		Pais Pais = PaisIdMap.get(id);
		return Pais;
	}

	public Pais addPais(Pais Pais) {
		Pais.setId(PaisIdMap.size() + 1);
		PaisIdMap.put(Pais.getId(), Pais);
		return Pais;
	}

	public Pais updatePais(Pais Pais) {
		if (Pais.getId() <= 0)
			return null;
		PaisIdMap.put(Pais.getId(), Pais);
		return Pais;
	}

	public void deletePais(int id) {
		PaisIdMap.remove(id);
	}

	public static HashMap<Integer, Pais> getPaisIdMap() {
		return PaisIdMap;
	}
}
