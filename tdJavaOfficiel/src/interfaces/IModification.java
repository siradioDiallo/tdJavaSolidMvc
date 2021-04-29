package interfaces;

import java.util.List;

public interface IModification <T> {
	
	void add(T toAdd);
	void delete(int id);
	void update(int id);
	void showDetail(int id);
	void showAll();
	/*
	 List<T> findAll();
	 int getById(T id);
	 T getById(int id);
	 */
	
	

}
