/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.DAO.ProdutoDao;
import fatec.poo.model.Produto;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TableProdutoVenda extends javax.swing.JFrame {

    private VendaView codPesquisa;
    private Connection connection;
    String aux;

    public TableProdutoVenda() {
        initComponents();
        aux = tPesquisaProduto.getText();
        readForTable(tPesquisaProduto.getText());
    }

    public void enviaParaPesquisa(VendaView codProdutoHerdado, String codProduto) {
        tPesquisaProduto.setText(codProduto);
        aux = tPesquisaProduto.getText();
    }

    private void configuraColubas() {
        tableProduto.getColumnModel().getColumn(0).setPreferredWidth(20);
        tableProduto.getColumnModel().getColumn(1).setPreferredWidth(20);
        tableProduto.getColumnModel().getColumn(2).setPreferredWidth(20);
        tableProduto.getColumnModel().getColumn(3).setPreferredWidth(20);
    }

    public void readTableProduto() {

        DefaultTableModel modelo = (DefaultTableModel) tableProduto.getModel();
        modelo.setNumRows(0);
        ProdutoDao pdao = new ProdutoDao();

        for (Produto p : pdao.read()) {

            modelo.addRow(new Object[]{
                p.getCodProduto(),
                p.getDescricao(),
                p.getTipo(),
                p.getPreco()
            });

        }

    }

    public void readForTable(String desc) {
        DefaultTableModel modelo = (DefaultTableModel) tableProduto.getModel();
        modelo.setNumRows(0);
        ProdutoDao pdao = new ProdutoDao();

        for (Produto p : pdao.readForDesc(desc)) {
            modelo.addRow(new Object[]{
                p.getCodProduto(),
                p.getDescricao(),
                p.getTipo(),
                p.getPreco()

            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduto = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        tPesquisaProduto = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        tableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Produto", "Descrição", "Tipo", "Val. Un"
            }
        ));
        tableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProduto);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 429;
        gridBagConstraints.ipady = 258;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 8, 0);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jButton1.setText("Selecionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jButton1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(tPesquisaProduto, gridBagConstraints);

        jButton2.setText("Atualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jButton2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
        VendaView vv = new VendaView();

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TableModel model1 = tableProduto.getModel();
        int index[] = tableProduto.getSelectedRows();
        Object[] row = new Object[5];
        DefaultTableModel model = (DefaultTableModel) vv.tableVenda.getModel();

        for (int i = 0; i < index.length; i++) {
            row[0] = model1.getValueAt(index[i], 0);
            row[1] = model1.getValueAt(index[i], 1);
            row[2] = model1.getValueAt(index[i], 2);
            row[3] = model1.getValueAt(index[i], 3);
            model.addRow(row);
        }
        vv.setVisible(true);
        vv.pack();
        vv.setDefaultCloseOperation(VendaView.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        readForTable(tPesquisaProduto.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdutoMouseClicked

        TableModel model1 = tableProduto.getModel();
        int index[] = tableProduto.getSelectedRows();
        Object[] row = new Object[5];
        DefaultTableModel model = (DefaultTableModel) vv.tableVenda.getModel();

        for (int i = 0; i < index.length; i++) {
            row[0] = model1.getValueAt(index[i], 0);
            row[1] = model1.getValueAt(index[i], 1);
            row[2] = model1.getValueAt(index[i], 2);
            row[3] = model1.getValueAt(index[i], 3);
            model.addRow(row);
        }
        vv.setVisible(true);
        vv.pack();
        vv.setDefaultCloseOperation(VendaView.DISPOSE_ON_CLOSE);

     //handle double click event.

    }//GEN-LAST:event_tableProdutoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tPesquisaProduto;
    private javax.swing.JTable tableProduto;
    // End of variables declaration//GEN-END:variables
}
