package main.com.github.jonataslaet.programmingchallenges.datastructures;

@SuppressWarnings({ "unused" })
public class LinkedList<T> implements Operations<T> {

	private T first;
	private T last;
	private int currentQuantityOfElements;

	@Override
	public void add(T object) {
	}

	@Override
	public void add(int position, T object) {
	}

	@Override
	public T get(int position) {
		return null;
	}

	@Override
	public void remove(int position) {
	}

	@Override
	public boolean contains(T object) {
		return false;
	}

	@Override
	public int size() {
		return this.currentQuantityOfElements;
	}

	public void addToTheBeginning(T object) {
	}

	public void removeFromTheBeginning() {
	}

	public void removeFromTheEnding() {
	}

	private boolean validPosition(int position) {
		return position >= 0 && position <= this.currentQuantityOfElements;
	}

	private void validOccupiedPosition(int position) {
		if (!occupiedPosition(position)) {
			throw new IllegalArgumentException("Position without element");
		}
	}

	private boolean occupiedPosition(int position) {
		return position >= 0 && position < this.currentQuantityOfElements;
	}
}
