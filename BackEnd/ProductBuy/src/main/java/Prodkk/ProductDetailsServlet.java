package Prodkk;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

 

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import Prodkk.ProductListServlet;

 

/**

* Servlet implementation class ProductDetailsServlet

*/

@WebServlet("/productDetails")
public class ProductDetailsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("product");

        // Get the user's purchased products from a database or the simulated data store.
        List<String> purchasedProducts = getPurchasedProducts(request.getSession().getAttribute("username").toString());

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Product Details</title></head><body>");
        out.println("<h1>Product Details</h1>");
        out.println("<p>Product Name: " + product + "</p>");

        if (purchasedProducts.contains(product)) {
            out.println("<p>You have already bought this product.</p>");
        } else {
            out.println("<form action='buyProduct' method='post'>");
            out.println("<input type='hidden' name='product' value='" + product + "'>");
            out.println("<input type='submit' value='Buy'>");
            out.println("</form>");
        }

        out.println("</body></html>");
    }

    // Implement this method to retrieve purchased products for a user from a database.
    private List<String> getPurchasedProducts(String username) {
        // Simulated user purchases using a HashMap (replace with a real data store).
        HashMap<String, List<String>> userPurchases = new HashMap<>();
        userPurchases.put("leo", new ArrayList<>());
        userPurchases.put("antony", new ArrayList<>());
        userPurchases.put("harold", new ArrayList<>());

        if (userPurchases.containsKey(username)) {
            return userPurchases.get(username);
        } else {
            return new ArrayList<>();
        }
    }
}

