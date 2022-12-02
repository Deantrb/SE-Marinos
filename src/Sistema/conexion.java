package Sistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class conexion {

    String ConexionDB = "jdbc:sqlite:C:/Users/joset/OneDrive/Escritorio/sqliteadmin/db/seMarinos.s3db";
    Connection con = null;

    public conexion() {
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(ConexionDB);
            System.out.println("Conexion establecida");
        } catch (Exception e) {
            System.out.println("Error de conexion " + e);
        }
    }

    public int ejecutarSentenciaSQL(String strSen) {
        try {
            PreparedStatement pstm = con.prepareStatement(strSen);
            pstm.execute();
            return 1;
        } catch (Exception e) {
            System.out.println("Conexion"+e);
            return 0;
        }   
    }
    public ResultSet consultaReg(String strSQl){
        try {
             PreparedStatement pstm = con.prepareStatement(strSQl);
             ResultSet res=pstm.executeQuery();
            return res;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
