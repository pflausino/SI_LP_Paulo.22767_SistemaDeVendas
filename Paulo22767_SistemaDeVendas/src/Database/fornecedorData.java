
package Database;
/**
 *
 * @author calde
 */

import Classe.Fornecedor;
import java.sql.PreparedStatement;

public class fornecedorData {
    
    SqlServerConnection con;
    
    public boolean include(Fornecedor objFor) throws Exception{
        con = new SqlServerConnection();
        String sql = "insert into tbfornecedor values(?,?)"; 
        
        PreparedStatement ps = con.getConexao().prepareStatement(sql);
        ps.setString(1, objFor.getNameFornecedor());
        ps.setString(2, objFor.getCnpjFornecedor());
        

        
        if(ps.executeUpdate() > 0)
            return true;
        else
            return false;
    }
            
}
