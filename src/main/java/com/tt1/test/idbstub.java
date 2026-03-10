package com.tt1.test;
import java.util.*;

/**
 * interfaz que define el contrato para el componente de persistencia de datos (stub).
 * proporciona los métodos necesarios para realizar operaciones crud (crear, leer, 
 * actualizar y borrar) sobre las tareas y las direcciones de correo electrónico.
 * * @author jumedrm
 * @version 1.0
 */
public interface idbstub {
    
    /**
     * inserta una nueva tarea en el sistema de almacenamiento.
     * @param todo el objeto {@link ToDo} que se desea persistir.
     */
    void insertarToDo(ToDo todo);
    
    /**
     * recupera el listado completo de tareas almacenadas en el sistema.
     * @return una {@link List} con todos los objetos {@link ToDo} registrados.
     */
    List<ToDo> obtenerTodos();
    
    /**
     * registra una dirección de correo electrónico en la base de datos.
     * @param email cadena de texto que contiene el correo del usuario.
     */
    void añadirEmail(String email);
    
    /**
     * recupera el conjunto de todas las direcciones de correo electrónico almacenadas.
     * @return un {@link Set} con los correos electrónicos, garantizando que no hay duplicados.
     */
    Set<String> obtenerEmails();
    
    /**
     * modifica los datos de una tarea ya existente en el sistema.
     * @param todo el objeto {@link ToDo} con la información actualizada.
     */
    void actualizarToDo(ToDo todo); 
    
    /**
     * elimina una tarea del sistema de almacenamiento basándose en su nombre.
     * @param nombre identificador único de la tarea que se desea borrar.
     */
    void eliminarToDo(String nombre);     
}