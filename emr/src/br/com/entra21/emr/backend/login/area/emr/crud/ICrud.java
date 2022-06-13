package br.com.entra21.emr.backend.login.area.emr.crud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public interface ICrud<A> {
	
	ArrayList<String> options = new ArrayList<String>(
			Arrays.asList("Create", "Read", "Update", "Delete", "Details"));

	public void list(HashMap<String,A> list);

	public void create();

	public A search(A key);

	public void update(A key);

	public void delete(A key);

	public A captureKey();

	public A captureValues();
	
	public void details(HashMap<String,A> list);
	
}
