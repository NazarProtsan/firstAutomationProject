package com.finWorks.step_definitions;

import com.finWorks.pages.LoginPage;
import com.finWorks.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equalsIgnoreCase("POS_manager")){
            username = ConfigurationReader.getProperty("POS_manager");
            password = ConfigurationReader.getProperty("POSM_password");
        }else if(userType.equalsIgnoreCase("Sales_Manager")){
            username = ConfigurationReader.getProperty("Sales_Manager");
            password = ConfigurationReader.getProperty("SMmanager");
        }else if(userType.equalsIgnoreCase("store manager")){
            username = ConfigurationReader.getProperty("store_manager_username");
            password = ConfigurationReader.getProperty("store_manager_password");
        }else if(userType.equalsIgnoreCase("Event_manager")){
            username = ConfigurationReader.getProperty("event_manager_username");
            password = ConfigurationReader.getProperty("event_manager_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
      LoginPage loginPage=new LoginPage();
      loginPage.login(username,password);
    }





}
