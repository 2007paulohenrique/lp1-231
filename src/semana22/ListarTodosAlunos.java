package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListarTodosAlunos {
    public static void main(String[] args) throws SQLException{
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        String sql = "SELECT* FROM alunos;";
        Statement stm = conn.createStatement();

        // ResultSet - representa o resultado de uma consulta - associado a um statement ou preparedstatement
        // executeQuery(sql) - retorna o resultado de uma consulta 
        ResultSet rs = stm.executeQuery(sql);

        // rs.next() - enquanto houver uma proxima linha de resultado
        while(rs.next()){
            // armazenar o valor que estao nas colunas especificadas - prestar atencao no tipo do valor que esta no banco de dados

            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            String email = rs.getString("email");
            boolean ativo = rs.getBoolean("ativo");

            System.out.println(id);
            System.out.println(nome);
            System.out.println(email);
            System.out.println(ativo);
        }

        conn.close();
        stm.close();
    }
}
