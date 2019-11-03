package fatec.poo.view;

import fatec.poo.DAO.ProdutoDao;
import fatec.poo.model.Produto;
import fatec.poo.util.Imagem;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kaique
 */
public class CadastroProduto extends javax.swing.JInternalFrame {

    private boolean status;
    BufferedImage imagem;

    /**
     * Creates new form CadastroProduto
     */
    public CadastroProduto() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tcod = new javax.swing.JTextField();
        tdesc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelimagem = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bCadastra = new javax.swing.JButton();
        cbTipo = new javax.swing.JComboBox();
        jlabelimagemaction = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jimagem = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableprod = new javax.swing.JTable();
        jPesquisar = new javax.swing.JButton();
        tpreco = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Formulário de Produto");
        setPreferredSize(new java.awt.Dimension(700, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(tcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 39, 130, -1));
        getContentPane().add(tdesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 72, 130, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Descricao");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        jLabelimagem.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelimagem.setText("Imagem do Produto");
        getContentPane().add(jLabelimagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 21, -1, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Unidade");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 103, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Preço");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 134, -1, -1));

        bCadastra.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bCadastra.setText("Cadastrar");
        bCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastraActionPerformed(evt);
            }
        });
        getContentPane().add(bCadastra, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 161, 103, -1));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "kg", "ml", "unid" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });
        getContentPane().add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 103, 81, -1));

        jlabelimagemaction.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jlabelimagemaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 200, 200));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 227, 103, -1));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 194, 103, -1));

        jimagem.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jimagem.setText("Imagem");
        jimagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jimagemActionPerformed(evt);
            }
        });
        getContentPane().add(jimagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 260, 103, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Cód do Produto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 37, -1, 20));

        tableprod.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        tableprod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód_Produto", "Descrição", "Preço", "Unidade"
            }
        ));
        tableprod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableprodMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableprod);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 487, 93));

        jPesquisar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPesquisar.setText("Pesquisar");
        jPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 52, -1, -1));
        getContentPane().add(tpreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastraActionPerformed
        Produto p = new Produto();
        
        p.setCodProduto(Integer.parseInt(tcod.getText()));
        p.setDescricao(tdesc.getText());
        p.setPreco(Double.parseDouble(tpreco.getText()));
        p.setTipo(cbTipo.getSelectedItem().toString());
        p.setImagem(Imagem.getImgBytes(imagem));

        ProdutoDao dao = new ProdutoDao();
        try {
            if (jlabelimagemaction.getIcon() == null) {
                dao.adiciona(p);
                JOptionPane.showMessageDialog(null, "O Produto " + tdesc.getText() + " Inserido com Sucesso !");
            } else {
                dao.adiciona(p);
                JOptionPane.showMessageDialog(null, "O Produto " + tdesc.getText() + " Inserido com Sucesso !");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código de Produto Já Cadastrado Anteriormente!");
        }

        limparCampos();

    }//GEN-LAST:event_bCadastraActionPerformed
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    private void SelecionaEpreencheCampos() {
        // passando da linha selecionada da table para os TextFiel 
        int indice = tableprod.getSelectedRow();
        tcod.setText(tableprod.getValueAt(indice, 0).toString());

        tdesc.setText(tableprod.getValueAt(indice, 1).toString());
        tpreco.setText(tableprod.getValueAt(indice, 2).toString());
        if ("kg".equals(tableprod.getValueAt(indice, 3).toString())) {
            cbTipo.setSelectedIndex(0);
        } else if ("ml".equals(tableprod.getValueAt(indice, 3).toString())) {
            cbTipo.setSelectedIndex(1);
        } else {
            cbTipo.setSelectedIndex(2);
        }
        status = true;
        try {
            Integer id = Integer.parseInt(tcod.getText());
            ProdutoDao dao = new ProdutoDao();
            Produto prod = dao.buscaimagem(id);
            Imagem.exibiImagemLabel(prod.getImagem(), jlabelimagemaction);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void readForTable(String desc) {
        DefaultTableModel modelo = (DefaultTableModel) tableprod.getModel();
        modelo.setNumRows(0);
        ProdutoDao pdao = new ProdutoDao();

        for (Produto c : pdao.readForDesc(desc)) {
            modelo.addRow(new Object[]{
                c.getCodProduto(),
                c.getDescricao(),
                c.getPreco(),
                c.getTipo(),});
        }
        modelo.fireTableDataChanged();
    }

    public void readForTable1(int cod) {
        DefaultTableModel modelo = (DefaultTableModel) tableprod.getModel();
        modelo.setNumRows(0);
        ProdutoDao pdao = new ProdutoDao();

        for (Produto c : pdao.readforCod(cod)) {
            modelo.addRow(new Object[]{
                c.getCodProduto(),
                c.getDescricao(),
                c.getPreco(),
                c.getTipo(),});
        }
        modelo.fireTableDataChanged();
    }

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoActionPerformed

    private void tableprodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableprodMouseClicked
        SelecionaEpreencheCampos();
    }//GEN-LAST:event_tableprodMouseClicked

    private void jPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPesquisarActionPerformed
        if (tcod.getText().equals("")) {
            readForTable(tdesc.getText());
        } else {
            readForTable1(Integer.parseInt(tcod.getText()));
        }
    }//GEN-LAST:event_jPesquisarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Produto produto = new Produto();
        ProdutoDao produtoDao = new ProdutoDao();
        produto.setCodProduto(Integer.parseInt(tcod.getText()));
        produto.setDescricao(tdesc.getText());
        produto.setPreco(Double.parseDouble(tpreco.getText()));
        produto.setImagem(Imagem.getImgBytes(imagem));

        try {
            if(jlabelimagemaction.getIcon().getIconHeight() != 0 && jlabelimagemaction.getIcon().getIconWidth() != 0){
             produtoDao.update(produto, (int) tableprod.getValueAt(tableprod.getSelectedRow(), 0));
             JOptionPane.showMessageDialog(null, "Produto Alterado !");    
            } else{
                produtoDao.update(produto, (int) tableprod.getValueAt(tableprod.getSelectedRow(), 0));
                JOptionPane.showMessageDialog(null, "Produto Alterado !");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpaTable();
        limparCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ProdutoDao produtoDao = new ProdutoDao();
        Produto produto = new Produto();
        try {
            produto.setCodProduto(Integer.parseInt(tcod.getText()));
            produtoDao.exclui(produto);
            JOptionPane.showMessageDialog(null, "O Produto " + tdesc.getText() + " Foi Deletado!");
            limparCampos();
            limpaTable();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jimagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jimagemActionPerformed
        JFileChooser jfc = new JFileChooser();
        int res = jfc.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            File arquivo = jfc.getSelectedFile();

            try {
                imagem = Imagem.setImagemDimensao(arquivo.getAbsolutePath(), 200, 200);
                jlabelimagemaction.setIcon(new ImageIcon(imagem));
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jimagemActionPerformed

    private void limparCampos() {
        tcod.setText("");
        tpreco.setText("");
        tdesc.setText("");
        jlabelimagemaction.setIcon(null);
    }

    private void limpaTable() {
        ((DefaultTableModel) tableprod.getModel()).setNumRows(0);
        tableprod.updateUI();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadastra;
    private javax.swing.JComboBox cbTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelimagem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jimagem;
    private javax.swing.JLabel jlabelimagemaction;
    private javax.swing.JTable tableprod;
    private javax.swing.JTextField tcod;
    private javax.swing.JTextField tdesc;
    private javax.swing.JTextField tpreco;
    // End of variables declaration//GEN-END:variables
}
