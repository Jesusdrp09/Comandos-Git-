/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version1;

import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class Version1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null, "Aprendiendo a usar git\n\nComandos:\nls: Listar todos tus directorios\npwd: Saber en que directorio te encuentras"+
               "\ngit init: Para inicializar un proyecto nuevo\ngit status: Para ver el estado de nuestros archivos\ngit add (Nombre archivo): Para agregar un archivo al staging area"+
               "\ngit commit: PAra crear un primer punto de control de nuestro codigo\ngit config --global user.email 'Correo': Para configurar el email de este usuario"+
               "git config --global user.name 'nombre': Para configurar el nombre del usuario\ngit log: Para ver todos los commits que hemos creados"
               + "\ngit checkout --: Para revertir los cambios de los archivos\ngit diff: Para ver las diferencias hechas en los archivos");
    }
    
}
