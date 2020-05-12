package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class TesteMap {

	public static void main(String[] args) {
		// Primeiro -> o tipo do dado da Chave (unico)
		// Segundo --> o tipo do dado comum ==> List
		Map <String, Cargo>lista = new HashMap<>();
		
		//list.put(key,value)
		lista.put("1", new Cargo("DBA","JR",5000));
		lista.put("2", new Cargo("Analista","Senior",10000));
		lista.put("1", new Cargo("DBA","Pleno",7500));
		
		System.out.println(lista);
		System.out.println(lista.keySet()); // mostra somente as chaves
		System.out.println(lista.values()); // Mostra somente os dados
	
	
		for(Cargo objeto : lista.values()) {
			System.out.println(objeto.getAll());
		}
		
		Cargo objeto = lista.get("2");
		System.out.println("Encontrado: " + objeto.getNome());
		
	
	}

}
