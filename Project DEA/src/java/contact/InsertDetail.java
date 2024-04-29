/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
class InsertDetail {

    void insertDetail(String name, String email, String pnumber, String messages) throws SQLException {
        connectToDB();
        String query ="INSERT INTO details(id,name,email,pnumber,messages) VALUES('"+name+"','"+email+"','"+pnumber+"','"+messages+"')";
        st.executeUpdate(query);
        System.out.println("Record inserted");
    }
    
    private void connectToDB() throws SQLException{
        String driver= "com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/contact";
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, "root", "");
            Statement st = con.createStatement();
        }
        catch (ClassNotFoundException | SQLException ex){
            Logger.getLogger(InsertDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    String getName(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    String getEmail(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    String getPnumber(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    String getMessages(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
