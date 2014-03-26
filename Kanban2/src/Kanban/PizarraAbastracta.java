
import java.util.ArrayList;
import java.util.List;

public abstract class PizarraAbastracta implements IDashboard {

	protected List container;

	public PizarraAbastracta() {
		super();
		System.out.println("Empezando Pizarra Abstracta");
		container = new ArrayList();
	}

	@Override
	public boolean add(Tareas task) {
		return container.add(task);
	}

}
