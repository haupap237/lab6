/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import static com.opensymphony.xwork2.Action.LOGIN;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionContext;
import db.DBConnection;

/**
 *
 * @author DELL
 */
public class Login {
    private String username;
    private String password;
    public Login(){        
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String execute() throws Exception{
        if (new DBConnection().checkLogin(username,password)){
            ActionContext.getContext().getSession().put("user", username);
            return SUCCESS;
        }
        return LOGIN;
    }
}
