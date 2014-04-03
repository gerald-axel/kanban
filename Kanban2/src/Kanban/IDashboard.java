package Kanban;

public interface IDashboard {

	public abstract boolean add(Tarea task);

	boolean remove(Tarea task);

	void clear();
}
