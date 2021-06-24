package dataAccess.concreates;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concreates.User;

public class HiberNateUser implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi");
		
	}

	@Override
	public void uptade() {
		System.out.println("Hibernate ile güncellendi");
		
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