package com.tt1.test;

import java.time.LocalDate;

/**
 * clase de servicios que gestiona la lógica de negocio del sistema de tareas.
 * actúa como intermediario entre el controlador y las capas de persistencia 
 * (repositorio) y comunicación (mailer).
 * * @author jumedrm
 * @version 1.0
 */
public class Servicio {
    /** referencia al repositorio de datos para la persistencia de tareas y correos */
    private irepositorio repo;
    /** componente encargado del envío de notificaciones por correo electrónico */
    private imailerstub mailer;

    /**
     * constructor de la clase servicio.
     * inicializa el servicio con sus dependencias necesarias mediante inyección.
     * * @param repo instancia de irepositorio para la gestión de datos.
     * @param mailer instancia de imailerstub para la gestión de envíos.
     */
    public Servicio(irepositorio repo, imailerstub mailer) {
        this.repo = repo;
        this.mailer = mailer;
    }

    /**
     * crea una nueva tarea {@link ToDo}, la configura y la persiste en el sistema.
     * establece el estado inicial de la tarea como no completada.
     * * @param nombre el nombre identificativo de la nueva tarea.
     * @param fecha la fecha límite en formato iso (yyyy-mm-dd).
     */
    public void crearTarea(String nombre, String fecha) {
        ToDo nuevo = new ToDo();
        nuevo.setNombre(nombre);
        nuevo.setFechaLimite(LocalDate.parse(fecha));
        nuevo.setCompletado(false);
        repo.guardarTarea(nuevo);
    }

    /**
     * registra una dirección de correo electrónico en el repositorio del sistema.
     * * @param email cadena de texto con la dirección de correo a guardar.
     */
    public void agregarEmail(String email) {
        repo.guardarEmail(email);
    }

    /**
     * marca una tarea existente como finalizada basándose en su nombre.
     * se apoya en la capa de repositorio para actualizar el estado de la tarea.
     * * @param nombre el nombre de la tarea que se desea completar.
     */
    public void marcarComoFinalizada(String nombre) {
        repo.completarTarea(nombre);
    }

    /**
     * realiza una consulta de las tareas que aún están pendientes de finalizar.
     * actualmente muestra un mensaje de estado por la salida estándar del sistema.
     */
    public void consultarPendientes() {
        System.out.println("revisando tareas...");
    }
}