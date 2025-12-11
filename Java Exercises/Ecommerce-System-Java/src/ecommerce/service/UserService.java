package ecommerce.service;

import java.util.Collection;
import java.util.Iterator;

import ecommerce.model.users.User;
import ecommerce.repository.UserRepository;

public class UserService {
	private UserRepository userRepository = new UserRepository();

	public void createUser(String id, User user) {
		userRepository.addUser(id, user);
	}

	public void authenticateUser(String username, String password) {
		Collection<User> list = userRepository.getAllUsers();
		Iterator<User> it = list.iterator();
		while (it.hasNext()) {
			User c = it.next();
			if (c.getUsername().equals(username) && c.getPassword().equals(password)) {
				System.out.println("Login successful");
				return;
			}
		}
		System.out.println("Login failed");
	}

	public User getUserById(String id) {
		return userRepository.getUser(id);
	}
}
