package cl.com.ccla.onboarding.VO;

public class EjecutivoVO {
    public EjecutivoVO(int idEjecutivo, String nombreEjecutivo) {
        this.idEjecutivo = idEjecutivo;
        this.nombreEjecutivo = nombreEjecutivo;
    }


    private int idEjecutivo;
    private String nombreEjecutivo;

    public void setIdEjecutivo(int idEjecutivo) {
        this.idEjecutivo = idEjecutivo;
    }

    public int getIdEjecutivo() {
        return idEjecutivo;
    }

    public void setNombreEjecutivo(String nombreEjecutivo) {
        this.nombreEjecutivo = nombreEjecutivo;
    }

    public String getNombreEjecutivo() {
        return nombreEjecutivo;
    }
}
