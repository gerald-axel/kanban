package Kanban;

import java.util.Arrays;

public class Pizarra implements IDashboard {

	private int capacid;
	private transient Tareas[] tareas;
	private transient int cantidad = 0;

	
	public boolean add(Tareas task) {
		VerificarCapacidad(capacid + 1);
		tareas[capacid++] = task;
		return true;
	}

	public void VerificarCapacidad(int minCapacity) {
		cantidad++;
		int oldCapacity = tareas.length;
		if (minCapacity > oldCapacity) {
			int newCapacity = (oldCapacity * 3) / 2 + 1;
			if (newCapacity < minCapacity)
				newCapacity = minCapacity;
			
			tareas = Arrays.copyOf(tareas, newCapacity);
		}
	}

	public boolean remove(Tareas task) {
		if (task == null) {
			for (int index = 0; index < capacid; index++)
				if (tareas[index] == null) {
					RemoverRapido(index);
					return true;
				}
		} 
                else {
			for (int index = 0; index < capacid; index++)
				if (task.equals(tareas[index])) {
					RemoverRapido(index);
					return true;
				}
		}
		return false;
	}

	
	private void RemoverRapido(int index) {
		cantidad++;
		int numMoved = capacid - index - 1;
		if (numMoved > 0)
			System.arraycopy(tareas, index + 1, tareas, index, numMoved);
		tareas[--capacid] = null; 
	}

	public void clear() {
		cantidad++;

		for (int i = 0; i < capacid; i++)
			tareas[i] = null;

		capacid = 0;
	}

	public Pizarra(int initialCapacity) {
		super();
		if (initialCapacity < 0)
			throw new IllegalArgumentException("Illegal Capacity: "
					+ initialCapacity);
		this.tareas = new Tareas[initialCapacity];
	}

	public Pizarra() {
		this(10);
	}
}
