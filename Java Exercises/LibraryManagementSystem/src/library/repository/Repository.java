package library.repository;

import java.util.Collection;
import java.util.HashMap;

public class Repository<K, V> {
	private HashMap<K, V> map = new HashMap<>();

	public void save(K key, V value) {
		map.put(key, value);
	}

	public V find(K key) {
		return map.get(key);
	}

	public void delete(K key) {
		map.remove(key);
	}

	public void update(K key, V newValue) {
		map.replace(key, newValue);
	}

	public Collection<V> findAll() {
		return map.values();
	}

}
