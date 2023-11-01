package Prodkk;

import java.io.IOException;

import java.io.PrintWriter;

 

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

 

/**

* Servlet implementation class ProductListServlet

*/

@WebServlet("/productList")
public class ProductListServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Product List</title><link rel=\"stylesheet\" href=\"styles3.css\"></head><body>");
        out.println("<h1>Product Marketing</h1>");
        out.println("<form action='productDetails' method='get'>");
        out.println("<button type='submit' name='product' value='Leo Das Hoodie'>Buy Leo Das Hoodie</button><br>");
        out.println("<button type='submit' name='product' value='Anthony Das Hoodie'>Buy Anthony Das Hoodie</button><br>");
        out.println("<button type='submit' name='product' value='Harold Das Hoodie'>Buy Harold Das Hoodie</button><br>");
        out.println("</form>");
        out.println("</body></html>");
    }
}
