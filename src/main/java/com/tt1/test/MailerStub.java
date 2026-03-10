package com.tt1.test;

/**
 * implementación simulada (stub) de la interfaz {@link imailerstub}.
 * se utiliza en el entorno de desarrollo y pruebas para emular el envío de 
 * notificaciones por correo electrónico sin realizar conexiones de red reales.
 * * @author jumedrm
 * @version 1.0
 */
public class MailerStub implements imailerstub {
    
    /**
     * simula el envío de un mensaje de correo electrónico.
     * en esta implementación, la operación siempre se considera exitosa y 
     * se registra el evento a través de la consola del sistema.
     * * @param destino dirección de correo electrónico del destinatario.
     * @param mensaje contenido del cuerpo del correo a enviar.
     * @return true, indicando que el proceso de "envío" se ha completado satisfactoriamente.
     */
    @Override
    public boolean enviarCorreo(String destino, String mensaje) {
        System.out.println("correo enviado a: " + destino);
        return true;
    }
}