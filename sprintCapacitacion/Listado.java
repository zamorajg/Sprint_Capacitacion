package sprintCapacitacion;

import java.util.ArrayList;
/**
 * @Definicion: Clase que agrega un elemento al listado y llama al metodo analizarUsuario
 * @Version: 1.0
 * @Autor: Grupo Java (Jose Zamora, Benjamin, Fernanda, Javiera)
 *
 */
public class Listado {
    ArrayList<Usuario> listaObjetos;

    public Listado() { // Constructor de la clase listado que instancia un arreglo de usuarios
        this.listaObjetos =new ArrayList<Usuario>();
    }

    public void agregar(Usuario usuarios){ // Metodo que permite agregar Usuarios al listado
        listaObjetos.add(usuarios);
    }


    public void mostrarUsuarios() { // metodo que permite mostrar los diferentes tipos de Usuarios añadidos
        for (int i = 0; i < listaObjetos.size(); i++) {

            System.out.println(listaObjetos.get(i).analizarUsuario());

        }
    }

}


