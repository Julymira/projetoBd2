/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bd2.View;

import com.mycompany.bd2.View.Adicionar.AdicionarComparacao;
import com.mycompany.bd2.View.Adicionar.Adicionar;
import com.mycompany.bd2.DTO.ObjetoDto;
import com.mycompany.bd2.View.Alterar.AlterarObj;
import com.mycompany.bd2.dao.DbException;
import com.mycompany.bd2.dao.ObjetoDao;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.lang.reflect.AnnotatedType;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Julyana Mira
 */
public class Inicio extends javax.swing.JFrame {
    private int id;

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        AdicionarButton = new javax.swing.JButton();
        AtualizarButton = new javax.swing.JButton();
        RemoverButton = new javax.swing.JButton();
        RecarregarBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
                jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
                jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "código", "Nome", "Descrição"
                }
        ));
        jScrollPane1.setViewportView(tabela);

        AdicionarButton.setBackground(new java.awt.Color(0, 0, 0));
        AdicionarButton.setForeground(new java.awt.Color(255, 255, 255));
        AdicionarButton.setText("Adicionar");
        AdicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarButtonActionPerformed(evt);
            }
        });

        AtualizarButton.setBackground(new java.awt.Color(0, 0, 0));
        AtualizarButton.setForeground(new java.awt.Color(255, 255, 255));
        AtualizarButton.setText("Alterar");
        AtualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarButtonActionPerformed(evt);
            }
        });

        RemoverButton.setBackground(new java.awt.Color(0, 0, 0));
        RemoverButton.setForeground(new java.awt.Color(255, 255, 255));
        RemoverButton.setText("Remover");
        RemoverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverButtonActionPerformed(evt);
            }
        });

        RecarregarBtn.setBackground(new java.awt.Color(0, 0, 0));
        RecarregarBtn.setForeground(new java.awt.Color(255, 255, 255));
        RecarregarBtn.setText("Recarregar");
        RecarregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecarregarBtnActionPerformed(evt);
            }
        });

        jMenu1.setText("Menu");

        jMenuItem1.setText("Adicionar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Resultado");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(AdicionarButton)
                                .addGap(18, 18, 18)
                                .addComponent(AtualizarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RemoverButton)
                                .addGap(18, 18, 18)
                                .addComponent(RecarregarBtn)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(29, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(AdicionarButton)
                                        .addComponent(AtualizarButton)
                                        .addComponent(RemoverButton)
                                        .addComponent(RecarregarBtn))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Adicionar adicionar = new Adicionar();
        adicionar.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Resultado resultado = new Resultado();
        resultado.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void AdicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarButtonActionPerformed
        try {
            AdicionarComparacao c = new AdicionarComparacao();
            c.setId(pegarId().getId());
            c.setVisible(true);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "clique no valor que queira  adicionar!");
        }


    }//GEN-LAST:event_AdicionarButtonActionPerformed

    private void RecarregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecarregarBtnActionPerformed
        listarValores();
    }//GEN-LAST:event_RecarregarBtnActionPerformed

    private void AtualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarButtonActionPerformed
        try {
            AlterarObj alterarObj = new AlterarObj();
            alterarObj.getTxtDescricaoA().setText(pegarId().getDescricao());
            alterarObj.getTxtNomeA().setText(pegarId().getNome());
            alterarObj.setId(pegarId().getId());
            alterarObj.setVisible(true);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "clique no valor que queira  alterar!");
        }


    }//GEN-LAST:event_AtualizarButtonActionPerformed

    private void RemoverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverButtonActionPerformed
        try {
            ObjetoDao dao = new ObjetoDao();
            dao.deletarObjeto(pegarId().getId());
            listarValores();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "clique no valor que queira remover ou verifique se há alguma chave estrangeira vinculada");
        }


    }//GEN-LAST:event_RemoverButtonActionPerformed


    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarButton;
    private javax.swing.JButton AtualizarButton;
    private javax.swing.JButton RecarregarBtn;
    private javax.swing.JButton RemoverButton;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    private void listarValores() {
        ObjetoDao dao = new ObjetoDao();
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.setNumRows(0);
        ArrayList<ObjetoDto> lista = dao.pesquisarObj();
        for (int i = 0; i < lista.size(); i++) {
            model.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getNome(),
                    lista.get(i).getDescricao()
            });
        }
    }

    private void carregarTabela() {
        int setar = tabela.getSelectedRow();
        this.id = (int) tabela.getModel().getValueAt(setar, 0);
    }

    public ObjetoDto pegarId() {
        ObjetoDao dao = new ObjetoDao();
        carregarTabela();
        return dao.findById(id);
    }
}
