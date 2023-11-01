package Prodkk;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import Prodkk.ProductDetailsServlet;

 

 

/**

* Servlet implementation class LoginServlet

*/

@WebServlet("/login")

public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Login</title><link rel=\"stylesheet\" href=\"styles2.css\"></head><body>");
        out.println("<form action='productList' method='post'>");
        out.println("Username: <input type='text' name='username' required><br>");
        out.println("Password: <input type='password' name='password' required><br>");
        out.println("<input type='submit' value='Login'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Simulated user authentication using a HashMap (replace with a real authentication mechanism).
        HashMap<String, String> userCredentials = new HashMap<>();
        userCredentials.put("leo", "password"); // Replace with actual username and password

        if (userCredentials.containsKey(username) && userCredentials.get(username).equals(password)) {
            // Successful login, redirect to the product list.
            response.sendRedirect("productList");
        } else {
            // Invalid login, redirect back to the login page.
            response.sendRedirect("login");
        }
    }
}
