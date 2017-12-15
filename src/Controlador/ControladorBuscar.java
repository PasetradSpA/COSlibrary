/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import deporte.Deporte;
import deporte.Registro;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author LEARNING CENTER
 */
public class ControladorBuscar {

    public ArrayList <Deporte> getBuscarDeporte() throws SQLException{
        Registro modeloBuscar = new Registro();
        return modeloBuscar.getBuscarDeporte(); 
    }

    public ArrayList<Deporte> getListadoDeporte() {
        
    }
    
}
