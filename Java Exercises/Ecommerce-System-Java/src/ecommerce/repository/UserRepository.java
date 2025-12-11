package ecommerce.repository;

import java.util.Collection;

import ecommerce.model.users.User;

public class UserRepository extends Repository<String, User> {

	public void addUser(String id, User user) {
		save(id, user);
	}

	public void removeUser(String id) {
		delete(id);
	}

	public User getUser(String id) {
		return find(id);
	}

	public Collection<User> getAllUsers() {
		return findAll();
	}

	public void updateUser(String id, User newUser) {
		update(id, newUser);
	}

}
