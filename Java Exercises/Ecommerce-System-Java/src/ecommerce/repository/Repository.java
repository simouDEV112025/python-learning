package ecommerce.repository;

import java.util.Collection;
import java.util.HashMap;

public class Repository<K, V> {
	private HashMap<K, V> storage = new HashMap<>();

	public void save(K k, V v) {
		storage.put(k, v);
	}

	public V find(K k) {
		return storage.get(k);
	}

	public void delete(K k) {
		storage.remove(k);
	}

	public void update(K k, V newV) {
		storage.replace(k, newV);
	}

	public Collection<V> findAll() {
		return storage.values();
	}

}
