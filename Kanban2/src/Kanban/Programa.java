package Kanban;

import java.util.Date;


public class Programa {
	public static IDashboard dashboard=new ListaDeTareas();

	public static void main(String[] args) throws Exception {
            
		Tareas task;
                
		IDashboard dashboard = new ListaDeTareas();
                
		for (int i = 0; i < 15; i++) {
			task = new Tareas("Tareas " + i, Estado.DO_TO);
			if (task.save()) {
				System.out.println("Saved " + task.getTitle());
			}
		}
		System.out.println("End"+new Date() );
	}

}
