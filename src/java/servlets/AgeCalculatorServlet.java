
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jimmy
 */
public class AgeCalculatorServlet extends HttpServlet {

    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // load jsp to the servlet
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String age1 = request.getParameter("user_age");
        
        if (age1 == null || age1 == ""){
            request.setAttribute("ageAtt", "You must give your current age");
        } else{
            try{
            int age = Integer.parseInt(request.getParameter("user_age"));
            age  = age + 1;
            request.setAttribute("ageAtt", "Your age next birthday will be " + age);
        } catch(NumberFormatException e){
            request.setAttribute("ageAtt", "You must enter a number");
        }
        }
        
       
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        
    

    

}
}
