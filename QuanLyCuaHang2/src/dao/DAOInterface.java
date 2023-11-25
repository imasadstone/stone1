package dao;

import java.util.ArrayList;

public interface DAOInterface<T> {
	public int insertSp(T t);
	public int updateSp(T t);
	public int deleteSp(T t);
	public ArrayList<T> selectAllSp();
	public T selectByIdSp(T t);
	public ArrayList<T> selectByConditionSp(String condition);
}
