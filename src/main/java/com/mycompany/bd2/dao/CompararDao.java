package com.mycompany.bd2.dao;

import com.mycompany.bd2.DTO.CompararDTO;
import com.mycompany.bd2.DTO.ObjetoDto;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CompararDao {

    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    ArrayList<CompararDTO> lista = new ArrayList<>();


    public CompararDTO findById(int id) {

        String sql = "SELECT * FROM comparacao WHERE id = ?";
        CompararDTO obj = null;

//        obj1_nota integer NOT NULL,
//        obj1_peso integer NOT NULL,
//        obj2_nota integer NOT NULL,
//        obj2_peso integer NOT NULL,
//        obj3_nota integer NOT NULL,
//        obj3_peso integer NOT NULL,
//        criterio_id_fk bigint

        try {
            conn = ConexaoBD.getConnection();

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, id);

            rs = pstm.executeQuery();
            rs.next();
            obj = new CompararDTO(rs.getInt("id"), rs.getInt("obj1_nota"), rs.getInt("obj1_peso")
                    , rs.getInt("obj2_nota"), rs.getInt("obj2_peso"), rs.getInt("obj3_nota"), rs.getInt("obj3_peso")
                    , rs.getInt("criterio_id_fk"));
            ConexaoBD.closeResultSet(rs);
            ConexaoBD.closeStatement(pstm);


        } catch (Exception e) {
            // TODO Auto-generated catch block
            throw new DbException(e.getMessage());
        }


        return obj;


    }

    public void deletarObjeto(CompararDTO compararDto) {
        String sql = "delete  from comparacao where id=?";
        conn = ConexaoBD.getConnection();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, compararDto.getId());
            pstm.execute();

            ConexaoBD.closeStatement(pstm);
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    public void adicionarObj(CompararDTO obj) {
        String sql = "insert into comparacao(obj1_nota,obj1_peso,obj2_nota,obj2_peso,obj3_nota,obj3_peso,criterio_id_fk)" +
                " values(?,?,?,?,?,?,?)";
        conn = ConexaoBD.getConnection();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, obj.getObj1Nota());
            pstm.setInt(2, obj.getObj1Peso());
            pstm.setInt(3, obj.getObj2Nota());
            pstm.setInt(4, obj.getObj2Peso());
            pstm.setInt(5, obj.getObj3Nota3());
            pstm.setInt(6, obj.getObj3Peso3());
            pstm.setInt(7, obj.getIdobjComparacao());
            pstm.execute();
            ConexaoBD.closeStatement(pstm);
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    public void atualizarObj(CompararDTO obj) {
        String sql = "update comparacao  set  obj1_nota = ?, obj1_peso = ?, obj2_nota = ?,obj2_peso = ?, obj3_nota = ?, obj3_peso = ? where id = ?";
        conn = ConexaoBD.getConnection();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, obj.getObj1Nota());
            pstm.setInt(2, obj.getObj1Peso());
            pstm.setInt(3, obj.getObj2Nota());
            pstm.setInt(4, obj.getObj2Peso());
            pstm.setInt(5, obj.getObj3Nota3());
            pstm.setInt(6, obj.getObj3Peso3());
            pstm.setInt(7, obj.getId());
            pstm.execute();
            ConexaoBD.closeStatement(pstm);

        } catch (SQLException e) {
            throw new DbException(e.getMessage());

        }
    }

}
