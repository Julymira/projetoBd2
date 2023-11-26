/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bd2.dao;

import com.mycompany.bd2.DTO.ObjetoDto;

import java.sql.*;
import java.util.ArrayList;

/**
 * @author Julyana Mira
 */
public class ObjetoDao {


    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    ArrayList<ObjetoDto> lista = new ArrayList<>();


    public void adicionarObj(ObjetoDto obj) {
        String sql = "insert into criteriosdecomparacao (nome, descricao) values (?,?)";
        conn = ConexaoBD.getConnection();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, obj.getNome());
            pstm.setString(2, obj.getDescricao());
            pstm.execute();
            ConexaoBD.closeStatement(pstm);
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    public void atualizarObj(ObjetoDto obj) {
        String sql = "update criteriosdecomparacao  set  nome = ?, descricao ="
                + " ?  where criterio_id = ?";
        conn = ConexaoBD.getConnection();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(3, obj.getId());
            pstm.setString(1, obj.getNome());
            pstm.setString(2, obj.getDescricao());
            pstm.execute();
            ConexaoBD.closeStatement(pstm);

        } catch (SQLException e) {
            throw new DbException(e.getMessage());

        }
    }

    public void deletarObjeto(int id) {
        String sql = "delete  from criteriosdecomparacao where criterio_id=?";
        conn = ConexaoBD.getConnection();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.execute();

            ConexaoBD.closeStatement(pstm);
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    public ArrayList<ObjetoDto> pesquisarObj() {

        String sql = "select * from criteriosdecomparacao";
        conn = ConexaoBD.getConnection();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                ObjetoDto obj = new ObjetoDto(rs.getInt("criterio_id"), rs.getString("nome"), rs.getString("descricao"));
                lista.add(obj);

            }
            ConexaoBD.closeResultSet(rs);
            ConexaoBD.closeStatement(pstm);
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        return lista;
    }

    public ObjetoDto findById(int id) {

        String sql = "SELECT * FROM criteriosdecomparacao WHERE criterio_id = ?";
        ObjetoDto obj = null;


        try {
            conn = ConexaoBD.getConnection();

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, id);

            rs = pstm.executeQuery();
            rs.next();
            obj = new ObjetoDto(rs.getInt("criterio_id"), rs.getString("nome"), rs.getString("descricao"));
            ConexaoBD.closeResultSet(rs);
            ConexaoBD.closeStatement(pstm);


        } catch (Exception e) {
            // TODO Auto-generated catch block
            throw new DbException(e.getMessage());
        }


        return obj;


    }
}
