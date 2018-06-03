package manager;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class manager{
    public static void main(String argv[]){

        try{
            Connection con=null;
            con = DriverManager.getConnection("jdbc:mysql://localhost","root", "1234"); // 3rd arg=password

        }catch(SQLException sqex){
            System.out.println("SQLException: " + sqex.getMessage());
			System.out.println("SQLState: " + sqex.getSQLState());
        }
        
    }

    public void insert(){

    }

    public void modify(){

    }

    public void delete(){

    }

    public void search(){

    }

    public void sort(){

    }
}