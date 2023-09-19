package com.example.some;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SuperServlet", value = "/SuperServlet")
public class NoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String username = request.getParameter("userName");
            String quantity = request.getParameter("quan");
            String item_name = request.getParameter("item");
            String membership = request.getParameter("mem");
            if(username != null && quantity != null && membership!= null){
                HttpSession httpsession = request.getSession();
                httpsession.setAttribute("userName", username);
                httpsession.setAttribute("quan",quantity);
                httpsession.setAttribute("item", item_name);
                httpsession.setAttribute("mem",membership);
                request.getRequestDispatcher("Welcome.jsp").forward(request,response);
            }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
