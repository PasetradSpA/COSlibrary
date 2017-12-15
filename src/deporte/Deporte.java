/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deporte;

import Vista.Agregar;
import Vista.Buscar;
import Vista.Eliminar;
import Vista.Listar;
import Vista.Modificar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author LEARNING CENTER
 */
public class Deporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conectar = Conexion.getConnection();
        JFrame frame = new JFrame("JMenu and JMenuItem Component");
        frame.setVisible(true);
        frame.setTitle("Biblioteca Duoc");
        JMenuBar menuBar = new JMenuBar();
        JMenu mArchivo = new JMenu ("Archivo");
        JMenu mProcesos = new JMenu ("Procesos");
        
        menuBar.add(mArchivo);
        menuBar.add(mProcesos);
        
        JMenuItem mSalir = new JMenuItem("Salir");
        JMenuItem mAgregar = new JMenuItem("Agregar");
        JMenuItem mListar = new JMenuItem("Listar");
        JMenuItem mEliminar = new JMenuItem("Eliminar");
        JMenuItem mModificar = new JMenuItem("Modificar");
        JMenuItem mBuscar = new JMenuItem("Buscar");
        mArchivo.add(mSalir);
        mProcesos.add(mBuscar);
        mProcesos.addSeparator();
        mProcesos.add(mAgregar);
        mProcesos.addSeparator();
        mProcesos.add(mListar);
        mProcesos.add(mModificar);
        mProcesos.addSeparator();
        mProcesos.addSeparator();
        mProcesos.add(mEliminar);
        
        frame.setJMenuBar(menuBar);
        
        frame.setJMenuBar(menuBar);
        frame.setSize(350, 250);
        
        mSalir.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ev){
                frame.dispose();
                
                
                
            }
        });
        
        mBuscar.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ev){
                Buscar nuevoBuscar = new Buscar();
                nuevoBuscar.setVisible(true);
                frame.setVisible(false);
                
            }
        });
        
        mModificar.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ev){
                Modificar ventanaModificar = new Modificar();
                ventanaModificar.setVisible(true);
                frame.setVisible(false);
                
            }
        });
        
        mAgregar.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ev){
                Agregar nuevaPelota = new Agregar();
                nuevaPelota.setVisible(true);
                frame.setVisible(false);
                
            }
        });
        
         mListar.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ev){
                frame.setVisible(false);
                Listar nuevoListar = new Listar();
                nuevoListar.setVisible(true);
            }
        });
         
          mEliminar.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ev){
                frame.setVisible(false);
                Eliminar ventanaEliminar = new Eliminar();
                ventanaEliminar.setVisible(true);
            }
        });
        
        // TODO code application logic here
    }
    
}
