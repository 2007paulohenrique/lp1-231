package semana22.exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BuscraAlunoPorNome {
    public static void main(String[] args) throws SQLException{
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        Scanner sc = new Scanner(System.in);
        System.out.println("digite o nome do aluno a ser buscado.");
        String nome = sc.next();

        String sql = "SELECT* FROM alunos WHERE nome = ?;";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, nome);
        ResultSet rs = pstm.executeQuery(sql);


        int id = rs.getInt("id");
        nome = rs.getString("nome");
        String email = rs.getString("email");
        boolean ativo = rs.getBoolean("ativo");

        System.out.println(id);
        System.out.println(nome);
        System.out.println(email);
        System.out.println(ativo);

        pstm.close();
        conn.close();
        sc.close();
    }
}
