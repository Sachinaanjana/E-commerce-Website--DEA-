package contact;

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

@WebServlet(name = "ContactServlet", urlPatterns = {"/ContactServlet"})
public class ContactServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve form parameters
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("pnumber");
        String message = request.getParameter("message");
        
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "shopping-cart";
        String password = " ";
        
        // SQL query to insert data into database
        String sql;
        String pnumber = null;
        sql ="INSERT INTO contact (name, email, pnumber, message) VALUES ("+name+","+email+","+pnumber+","+message+")";
        
        try ( // Establish database connection
                Connection conn = DriverManager.getConnection(url, username, password)) {
            
            // Create prepared statement
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, email);
            statement.setString(3, pnumber);
            statement.setString(4, message);
            
            // Execute the statement
            statement.executeUpdate();
            // Close the connection

        } catch (SQLException e) {
            // Redirect back to the contact page with an error message
            response.sendRedirect("contact.jsp?error=true");
        }
        // Redirect back to the contact page with a success message
        response.sendRedirect("contact.jsp?success=true");
    }
}
