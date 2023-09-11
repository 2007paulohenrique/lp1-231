package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//como abrir conexao com bdd - mysql
//como executar um codigo sql
//ql o formato de resultados de uma consulta

//driver
//JDBC - conexao para todos os apps de bdd - java database connection

//CRIAR TABELA

public class Main {
    public static void main(String[] args) throws SQLException{
        //criar conexao
        //executar a consulta sql
        //fechar a conexao

        String url = "jdbc:mysql://localhost/semana22?user=root?password=NO";
        Connection conn = DriverManager.getConnection(url);

        String sql = "CREATE TABLE alunos(id INT PRIMARY KEY, nome TEXT, email TEXT, ativo BOOL);";
        Statement stm = conn.createStatement();
        stm.execute(sql);

        stm.close();
        conn.close();
    }
}
