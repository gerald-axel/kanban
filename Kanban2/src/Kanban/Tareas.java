
import java.util.Date;

public class Tareas {
	private String titulo;
	private String descripcion;
	private Estado estado;
	private Categoria categoria;
	private short priority;
	private String Dueño;
	private Date FechaDeEntrega;
	private Date FechaDeCreacion;

	public Tareas() {
		this("");
		System.out.println("Empezando Tarea ");
	}

	public Tareas(String title) {
		this(title, Estado.BACKLOG);
		System.out.println("Titulo");
	}

	public Tareas(String title, Estado state) {
		super();
		System.out.println("Estado");
		
		this.titulo = title;
		FechaDeCreacion = new Date();
		priority = 1;
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
		return Dueño;
	}

	public void setOwner(String owner) {
		this.Dueño = owner;
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
			if (obj instanceof Tareas) {
				return titulo.equals(((Tareas) obj).getTitle());
			}
		}
		return false;
	}

}