package LojaDeCarros.Inserts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InserirCargo {
    public static void main(String[] args) throws SQLException{
        String url = "jdbc:mysql://localhost/lojadecarros?user=root&password=0000&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ID do cargo a ser inserido: ");
        int id = sc.nextInt();

        System.out.println("Digite o nome do cargo: ");
        String nome = sc.nextLine();

        String sql = "INSERT INTO cargo VALUES(?, ?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        pstm.setString(2, nome);
        pstm.executeUpdate();

        pstm.close();
        conn.close();
        sc.close();
    }
}