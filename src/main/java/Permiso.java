import java.util.Date;
public class Permiso {
	private Date fechaEmision;
	private Date fechaVencimiento;
	private int costo;
	private int nroGestion;
	private Municipalidad municipalidad;
	private Tipo tipo;

	public Date getFechaEmision() {
		return this.fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Date getFechaVencimiento() {
		return this.fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getCosto() {
		return this.costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public int getNroGestion() {
		return this.nroGestion;
	}

	public void setNroGestion(int nroGestion) {
		this.nroGestion = nroGestion;
	}

	public Permiso(Date fechaEmision, Date fechaVencimiento, int costo, int nroGestion, Tipo tipoGestion) {
		throw new UnsupportedOperationException();
	}
}