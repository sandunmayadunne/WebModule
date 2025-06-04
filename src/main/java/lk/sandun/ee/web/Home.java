package lk.sandun.ee.web;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.sandun.ee.ejb.remote.UserDetails;

import javax.naming.InitialContext;
import java.io.IOException;

@WebServlet("/home")
public class Home extends HttpServlet {
    @EJB(lookup = "UserInfo")
    private UserDetails userDetails;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        try {
//            InitialContext ctx = new InitialContext();
//            UserDetails details = (UserDetails) ctx.lookup("UserInfo");
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
        response.getWriter().println(userDetails.getName());

    }
}
