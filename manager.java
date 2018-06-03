package manager;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class manager{
    public static void main(String argv[]){
        int mode;
        Scanner input=new Scanner(System.in);
        try{
            Connection con=null;
            con = DriverManager.getConnection("jdbc:mysql://localhost","root", "1234"); // 3rd arg=password

        }catch(SQLException sqex){
            System.out.println("SQLException: " + sqex.getMessage());
            System.out.println("SQLState: " + sqex.getSQLState());
        }

        while(1){
            mode=input.nextINT();
            switch(mode){
                case 1: insert(); break;
                case 2: modify(); break;
                case 3: delete(); break;
                case 4: search(); break;
                case 5: sort(); break;
            }
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