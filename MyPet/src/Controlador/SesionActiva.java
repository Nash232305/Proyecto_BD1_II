package Controlador;

import Vista.Login;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class SesionActiva {
    private static SesionActiva instancia;
    private long ultimoTiempoActivo;
    private final long TIEMPO_DURACION = 30 * 60 * 1000;
    private Timer timer;
    private javax.swing.JFrame FrameActual;

    private SesionActiva(javax.swing.JFrame Frame){
       actualizarActividad(Frame);
       iniciarSesion();
    }

    public static synchronized SesionActiva getInstance(javax.swing.JFrame Frame){
        if(instancia == null){
            instancia = new SesionActiva(Frame);
        }
        return instancia;
    }

    public void actualizarActividad(javax.swing.JFrame Frame){
        ultimoTiempoActivo = System.currentTimeMillis();
        FrameActual = Frame;
    }


    private void iniciarSesion(){
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run(){
                System.out.println("Running " + System.currentTimeMillis()/1000 );
                if(System.currentTimeMillis() - ultimoTiempoActivo > TIEMPO_DURACION){
                    cerrarSesion();
                }
            }
        }, 0, 1000);
    }


    private void cerrarSesion(){
        JOptionPane.showMessageDialog(null,"Se ha desconectado por inactividad.","Error",JOptionPane.ERROR_MESSAGE);
        Login login = new Login();
        login.setVisible(true);
        FrameActual.dispose();
        timer.cancel();
        instancia = null;
    }
}
