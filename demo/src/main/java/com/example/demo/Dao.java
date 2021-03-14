package com.example.demo;

import java.util.List;

public interface Dao<E> {
	void save(E e);
	E load(int empid);
	void delete(int empid);
	void update(E e);
	List<E> loadAll();
	
}
	
	
	
	
	
	
	
	
	
	
	

