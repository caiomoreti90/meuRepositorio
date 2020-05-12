package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteListaObjeto {

	public static void main(String[] args) {
		List<Cargo> lista = new ArrayList<>();
		lista.add( new Cargo("DBA","JR",5000));
		lista.add( new Cargo("ANALISTA","PLENO",7000));
		lista.add( new Cargo("DESENVOLVEDOR","SENIOR",10000));
		System.out.println(lista.get(0).getAll());

		Collections.sort(lista);
		
		for (Cargo objeto: lista) {
			System.out.println(objeto.getAll());
		}

	}

}