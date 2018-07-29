package cl.com.ccla.onboarding.Bean;

import cl.com.ccla.onboarding.VO.EjecutivoVO;
import cl.com.ccla.onboarding.VO.EstadoCreditoVO;

import java.util.ArrayList;
import java.util.List;

public class ComunesBean {
    public ComunesBean() {
        super();
    }


    public List<EstadoCreditoVO> ConsultarEstadosCredito() {


        EstadoCreditoVO estadoCreditoVO1 =
            new EstadoCreditoVO(1, "firmado por cliente");
        EstadoCreditoVO estadoCreditoVO2 =
            new EstadoCreditoVO(1, "en proceso curse");
        EstadoCreditoVO estadoCreditoVO3 = new EstadoCreditoVO(1, "caducada");
        EstadoCreditoVO estadoCreditoVO4 =
            new EstadoCreditoVO(1, "pendiente firma");
        EstadoCreditoVO estadoCreditoVO5 = new EstadoCreditoVO(1, "cursada");
        EstadoCreditoVO estadoCreditoVO6 = new EstadoCreditoVO(1, "cancelada");
        EstadoCreditoVO estadoCreditoVO7 =
            new EstadoCreditoVO(1, "generando documentacion");
        //meter mas estados


        List<EstadoCreditoVO> lista = new ArrayList<EstadoCreditoVO>();
        lista.add(estadoCreditoVO1);
        lista.add(estadoCreditoVO2);
        lista.add(estadoCreditoVO3);
        lista.add(estadoCreditoVO4);
        lista.add(estadoCreditoVO5);
        lista.add(estadoCreditoVO6);
        lista.add(estadoCreditoVO7);

        return lista;

    }


    public List<EjecutivoVO> ConsultarEjecutivo() {

        EjecutivoVO ejecutivoVO = new EjecutivoVO(1, "nombrejecutivo");

        //meter mas ejecutivos
        List<EjecutivoVO> lista = new ArrayList<EjecutivoVO>();


        return lista;

    }

}
