package fatec.poo.view;

import fatec.poo.DAO.ProdutoDao;
import fatec.poo.model.Produto;
import fatec.poo.util.Imagem;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        blimpar = new javax.swing.JButton();
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
        bCadastra1 = new javax.swing.JButton();

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
        setPreferredSize(new java.awt.Dimension(630, 600));

        tdesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdescActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Desc.");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Unidade");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Preço");

        blimpar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        blimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        blimpar.setText("Limpar");
        blimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blimparActionPerformed(evt);
            }
        });

        cbTipo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "kg", "ml", "unid" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        jlabelimagemaction.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        jButton1.setText("Alterar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/rem.png"))); // NOI18N
        jButton2.setText("Remover");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jimagem.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jimagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/save.png"))); // NOI18N
        jimagem.setText("Imagem");
        jimagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jimagemActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Cód Prod");

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

        jPesquisar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        jPesquisar.setText("Pesquisar");
        jPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPesquisarActionPerformed(evt);
            }
        });

        bCadastra1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bCadastra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        bCadastra1.setText("Cadastrar");
        bCadastra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastra1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tcod, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addComponent(jPesquisar))
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tdesc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabelimagemaction, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jimagem, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bCadastra1)
                        .addGap(35, 35, 35)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(blimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bCadastra1, blimpar, jButton1, jButton2, jPesquisar, jimagem});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPesquisar))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tdesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jimagem)
                        .addGap(10, 10, 10)
                        .addComponent(jlabelimagemaction, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCadastra1)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(blimpar))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bCadastra1, blimpar, jButton1, jButton2, jPesquisar, jimagem});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void blimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_blimparActionPerformed
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

        if (jlabelimagemaction.getIcon() == null) {
            try {
                produtoDao.update(produto, (int) tableprod.getValueAt(tableprod.getSelectedRow(), 0));
                JOptionPane.showMessageDialog(null, "O Produto " + tdesc.getText() + " alterado com Sucesso !");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Código de Produto Já Cadastrado Anteriormente!");
            }
        } else if (jlabelimagemaction.getIcon() != null) {
            
            
            System.out.println("");
            produto.setImagem(Imagem.getImgBytes((BufferedImage) iconToImage(jlabelimagemaction.getIcon())));
            try {
                produtoDao.update(produto,
                        (int) tableprod.getValueAt(tableprod.getSelectedRow(), 0));
            } catch (SQLException ex) {
                Logger.getLogger(CadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        limpaTable();
        limparCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    static Image iconToImage(Icon icon) {
        if (icon instanceof ImageIcon) {
            return ((ImageIcon) icon).getImage();
        } else {
            int w = icon.getIconWidth();
            int h = icon.getIconHeight();
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice gd = ge.getDefaultScreenDevice();
            GraphicsConfiguration gc = gd.getDefaultConfiguration();
            BufferedImage image = gc.createCompatibleImage(w, h);
            Graphics2D g = image.createGraphics();
            icon.paintIcon(null, g, 0, 0);
            g.dispose();
            return image;
        }
    }
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

    private void bCadastra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastra1ActionPerformed
        Produto p = new Produto();

        p.setCodProduto(Integer.parseInt(tcod.getText()));
        p.setDescricao(tdesc.getText());
        p.setPreco(Double.parseDouble(tpreco.getText()));
        p.setTipo(cbTipo.getSelectedItem().toString());
        ProdutoDao dao = new ProdutoDao();
        if (jlabelimagemaction.getIcon() == null) {
            try {
                dao.adiciona(p);
                JOptionPane.showMessageDialog(null, "O Produto " + tdesc.getText() + " Inserido com Sucesso !");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Código de Produto Já Cadastrado Anteriormente!");
            }
        } else {
            p.setImagem(Imagem.getImgBytes(imagem));
            System.out.println("");
            try {
                dao.adiciona(p);
                JOptionPane.showMessageDialog(null, "O Produto " + tdesc.getText() + " Inserido com Sucesso !");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Código de Produto Já Cadastrado Anteriormente!");
            }
        }

        limparCampos();
    }//GEN-LAST:event_bCadastra1ActionPerformed

    private void tdescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdescActionPerformed

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
    private javax.swing.JButton bCadastra1;
    private javax.swing.JButton blimpar;
    private javax.swing.JComboBox cbTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
