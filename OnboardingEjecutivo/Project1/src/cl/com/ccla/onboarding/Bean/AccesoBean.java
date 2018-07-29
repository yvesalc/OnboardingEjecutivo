package cl.com.ccla.onboarding.Bean;

import cl.com.ccla.onboarding.VO.LoginVO;
import cl.com.ccla.onboarding.VO.PerfilVO;

public class AccesoBean {
    public AccesoBean() {
        super();
    }


    public LoginVO validarLogin(String usuario, String pass) {

        LoginVO loginvo = new LoginVO();


        if (usuario.equals("ejecutivo")) {

            if (pass.equals("ejecutivo")) {

                loginvo.setLogin(true);
                loginvo.setPerfilVO(new PerfilVO(1, "A", "Ejecutivo"));
            }


            if (usuario.equals("admin")) {

                if (pass.equals("admin")) {

                    loginvo.setLogin(true);
                    loginvo.setPerfilVO(new PerfilVO(2, "A", "Administrador"));
                }

            }


            return loginvo;

        }
    }
}
