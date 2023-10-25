package LojaDeCarros;

import java.sql.SQLException;

import LojaDeCarros.TablesDAO.CriarTabelas;
import LojaDeCarros.TablesDAO.CriarViews;
import LojaDeCarros.TablesDAO.RemoverTodasTabelas;
import LojaDeCarros.TablesDAO.RemoverTodasViews;

public class CriarEstruturaBDD {
    public static void main(String[] args) throws SQLException {
        RemoverTodasTabelas removerTabelas = new RemoverTodasTabelas();
        removerTabelas.remover();

        CriarTabelas criarTabelas = new CriarTabelas();
        criarTabelas.criar();

        RemoverTodasViews removerViews = new RemoverTodasViews();
        removerViews.remover();
        
        CriarViews criarViews = new CriarViews();
        criarViews.criar();
    }
}
