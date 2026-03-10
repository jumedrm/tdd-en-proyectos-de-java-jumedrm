package com.tt1.test;

/**
 * implementación concreta de la interfaz {@link irepositorio}.
 * esta clase se encarga de la persistencia y recuperación de datos utilizando
 * un componente de base de datos simulado ({@link idbstub}).
 * * @author jumedrm
 * @version 1.0
 */
public class Repositorio implements irepositorio {
    /** instancia de la base de datos simulada para realizar operaciones crud */
    private idbstub db;

    /**
     * constructor de la clase repositorio.
     * @param db componente de base de datos que se inyectará para la persistencia.
     */
    public Repositorio(idbstub db) {
        this.db = db;
    }

    /**
     * {@inheritDoc}
     * delega la inserción del objeto tarea en el componente de base de datos.
     * @param todo el objeto {@link ToDo} a persistir.
     */
    @Override
    public void guardarTarea(ToDo todo) { db.insertarToDo(todo); }

    /**
     * {@inheritDoc}
     * solicita al componente de base de datos el registro de una nueva dirección de correo.
     * @param email cadena de texto con el correo electrónico.
     */
    @Override
    public void guardarEmail(String email) { db.añadirEmail(email); }

    /**
     * busca una tarea específica en la base de datos basándose en su nombre.
     * utiliza la api de streams de java para filtrar la colección de tareas.
     * * @param nombre cadena con el nombre de la tarea a localizar.
     * @return el objeto {@link ToDo} encontrado, o null si no existe ninguna coincidencia.
     */
    @Override
    public ToDo buscarPorNombre(String nombre) {
        return db.obtenerTodos().stream()
                .filter(t -> t.getNombre().equals(nombre))
                .findFirst().orElse(null);
    }

    /**
     * marca una tarea como finalizada y actualiza su estado en la base de datos.
     * primero localiza la tarea por nombre y, si existe, modifica su atributo 
     * de estado y la reinserta/actualiza.
     * * @param nombre el nombre de la tarea que se desea completar.
     */
    @Override
    public void completarTarea(String nombre) {
        ToDo t = buscarPorNombre(nombre);
        if (t != null) {
            t.setCompletado(true);
            db.actualizarToDo(t);
        }
    }
}