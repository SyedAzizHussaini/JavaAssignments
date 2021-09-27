package headfirst.iterator.candy;
import java.util.Calendar;

public class AlternatingChicagoMenuIterator implements Iterator {
	MenuItem[] list;
	int pos;

	public AlternatingChicagoMenuIterator(MenuItem[] list) {
		this.list = list;
		Calendar rightNow = Calendar.getInstance();
		pos = rightNow.DAY_OF_WEEK % 2;
	}
	public Object next() {
		MenuItem menuItem = list[pos];
		pos = pos + 2;
		return menuItem;
	}
	public boolean hasNext() {
		if (pos >= list.length || list[pos] == null) {
			return false;
		} else {
			return true;
		}
	}
	public String toString() {
		return "Alternating Chicago Menu Iterator";
	}
}
