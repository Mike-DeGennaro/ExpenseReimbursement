package doa;

import Model.Account;
import Model.Item;
import Model.Lists;
import Model.Ticket;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Service {

    public static Jdbc database = new Jdbc();

    //takes username and password and passes it through design pattern to doa, looking for account to log into
    // if an account is found we then search for tickets related to the account

    //calls add ticket method passing in required information
    public static Ticket addTicket(int id, int amount, String message, int type){
        Ticket rs = database.addTicket(id, amount, message, type);


        return rs;
    }

    //calls update ticket method passing in required information
    public static void updateTicket(int id, int status, int resolvedBy){
        database.updateTicket(id, status, resolvedBy);
    }
}
