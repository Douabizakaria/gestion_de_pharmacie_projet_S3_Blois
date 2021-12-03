
package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Medicament extends javax.swing.JFrame {
Connection con = null;
PreparedStatement pre = null;
ResultSet res= null;
    public Medicament() {
        initComponents();
        con=Connexion.connexion();
        Fournisseur_liste();
    }

  
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nom_Médicament = new javax.swing.JTextField();
        dose = new javax.swing.JTextField();
        code = new javax.swing.JTextField();
        cout_du_medicament = new javax.swing.JTextField();
        prix_du_vente = new javax.swing.JTextField();
        Nom_Fournisseur = new javax.swing.JComboBox<>();
        pro_Jour = new javax.swing.JComboBox<>();
        pro_Mois = new javax.swing.JComboBox<>();
        pro_year = new javax.swing.JComboBox<>();
        exp_Jour = new javax.swing.JComboBox<>();
        exp_Mois = new javax.swing.JComboBox<>();
        exp_Année = new javax.swing.JComboBox<>();
        section = new javax.swing.JComboBox<>();
        place = new javax.swing.JComboBox<>();
        type = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        Quantité = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        code_barres = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        Modifier_Med = new javax.swing.JButton();
        liste_medicaments = new javax.swing.JButton();
        Annuler = new javax.swing.JButton();
        Supprimer_med = new javax.swing.JButton();
        ajouter_Med = new javax.swing.JButton();
        Vider = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulaire Médicaments");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 255, 102));

        jPanel2.setBackground(new java.awt.Color(0, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Formulaire Medicaments");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(223, 223, 223))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Les informations des Medicaments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Type Médicament : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nom Médicament: ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Date d'expiration : ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Prix coutant du médicament : ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Prix de vente du médicament :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Dose Médicament : ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Date de production : ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Place de Médicament : ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Nom_Fournisseur : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Code Médicament: ");

        Nom_Fournisseur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nom_Fournisseur :" }));
        Nom_Fournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nom_FournisseurActionPerformed(evt);
            }
        });

        pro_Jour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jour :", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        pro_Mois.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mois :", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        pro_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Année :", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));

        exp_Jour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jour :", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        exp_Mois.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mois :", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        exp_Année.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Année :", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));

        section.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Section :", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));

        place.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Place :", "en Haut", "en bas", "en droit", "en gauche" }));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Type_Medicament :", "Bills", "Injection", "Drink", "Fizzing" }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Quantité Médicament : ");

        Quantité.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quantité :", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Médicament code-barres   : ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cout_du_medicament, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(prix_du_vente, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel8))
                                            .addGap(42, 42, 42))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(63, 63, 63)))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dose, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(type, 0, 144, Short.MAX_VALUE)
                                            .addComponent(Nom_Médicament)
                                            .addComponent(code_barres)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Quantité, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pro_Jour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pro_Mois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pro_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(exp_Jour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exp_Mois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exp_Année, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Nom_Fournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(section, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(place, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Nom_Fournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(pro_Jour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pro_Mois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pro_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(23, 23, 23)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(dose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(exp_Jour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exp_Mois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exp_Année, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel11))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Nom_Médicament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(code_barres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(section, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(place, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cout_du_medicament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(Quantité, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(prix_du_vente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 255, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        Modifier_Med.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Modifier_Med.setText("Modifier_Med");
        Modifier_Med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modifier_MedActionPerformed(evt);
            }
        });

        liste_medicaments.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        liste_medicaments.setText("liste_Med");
        liste_medicaments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liste_medicamentsActionPerformed(evt);
            }
        });

        Annuler.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Annuler.setText("Annuler");
        Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnulerActionPerformed(evt);
            }
        });

        Supprimer_med.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Supprimer_med.setText("supprimer_Med");
        Supprimer_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Supprimer_medActionPerformed(evt);
            }
        });

        ajouter_Med.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ajouter_Med.setText("ajouter_Med");
        ajouter_Med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter_MedActionPerformed(evt);
            }
        });

        Vider.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Vider.setText("Vider");
        Vider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ajouter_Med)
                .addGap(18, 18, 18)
                .addComponent(Modifier_Med)
                .addGap(18, 18, 18)
                .addComponent(Supprimer_med)
                .addGap(18, 18, 18)
                .addComponent(liste_medicaments)
                .addGap(18, 18, 18)
                .addComponent(Vider, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouter_Med)
                    .addComponent(Modifier_Med)
                    .addComponent(Supprimer_med)
                    .addComponent(liste_medicaments)
                    .addComponent(Annuler)
                    .addComponent(Vider))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 8, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(825, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerActionPerformed
this.dispose();
    }//GEN-LAST:event_AnnulerActionPerformed

    private void ajouter_MedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter_MedActionPerformed
if(Quantité.getSelectedIndex()==0||code_barres.getText().equals("")||Nom_Médicament.getText().equals("")||type.getSelectedIndex()==0||dose.getText().equals("")||
code.getText().equals("")||cout_du_medicament.getText().equals("")||prix_du_vente.getText().equals("")
||Nom_Fournisseur.getSelectedIndex()==0||pro_Jour.getSelectedIndex()==0||
pro_Mois.getSelectedIndex()==0||pro_year.getSelectedIndex()==0||
exp_Jour.getSelectedIndex()==0||exp_Mois.getSelectedIndex()==0||
exp_Année.getSelectedIndex()==0||section.getSelectedIndex()==0||
place.getSelectedIndex()==0){
JOptionPane.showMessageDialog(null,"complètes les informations sur Médicament","information manquante",2);
}else if(Integer.parseInt(pro_year.getSelectedItem().toString())>
Integer.parseInt(exp_Année.getSelectedItem().toString())){
JOptionPane.showMessageDialog(null,"Vérifier la date de production et d’expiration","Informations erronées",2);
}
else  if(Integer.parseInt(pro_year.getSelectedItem().toString())==
Integer.parseInt(exp_Année.getSelectedItem().toString())){
 if(Integer.parseInt(pro_Mois.getSelectedItem().toString())>=
Integer.parseInt(exp_Mois.getSelectedItem().toString())){
JOptionPane.showMessageDialog(null,"Vérifier la date de production et d’expiration","Informations erronées",2); 
 }
}else 
{
if(!vérifier_nom_Médicament()){
   //   String sql = "insert into drugs (NAME,TYPE,BARCODE,DOSE,CODE,COST_PRICE,SELLING_PRICE,EXPIRY,COMPANY_NAME,PRODUCTION_DATE,EXPIRATION_DATE,PLACE,QUANTITY) values ('"+Nom_Médicament.getText()+"' , '"+type.getSelectedItem()+"' ,'"+code_barres.getText()+"' ,'"+dose.getText()+"' ,'"+code.getText()+"' ,'"+cout_du_medicament.getText()+"' ,'"+prix_du_vente.getText()+"' ,'Disponible pour util' ,'"+Nom_Fournisseur.getSelectedItem()+"' ,'"+pro_year.getSelectedItem()+"-"+pro_Mois.getSelectedItem()+"-"+pro_Jour.getSelectedItem()+"' ,'"+exp_Année.getSelectedItem()+"-"+exp_Mois.getSelectedItem()+"-"+exp_Jour.getSelectedItem()+"' ,'"+section.getSelectedItem()+"-"+place.getSelectedItem()+"','"+Quantité.getSelectedItem()+"' )";
   String sql = "insert into medicament (NOM,TYPE,CODE_BARRES,DOSE,CODE,PRIX_COUTANT,PRIX_VENTE,EXPIRATION,NOM_FOURNISSEUR,DATE_PRODUCTION,DATE_EXPIRATION,PLACE,QUANTITE) values ('"+Nom_Médicament.getText()+"' , '"+type.getSelectedItem()+"' ,'"+code_barres.getText()+"' ,'"+dose.getText()+"' ,'"+code.getText()+"' ,'"+cout_du_medicament.getText()+"' ,'"+prix_du_vente.getText()+"' ,'Disponible pour util' ,'"+Nom_Fournisseur.getSelectedItem()+"' ,'"+pro_year.getSelectedItem()+"-"+pro_Mois.getSelectedItem()+"-"+pro_Jour.getSelectedItem()+"' ,'"+exp_Année.getSelectedItem()+"-"+exp_Mois.getSelectedItem()+"-"+exp_Jour.getSelectedItem()+"' ,'"+section.getSelectedItem()+"-"+place.getSelectedItem()+"','"+Quantité.getSelectedItem()+"' )";
    int suring = JOptionPane.showConfirmDialog(null,"Êtes-vous sûr de ces informations \n\n Nom : "+Nom_Médicament.getText()+"\nDate_Production : "+pro_Jour.getSelectedItem()+"-"+pro_Mois.getSelectedItem()+"-"+pro_year.getSelectedItem()+"\nDate_Expiration : "+exp_Jour.getSelectedItem()+"-"+exp_Mois.getSelectedItem()+"-"+exp_Année.getSelectedItem());
    if(suring==0){
    try{
        pre=con.prepareStatement(sql);
        pre.execute();
        JOptionPane.showMessageDialog(null,"Le médicament a été ajouté avec succès"," Operation succès",1);
    }catch(Exception e){
   JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
    }Vider();}
}else {
  JOptionPane.showMessageDialog(null,"Ce médicament est déjà inséré","Operation échoue",2);
}   
}
    }//GEN-LAST:event_ajouter_MedActionPerformed

    private void Supprimer_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Supprimer_medActionPerformed
if(code_barres.getText().equals("")){
 JOptionPane.showMessageDialog(null,"Entrez nom_médicament vous souhaitez supprimer","information manquante",2);
}else {
    if(vérifier_nom_Médicament()){
       // String sql = "delete from drugs where BARCODE='"+code_barres.getText()+"' ";
        String sql = "delete from medicament where CODE_BARRES='"+code_barres.getText()+"' ";
        int suring = JOptionPane.showConfirmDialog(null,"Êtes-vous sûr de cette demande");
        if(suring==0){
        try{
        pre=con.prepareStatement(sql);
        pre.execute();
   JOptionPane.showMessageDialog(null,"Le médicament a été supprimé avec succès","Operation succès",1);
         }catch(Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
        }Vider();}
    }else {
   JOptionPane.showMessageDialog(null,"Ce médicament n’est pas inséré"," Operation échoue",2);
    }
}
    }//GEN-LAST:event_Supprimer_medActionPerformed

    private void Modifier_MedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modifier_MedActionPerformed
if(Quantité.getSelectedIndex()==0||code_barres.getText().equals("")||Nom_Médicament.getText().equals("")||type.getSelectedIndex()==0||dose.getText().equals("")||
code.getText().equals("")||cout_du_medicament.getText().equals("")||prix_du_vente.getText().equals("")
||Nom_Fournisseur.getSelectedIndex()==0||pro_Jour.getSelectedIndex()==0||
pro_Mois.getSelectedIndex()==0||pro_year.getSelectedIndex()==0||
exp_Jour.getSelectedIndex()==0||exp_Mois.getSelectedIndex()==0||
exp_Année.getSelectedIndex()==0||section.getSelectedIndex()==0||
place.getSelectedIndex()==0){
JOptionPane.showMessageDialog(null,"complètes les informations sur Médicament","information manquante",2);
}else {
   //  String sql = "update drugs set NAME='"+Nom_Médicament.getText()+"' , TYPE='"+type.getSelectedItem()+"',DOSE='"+dose.getText()+"' ,CODE='"+code.getText()+"' , COST_PRICE='"+cout_du_medicament.getText()+"' ,quantity='"+Quantité.getSelectedItem()+"',SELLING_PRICE='"+prix_du_vente.getText()+"', COMPANY_NAME='"+Nom_Fournisseur.getSelectedItem()+"',PLACE='"+section.getSelectedItem()+"-"+place.getSelectedItem()+"' where BARCODE='"+code_barres.getText()+"' ";
     String sql = "update medicament set NOM='"+Nom_Médicament.getText()+"' , TYPE='"+type.getSelectedItem()+"',DOSE='"+dose.getText()+"' ,CODE='"+code.getText()+"' , PRIX_COUTANT='"+cout_du_medicament.getText()+"' ,QUANTITE='"+Quantité.getSelectedItem()+"',PRIX_VENTE='"+prix_du_vente.getText()+"', NOM_FOURNISSEUR='"+Nom_Fournisseur.getSelectedItem()+"',PLACE='"+section.getSelectedItem()+"-"+place.getSelectedItem()+"' where CODE_BARRES='"+code_barres.getText()+"' ";
    try{
        pre=con.prepareStatement(sql);
        pre.execute();
        JOptionPane.showMessageDialog(null,"Le médicament a été mis à jour avec succès","Operation succès",1);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
    }Vider();
}
    }//GEN-LAST:event_Modifier_MedActionPerformed

    private void ViderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViderActionPerformed
Vider();
    }//GEN-LAST:event_ViderActionPerformed

    private void liste_medicamentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liste_medicamentsActionPerformed
new Medicament_Liste().setVisible(true);
    }//GEN-LAST:event_liste_medicamentsActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
       
    }//GEN-LAST:event_typeActionPerformed

    private void Nom_FournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nom_FournisseurActionPerformed
        
    }//GEN-LAST:event_Nom_FournisseurActionPerformed

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
            java.util.logging.Logger.getLogger(Medicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medicament().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Annuler;
    public javax.swing.JButton Modifier_Med;
    public javax.swing.JComboBox<String> Nom_Fournisseur;
    public javax.swing.JTextField Nom_Médicament;
    public javax.swing.JComboBox<String> Quantité;
    public javax.swing.JButton Supprimer_med;
    private javax.swing.JButton Vider;
    public javax.swing.JButton ajouter_Med;
    public javax.swing.JTextField code;
    public javax.swing.JTextField code_barres;
    public javax.swing.JTextField cout_du_medicament;
    public javax.swing.JTextField dose;
    public javax.swing.JComboBox<String> exp_Année;
    public javax.swing.JComboBox<String> exp_Jour;
    public javax.swing.JComboBox<String> exp_Mois;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton liste_medicaments;
    public javax.swing.JComboBox<String> place;
    public javax.swing.JTextField prix_du_vente;
    public javax.swing.JComboBox<String> pro_Jour;
    public javax.swing.JComboBox<String> pro_Mois;
    public javax.swing.JComboBox<String> pro_year;
    public javax.swing.JComboBox<String> section;
    public javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables

    private boolean vérifier_nom_Médicament(){
        boolean found = false;
      //  String sql = "select BARCODE from drugs where BARCODE='"+code_barres.getText()+"' ";
         String sql = "select CODE_BARRES from medicament where CODE_BARRES='"+code_barres.getText()+"' ";
        try{
         pre=con.prepareStatement(sql);
         res=pre.executeQuery();
         if(res.next()){
             found=true;
         }
        }catch(Exception e){
      JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
        }return found;
    }
    private void Fournisseur_liste(){
     //   String sql = "select NAME from company";
           String sql = "select NOM from fournisseur";
        try{
            pre=con.prepareStatement(sql);
            res=pre.executeQuery();
            while(res.next()){
                Nom_Fournisseur.addItem(res.getString("NOM")); // NOM
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
        }
    }
private void Vider(){
Nom_Médicament.setText("");
dose.setText("");
code.setText("");
cout_du_medicament.setText("");
prix_du_vente.setText("");
type.setSelectedIndex(0);
section.setSelectedIndex(0);
place.setSelectedIndex(0);
pro_Jour.setSelectedIndex(0);
pro_Mois.setSelectedIndex(0);
pro_year.setSelectedIndex(0);
exp_Jour.setSelectedIndex(0);
exp_Mois.setSelectedIndex(0);
exp_Année.setSelectedIndex(0);
Quantité.setSelectedIndex(0);
code_barres.setText("");
Nom_Fournisseur.setSelectedIndex(0);
   }
  
}
