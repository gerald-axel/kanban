package Kanban;

public class User implements Runnable {
	public void run() {
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();

		System.out.println("Running " + name + " (Priority =" + priority
				+ ")...");

		Tarea tarea = new Tarea(name, (short) priority);
		if (tarea.save()) {
			Programa.dashboard.add(tarea);
		}
	}
}
