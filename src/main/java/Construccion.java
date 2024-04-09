public class Construccion extends Tipo {
	private String tipoConstruccion;
	private double tamaConstruccion;
	private String ubicacion;

	public String getTipoConstruccion() {
		return this.tipoConstruccion;
	}

	public void setTipoConstruccion(String tipoConstruccion) {
		this.tipoConstruccion = tipoConstruccion;
	}

	public double getTamaConstruccion() {
		return this.tamaConstruccion;
	}

	public void setTamaConstruccion(double tamaConstruccion) {
		this.tamaConstruccion = tamaConstruccion;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Construccion(String tipoConstruccion, double tamaConstruccion, String ubicacion) {
		throw new UnsupportedOperationException();
	}
}