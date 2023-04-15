/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelets;

import java.io.IOException;
import javax.servlet.*;
/**
 *
 * @author Gyanendra-Yadav
 */
public class FirstServelet implements Servlet{

    private ServletConfig config;
    
    //Adding lifecycle methods of the servelet
    
    //This is the first mehtod of Servelet initilzation
    public void init(ServletConfig config){
        System.out.println("Hey....! Creating object of the servelet in the init method");
 
    }
    
    //this is the second phase of Servlet Life-Cycle 
    public void service(ServletRequest req, ServletResponse res)throws ServletException, IOException{  
        System.out.println("Hey.....! On the second LifeCycle Phase of Servlet");
    }
    
    //this is the 3rd method of LifeCycle of Servelet
    public void destroy(){
        System.out.println("Hey.......! Going to destroy the Servlet");
    }
    
    //Another method of the servlet LifeCycle \
    public String getServeletInfo(){
        return "Hey.......! Returning serveletInfo";
    }
    
    public ServletConfig getServletConfig(){
        return this.config;
    }

    @Override
    public String getServletInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
