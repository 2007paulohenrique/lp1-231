package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirAluno {
    public static void main(String[] args) throws SQLException{
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        int id = 1;
        String nome = "paulo";
        String email = "pvjbfhib@gmail.com";
        boolean ativo = true;

        // para os espacos onde serao inseridos os valores - "?" - parametros
        String sql = "INSERT INTO alunos VALUES(?,?,?,?)";

        // preparar consulta com parametros
        PreparedStatement pstm = conn.prepareStatement(sql);
        
        // inserir os valores nos parametros - setTipoDoValor(posicao nos parametros, valor)
        pstm.setInt(1, id);
        pstm.setString(2, nome);
        pstm.setString(3, email);
        pstm.setBoolean(4, ativo);

        // executar a consulta
        pstm.executeUpdate();

        pstm.close();
        conn.close();
    }
}
