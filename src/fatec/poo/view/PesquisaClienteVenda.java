/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.DAO.ClienteDao;
import fatec.poo.model.Cliente;
import fatec.poo.model.Endereco;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kaique
 */
public class PesquisaClienteVenda extends javax.swing.JFrame {

 Cliente c = new Cliente();
 Endereco e = new Endereco();
    Venda v;

    /**
     * Creates new form PesquisaClienteVenda
     */
    public PesquisaClienteVenda(Venda v, String nomeCli) {
        this.v = v;
        initComponents();
        readForTable(nomeCli);
    }

    public void readForTable(String desc) {
        DefaultTableModel modelo = (DefaultTableModel) tableCliente.getModel();
        modelo.setNumRows(0);
        ClienteDao cdao = new ClienteDao();
        Endereco end = new Endereco();

        for (Cliente cc : cdao.readForTableClienteVenda(desc)) {
            modelo.addRow(new Object[]{
                cc.getId(),
                cc.getNome(),
                cc.getCpfCnpj(),
                cc.getEmail(),
                cc.getTelefone(),
                cc.getEndereco().getBairro(),
                cc.getEndereco().getRua(),
                cc.getEndereco().getCidade(),
                cc.getEndereco().getNumero(),
                cc.getObservalcao(),});
            System.out.println("");
        }
        modelo.fireTableDataChanged();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCliente = new javax.swing.JTable();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Cliente", "Nome", "CPF", "Email", "Telefone", "Bairro", "Rua", "Cidade", "Numero", "Observacao"
            }
        ));
        tableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClienteMouseClicked
        SelecionaEpreencheCamposs();
        System.out.println("" + c.getId());
        v.recebeClientePesquisa(c);
        this.dispose();

    }//GEN-LAST:event_tableClienteMouseClicked

    private void SelecionaEpreencheCamposs() {
       
        // passando da linha selecionada da table para os TextFiel 
        int indice = tableCliente.getSelectedRow();
        c.setId(Integer.parseInt(tableCliente.getValueAt(indice, 0).toString()));
        c.setNome(tableCliente.getValueAt(indice, 1).toString());
        c.setCpfCnpj(tableCliente.getValueAt(indice, 2).toString());
        c.setEmail(tableCliente.getValueAt(indice, 3).toString());
        c.setTelefone(tableCliente.getValueAt(indice, 4).toString());
        e.setBairro(tableCliente.getValueAt(indice, 5).toString());
        e.setRua(tableCliente.getValueAt(indice, 6).toString());
        e.setCidade(tableCliente.getValueAt(indice, 7).toString());
        e.setNumero(Integer.parseInt(tableCliente.getValueAt(indice, 8).toString()));
        c.setObservalcao(tableCliente.getValueAt(indice, 8).toString());
        c.adiciona(e);
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tableCliente;
    // End of variables declaration//GEN-END:variables
}
