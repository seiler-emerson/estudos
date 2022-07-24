package br.com.financeSystem.backend.login.area.crud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public interface ICrud<T> {
	ArrayList<String> options = new ArrayList<String>(
			Arrays.asList("CREATE", "READ", "UPDATE","DELETE", "DETAILS"));
	
	public void list(HashMap<String,T> list);
	
	public void create();
	
	public T search(T key);
	
	public void update(T key);
	
	public void delete(T key);
	
	public T captureKey();
	
	public T captureValues();
	
	public void details(T complete);
	
}
