package semana22.exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarAluno {
        public static void main(String[] args) throws SQLException{
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        Scanner sc = new Scanner(System.in);
        System.out.println("digite o id do aluno a ser alterado.");
        int id = sc.nextInt();

        String sql = "SELECT* FROM alunos WHERE id = ?;";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        ResultSet rs = pstm.executeQuery(sql);

        id = rs.getInt("id");
        String nome = rs.getString("nome");
        String email = rs.getString("email");
        boolean ativo = rs.getBoolean("ativo");

        System.out.println("registro buscado:");
        System.out.println(id);
        System.out.println(nome);
        System.out.println(email);
        System.out.println(ativo);

        System.out.println("escreva n na coluna a se manter ou escreva um novo campo para alterara-la. ");
        System.out.println("nome:");
        String resposta = sc.nextLine();
        if (resposta != "n") {
            sql = "UPDATE alunos SET nome = ? WHERE id = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, resposta);
            pstm.setInt(2, id);
            pstm.executeUpdate();
        }

        System.out.println("email:");
        resposta = sc.nextLine();
        if (resposta != "n") {
            sql = "UPDATE alunos SET email = ? WHERE id = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, resposta);
            pstm.setInt(2, id);
            pstm.executeUpdate();
        }

        System.out.println("digite true para usuario ativo ou false para desativo:");
        boolean r = sc.nextBoolean();
        sql = "UPDATE alunos SET ativo = ? WHERE id = ?";
        pstm = conn.prepareStatement(sql);
        pstm.setBoolean(1, r);
        pstm.setInt(2, id);
        pstm.executeUpdate();

        pstm.close();
        conn.close();
        sc.close();
    }
}
