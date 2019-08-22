/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import figuras.Circulo;
import figuras.Cuadrado;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import figuras.Figura;
import figuras.Triangulo;
import figuras.Cuadrado;
import figuras.Circulo;
/**
 *
 * @author estudiantes
 */
@WebServlet(urlPatterns = {"/ServletFigura"})
public class ServletFigura extends HttpServlet {
    
    private Figura fig;
    
    public void liskov(Figura f, double v){
        f.setValor(v);
        f.calcularArea(v);
        f.calcularPerimetro(v);
        fig=f;
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String h = request.getParameter("figura");
        double v = 0;
        try{
        v = Double.parseDouble(request.getParameter("valor"));
        }
        catch(Exception e){
            response.sendRedirect("index.html");
        }
        response.setContentType("text/html;charset=UTF-8");
        
        if(h.equals("TRIANGULO")){
            Triangulo t = new Triangulo();          
            liskov(t,v);
        }
        
        if(h.equals("CUADRADO")){
            Cuadrado c = new Cuadrado();
            liskov(c,v);
        }
        
        if(h.equals("CIRCULO")){
            Circulo i = new Circulo();
            liskov(i,v);
        }

        try{
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>ServletFigura</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<center><p>"+"La figura es: "+h+"</p></center>");
            out.println("<center><p>"+"El valor es: "+fig.getValor()+"</p></center>");
            out.println("<center><p>"+"El area es: "+fig.getArea()+"</p></center>");
            out.println("<center><p>"+"El perimetro es: "+fig.getPerimetro()+"</p></center>");
            out.println("<center><a href='index.html'>Regresar al inicio</a></center>");
            out.println("</body>");
            out.println("</html>");
        }
        finally{
            out.close();
        }
            


        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
