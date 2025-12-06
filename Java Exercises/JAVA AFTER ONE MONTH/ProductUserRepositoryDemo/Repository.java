package oop_projects;

import java.util.HashMap;

public class Repository<T, V> {
	private HashMap<T, V> map = new HashMap<>();

	public void save(T id, V product) {
		map.put(id, product);
	}

	public V get(T id) {
		return map.get(id);
	}

	public HashMap<T, V> getRepository() {
		return map;
	}

	public void remove(T id) {
		map.remove(id);
	}

	public void update(T id, V product) {
		map.replace(id, product);
	}

}
