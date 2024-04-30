package contact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertDetail {

    private Connection con;
    private PreparedStatement ps;

    public void insertDetail(String name, String email, String pnumber, String messages) {
        connectToDB();
        try {
            String query = "INSERT INTO details(name, email, pnumber, messages) VALUES("+name+","+email+","+pnumber+","+messages+")";
            ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, pnumber);
            ps.setString(4, messages);
            ps.executeUpdate();
            System.out.println("Record inserted");
        } catch (SQLException ex) {
            Logger.getLogger(InsertDetail.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeResources();
        }
    }

    private void connectToDB() {
        String url = "jdbc:mysql://localhost:3306/contact";
        String username = "shopping-cart";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(InsertDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void closeResources() {
        try {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(InsertDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
