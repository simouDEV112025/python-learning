package oop_projects;

import java.util.HashMap;

public class Repository<I, P> {
	private HashMap<I, P> map = new HashMap<>();

	public void save(I id, P product) {
		map.put(id, product);
	}

	public P get(I id) {
		return map.get(id);
	}

	public void remove(I id) {
		map.remove(id);
	}

	public void update(I id, P newProduct) {
		map.replace(id, newProduct);
	}

	public HashMap<I, P> map() {
		return map;
	}
}
