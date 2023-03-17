package sprint;

import java.util.ArrayList;
/**
 * @Definicion: Clase que agrega un elemento al listado y llama al metodo analizarUsuario
 * @Version: 1.0
 * @Autor: Grupo Java (Jose Zamora, Benjamin, Fernanda, Javiera)
 *
 */
public class ListaUsuarios {
    ArrayList<Usuario> listaUsuarios;

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ListaUsuarios() { // Constructor de la clase listado que instancia un arreglo de usuarios
        this.listaUsuarios =new ArrayList<Usuario>();
    }

    public void agregar(Usuario usuarios){ // Metodo que permite agregar Usuarios al listado
        listaUsuarios.add(usuarios);
    }


    public void mostrarUsuarios() { // metodo que permite mostrar los diferentes tipos de Usuarios añadidos
        for (int i = 0; i < listaUsuarios.size(); i++) {

           // System.out.println(listaUsuarios.get(i).analizarUsuario());
            System.out.println(listaUsuarios.get(i).getNombre() + listaUsuarios.get(i).getFechaNacimiento()+ listaUsuarios.get(i).getRun());

        }
    }

}


