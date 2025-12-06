package oop_projects;

public class UserRepository {
	Repository<String, User> repository = new Repository<>();

	public void addUser(String id, User u) {
		repository.save(id, u);
	}

	public void update(String id, User newUser) {
		repository.update(id, newUser);
	}

	public void remove(String id) {
		repository.remove(id);
	}

	public void printAll() {
		for (User user : repository.getRepository().values()) {
			System.out.println(user);
		}
	}

	public void printUserByLetter(String letter) {
		for (User user : repository.getRepository().values()) {
			if (user.getUsername().startsWith(letter)) {
				System.out.println(user);
			}
		}
	}

}
