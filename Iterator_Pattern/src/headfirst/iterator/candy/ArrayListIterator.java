package headfirst.iterator.candy;

import java.util.ArrayList;

public class ArrayListIterator implements Iterator {
	ArrayList items;
	int pos = 0;

	public ArrayListIterator(ArrayList items) {
		this.items = items;
	}

	public Object next() {
		Object object = items.get(pos);
		pos = pos + 1;
		return object;
	}

	public boolean hasNext() {
		if (pos >= items.size()) {
			return false;
		} else {
			return true;
		}
	}
}