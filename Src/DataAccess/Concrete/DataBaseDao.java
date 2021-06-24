package dataAccess.concreates;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concreates.User;

public class DatabaseDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Database ile eklendi");
		
	}

	@Override
	public void uptade() {
		System.out.println("Database'de uptade edildi");
		
	}

	@Override
	public User get(int email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}