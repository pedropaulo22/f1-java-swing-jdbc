package ui;

import dao.EquipeDAO;
import dao.PaisDAO;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import model.Equipe;
import model.Pais;

/**
 *
 * @author André Schwerz
 */
public class EquipeJDialog extends javax.swing.JDialog {

    public EquipeJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try {
            loadRecords();
            fillCBPais();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
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
        JTableEquipes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtDiretor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CBPais = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        CBStatus = new javax.swing.JCheckBox();
        btnFechar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EQUIPE");
        setBounds(new java.awt.Rectangle(0, 15, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTableEquipes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JTableEquipes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Diretor", "Pais", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTableEquipes);
        if (JTableEquipes.getColumnModel().getColumnCount() > 0) {
            JTableEquipes.getColumnModel().getColumn(0).setResizable(false);
            JTableEquipes.getColumnModel().getColumn(1).setResizable(false);
            JTableEquipes.getColumnModel().getColumn(2).setResizable(false);
            JTableEquipes.getColumnModel().getColumn(3).setResizable(false);
            JTableEquipes.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 490, 215));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), " REGISTRO DE EQUIPE ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtID.setToolTipText("");
        txtID.setEnabled(false);
        txtID.setName("txtID"); // NOI18N
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, -1));

        jLabel1.setText("Nome:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 70, 70, 20));

        jLabel2.setText("Pais:");
        jLabel2.setAlignmentX(1.0F);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 20, 70, 20));

        txtNome.setEnabled(false);
        txtNome.setName("txtNome"); // NOI18N
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 440, -1));

        txtDiretor.setEnabled(false);
        txtDiretor.setName("nome"); // NOI18N
        jPanel1.add(txtDiretor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 440, -1));

        jLabel3.setText("Diretor:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 120, 70, 20));

        CBPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBPais.setEnabled(false);
        jPanel1.add(CBPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 210, -1));

        jLabel4.setText("ID:");
        jLabel4.setAlignmentX(1.0F);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 20, 70, 20));

        CBStatus.setText("Status");
        CBStatus.setToolTipText("");
        CBStatus.setEnabled(false);
        CBStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBStatusActionPerformed(evt);
            }
        });
        jPanel1.add(CBStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 490, 190));

        btnFechar.setText("Fechar");
        btnFechar.setActionCommand("btnFechar");
        btnFechar.setPreferredSize(new java.awt.Dimension(90, 29));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        getContentPane().add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 100, 30));

        btnNovo.setText("Novo");
        btnNovo.setActionCommand("btnNovo");
        btnNovo.setPreferredSize(new java.awt.Dimension(90, 29));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 100, 30));

        btnSalvar.setText("Salvar");
        btnSalvar.setActionCommand("btnAlterar");
        btnSalvar.setEnabled(false);
        btnSalvar.setPreferredSize(new java.awt.Dimension(90, 29));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 100, 30));

        btnRemover.setText("Remover");
        btnRemover.setActionCommand("btnRemover");
        btnRemover.setEnabled(false);
        btnRemover.setPreferredSize(new java.awt.Dimension(90, 29));
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 100, 30));

        btnCancelar.setText("Cancelar");
        btnCancelar.setActionCommand("btnImprimir");
        btnCancelar.setEnabled(false);
        btnCancelar.setPreferredSize(new java.awt.Dimension(90, 29));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 100, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        addRecord = true;
        clearInputBoxes();
        CBPais.requestFocus();
        enableButtons(false, true, true, false);
        txtNome.setEnabled(true);
        txtDiretor.setEnabled(true);
        CBPais.setEnabled(true);
        CBStatus.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja salvar esse registro?", "Confirmação?", JOptionPane.YES_NO_OPTION);

        if (dialogResult == JOptionPane.YES_OPTION) {
            try {
                if (addRecord == true) {
                    addNew();
                } else {
                    updateRecord();
                }
                addRecord = false;
                loadRecords();
                enableButtons(true, false, false, false);
                txtNome.setEnabled(false);
                txtDiretor.setEnabled(false);
                CBPais.setEnabled(false);
                CBStatus.setEnabled(false);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        } 
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja excluir esse registro?", "Confirmação?", JOptionPane.YES_NO_OPTION);

        if (dialogResult == JOptionPane.YES_OPTION) {
            try {
                deleteRecord();
                loadRecords();
                clearInputBoxes();
                enableButtons(true, false, false, false);
                txtNome.setEnabled(false);
                txtDiretor.setEnabled(false);
                CBPais.setEnabled(false);
                CBStatus.setEnabled(false);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void CBStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBStatusActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        clearInputBoxes();  
        enableButtons(true, false, false, false);
        txtNome.setEnabled(false);
        txtDiretor.setEnabled(false);
        CBPais.setEnabled(false);
        CBStatus.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBPais;
    private javax.swing.JCheckBox CBStatus;
    private javax.swing.JTable JTableEquipes;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDiretor;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
    
    boolean addRecord = false;

    private void clearInputBoxes() {
        txtID.setText("");
        txtNome.setText("");
    }
    
    private void addNew() throws SQLException {
        PaisDAO pDao = new PaisDAO(); 
        Equipe e = new Equipe();
        e.setNome(txtNome.getText());
        e.setDiretor(txtDiretor.getText());
        e.setPais(pDao.find((String) CBPais.getSelectedItem()));
        e.setStatus(CBStatus.isSelected());
        EquipeDAO dao = new EquipeDAO();
        dao.insert(e);
    }
    
    private void updateRecord() throws SQLException {
        PaisDAO pDao = new PaisDAO();
        Equipe e = new Equipe();
        e.setId(Integer.parseInt(txtID.getText()));
        e.setNome(txtNome.getText());
        e.setDiretor(txtDiretor.getText());
        e.setPais(pDao.find((String) CBPais.getSelectedItem()));
        e.setStatus(CBStatus.isSelected());
        EquipeDAO dao = new EquipeDAO();
        dao.update(e);
    }

    private void deleteRecord() throws SQLException {
        EquipeDAO dao = new EquipeDAO();
        dao.remove(Integer.parseInt(txtID.getText()));
    }
    
    private void loadRecords() throws SQLException {
        String sql = "SELECT id as ID, nome as Nome, diretor as Diretor, pais_sigla as 'Sigla do Pais', status as Status  FROM EQUIPE;";
        ResultSetTableModel tableModel = new ResultSetTableModel(sql);
        JTableEquipes.setModel(tableModel);
        
        //Hiding column "id" 
        JTableEquipes.removeColumn(JTableEquipes.getColumnModel().getColumn(0));
        
        //Adjusting columns 
        JTableEquipes.getColumnModel().getColumn(0).setMinWidth(200);//"nome
        JTableEquipes.getColumnModel().getColumn(2).setMaxWidth(50); //"sigla"
        JTableEquipes.getColumnModel().getColumn(3).setMaxWidth(40); //"status"
       
        JTableEquipes.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                try {
                    if (JTableEquipes.getSelectedRow() >= 0) {
                        
                        Object id = JTableEquipes.getModel().getValueAt(JTableEquipes.getSelectedRow(), 0);
                        Object nome = JTableEquipes.getModel().getValueAt(JTableEquipes.getSelectedRow(), 1);
                        Object diretor = JTableEquipes.getModel().getValueAt(JTableEquipes.getSelectedRow(), 2);
                        Object pais_sigla = JTableEquipes.getModel().getValueAt(JTableEquipes.getSelectedRow(), 3);
                        Object status = JTableEquipes.getModel().getValueAt(JTableEquipes.getSelectedRow(), 4).toString();
                        
                        txtID.setText(id.toString());
                        txtNome.setText(nome.toString());
                        txtDiretor.setText(diretor.toString());
                        CBPais.setSelectedItem(pais_sigla.toString());
                        CBStatus.setSelected(status.equals("true"));
                        
                        enableButtons(false, true, true, true);
                        txtNome.setEnabled(true);
                        txtDiretor.setEnabled(true);
                        CBPais.setEnabled(true);
                        CBStatus.setEnabled(true);
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        JTableEquipes.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
    }  

    private void fillCBPais() throws SQLException {
        PaisDAO dao = new PaisDAO();
        List<Pais> paises = dao.list();
        CBPais.removeAllItems();
        for(Pais p : paises){
            CBPais.addItem(p.getSigla());
        }     
    } 
    
    public void enableButtons(boolean novo, boolean salvar, boolean cancelar, boolean remover){
        btnNovo.setEnabled(novo);
        btnSalvar.setEnabled(salvar);
        btnCancelar.setEnabled(cancelar);
        btnRemover.setEnabled(remover);
    }
}
