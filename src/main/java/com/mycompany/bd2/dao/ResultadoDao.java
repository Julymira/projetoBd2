package com.mycompany.bd2.dao;


import com.mycompany.bd2.DTO.ObjetoDto;
import com.mycompany.bd2.DTO.ResultadoDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ResultadoDao {
    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    ArrayList<ResultadoDto> lista = new ArrayList<>();

    public ArrayList<ResultadoDto> getAll() {
        String sql = "select * from resultado";
        conn = ConexaoBD.getConnection();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                ResultadoDto obj = new ResultadoDto(rs.getInt("id"), rs.getString("nome"), rs.getString("resultado"));
                lista.add(obj);

            }
            ConexaoBD.closeResultSet(rs);
            ConexaoBD.closeStatement(pstm);
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        return lista;
    }
}
