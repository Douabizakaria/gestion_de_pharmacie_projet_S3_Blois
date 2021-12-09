
package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Vente_Equipe extends javax.swing.JFrame {
Connection con = null;
PreparedStatement pre= null;
ResultSet res = null;
    public Vente_Equipe() {
        initComponents();
        con=Connexion.connexion();
        Remplir_Nom_utilisateur();
    }

   

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Nom_utilisateur = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Jour = new javax.swing.JComboBox<>();
        Mois = new javax.swing.JComboBox<>();
        Année = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        total = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vente d'équipe");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 255, 102));

        jPanel2.setBackground(new java.awt.Color(0, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Formulaire de vente d'équipe");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel1)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nom_utilisateur : ");

        Nom_utilisateur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Utilisateur :" }));
        Nom_utilisateur.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Nom_utilisateurItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Date : ");

        Jour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jour :", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Jour.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JourItemStateChanged(evt);
            }
        });

        Mois.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mois :", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        Mois.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                MoisItemStateChanged(evt);
            }
        });

        Année.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Année :", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        Année.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                AnnéeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(Nom_utilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addComponent(Jour, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Mois, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Année, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Jour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Mois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Année, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(Nom_utilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 255, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "  Nom_Utilisateur", "code-barres", "  Nom_Medicament", "   Quantité", "   Prix", "Montant", "    Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(153, 255, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        total.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        total.setText("00.0 €");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("  Bénéfice : ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(total)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(153, 255, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jButton1.setText("Vider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(778, 606));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Nom_utilisateurItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Nom_utilisateurItemStateChanged
String sql;
        if(Jour.getSelectedIndex()==0&&Mois.getSelectedIndex()==0&&Année.getSelectedIndex()==0){
 sql = "select NOM_UTILISATEUR,CODE_BARRES,NOM,QUANTITE,PRIX,MONTANT,DATE from ventes_historiques where NOM_UTILISATEUR='"+Nom_utilisateur.getSelectedItem()+"' ";
       double amount = 0; 
       try {
       pre=con.prepareStatement(sql);
       res=pre.executeQuery();
       jTable1.setModel(DbUtils.resultSetToTableModel(res));
       Aide_utilisateur1();
       } catch (Exception e) {
        JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
        }}else {

 sql = "select NOM_UTILISATEUR,CODE_BARRES,NOM,QUANTITE,PRIX,MONTANT,DATE from ventes_historiques where NOM_UTILISATEUR='"+Nom_utilisateur.getSelectedItem()+"' and DATE='"+Jour.getSelectedItem()+"-"+Mois.getSelectedItem()+"-"+Année.getSelectedItem()+"' ";
       double amount = 0; 
       try {
       pre=con.prepareStatement(sql);
       res=pre.executeQuery();
       jTable1.setModel(DbUtils.resultSetToTableModel(res));
       Aide_utilisateur();
       }catch (Exception e) {
        JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
       }
}
    }//GEN-LAST:event_Nom_utilisateurItemStateChanged

    private void JourItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JourItemStateChanged
 if(Mois.getSelectedIndex()!=0&&Année.getSelectedIndex()!=0){
date_aide();
 }
    }//GEN-LAST:event_JourItemStateChanged

    private void MoisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_MoisItemStateChanged
 if(Jour.getSelectedIndex()!=0&&Année.getSelectedIndex()!=0){
date_aide();
 }
    }//GEN-LAST:event_MoisItemStateChanged

    private void AnnéeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_AnnéeItemStateChanged
 if(Mois.getSelectedIndex()!=0&&Jour.getSelectedIndex()!=0){
date_aide();
 }
    }//GEN-LAST:event_AnnéeItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Nom_utilisateur.setSelectedIndex(0);
Jour.setSelectedIndex(0);
Mois.setSelectedIndex(0);
Année.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Vente_Equipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vente_Equipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vente_Equipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vente_Equipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vente_Equipe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> Année;
    public javax.swing.JComboBox<String> Jour;
    public javax.swing.JComboBox<String> Mois;
    private javax.swing.JComboBox<String> Nom_utilisateur;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
private void Remplir_Nom_utilisateur(){
      String sql = "select NOM from utilisateur";
    try {
        pre=con.prepareStatement(sql);
        res=pre.executeQuery();
        while(res.next()){
        Nom_utilisateur.addItem(res.getString("NOM")); 
        }
    } catch (Exception e) {
  JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);      
    }
} 
private void Aide_utilisateur(){
    String sql = "select NOM_UTILISATEUR,CODE_BARRES,NOM,QUANTITE,PRIX,MONTANT,DATE from ventes_historiques where NOM_UTILISATEUR='"+Nom_utilisateur.getSelectedItem()+"' and DATE='"+Jour.getSelectedItem()+"-"+Mois.getSelectedItem()+"-"+Année.getSelectedItem()+"' ";
       double amount = 0; 
       try {
       pre=con.prepareStatement(sql);
       res=pre.executeQuery();
       while(res.next()){
           amount += Double.parseDouble(res.getString("MONTANT")) ; 
       } total.setText(String.valueOf(amount)+"$");
       } catch (Exception e) {
        JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
        }
}
private void Aide_utilisateur1(){
    String sql = "select NOM_UTILISATEUR,CODE_BARRES,NOM,QUANTITE,PRIX,MONTANT,DATE from ventes_historiques where NOM_UTILISATEUR='"+Nom_utilisateur.getSelectedItem()+"'";
       double amount = 0; 
       try {
       pre=con.prepareStatement(sql);
       res=pre.executeQuery();
       while(res.next()){
           amount += Double.parseDouble(res.getString("MONTANT")) ; 
       } total.setText(String.valueOf(amount)+"$");
       } catch (Exception e) {
        JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
        }
}
private void Aide(){
String sql;
if(Nom_utilisateur.getSelectedIndex()==0){
sql = "select NOM_UTILISATEUR,CODE_BARRES,NOM,QUANTITE,PRIX,MONTANT,DATE from ventes_historiques where DATE='"+Jour.getSelectedItem()+"-"+Mois.getSelectedItem()+"-"+Année.getSelectedItem()+"' ";        
}else{
 sql = "select NOM_UTILISATEUR,CODE_BARRES,NOM,QUANTITE,PRIX,MONTANT,DATE from ventes_historiques where NOM_UTILISATEUR='"+Nom_utilisateur.getSelectedItem()+"' and DATE='"+Jour.getSelectedItem()+"-"+Mois.getSelectedItem()+"-"+Année.getSelectedItem()+"' ";
}
    double montant = 0; 
       try {
       pre=con.prepareStatement(sql);
       res=pre.executeQuery();
       while(res.next()){
           montant += Double.parseDouble(res.getString("MONTANT")) ; 
       } total.setText(String.valueOf(montant)+"€");
       } catch (Exception e) {
        JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
        }
}
private void date_aide(){
String sql;
if(Nom_utilisateur.getSelectedIndex()==0){
 sql = "select NOM_UTILISATEUR,CODE_BARRES,NOM,QUANTITE,PRIX,MONTANT,DATE from ventes_historiques where DATE='"+Jour.getSelectedItem()+"-"+Mois.getSelectedItem()+"-"+Année.getSelectedItem()+"' ";        
}else{
 sql = "select NOM_UTILISATEUR,CODE_BARRES,NOM,QUANTITE,PRIX,MONTANT,DATE from ventes_historiques where NOM_UTILISATEUR='"+Nom_utilisateur.getSelectedItem()+"' and DATE='"+Jour.getSelectedItem()+"-"+Mois.getSelectedItem()+"-"+Année.getSelectedItem()+"' ";
}
double montant = 0;
       try {
       pre=con.prepareStatement(sql);
       res=pre.executeQuery();
       jTable1.setModel(DbUtils.resultSetToTableModel(res));
       Aide();
       }catch(Exception e){
       JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
       }}}