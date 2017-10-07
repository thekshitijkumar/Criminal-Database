
package criminal;
import java.sql.*;
public class DBConnect {
    Connection con=null;
    Statement st=null;
    PreparedStatement ps=null;
    
public Connection getConnection()
    {
        try
        {
            Class.forName("org.h2.Driver");
            con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/criminal","sa","");
        }
        catch(ClassNotFoundException | SQLException ee) {System.out.println("Unable to connect"+ee);}
        return con;
    }
    
public Statement getStatement()
    {
        try
        {
            st=getConnection().createStatement();
        }
        catch(Exception e)  {System.out.println("Unable to connect"+e);   }
    
    return st;
    }



}

