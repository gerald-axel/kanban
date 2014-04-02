package Kanban;

public class User extends Thread{
	public void run(){
		String name= Thread.currentThread().getName();
		
		int priority= Thread.currentThread().getPriority();
		
		System.out.println("Running"+name);
		
		Tareas task= new Tareas(name, (short) priority);
		
		if(task.save()){
			Programa.dashboard.add(task);
		}
	}

}
