/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deporte;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LEARNING CENTER
 */
public class Registro {

    public ArrayList<Deporte> getBuscarDeporte() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<Deporte> getListadoDeporte() throws SQLException{
        ArrayList<Deporte> listDeporte = null;
        String sql="SELECT CODIGO FROM PELOTAS";
        PreparedStatement preparedStatement;
        try {
            listDeporte=new ArrayList<>();
            preparedStatement = Conexion.getConnection().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            Deporte deportePelota = new Deporte();
            deportePelota.setNombreDeporte(resultSet.getString("CODIGO"));
            listDeporte.add(deportePelota);
        }
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDeporte;
    }

    public ArrayList<Deporte> getBuscarDeporte() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
