package com.tt1.test;

import java.time.LocalDate;

/**
 * representa una tarea o elemento de trabajo dentro del sistema.
 * esta clase encapsula la información básica de una tarea, incluyendo su nombre,
 * descripción, fecha límite y el estado de finalización.
 * * @author jumedrm
 * @version 1.0
 */
public class ToDo {
    /** nombre identificativo de la tarea */
    private String nombre;
    /** detalle extendido sobre el contenido de la tarea */
    private String descripcion;
    /** fecha máxima para la resolución de la tarea */
    private LocalDate fechaLimite;
    /** indicador de si la tarea ha sido finalizada */
    private boolean completado;

    /**
     * constructor por defecto de la clase todo.
     * permite la instanciación de un objeto de tarea vacío para su posterior configuración.
     */
    public ToDo() {
        
    }

    /**
     * obtiene el nombre de la tarea.
     * @return el nombre asignado a la tarea.
     */
    public String getNombre() { return nombre; }

    /**
     * establece o modifica el nombre de la tarea.
     * @param nombre cadena de texto con el nuevo nombre.
     */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * obtiene la descripción detallada de la tarea.
     * @return la descripción de la tarea.
     */
    public String getDescripcion() { return descripcion; }

    /**
     * establece una descripción detallada para la tarea.
     * @param descripcion texto descriptivo de la actividad a realizar.
     */
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    /**
     * obtiene la fecha límite establecida para la tarea.
     * @return objeto localdate con la fecha de vencimiento.
     */
    public LocalDate getFechaLimite() { return fechaLimite; }

    /**
     * establece la fecha límite para completar la tarea.
     * @param fechaLimite objeto localdate que representa el plazo máximo.
     */
    public void setFechaLimite(LocalDate fechaLimite) { this.fechaLimite = fechaLimite; }

    /**
     * indica si la tarea ya ha sido completada.
     * @return true si la tarea está marcada como finalizada, false en caso contrario.
     */
    public boolean isCompletado() { return completado; }

    /**
     * cambia el estado de finalización de la tarea.
     * @param completado valor booleano para marcar la tarea como terminada o pendiente.
     */
    public void setCompletado(boolean completado) { this.completado = completado; }
    
}