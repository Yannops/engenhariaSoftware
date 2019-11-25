/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.model.Pagamento;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kaique
 */
public class PagamentoVieww extends javax.swing.JFrame {
    
    Pagamento pag;
    List<Pagamento> pagamentos = new ArrayList<Pagamento>();
    

    /**
     * Creates new form PagamentoVieww
     */
    public PagamentoVieww(Pagamento pag) {
        this.pag = pag;
        initComponents();
        Mostra();
    }

    private void Mostra() {
        String total = Double.toString(pag.getValorPagamento());
        txtTotal.setText(total);
        txtCodPed.setText(Integer.toString(pag.getNumPedido().getCodPedido()));
        txtQntParc.setText("1");
        txtTroco.setText("0");
        txtRestante.setText(Double.toString(pag.getValorPagamento()));
        radDinheiro.setSelected(true);
        validaTipoPagamento();
    }

    private void validaTipoPagamento() {
        if (radDinheiro.isSelected()) {
            txtDinheiro.setEnabled(true);
            txtCartao.setEnabled(false);
            txtQntParc.setEnabled(false);
            combobox.setEnabled(false);
            txtQntParc.setText("0");
        } else {
            txtDinheiro.setText(null);
            txtDinheiro.setEnabled(false);
            txtCartao.setEnabled(true);
            txtQntParc.setEnabled(true);
            combobox.setEnabled(true);
            txtQntParc.setText("1");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupRadionPag = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        txtRestante = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPagamentos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDinheiro = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtQntParc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTroco = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JButton();
        combobox = new javax.swing.JComboBox();
        txtCartao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodPed = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        RadCartao = new javax.swing.JRadioButton();
        radDinheiro = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel6.setText("Restante");

        txtRestante.setEnabled(false);
        txtRestante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRestanteActionPerformed(evt);
            }
        });

        jLabel1.setText("Total:");

        tblPagamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod. Pagamento", "Descrição", "Qntd.Parc", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tblPagamentos);

        jLabel3.setText("Cartão");

        jLabel4.setText("Dinheiro");

        txtDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDinheiroActionPerformed(evt);
            }
        });
        txtDinheiro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDinheiroKeyPressed(evt);
            }
        });

        txtTotal.setEnabled(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        txtQntParc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQntParcActionPerformed(evt);
            }
        });

        jLabel5.setText("Troco");

        txtTroco.setEnabled(false);
        txtTroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrocoActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Finalizaar");
        btnFinalizar.setEnabled(false);
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DÉBITO\t", "CRÉDITO" }));

        txtCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCartaoActionPerformed(evt);
            }
        });

        jLabel2.setText("Qnt. Parc.");

        jLabel7.setText("Cod. Ped");

        txtCodPed.setEnabled(false);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        buttonGroupRadionPag.add(RadCartao);
        RadCartao.setText("Cartão");
        RadCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadCartaoActionPerformed(evt);
            }
        });

        buttonGroupRadionPag.add(radDinheiro);
        radDinheiro.setText("Dinheiro");
        radDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radDinheiroActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo Pagamento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDinheiro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCartao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 28, Short.MAX_VALUE)
                                        .addComponent(btnAdicionar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnFinalizar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radDinheiro)
                                        .addGap(18, 18, 18)
                                        .addComponent(RadCartao)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtQntParc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(txtCodPed))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCodPed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RadCartao)
                    .addComponent(radDinheiro)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtQntParc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtRestante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFinalizar)
                            .addComponent(btnAdicionar)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRestanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRestanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRestanteActionPerformed

    private void txtDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDinheiroActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDinheiroActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtQntParcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQntParcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQntParcActionPerformed

    private void txtTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrocoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Mostra();
    }//GEN-LAST:event_formWindowOpened

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed


    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void txtCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCartaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCartaoActionPerformed

    private void txtDinheiroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDinheiroKeyPressed

    }//GEN-LAST:event_txtDinheiroKeyPressed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        int codPagamento;
        String desc;
        String valorDinheiro = null;
        double valorCartao = 0;
        String valor = null;
        boolean temValor = false;

        double restante = Double.parseDouble(txtRestante.getText());

        if (radDinheiro.isSelected()) {
            codPagamento = 1;
            desc = "Dinheiro";
        } else if (combobox.getSelectedIndex() == 0) {
            codPagamento = 2;
            desc = "Débito";
        } else {
            codPagamento = 3;
            desc = "Crédito";
        }

        if (txtDinheiro.getText().isEmpty()) {
            valor = txtCartao.getText();
            valorCartao = Double.parseDouble(txtCartao.getText());
            temValor = true;
        } else if (txtCartao.getText().isEmpty()) {
            valor = txtDinheiro.getText();
            valorDinheiro = txtDinheiro.getText();
        }

        if (temValor && valorCartao > restante) {
            JOptionPane.showMessageDialog(null, "Impossivel Receber um valor do tipo 'Cartão' maior que o restante da compra. ", "Valor maior que restante", JOptionPane.ERROR_MESSAGE);
            limpaDepoisQueAdiciona();
            temValor = false;
        } else {

            if (Double.parseDouble(valor) > restante) {
                restante = Double.parseDouble(valor) - restante;
                txtTroco.setText(Double.toString(restante));
                restante = 0;
                btnFinalizar.setEnabled(true);
                btnAdicionar.setVisible(false);
            } else {
                restante -= Double.parseDouble(valor);
            }
            txtRestante.setText(Double.toString(restante));

            DefaultTableModel modelo = (DefaultTableModel) tblPagamentos.getModel();
            String[] novaLinha = {
                Integer.toString(codPagamento),
                String.valueOf(desc),
                String.valueOf(txtQntParc.getText()),
                String.valueOf(valor),};
                       
            modelo.addRow(novaLinha);
            limpaDepoisQueAdiciona();
            //    radDinheiro.grabFocus();
            if (txtRestante.getText().equals("0.0")) {
                btnFinalizar.setEnabled(true);
                btnAdicionar.setVisible(false);
            }
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed
    private void limpaDepoisQueAdiciona() {
        txtDinheiro.setText(null);
        txtCartao.setText(null);
        txtQntParc.setText("1");
    }
    private void radDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radDinheiroActionPerformed
        validaTipoPagamento();
    }//GEN-LAST:event_radDinheiroActionPerformed

    private void RadCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadCartaoActionPerformed
        validaTipoPagamento();
    }//GEN-LAST:event_RadCartaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadCartao;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.ButtonGroup buttonGroupRadionPag;
    private javax.swing.JComboBox combobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radDinheiro;
    private javax.swing.JTable tblPagamentos;
    private javax.swing.JTextField txtCartao;
    private javax.swing.JTextField txtCodPed;
    private javax.swing.JTextField txtDinheiro;
    private javax.swing.JTextField txtQntParc;
    private javax.swing.JTextField txtRestante;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTroco;
    // End of variables declaration//GEN-END:variables
}
