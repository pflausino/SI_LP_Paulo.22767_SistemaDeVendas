
package Database;

import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author Paulo(mobile)
 */


public class SqlServerConnection {
    private Connection conexao;
   public SqlServerConnection() throws Exception{
       Class.forName("net.sourceforge.jtds.jdbc.Driver");
       String url = "jdbc:jtds:sqlserver://LOGAN-WOLVERINE:1433/dbsistemavenda";
       conexao = DriverManager.getConnection(url,"pflausino","123");
   }
   public Connection getConexao(){
       return conexao;
   }
}
/**
public class SqlServerConnection {
    static String connectionURL = "jdbc:server://localhost1433;"+
            "databaseName=dbsistemavenda;"+"ntegrateSecurty=true;";

    public static Conection getConection()s{
        Conection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionURL);
        } 
    return con;
    }

    
}
*/