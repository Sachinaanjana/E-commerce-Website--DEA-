/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srv;

/**
 *
 * @author HP
 */

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Chathushka
 */
@WebServlet(urlPatterns = {"/register"})
public class SignUpSrv extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
     String firstName = request.getParameter("firstName");
String lastName = request.getParameter("lastName");
String name = firstName + " " + lastName;

        String gender = request.getParameter("gender");
        String mobile = request.getParameter("mobile");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
   
        
        
         String url = "jdbc:mysql://localhost:3306/shopping-cart";
        String user = "root";
        String dbPassword = "";
        
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Create SQL query to insert data into the database
            try ( // Establish database connection
                    Connection conn = DriverManager.getConnection(url, user, dbPassword)) {
                // Create SQL query to insert data into the database
                String sql = "INSERT INTO user (name, gender, mobile, email, password, address) VALUES (?, ?, ?, ?, ?, ?)";
                try (PreparedStatement statement = conn.prepareStatement(sql)) {
                    statement.setString(1, name);
                    statement.setString(2, gender);
                    statement.setString(3, mobile);
                    statement.setString(4, email);
                    statement.setString(5, password);
                    statement.setString(6, address);
                    // Execute the query
                    int rowsInserted = statement.executeUpdate();
                    if (rowsInserted > 0) {
                        response.sendRedirect("login.jsp");
                    } else {
                        response.getWriter().println("<h2>Registration failed. Please try again!</h2>");
                    }
                    // Close resources
                    
                }
            }
        } catch (ClassNotFoundException | SQLException | IOException e) {
            response.getWriter().println("An error occurred: " + e.getMessage());
        }
    }


}

