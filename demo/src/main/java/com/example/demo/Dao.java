package com.example.demo;

import java.util.List;

public interface Dao<E> {
	void save(E e);
	E load(long empid);
	void delete(long empid);
	void update(E e);
	List<E> loadAll();
	
}
	
	
	
	
	
	
	
	
	
	
	

