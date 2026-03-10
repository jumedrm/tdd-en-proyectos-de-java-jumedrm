package com.tt1.test;

/**
 * interfaz que define el contrato para el sistema de mensajería del proyecto.
 * establece los métodos necesarios para la comunicación mediante correo electrónico,
 * permitiendo desacoplar la lógica de negocio de la implementación real del servidor de correo.
 * * @author jumedrm
 * @version 1.0
 */
public interface imailerstub {
    
    /**
     * solicita el envío de un mensaje de correo electrónico a un destinatario específico.
     * * @param destino dirección de correo electrónico a la que se enviará la notificación.
     * @param mensaje contenido textual del cuerpo del correo.
     * @return true si el proceso de envío se ha gestionado correctamente, false en caso contrario.
     */
    boolean enviarCorreo(String destino, String mensaje);
}