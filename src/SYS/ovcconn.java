package SYS;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ahamed azhar
 */
public class ovcconn {

    public static Connection DB() throws Exception {
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ovc", "root", "kavirox");
        return c;

    }

}
