/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import ui.Login;
/**
 *
 * @author DELL
 */
public class Authorization implements Interceptor{
    @Override
    public void destroy(){
        
    }
    
    @Override
    public void init(){
        
    }

    @Override
    public String intercept(ActionInvocation ai) throws Exception {
            Object user = ActionContext.getContext().getSession().get("user");
        if (ai.getAction()instanceof Login || user!=null){    
            return ai.invoke();
    }
        return ActionSupport.LOGIN;
}
}
