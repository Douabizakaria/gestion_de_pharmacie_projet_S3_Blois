
package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Utilisateur extends javax.swing.JFrame {
Connection con = null;
PreparedStatement pre= null;
ResultSet res= null;
String t ;
    public Utilisateur() {
        initComponents();
        con=Connexion.connexion();
        Actualiser();
    }

   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Jour = new javax.swing.JComboBox<>();
        telephone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adresse = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        Nom_utilisateur = new javax.swing.JTextField();
        salaire = new javax.swing.JTextField();
        Mois = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Année = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Mot_de_passe = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        Supprimer_Utilisateur = new javax.swing.JButton();
        Ajouter_Utilisateur = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Modifier_utilisateur = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Utilisateurtableau = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulaire Utilisateur");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Formulaire Utilisateur");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jLabel1)
                .addContainerGap(475, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Utilisateur Détails", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Date de naissance : ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 113, -1, -1));

        Jour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jour :", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Jour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JourActionPerformed(evt);
            }
        });
        jPanel3.add(Jour, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 110, -1, -1));
        jPanel3.add(telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 243, 188, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Telephone : ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 246, -1, -1));

        adresse.setColumns(20);
        adresse.setRows(5);
        jScrollPane1.setViewportView(adresse);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 148, 188, 72));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nom_Utilisateur : ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 72, -1, -1));
        jPanel3.add(Nom_utilisateur, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 69, 188, -1));
        jPanel3.add(salaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 291, 188, -1));

        Mois.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mois :", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel3.add(Mois, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Adresse : ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 160, -1, -1));

        Année.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Année :", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "" }));
        jPanel3.add(Année, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Salaire : ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 294, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Mot de passe : ");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 341, -1, -1));
        jPanel3.add(Mot_de_passe, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 338, 188, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Id_Utilisateur : ");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 31, -1, -1));
        jPanel3.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 28, 188, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 370, 390));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 492, 380, 0));

        jPanel4.setBackground(new java.awt.Color(153, 255, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Supprimer_Utilisateur.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Supprimer_Utilisateur.setText("Supprimer");
        Supprimer_Utilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Supprimer_UtilisateurActionPerformed(evt);
            }
        });
        jPanel4.add(Supprimer_Utilisateur, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        Ajouter_Utilisateur.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Ajouter_Utilisateur.setText("Ajouter ");
        Ajouter_Utilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ajouter_UtilisateurActionPerformed(evt);
            }
        });
        jPanel4.add(Ajouter_Utilisateur, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Vider");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 100, -1));

        Modifier_utilisateur.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Modifier_utilisateur.setText("Mettre à jour");
        Modifier_utilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modifier_utilisateurActionPerformed(evt);
            }
        });
        jPanel4.add(Modifier_utilisateur, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("annuler");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 100, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 370, 80));

        jPanel5.setBackground(new java.awt.Color(153, 255, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Utilisateur_tableau", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        Utilisateurtableau.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Utilisateurtableau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "      Id", "      Nom", "date-naissance", "Adresse", "Telephone", "Salaire"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Utilisateurtableau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UtilisateurtableauMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Utilisateurtableau);
        if (Utilisateurtableau.getColumnModel().getColumnCount() > 0) {
            Utilisateurtableau.getColumnModel().getColumn(0).setResizable(false);
            Utilisateurtableau.getColumnModel().getColumn(1).setResizable(false);
            Utilisateurtableau.getColumnModel().getColumn(2).setMinWidth(100);
            Utilisateurtableau.getColumnModel().getColumn(2).setMaxWidth(100);
            Utilisateurtableau.getColumnModel().getColumn(3).setResizable(false);
            Utilisateurtableau.getColumnModel().getColumn(4).setResizable(false);
            Utilisateurtableau.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 91, 520, 500));
        jPanel5.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 937, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(929, 652));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
id.setText("");
Mot_de_passe.setText("");
Nom_utilisateur.setText("");
adresse.setText("");telephone.setText("");salaire.setText("");
Jour.setSelectedIndex(0);
Mois.setSelectedIndex(0);
Année.setSelectedIndex(0);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void Ajouter_UtilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ajouter_UtilisateurActionPerformed
if(id.getText().equals("")||Nom_utilisateur.getText().equals("")||Jour.getSelectedIndex()==0||
Mois.getSelectedIndex()==0||Année.getSelectedIndex()==0||adresse.getText().equals("")||
    telephone.getText().equals("")||Mot_de_passe.getText().equals("")||
        salaire.getText().equals("")){
  JOptionPane.showMessageDialog(null,"Complétez vos informations","Informations manquantes",2); 
}
else if(!checker_id()){
    if(Mot_de_passe.getText().length()<6){
  JOptionPane.showMessageDialog(null,"Le mot de passe de l’utilisateur doit comporter au moins 6 caractères","Mauvaise opération",2);
    }else {
 String sql = "insert into utilisateur (ID,NOM,DDN,ADRESSE,TELEPHONE,SALAIRE,MOT_DE_PASSE) values ('"+id.getText()+"','"+Nom_utilisateur.getText()+"' , '"+Jour.getSelectedItem()+"-"+Mois.getSelectedItem()+"-"+Année.getSelectedItem()+"' ,'"+adresse.getText()+"' ,'"+telephone.getText()+"' ,'"+salaire.getText()+"' ,'"+Mot_de_passe.getText()+"')";
try{
 pre=con.prepareStatement(sql);
 pre.execute();
 JOptionPane.showMessageDialog(null,"L’utilisateur a été ajouté avec succès","succès",1);Vider();
}catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
}Actualiser();}}
else {
    JOptionPane.showMessageDialog(null,"L’utilisateur est déjà inséré","Mauvaise opération",2);
}
    }//GEN-LAST:event_Ajouter_UtilisateurActionPerformed

    private void Supprimer_UtilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Supprimer_UtilisateurActionPerformed
if(id.getText().equals("")){
      JOptionPane.showMessageDialog(null,"Entrez l’ID que vous souhaitez supprimer","Informations manquantes",2);
}
else if(checker_id()){
String sql = "delete from utilisateur where ID='"+id.getText()+"' ";
try{
 int check = JOptionPane.showConfirmDialog(null,"Êtes-vous sûr de supprimer cet utilisateur ?"); 
 if(check==0){
 pre=con.prepareStatement(sql);
 pre.execute();
 JOptionPane.showMessageDialog(null,"L’utilisateur a été supprimé avec succès","succès",1);
}    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
}
Actualiser();}else {
      JOptionPane.showMessageDialog(null,"L’utilisateur est introuvable","Mauvaise opération",2);
}
    }//GEN-LAST:event_Supprimer_UtilisateurActionPerformed

    private void Modifier_utilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modifier_utilisateurActionPerformed
if(id.getText().equals("")||Nom_utilisateur.getText().equals("")||Jour.getSelectedIndex()==0||
Mois.getSelectedIndex()==0||Année.getSelectedIndex()==0||adresse.getText().equals("")||
    telephone.getText().equals("")||salaire.getText().equals("")){
  JOptionPane.showMessageDialog(null,"Complétez vos informations","Informations manquantes",2); 
}else {
  String sql = "update utilisateur set NOM='"+Nom_utilisateur.getText()+"' ,ADRESSE='"+adresse.getText()+"' ,TELEPHONE='"+telephone.getText()+"' ,SALAIRE='"+salaire.getText()+"' where ID='"+id.getText()+"' ";
try{
 pre=con.prepareStatement(sql);
 pre.execute();
 JOptionPane.showMessageDialog(null,"L’utilisateur a été ajouté avec succès","succès",1);
}catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
}Actualiser();}
    }//GEN-LAST:event_Modifier_utilisateurActionPerformed

    private void UtilisateurtableauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UtilisateurtableauMouseClicked
int row = Utilisateurtableau.getSelectedRow();
t = Utilisateurtableau.getModel().getValueAt(row,0).toString();
 String sql = "select * from utilisateur where ID='"+t+"' ";
try{
    pre=con.prepareStatement(sql);
    res=pre.executeQuery();
    if(res.next()){
        String Id = res.getString("ID");
        id.setText(Id);
        
         String Nom = res.getString("NOM"); 
         Nom_utilisateur.setText(Nom);
        
             String JR = res.getString("DDN").split("-")[0]; 
             Jour.setSelectedItem(JR);
             String Ms = res.getString("DDN").split("-")[1]; 
             Mois.setSelectedItem(Ms);
             String AN = res.getString("DDN").split("-")[2]; 
             Année.setSelectedItem(AN);
        
         String Adresse = res.getString("ADRESSE"); 
         adresse.setText(Adresse);
        
         String Telephone = res.getString("TELEPHONE"); 
         telephone.setText(Telephone);
        
         String Salary = res.getString("SALAIRE"); 
         salaire.setText(Salary);
         
         String mdp = res.getString("MOT_DE_PASSE"); 
         Mot_de_passe.setText(mdp);
         Mot_de_passe.setEchoChar('*');
    }
}catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
}
    }//GEN-LAST:event_UtilisateurtableauMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void JourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JourActionPerformed
    
    }//GEN-LAST:event_JourActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utilisateur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Ajouter_Utilisateur;
    public static javax.swing.JComboBox<String> Année;
    public static javax.swing.JComboBox<String> Jour;
    public javax.swing.JButton Modifier_utilisateur;
    public static javax.swing.JComboBox<String> Mois;
    private javax.swing.JPasswordField Mot_de_passe;
    private javax.swing.JTextField Nom_utilisateur;
    public javax.swing.JButton Supprimer_Utilisateur;
    private javax.swing.JTable Utilisateurtableau;
    private javax.swing.JTextArea adresse;
    public static javax.swing.JTextField id;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField salaire;
    private javax.swing.JTextField telephone;
    // End of variables declaration//GEN-END:variables

    private boolean checker_id(){
        boolean check =false;
        String sql = "select ID from utilisateur where ID='"+id.getText()+"' ";
        try{
            pre=con.prepareStatement(sql);
            res=pre.executeQuery();
            if(res.next()){
          check=true;
            }
        }catch(Exception e){
          JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
        }return check;
    }
  private void Actualiser(){
    String sql = "select ID ,NOM ,DDN ,ADRESSE ,TELEPHONE ,SALAIRE  from utilisateur";
      try{
 pre=con.prepareStatement(sql);
 res=pre.executeQuery();
 Utilisateurtableau.setModel(DbUtils.resultSetToTableModel(res));
 }catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
}
  }
private void Vider(){
    id.setText("");
    Nom_utilisateur.setText("");
    adresse.setText("");
    telephone.setText("");
    salaire.setText("");
    Mot_de_passe.setText("");
    Jour.setSelectedIndex(0);
    Mois.setSelectedIndex(0);
    Année.setSelectedIndex(0);
}
}