package headfirst.iterator.candy;

public class ArrayIterator implements Iterator {
	MenuItem[] items;
	int pos = 0;

	public ArrayIterator(MenuItem[] items) {
		this.items = items;
	}

	public Object next() {
		MenuItem menuItem = items[pos];
		pos = pos + 1;
		return menuItem;
	}

	public boolean hasNext() {
		if (pos >= items.length || items[pos] == null) {
			return false;
		} else {
			return true;
		}
	}
}