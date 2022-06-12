package br.com.entra21.emr.backend.login.area.emr.crud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import br.com.entra21.emr.backend.anottations.NotImplemented;

public interface ICrud<T> {
	
	@NotImplemented
	ArrayList<String> options = new ArrayList<String>(
			Arrays.asList("Create", "Read", "Update", "Delete", "Details"));
		//Arrays.asList("List", "Create", "Search", "Update", "Delete"));

	public void list(HashMap<String,T> list);

	public void create();

	public T search(T key);

	public void update(T key);

	public void delete(T key);

	public T captureKey();

	public T captureValues();
	
	public void details(HashMap<String,T> list);
	
}
