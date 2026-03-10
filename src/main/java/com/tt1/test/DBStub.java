package com.tt1.test;
import java.util.*;

/**
 * implementación simulada (stub) de la interfaz {@link idbstub}.
 * actúa como una base de datos en memoria utilizando colecciones estándar de java
 * para almacenar tareas y direcciones de correo electrónico durante la ejecución.
 * * @author jumedrm
 * @version 1.0
 */
public class DBStub implements idbstub {
    /** colección que almacena las tareas del sistema en una lista dinámica */
    private List<ToDo> tareas = new ArrayList<>();
    /** conjunto de direcciones de correo electrónico, garantizando la unicidad mediante un hashset */
    private Set<String> emails = new HashSet<>();

    /**
     * añade una nueva tarea a la persistencia en memoria.
     * @param todo el objeto {@link ToDo} que se desea insertar en la lista.
     */
    @Override
    public void insertarToDo(ToDo todo) { tareas.add(todo); }

    /**
     * recupera el listado completo de tareas almacenadas.
     * @return una {@link List} que contiene todos los objetos {@link ToDo}.
     */
    @Override
    public List<ToDo> obtenerTodos() { return tareas; }

    /**
     * registra una dirección de correo electrónico en el conjunto de correos.
     * @param email cadena de texto con el correo a insertar.
     */
    @Override
    public void añadirEmail(String email) { emails.add(email); }

    /**
     * recupera el conjunto de todos los correos electrónicos registrados.
     * @return un {@link Set} con las direcciones de correo, sin duplicados.
     */
    @Override
    public Set<String> obtenerEmails() { return emails; }

    /**
     * actualiza la información de una tarea existente.
     * la lógica consiste en eliminar la versión anterior basada en el nombre 
     * e insertar la nueva instancia actualizada.
     * @param todo el objeto {@link ToDo} con los datos modificados.
     */
    @Override
    public void actualizarToDo(ToDo todo) {
        eliminarToDo(todo.getNombre());
        insertarToDo(todo);
    }

    /**
     * elimina una tarea de la lista basándose en su nombre identificativo.
     * utiliza un predicado para localizar y remover el objeto coincidente.
     * @param nombre el nombre de la tarea que se desea eliminar.
     */
    @Override
    public void eliminarToDo(String nombre) {
        tareas.removeIf(t -> t.getNombre().equals(nombre));
    }
}