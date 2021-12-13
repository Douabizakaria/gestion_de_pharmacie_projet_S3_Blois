/**
 * @author DOUABIZAKARIA
 * @version 1.3
 */
package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Auth_Details extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pre = null;
    ResultSet res= null;
    public Auth_Details() {
        initComponents();
        con=Connexion.connexion();
        Remplir_Nomutilisateur();
    }



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        Année = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        Mois = new javax.swing.JComboBox<>();
        Jour = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        nom_utilisateur = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Connexion_Détails");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 255, 102));

        jPanel2.setBackground(new java.awt.Color(0, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Formulaire d'information de connexion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(85, 85, 85))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(24, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(22, 22, 22))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "        Nom", "        Type", "        Date", "Heure"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(153, 255, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        Année.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Année :", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        Année.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                AnnéeItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("nom_utilisateur : ");

        Mois.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mois :", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        Mois.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                MoisItemStateChanged(evt);
            }
        });

        Jour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jour :", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Jour.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JourItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Date_login : ");

        nom_utilisateur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nom :" }));
        nom_utilisateur.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nom_utilisateurItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nom_utilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(Jour, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Mois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Année, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(Jour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Mois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Année, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nom_utilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(685, 503));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nom_utilisateurItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nom_utilisateurItemStateChanged
        String sql;
        if(Jour.getSelectedIndex()==0&&Mois.getSelectedIndex()==0&&Année.getSelectedIndex()==0){
            sql = "select NOM,TYPE,DATE,TEMPS from login where NOM='"+nom_utilisateur.getSelectedItem()+"' ";
        }else {
            sql = "select NOM,TYPE,DATE,TEMPS from login where NOM='"+nom_utilisateur.getSelectedItem()+"' and DATE='"+Jour.getSelectedItem()+"-"+Mois.getSelectedItem()+"-"+Année.getSelectedItem()+"' ";
        }  try {
            pre=con.prepareStatement(sql);
            res=pre.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(res));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
        }
    }//GEN-LAST:event_nom_utilisateurItemStateChanged

    private void JourItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JourItemStateChanged
        String sql ;
        if(Mois.getSelectedIndex()!=0&&Année.getSelectedIndex()!=0&&nom_utilisateur.getSelectedIndex()==0){
            sql = "select NOM,TYPE,DATE,TEMPS from login where DATE='"+Jour.getSelectedItem()+"-"+Mois.getSelectedItem()+"-"+Année.getSelectedItem()+"' ";
        }else {
            sql = "select NOM,TYPE,DATE,TEMPS from login where NOM='"+nom_utilisateur.getSelectedItem()+"' and DATE='"+Jour.getSelectedItem()+"-"+Mois.getSelectedItem()+"-"+Année.getSelectedItem()+"' ";
        }
        try {
            pre=con.prepareStatement(sql);
            res=pre.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(res));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
        }
    }//GEN-LAST:event_JourItemStateChanged

    private void MoisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_MoisItemStateChanged
        String sql;
        if(Jour.getSelectedIndex()!=0&&Mois.getSelectedIndex()!=0&&Année.getSelectedIndex()!=0&&nom_utilisateur.getSelectedIndex()==0){
            sql = "select NOM,TYPE,DATE,TEMPS from login where DATE='"+Jour.getSelectedItem()+"-"+Mois.getSelectedItem()+"-"+Année.getSelectedItem()+"' ";
        }else {
            sql = "select NOM,TYPE,DATE,TEMPS from login where NOM='"+nom_utilisateur.getSelectedItem()+"' and DATE='"+Jour.getSelectedItem()+"-"+Mois.getSelectedItem()+"-"+Année.getSelectedItem()+"' ";
        }
        try {
            pre=con.prepareStatement(sql);
            res=pre.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(res));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
        }

    }//GEN-LAST:event_MoisItemStateChanged

    private void AnnéeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_AnnéeItemStateChanged
        String sql;
        if(Mois.getSelectedIndex()!=0&&Jour.getSelectedIndex()!=0&&nom_utilisateur.getSelectedIndex()==0){
            sql = "select NOM,TYPE,DATE,TEMPS from login where DATE='"+Jour.getSelectedItem()+"-"+Mois.getSelectedItem()+"-"+Année.getSelectedItem()+"' ";
        }else {
            sql = "select NOM,TYPE,DATE,TEMPS from login where NOM='"+nom_utilisateur.getSelectedItem()+"' and DATE='"+Jour.getSelectedItem()+"-"+Mois.getSelectedItem()+"-"+Année.getSelectedItem()+"' ";
        }
        try {
            pre=con.prepareStatement(sql);
            res=pre.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(res));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
        }

    }//GEN-LAST:event_AnnéeItemStateChanged

    /**
     * @param args
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Auth_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Auth_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Auth_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Auth_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Auth_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> Année;
    public javax.swing.JComboBox<String> Jour;
    public javax.swing.JComboBox<String> Mois;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> nom_utilisateur;
    // End of variables declaration//GEN-END:variables
    private void Remplir_Nomutilisateur(){
        String sql = "select NOM from utilisateur";
        try {
            pre=con.prepareStatement(sql);
            res=pre.executeQuery();
            while(res.next()){
                nom_utilisateur.addItem(res.getString("NOM"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
        }
    }
}
