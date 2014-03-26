package Kanban;


public class Programa {

	public static void main(String[] args) throws Exception {
            
		Tareas task;
                
		IDashboard dashboard = new ListaDeTareas();
                
		for (int i = 0; i < 15; i++) {
			task = new Tareas("Tareas " + i, Estado.DO_TO);
			if (dashboard.add(task)) {
				System.out.println("Agregar " + task.getTitle());
			}
		}
	}

}
