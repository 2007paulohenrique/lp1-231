package LojaDeCarros.TablesDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import LojaDeCarros.Conexao;
import LojaDeCarros.Tables.CategoriaCarro;
import LojaDeCarros.Tables.Marca;
import LojaDeCarros.Tables.Modelo;
import LojaDeCarros.Tables.Versao;

public class VersaoDAO {
    public Versao create(Versao versao) throws SQLException{
        String sql = """
        INSERT INTO versao (id_modelo, id_categoria_carro, nome, lancamento)
        VALUES (?, ?, ?, ?);
        """;

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {
            statement.setInt(1, versao.getModelo().getId());
            statement.setInt(2, versao.getCategoriaCarro().getId());
            statement.setString(3, versao.getNome());  
            Date lancamento = Date.valueOf(versao.getLancamento());
            statement.setDate(4, lancamento); 
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                versao.setId(rs.getInt(1));
            }

            rs.close();

            return versao;
        }
    }

    public Versao update(Versao versao) throws SQLException { 
        String sql = """
        UPDATE versao
        SET nome = ?
        WHERE id = ?;
        """;

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setString(1, versao.getNome());
            statement.setInt(2, versao.getId());
            int linhasAfetadas = statement.executeUpdate();

            if (linhasAfetadas > 0) {
                return versao;
            }
            return null;

        } catch (SQLException e) {
            return null;
        }
    }

    public Versao findByNome(String nome) { 
        String sql = "SELECT * FROM versao WHERE nome = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setString(1, nome);

            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return resultSetToVersao(rs);
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    public List<Versao> findVersoesByModelo(Modelo modelo) {
        List<Versao> versoes = new ArrayList<>();

        String sql = "SELECT * FROM versao WHERE id_modelo = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setInt(1, modelo.getId());

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Versao versao = resultSetToVersao(rs);
                versoes.add(versao);
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return versoes;
    }

    private Marca findMarcaDoModeloDaVersao(int id) {
        String sql = "SELECT * FROM marca WHERE id = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setInt(1, id);

            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return resultSetToMarca(rs);
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    private Marca resultSetToMarca(ResultSet rs) throws SQLException { 
        return new Marca(
            rs.getInt("id"),
            rs.getString("nome")
        );
    }

    private Modelo findModeloDaVersao(int id) {
        String sql = "SELECT * FROM modelo WHERE id = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setInt(1, id);

            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return resultSetToModelo(rs);
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    private CategoriaCarro findCategoriaDaVersao(int id) {
        String sql = "SELECT * FROM categoria_carro WHERE id = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setInt(1, id);

            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return resultSetTocategoriaCarro(rs);
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    private Modelo resultSetToModelo(ResultSet rs) throws SQLException { 
        return new Modelo(
            rs.getInt("id"),
            rs.getString("nome"),
            findMarcaDoModeloDaVersao(rs.getInt(2))
        );
    }

    private CategoriaCarro resultSetTocategoriaCarro(ResultSet rs) throws SQLException {
        return new CategoriaCarro(
            rs.getInt("id"),
            rs.getString("nome")
        );
    }

    //testar
    private Versao resultSetToVersao(ResultSet rs) throws SQLException { 
        LocalDate lancamento = LocalDate.of(rs.getDate("lancamento").getYear(), rs.getDate("lancamento").getMonth(), rs.getDate("lancamento").getDay());
        return new Versao(
            rs.getInt("id"),
            rs.getString("nome"),
            lancamento,
            findModeloDaVersao(rs.getInt(2)),
            findCategoriaDaVersao(rs.getInt(3))
        );
    }
}
