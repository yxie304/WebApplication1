/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import location.Lonlat;
import location.Place;
import location.locationManager;

/**
 *
 * @author yixxie
 */
public class searchServlet extends HttpServlet {

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
        locationManager  p= (locationManager)request.getSession().getAttribute("p");
        String search=request.getParameter("search");
        int mark=0; //don't to add marker
        List<Place> result=new ArrayList<>();
        if (search.equals("basic")){
            String name=request.getParameter("SearchParameter");
            result=p.findByName(name);
            if (result==null){
                request.setAttribute("errorMessage", "Place not found! Please try again!");
            }
            else{
                request.setAttribute("returnList",result);
                mark=1;
            }
        }
        else if(search.equals("advanced")){
            String sType=request.getParameter("type");
            String currentOpen=request.getParameter("currentOpen");
            if(currentOpen!=null && !currentOpen.isEmpty()){  
                result=p.findByType(sType,"yes");  //find currently open 
            }
            else{
                result=p.findByType(sType,"no");
            }
            if (result==null){
                request.setAttribute("errorMessage", "No place for this type! Please try again!");
            }
            else{
                request.setAttribute("returnList",result);
                request.setAttribute("sType", sType);
                mark=1;
            }
        }
        if (mark==1){
            List<String> positionList = new ArrayList<>();
            int size=result.size();
            request.setAttribute("size", size);
            for (int i=0;i<result.size();i++){
                Lonlat lonlat=p.findbyID(result.get(i).getOsmId());
                String positionName=result.get(i).getName();
               // Lonlat lonlat=p.findbyID(42706715);
                if(lonlat!=null){
                    positionList.add("{lon:"+lonlat.getLon()+","+"lat: "+lonlat.getLat()+","+"name: "+"\""+positionName+"\""+"}");
                }
            }
            if(positionList.isEmpty()){
                request.setAttribute("errorMessage", "No marker added!");
            }
            else{
                request.setAttribute("position", positionList);
            }
            
        }
        RequestDispatcher dispatcher =request.getRequestDispatcher("homePage.jsp");
        dispatcher.forward(request,response);
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
