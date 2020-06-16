import java.util.ArrayList;
import java.util.List;

// Able to hold books, borrowers, library staff, loans, etc
public class Catalog<T extends Item> {

	private List<T> allItems = new ArrayList<T>();

	// Find items
	public List<T> getAllItems() {
		return allItems;
	}

	// Find items
	public T getItem(T id) {
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