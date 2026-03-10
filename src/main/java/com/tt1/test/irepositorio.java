package com.tt1.test;

/**
 * interfaz que define el contrato para la persistencia de datos en el sistema.
 * establece las operaciones necesarias para gestionar objetos {@link ToDo} y 
 * direcciones de correo electrónico, independientemente de la tecnología de 
 * almacenamiento utilizada.
 * * @author jumedrm
 * @version 1.0
 */
public interface irepositorio {
    
    /**
     * recupera una tarea específica del medio de almacenamiento.
     * @param nombre cadena de texto que identifica de forma única a la tarea.
     * @return el objeto {@link ToDo} correspondiente al nombre, o null si no se encuentra.
     */
    ToDo buscarPorNombre(String nombre);
    
    /**
     * actualiza el estado de una tarea existente a finalizado.
     * @param nombre identificador de la tarea que ha sido completada.
     */
    void completarTarea(String nombre);
    
    /**
     * registra y persiste una nueva instancia de tarea en el sistema.
     * @param todo el objeto {@link ToDo} con la información a guardar.
     */
    void guardarTarea(ToDo todo);
    
    /**
     * almacena una dirección de correo electrónico en el registro global.
     * @param email cadena con la dirección de correo del usuario.
     */
    void guardarEmail(String email);
}