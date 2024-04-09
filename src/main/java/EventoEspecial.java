public class EventoEspecial extends Tipo {
	private String tipoEvento;
	private int cantAsistente;
	private String medidaSeguridad;

	public String getTipoEvento() {
		return this.tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public int getCantAsistente() {
		return this.cantAsistente;
	}

	public void setCantAsistente(int cantAsistente) {
		this.cantAsistente = cantAsistente;
	}

	public String getMedidaSeguridad() {
		return this.medidaSeguridad;
	}

	public void setMedidaSeguridad(String medidaSeguridad) {
		this.medidaSeguridad = medidaSeguridad;
	}

	public EventoEspecial(String tipoEvento, int cantAsistente, String medidaSeguridad) {
		throw new UnsupportedOperationException();
	}
}