package frontcontroller;

import controller.EmpController;
import io.javalin.Javalin;
import io.javalin.http.Context;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.UnauthorizedResponse;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

import javax.servlet.http.HttpSession;


public class FrontController {
    public static Logger loggy = Logger.getLogger(FrontController.class);
    Javalin app;
    Dispatcher dispatcher;

    //CONSTRUCTOR
    public FrontController(Javalin app){
        this.app = app;

        dispatcher = new Dispatcher(app);



    }

    //ROUTES
    public static void checkAllRequests(Context context){



        //THIS is where you would check to see if they are logged in, via checking their current session object
        //AND yoou'll see what role they are loggeed in as...to see if they are trying to use admin functionality
        // when they are merely an employee
        //YOu can ALSO check to see if they are using the proper HTTP METHOD
//        if(context.header("authToken")==null){
//            throw new UnauthorizedResponse("Your headertoken is null. Hint: who's the number one hero?");
//        }
//
//        if(!context.header("authToken").equals("UnitedStatesOfSmash")){
//            throw new UnauthorizedResponse("Do you not know who the number one hero is?");
//        }

        //default response can be found in the documentation:
        //https://javalin.io/documentation#default-responses

    }

}
