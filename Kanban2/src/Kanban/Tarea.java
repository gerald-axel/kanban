package Kanban;

import java.util.Date;

public class Tarea {
	private String titulo;
	private String descripcion;
	private Estado estado;
	private Categoria categoria;
	private short priority;
	private String Usuario;
	private Date FechaDeEntrega;
	private Date FechaDeCreacion;

	public Tarea() {
		this("");
		System.out.println("Empezando Tarea ");
	}

	public Tarea(String title) {
		this(title, Estado.BACKLOG, (short) 1);
		System.out.println("Titulo");
	}
	
	public Tarea(String title, short priority) {
		this(title, Estado.BACKLOG, priority);
		System.out.println("Titulo");
	}
	
	public Tarea(String title, Estado state) {
		this(title, Estado.BACKLOG,(short) 1);
		System.out.println("Titulo");
	}

	public Tarea(String title, Estado state, short priority) {
		super();
		System.out.println("Estado");
		
		this.titulo = title;
		FechaDeCreacion = new Date();
		this.priority = priority;
		this.estado = state;
	}

	public String getTitle() {
		return titulo;
	}

	public void setTitle(String title) {
		if (title != null) {
			this.titulo = title;
		}
	}

	public String getDescription() {
		return descripcion;
	}

	public void setDescription(String description) {
		this.descripcion = description;
	}

	public Estado getState() {
		return estado;
	}

	public void setState(Estado state) {
		this.estado = state;
	}

	public Categoria getCategory() {
		return categoria;
	}

	public void setCategory(Categoria category) {
		this.categoria = category;
	}

	public short getPriority() {
		return priority;
	}

	public void setPriority(short priority) {
		this.priority = priority;
	}

	public String getOwner() {
		return Usuario;
	}

	public void setOwner(String owner) {
		this.Usuario = owner;
	}

	public Date getDueDate() {
		return FechaDeEntrega;
	}

	public void setDueDate(Date dueDate) {
		this.FechaDeEntrega = dueDate;
	}

	public Date getCreateDate() {
		return FechaDeCreacion;
	}

	public void setCreateDate(Date createDate) {
		this.FechaDeCreacion = createDate;
	}

	public String toString() {
		return this.titulo;
	}

	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof Tarea) {
				return titulo.equals(((Tarea) obj).getTitle());
			}
		}
		return false;
	}
	
	public boolean save(){
		try{
			Thread.sleep(1*1000);
		}catch(InterruptedException e ){
			e.printStackTrace();
		}
		return true;
	}

}