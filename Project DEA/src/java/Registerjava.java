import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.UserBean;
import com.sun.xml.ws.tx.at.v10.client.ParticipantProxyBuilderImpl.service.UserServiceImpl;

public class Registerjava extends HttpServlet {
    private static final long serialVersionUID = 1L;

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        String userName = request.getParameter("username");
        String emailId = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");
        String status = "";

        if (password != null && password.equals(confirmPassword)) {
            UserBean user = new UserBean(userName, emailId, password, confirmPassword);

            UserServiceImpl dao = new UserServiceImpl();

            status = dao.registerUser(user);

            if (status.equals("Success")) {
                System.out.println("Registration successful!"); // Print the success message
            }
        } else {
            status = "Password not matching!";
        }

        RequestDispatcher rd = request.getRequestDispatcher("register.jsp?message=" + status);

        rd.forward(request, response);
    }
}
