
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jimmy
 */
@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/arithmetic"})
public class ArithmeticCalculatorServlet extends HttpServlet {

    
   

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result1", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String operator = request.getParameter("math");
        
        int result;
        if ((first == null || first.equals("")) && (second == null || second.equals(""))){
        request.setAttribute("result1", "---");
        request.setAttribute("first", first);
                    request.setAttribute("second", second);
        }else if ((first == null || first.equals("")) || (second == null || second.equals(""))){
                request.setAttribute("result1", "invalid");
                request.setAttribute("first", first);
                request.setAttribute("second", second);
            }else{
                try{
                    int newFirst = Integer.parseInt(first);
                    int newSecond = Integer.parseInt(second);
                    if (operator.equals("+")){
                        result = newFirst + newSecond;
                    } else if (operator.equals("-")){
                        result = newFirst - newSecond;
                    } else if (operator.equals("*")){
                        result = newFirst * newSecond;
                    } else{
                        result = newFirst % newSecond;
                    }
                    request.setAttribute("result1", result);
                    request.setAttribute("first", newFirst);
                    request.setAttribute("second", newSecond);
                } catch (NumberFormatException e){
                    request.setAttribute("result1", "invalid");
                    request.setAttribute("first", first);
                    request.setAttribute("second", second);
                    
                } finally{
                    
                }
                 
            }
        
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp").forward(request, response);
        
    }

    

}
