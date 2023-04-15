/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelets;

import javax.servlet.*;
/**
 *
 * @author Gyanendra-Yadav
 */
public class FirstServelet {
    
    //Adding lifecycle methods of the servelet
    
    //This is the first mehtod of Servelet initilzation
    public void init(ServletConfig config){
        System.out.println("Hey....! Creating object of the servelet in the init method");
 
    }
    
    //this is the second phase of Servlet Life-Cycle 
    public void service(ServletRequest req, ServletResponse res){  
        System.out.println("Hey.....! On the second LifeCycle Phase of Servlet");
    }
    
}
