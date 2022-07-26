package br.com.financeSystem.backend.models;

import java.util.ArrayList;

public class Category {
	private ArrayList<String> category = new ArrayList<String>();

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(ArrayList<String> category) {
		super();
		this.category = category;
	}

	public ArrayList<String> getCategory() {
		return category;
	}

	public void setCategory(ArrayList<String> category) {
		this.category = category;
	}
	
	
	public void addCategory(String categoryItem) {
		this.category.add(categoryItem);
		
	}
	
	public String readCategory(int index) {
		return category.get(index);
	}
	
}
