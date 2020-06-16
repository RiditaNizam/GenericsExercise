import java.util.ArrayList;
import java.util.List;

// <ID> references the one that's outside
public class Catalog<T extends Item<ID>, ID extends Number> {

	private List<T> allItems = new ArrayList<T>();

	// Find everything the catalog has in it
	public List<T> getAllItems() {
		return allItems;
	}

	// Find items, by ID, T is an item
	public T getItem(ID id) {
		for (T item : allItems) {
			if (item.getUniqueId().equals(id)) {
				return item;
			}
		}
		return null;
	}

	public void addItem(T item) {
		allItems.add(item);
	}

}