/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GYmService3;

import gymService2.NewGymWebService_Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author GoStar
 */
@WebServlet(name = "GymingServletService", urlPatterns = {"/GymingServletService"})
public class GymingServletService extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/GymService1/NewGymWebService.wsdl")
    private NewGymWebService_Service service;

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
             String s1=request.getParameter("name1");
          String s2=request.getParameter("name2");
          String s3=request.getParameter("h");
          String s4=request.getParameter("name4");
          String form=request.getParameter("type");
           out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GymMembershipServlet</title>");            
            out.println("</head>");
            out.println("<body>");
          out.println(" <h1 style='color:red; font-size: 50px;'>Talwarkar's<br><br><br></h1>");
           
              if(form.equals("register"))
              {
              int age=Integer.parseInt(request.getParameter("age"));
              int wt=Integer.parseInt(request.getParameter("weight"));
              register(s1, age, wt);
              out.println("<h1>congratulations "+s1+" you are registered now with us <h1>");
              out.println("<h1>now u can procees to renew your first membership<h1>");
              }
           
                      

            
                
            
                   
            
         
             if(form.equals("renew"))
             {
             
             float plan=Float.parseFloat(request.getParameter("plan"));
              int i=search(s2);
             
              if(i==234)
              {
                   out.println("<h1>sorry, u havent registered<h1> ");    
              }
              else
              {
                float dur=renew(s2,plan);
                  out.println("<h1>congratulations ur membership is now "+dur+" years<h1> ");    
              }
                 
             }
          
           if(form.equals("bmi"))
          {
             
             float he=Float.parseFloat(request.getParameter("h"));
             int we=Integer.parseInt(request.getParameter("w"));
             
             float bmi=Float.parseFloat(bmi(we, he));
             out.println("<h1>bmi is "+bmi+"<h1> ");    
             if(bmi<18.5)
             {
                 out.println("<h1> you are underweight !!!! <br>you can join our super package for body buildidng+<h1> ");    
             }
             else if ((bmi>18.5)&&(bmi<25))
             {
                 out.println("<h1> you are fit !!!! <br>you can join our regular pack to maintain!!+<h1> ");    
                 
             }
             else
             {
                   out.println("<h1> you are overweight !!!! <br>its highly recomended you join our weight loss programme+<h1> ");    
             }
                
           
          }
          if(form.equals("upgrade"))
          {
             
              float plan=Float.parseFloat(request.getParameter("plan4"));
              int i=search(s4);
              
            
          
                
               if(i==234)
              {
                 out.println("<h1>sorry, u havent registered<h1> ");    
              }
              else
               {
                   float dur=Float.parseFloat(upgrade(s4,plan));
                out.println("<h1>you have been upgraded by "+plan+" years and total duration is :"+dur+" years<h1> ");    
               
               }
               
          }
          out.println("</body>");
            out.println("</html>");
        
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

    private String bmi(float height, float weight) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        gymService2.NewGymWebService port = service.getNewGymWebServicePort();
        return port.bmi(height, weight);
    }

    private String register(java.lang.String name, int age, int weight) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        gymService2.NewGymWebService port = service.getNewGymWebServicePort();
        return port.register(name, age, weight);
    }

    private float renew(java.lang.String name, float membership) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        gymService2.NewGymWebService port = service.getNewGymWebServicePort();
        return port.renew(name, membership);
    }

    private Integer search(java.lang.String name) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        gymService2.NewGymWebService port = service.getNewGymWebServicePort();
        return port.search(name);
    }

    private String upgrade(java.lang.String name, float membership) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        gymService2.NewGymWebService port = service.getNewGymWebServicePort();
        return port.upgrade(name, membership);
    }

}
