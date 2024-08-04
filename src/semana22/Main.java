package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// como abrir conexao com banco de dados - mysql
// como executar um codigo sql
// consultas

// driver (nesse caso) - biblioteca que permite a comunicacao entre uma aplicacao e um sistema de gerenciamento de banco de dados
// JDBC - API que define como acessar um banco de dados - fornece metodos para consultar e atualizar dados de um banco de dados

public class Main {
    // throws SQLException - permite que o programa lance uma sql exception durante a sua execucao

    public static void main(String[] args) throws SQLException{
        
        // criar conexao - para funcionar, o banco de dados deve existir

        // local e informacoes do banco de dados
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";  
        
        // obter conexao
        Connection conn = DriverManager.getConnection(url);

        // executar a consulta sql

        // codigo a ser executado - nesse caso, criar uma tabela
        String sql = "CREATE TABLE alunos(id INT PRIMARY KEY, nome TEXT, email TEXT, ativo BOOL);"; 

        // Statement - interface usada para executar consultas sql e retornar os resultados produzidos pela consulta 

        // tipos
        // Statement - consultas simples sem parametros
        // PreparedStatement - consultas com parametros

        Statement stm = conn.createStatement();
        stm.execute(sql);

        // fechar a conexao e o Statement
        stm.close();
        conn.close();
    }
}
