package ecommerce.model.users;

public class Admin extends User {

	public Admin(String id, String username, String password) {
		super(id, username, password);
	}

	@Override
	public String toString() {
		return getId() + " " + getUsername() + " " + getPassword();
	}
}
