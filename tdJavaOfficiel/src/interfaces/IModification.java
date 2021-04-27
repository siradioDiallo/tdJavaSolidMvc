package interfaces;

public interface IModification <T> {
	
	void add(T toAdd);
	void delete(int id);
	void update(int id);
	void showDetail(int id);
	void showAll();
	//int getById(T id);
	

}
