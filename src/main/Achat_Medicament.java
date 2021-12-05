
package main;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Achat_Medicament extends javax.swing.JFrame {
Connection con = null;
PreparedStatement pre = null;
ResultSet res= null;
    public Achat_Medicament() {
        initComponents();
        con=Connexion.connexion();
        Fournisseur();
    }

    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Montant = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        type_med = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Nom_fournisseur = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        Code_barres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Quantité = new javax.swing.JComboBox<>();
        Nom_medicament = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Prix_cout = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        passer_un_marcher = new javax.swing.JButton();
        Annuler = new javax.swing.JButton();
        mettre_a_jour = new javax.swing.JButton();
        vider = new javax.swing.JButton();
        supprimer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Achat_Médicaments");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 255, 102));

        jPanel2.setBackground(new java.awt.Color(0, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Formulaire d'achat de médicaments");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vente_Medicaments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nom_Medicament : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Médicam_Code-barres : ");

        type_med.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Type_Medicament :", "gelule", "sirop", "comprimé", "pommade" }));
        type_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_medActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Nom_Fournisseur : ");

        Nom_fournisseur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nom_Fournisseur :" }));
        Nom_fournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nom_fournisseurActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Quantité : ");

        Code_barres.setToolTipText("Enter Barcode and Press Enter for Updating");
        Code_barres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Code_barresActionPerformed(evt);
            }
        });
        Code_barres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Code_barresKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Type_Medicament : ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Prix_Couteux : ");

        Quantité.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quantité :", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Montant : ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Nom_medicament)
                    .addComponent(Code_barres)
                    .addComponent(type_med, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nom_fournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Prix_cout)
                    .addComponent(Quantité, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Montant, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Code_barres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Nom_medicament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(Montant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(type_med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Nom_fournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Quantité, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Prix_cout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(153, 255, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        passer_un_marcher.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passer_un_marcher.setText("Passer un marché");
        passer_un_marcher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passer_un_marcherActionPerformed(evt);
            }
        });

        Annuler.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Annuler.setText("Annuler");
        Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnulerActionPerformed(evt);
            }
        });

        mettre_a_jour.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mettre_a_jour.setText("Mettre à jour");
        mettre_a_jour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mettre_a_jourActionPerformed(evt);
            }
        });

        vider.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vider.setText("vider");
        vider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viderActionPerformed(evt);
            }
        });

        supprimer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        supprimer.setText("Supprimer");
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(passer_un_marcher, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mettre_a_jour, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vider, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passer_un_marcher)
                    .addComponent(Annuler)
                    .addComponent(mettre_a_jour)
                    .addComponent(vider)
                    .addComponent(supprimer))
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
                    .addComponent(jSeparator1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.getAccessibleContext().setAccessibleName("vente_Medicaments");

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

        setSize(new java.awt.Dimension(748, 411));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerActionPerformed
this.dispose();
    }//GEN-LAST:event_AnnulerActionPerformed

    private void passer_un_marcherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passer_un_marcherActionPerformed
if(Code_barres.getText().equals("")||Prix_cout.getText().equals("")||Montant.getText().equals("")||
Nom_medicament.getText().equals("")||Quantité.getSelectedIndex()==0||
Nom_fournisseur.getSelectedIndex()==0||type_med.getSelectedIndex()==0){
    JOptionPane.showMessageDialog(null,"Complétez vos informations","Error",2);
}else {
    if(checker()){
       JOptionPane.showMessageDialog(null,"Ce médicament a été inséré avant","Échec de l’opération",2);
    }else {
     
    String sql =   "insert into achat (CODE_BARRES,NOM,TYPE,NOM_FOURNISSEUR,QUANTITE,PRIX,MONTANT) values ('"+Code_barres.getText()+"' ,'"+Nom_medicament.getText()+"' ,'"+type_med.getSelectedItem()+"' ,'"+Nom_fournisseur.getSelectedItem()+"' ,'"+Quantité.getSelectedItem()+"' ,'"+Prix_cout.getText()+"' ,'"+Montant.getText()+"' )";
        try {
            pre=con.prepareStatement(sql);
            pre.execute();
            int confirm=JOptionPane.showConfirmDialog(null,"Un accord a été conclu\n\nAjouter ce médicament ?"," Operation succès",1);
            Medicament d ;
            if(confirm==0){
             this.dispose();   
             d=new Medicament();
             d.setVisible(true);
             d.code_barres.setText(Code_barres.getText());
             d.Nom_Médicament.setText(Nom_medicament.getText());
             d.type.setSelectedItem(type_med.getSelectedItem());
             d.Nom_Fournisseur.setSelectedItem(Nom_fournisseur.getSelectedItem());
             d.Quantité.setSelectedItem(Quantité.getSelectedItem());
             d.cout_du_medicament.setText(Prix_cout.getText());
          }
        } catch (Exception e) {
  JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
        }}
}
    }//GEN-LAST:event_passer_un_marcherActionPerformed

    private void mettre_a_jourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mettre_a_jourActionPerformed
if(Code_barres.getText().equals("")||Prix_cout.getText().equals("")||Montant.getText().equals("")||
Nom_medicament.getText().equals("")||Quantité.getSelectedIndex()==0||
Nom_fournisseur.getSelectedIndex()==0||type_med.getSelectedIndex()==0){
    JOptionPane.showMessageDialog(null,"Complete Your Information","Error",2);
}else {
    
   String sql = "update achat set NOM='"+Nom_medicament.getText()+"', TYPE='"+type_med.getSelectedItem()+"' , NOM_FOURNISSEUR='"+Nom_fournisseur.getSelectedItem()+"' ,QUANTITE='"+Quantité.getSelectedItem()+"' ,PRIX='"+Prix_cout.getText()+"',MONTANT='"+Montant.getText()+"' ";
    try {
        pre=con.prepareStatement(sql);
        pre.execute();
JOptionPane.showMessageDialog(null,"L’accord a été mis à jour avec succès","Operation succès",1);
    Vider();} catch (Exception e) {
   JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
    }
}
    }//GEN-LAST:event_mettre_a_jourActionPerformed

    private void Code_barresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Code_barresKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
       
        String sql = "select * from achat where CODE_BARRES='"+Code_barres.getText()+"' " ;
        try{
    pre=con.prepareStatement(sql);
    res=pre.executeQuery();
    if(res.next()){
        String Name = res.getString("NOM");
        Nom_medicament.setText(Name);
        
        String Type = res.getString("TYPE");
        type_med.setSelectedItem(Type);
        
        String C_name = res.getString("NOM_FOURNISSEUR");
        Nom_fournisseur.setSelectedItem(C_name);
        
        String Price = res.getString("PRIX");
        Prix_cout.setText(Price);
        
        String Quantity = res.getString("QUANTITE");
        Quantité.setSelectedItem(Quantity);
        
        String Amount = res.getString("MONTANT");
        Montant.setText(Amount);
    }else {
    JOptionPane.showMessageDialog(null,"Ce médicament n’existait pas avant","Error",2);
    }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
        }
        }    
    }//GEN-LAST:event_Code_barresKeyPressed

    private void viderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viderActionPerformed
Vider();
    }//GEN-LAST:event_viderActionPerformed

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
if(Code_barres.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Complétez vos informations");
}else {
  //  
     String sql = "delete from achat where CODE_BARRES='"+Code_barres.getText()+"' ";
    int delete = JOptionPane.showConfirmDialog(null,"Confirmez votre demande");
    if(delete==0){
    try{
        pre=con.prepareStatement(sql);
        pre.execute();
        JOptionPane.showMessageDialog(null,"L’achat a été supprimé avec succès","Operation succès",1);
        Vider();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
}}  
    }//GEN-LAST:event_supprimerActionPerformed

    private void Nom_fournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nom_fournisseurActionPerformed
      
    }//GEN-LAST:event_Nom_fournisseurActionPerformed

    private void Code_barresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Code_barresActionPerformed

    }//GEN-LAST:event_Code_barresActionPerformed

    private void type_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_medActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_type_medActionPerformed

    /**
     * @param args 
     */
    public static void main(String args[]) {
       

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Achat_Medicament().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Annuler;
    private javax.swing.JTextField Code_barres;
    private javax.swing.JTextField Montant;
    public javax.swing.JComboBox<String> Nom_fournisseur;
    private javax.swing.JTextField Nom_medicament;
    private javax.swing.JTextField Prix_cout;
    public javax.swing.JComboBox<String> Quantité;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JButton mettre_a_jour;
    public javax.swing.JButton passer_un_marcher;
    public javax.swing.JButton supprimer;
    public javax.swing.JComboBox<String> type_med;
    private javax.swing.JButton vider;
    // End of variables declaration//GEN-END:variables
    private boolean checker(){
        boolean found = false;
      
       
        String sql = "select CODE_BARRES from achat where CODE_BARRES='"+Code_barres.getText()+"' ";
        try{
        pre=con.prepareStatement(sql);
        res=pre.executeQuery();
        if(res.next()){
            found=true;
        }    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
        }
    return found;
    }
    private void Fournisseur(){
       
        String sql = "select NOM from fournisseur";
        try{
            pre=con.prepareStatement(sql);
            res=pre.executeQuery();
            while(res.next()){
                Nom_fournisseur.addItem(res.getString("NOM")); 
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
        }
    }
    private void Vider(){
        Code_barres.setText("");
        Prix_cout.setText("");
        Montant.setText("");
        Nom_medicament.setText("");
        Quantité.setSelectedIndex(0);
        Nom_fournisseur.setSelectedIndex(0);
        type_med.setSelectedIndex(0);
    }
}