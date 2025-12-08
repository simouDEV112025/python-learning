package library.repository;

import java.util.Collection;

import library.model.User;

public class UserRepository {
	private Repository<String, User> repository = new Repository<>();

	public void addUser(String id, User b) {
		repository.save(id, b);
	}

	public void removeUser(String id) {
		repository.delete(id);
	}

	public User getUser(String id) {
		return repository.find(id);
	}

	public Collection<User> getAllUsers() {
		return repository.findAll();
	}

	public void update(String id, User b) {
		repository.update(id, b);
	}

}
