
package main;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Medicament_Liste extends javax.swing.JFrame {
Connection con = null;
PreparedStatement pre = null;
ResultSet res= null;
String sql1;
String sql2;
String sql3;
    public Medicament_Liste() {
        initComponents();
        con=Connexion.connexion();
        Liste_Médicament();
    }

   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Liste_Médicament = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        Trier_par = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Médicament_liste");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 255, 102));

        jPanel2.setBackground(new java.awt.Color(0, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Liste Medicaments");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(220, 220, 220))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        Liste_Médicament.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Liste_Médicament.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "         Nom", "         Type", "Code-barres", "           Prix", "   Expiration", "   Fournisseur"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Liste_Médicament.getTableHeader().setReorderingAllowed(false);
        Liste_Médicament.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Liste_MédicamentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Liste_Médicament);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 255, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        Trier_par.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choisir:", "Nom", "Prix", "Expiration" }));
        Trier_par.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Trier_parItemStateChanged(evt);
            }
        });
        Trier_par.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Trier_parActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Trier par : ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Trier_par, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Trier_par, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        setSize(new java.awt.Dimension(679, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Liste_MédicamentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Liste_MédicamentMouseClicked
int row = Liste_Médicament.getSelectedRow();
String t = Liste_Médicament.getModel().getValueAt(row,2).toString();
 String sql = "select * from medicament where CODE_BARRES='"+t+"' ";
try{
    pre=con.prepareStatement(sql);
    res=pre.executeQuery();
    if(res.next()){
        String Nom = res.getString("NOM"); 
        Pharmacie.Médi.Nom_Médicament.setText(Nom);
        
        String Type = res.getString("TYPE");
        Pharmacie.Médi.type.setSelectedItem(Type);
        
        String CODE_Barres = res.getString("CODE_BARRES"); 
        Pharmacie.Médi.code_barres.setText(CODE_Barres);
        
        String Code = res.getString("CODE");
        Pharmacie.Médi.code.setText(Code);
        
        String Dose = res.getString("DOSE");
        Pharmacie.Médi.dose.setText(Dose);
        
        String cost_price = res.getString("PRIX_COUTANT"); 
        Pharmacie.Médi.cout_du_medicament.setText(cost_price);
        
        String PRIX_vente = res.getString("PRIX_VENTE"); 
        Pharmacie.Médi.prix_du_vente.setText(PRIX_vente);
        
        String NOM_Fournisseur = res.getString("NOM_FOURNISSEUR");
        Pharmacie.Médi.Nom_Fournisseur.setSelectedItem(NOM_Fournisseur);
        
        String Quantite = res.getString("QUANTITE"); 
        Pharmacie.Médi.Quantité.setSelectedItem(Quantite);
        
             String JOUR = res.getString("DATE_PRODUCTION").split("-")[0];
             Pharmacie.Médi.pro_Jour.setSelectedItem(JOUR);
             String Mois = res.getString("DATE_PRODUCTION").split("-")[1];
             Pharmacie.Médi.pro_Mois.setSelectedItem(Mois);
             String Annee = res.getString("DATE_PRODUCTION").split("-")[2];
             Pharmacie.Médi.pro_year.setSelectedItem(Annee);
             
              String ex_Jour = res.getString("DATE_EXPIRATION").split("-")[0];
             Pharmacie.Médi.exp_Jour.setSelectedItem(ex_Jour);
             String ex_Mois = res.getString("DATE_EXPIRATION").split("-")[1];
             Pharmacie.Médi.exp_Mois.setSelectedItem(ex_Mois);
             String ex_Annee = res.getString("DATE_EXPIRATION").split("-")[2];
             Pharmacie.Médi.exp_Année.setSelectedItem(ex_Annee);
        
             String sec = res.getString("PLACE").split("-")[0];
             Pharmacie.Médi.section.setSelectedItem(sec);
             String pla = res.getString("PLACE").split("-")[1];
             Pharmacie.Médi.place.setSelectedItem(pla);
    }
}catch(Exception e){
    JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
}

    }//GEN-LAST:event_Liste_MédicamentMouseClicked

    private void Trier_parItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Trier_parItemStateChanged
switch (Trier_par.getSelectedIndex()){ // un cas s’exécutera dans ces cas
    case 1 : {
     sql1 = "select NOM  , TYPE  ,CODE_BARRES ,PRIX_VENTE  , DATE_EXPIRATION  , NOM_FOURNISSEUR  from medicament order by NOM";
    Trier(1);  break;  //1- commande par nom de A - Z
    }
   case 2 : {
    sql2 = "select NOM  , TYPE  ,CODE_BARRES ,PRIX_VENTE  , DATE_EXPIRATION  , NOM_FOURNISSEUR  from medicament order by PRIX_VENTE DESC";
   Trier(2);break;  //2- ordre par Prix de A - Z
    }
    case 3 : {
    sql3 = "select NOM  , TYPE  ,CODE_BARRES ,PRIX_VENTE  , DATE_EXPIRATION  , NOM_FOURNISSEUR  from medicament order by DATE_EXPIRATION DESC";
   Trier(3); break; //3- ordre par expiration, donc le plus d’expiration sera le premier (médicament expiré)
   }  
}
    }//GEN-LAST:event_Trier_parItemStateChanged

    private void Trier_parActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Trier_parActionPerformed
        
    }//GEN-LAST:event_Trier_parActionPerformed

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
            java.util.logging.Logger.getLogger(Medicament_Liste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicament_Liste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicament_Liste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicament_Liste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medicament_Liste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Liste_Médicament;
    private javax.swing.JComboBox<String> Trier_par;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
private void Liste_Médicament(){ // cette méthode sera exécutée lorsque vous cliquerez sur liste_Medicament_
     String sql = sql3 = "select NOM  , TYPE  ,CODE_BARRES ,PRIX_VENTE  , DATE_EXPIRATION  , NOM_FOURNISSEUR  from medicament"; 
    try{
        pre=con.prepareStatement(sql); 
        res=pre.executeQuery(); 
        Liste_Médicament.setModel(DbUtils.resultSetToTableModel(res)); // définir des données dans la table
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
    }
}
private void Trier(int index){ // un cas s’exécutera dans ces cas 1 ou 2 ou 3 en fonction du numéro d’index;
    try{
   switch (index){
       case 1 : {
        pre=con.prepareStatement(sql1);
        res=pre.executeQuery();
        Liste_Médicament.setModel(DbUtils.resultSetToTableModel(res));   
      }break;
       case 2 : {
       pre=con.prepareStatement(sql2);
        res=pre.executeQuery();
        Liste_Médicament.setModel(DbUtils.resultSetToTableModel(res));    
       }break;
       case 3 : {
       pre=con.prepareStatement(sql3);
        res=pre.executeQuery();
        Liste_Médicament.setModel(DbUtils.resultSetToTableModel(res));    // définir des données dans la table
       }
    }    
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
    }}
}