package cl.com.ccla.onboarding.VO;

public class EstadoCreditoVO {
    public EstadoCreditoVO(int idEstadoCredito, String nombreEstado) {
        this.idEstadoCredito = idEstadoCredito;
        this.nombreEstado = nombreEstado;

    }

    private int idEstadoCredito;
    private String nombreEstado;

    public void setIdEstadoCredito(int idEstadoCredito) {
        this.idEstadoCredito = idEstadoCredito;
    }

    public int getIdEstadoCredito() {
        return idEstadoCredito;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }
}
