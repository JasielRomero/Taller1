public class Negocio extends Tipo {
	private String tipoNegocio;
	private double tamaLocal;
	private int nroEmpleado;

	public String getTipoNegocio() {
		return this.tipoNegocio;
	}

	public void setTipoNegocio(String tipoNegocio) {
		this.tipoNegocio = tipoNegocio;
	}

	public double getTamaLocal() {
		return this.tamaLocal;
	}

	public void setTamaLocal(double tamaLocal) {
		this.tamaLocal = tamaLocal;
	}

	public int getNroEmpleado() {
		return this.nroEmpleado;
	}

	public void setNroEmpleado(int nroEmpleado) {
		this.nroEmpleado = nroEmpleado;
	}

	public Negocio(String tipoNegocio, int nroEmpleado, double tamaLocal) {
		throw new UnsupportedOperationException();
	}
}