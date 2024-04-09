public class Ciudadano {
	private String nombre;
	private int run;
	private Municipalidad municipalidad;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRun() {
		return this.run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public Ciudadano(String nombre, int run) {
		throw new UnsupportedOperationException();
	}
}