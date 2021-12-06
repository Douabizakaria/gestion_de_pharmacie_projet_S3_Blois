package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.Toolkit;
import javax.swing.ImageIcon; // outil pour importer image 

public class Pharmacie extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pre= null;
    ResultSet res = null;
    static int ex;
    Utilisateur Utilisateur_ ;
    Fournisseur Fourni;
    static Medicament Médi ;
    static Deplacer_Medicament Déplacer_Médicament;
    Achat_Medicament Achat;
    Date d;
    SimpleDateFormat dd;
    static String à;
    static String de ;
    static String texte ;
    static String barre_presque_expirée ;
    static String barre_expirée ;
    
    
    public Pharmacie() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(Pharmacie.class.getResource("/img/Untitled.png")));
        initComponents();
        con=Connexion.connexion();
        Afficher_Date();
        buttonvis();
        Utilisateur_ = new Utilisateur();
        Médi = new Medicament();
        Fourni = new Fournisseur();
        Déplacer_Médicament = new Deplacer_Medicament();
        Achat = new Achat_Medicament();
        Authentification();
        Alerte();
        Auth();
        alert_message();
    }
    
  
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        Today = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Nom_utilisateur = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Nom_utilisateur1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        msgAlerte = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        afficher_message = new javax.swing.JButton();
        annuler = new javax.swing.JButton();
        Utilisateur = new javax.swing.JButton();
        Medicament = new javax.swing.JButton();
        Ajouter_Utilisateur = new javax.swing.JButton();
        Supprimer_Utilisateur = new javax.swing.JButton();
        modifier_Utilisateur = new javax.swing.JButton();
        ajouter_Medicament = new javax.swing.JButton();
        supprimer_Medicament = new javax.swing.JButton();
        Modifier_Medicament = new javax.swing.JButton();
        chercher_Medicament = new javax.swing.JButton();
        Détails_Medicament = new javax.swing.JButton();
        Ajoute = new javax.swing.JButton();
        Résilier = new javax.swing.JButton();
        Modifier = new javax.swing.JButton();
        liste_Medicament = new javax.swing.JButton();
        Paramètres = new javax.swing.JButton();
        Info_Auth = new javax.swing.JButton();
        Modifier_MDP = new javax.swing.JButton();
        Fournisseur = new javax.swing.JButton();
        Editer_Prix = new javax.swing.JButton();
        Achats = new javax.swing.JButton();
        Renouveler_validité = new javax.swing.JButton();
        Acheter_med = new javax.swing.JButton();
        modifier_offre = new javax.swing.JButton();
        listedesAchats = new javax.swing.JButton();
        Ventes = new javax.swing.JButton();
        Factures = new javax.swing.JButton();
        Déconnexion = new javax.swing.JButton();
        vente_equipe = new javax.swing.JButton();
        checker_place = new javax.swing.JButton();
        Liste_Médicament = new javax.swing.JButton();
        Déplacer_Medicament = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Medicaments_expirés = new javax.swing.JButton();
        presque_finis = new javax.swing.JButton();
        med_recup = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de Pharmacie");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Gestion de Pharmacie");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Heure:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Aujourd'hui");

        Time.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Time.setForeground(new java.awt.Color(0, 0, 102));
        Time.setText("00:00:00");

        Today.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Today.setForeground(new java.awt.Color(153, 0, 0));
        Today.setText("00-00-0000");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Apps-session-logout-icon.png"))); // NOI18N
        jButton1.setToolTipText("Logout");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Nom_utilisateur.setBackground(new java.awt.Color(255, 255, 255));
        Nom_utilisateur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Nom_utilisateur.setForeground(new java.awt.Color(153, 0, 0));
        Nom_utilisateur.setText("Login As : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Connecté en tant: ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Nom_utilisateur : ");

        Nom_utilisateur1.setBackground(new java.awt.Color(255, 255, 255));
        Nom_utilisateur1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Nom_utilisateur1.setForeground(new java.awt.Color(0, 0, 102));
        Nom_utilisateur1.setText("Login As : ");

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/2572420.postal.envelope.icon.dark.blue.isolated.on.black.background (1).jpg"))); // NOI18N
        jButton2.setToolTipText("Public Inbox");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("(Administration)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nom_utilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nom_utilisateur1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(95, 95, 95)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3))
                    .addComponent(Today, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Nom_utilisateur))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Nom_utilisateur1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23)
                        .addComponent(Time))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23)
                        .addComponent(Today))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(8, 8, 8))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1220, 80);

        msgAlerte.setBackground(new java.awt.Color(0, 255, 0));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Vous avez de nouveaux messages");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        afficher_message.setText("afficher message");
        afficher_message.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afficher_messageActionPerformed(evt);
            }
        });

        annuler.setText("annuler");

        javax.swing.GroupLayout msgAlerteLayout = new javax.swing.GroupLayout(msgAlerte);
        msgAlerte.setLayout(msgAlerteLayout);
        msgAlerteLayout.setHorizontalGroup(
            msgAlerteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(msgAlerteLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(afficher_message)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        msgAlerteLayout.setVerticalGroup(
            msgAlerteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, msgAlerteLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(msgAlerteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(afficher_message)
                    .addComponent(annuler))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(msgAlerte);
        msgAlerte.setBounds(380, 300, 430, 110);

        Utilisateur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Utilisateur.setForeground(new java.awt.Color(0, 51, 51));
        Utilisateur.setText("Utilisateur");
        Utilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UtilisateurActionPerformed(evt);
            }
        });
        jPanel1.add(Utilisateur);
        Utilisateur.setBounds(1030, 100, 170, 34);

        Medicament.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Medicament.setForeground(new java.awt.Color(0, 51, 51));
        Medicament.setText("Medicament");
        Medicament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicamentActionPerformed(evt);
            }
        });
        jPanel1.add(Medicament);
        Medicament.setBounds(860, 100, 150, 34);

        Ajouter_Utilisateur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Ajouter_Utilisateur.setText("Ajouter Utilisateur");
        Ajouter_Utilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ajouter_UtilisateurActionPerformed(evt);
            }
        });
        jPanel1.add(Ajouter_Utilisateur);
        Ajouter_Utilisateur.setBounds(1030, 150, 170, 23);

        Supprimer_Utilisateur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Supprimer_Utilisateur.setText("Supprimer Utilisateur");
        Supprimer_Utilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Supprimer_UtilisateurActionPerformed(evt);
            }
        });
        jPanel1.add(Supprimer_Utilisateur);
        Supprimer_Utilisateur.setBounds(1030, 190, 170, 23);

        modifier_Utilisateur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        modifier_Utilisateur.setText("modifier Utilisateur");
        modifier_Utilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifier_UtilisateurActionPerformed(evt);
            }
        });
        jPanel1.add(modifier_Utilisateur);
        modifier_Utilisateur.setBounds(1030, 230, 170, 23);

        ajouter_Medicament.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ajouter_Medicament.setText("ajouter Medicament");
        ajouter_Medicament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter_MedicamentActionPerformed(evt);
            }
        });
        jPanel1.add(ajouter_Medicament);
        ajouter_Medicament.setBounds(860, 150, 150, 23);

        supprimer_Medicament.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        supprimer_Medicament.setText("supprimer Medicament");
        supprimer_Medicament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimer_MedicamentActionPerformed(evt);
            }
        });
        jPanel1.add(supprimer_Medicament);
        supprimer_Medicament.setBounds(860, 190, 150, 23);

        Modifier_Medicament.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Modifier_Medicament.setText("Modifier Medicament");
        Modifier_Medicament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modifier_MedicamentActionPerformed(evt);
            }
        });
        jPanel1.add(Modifier_Medicament);
        Modifier_Medicament.setBounds(860, 230, 150, 23);

        chercher_Medicament.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chercher_Medicament.setText("chercher Medicament");
        chercher_Medicament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chercher_MedicamentActionPerformed(evt);
            }
        });
        jPanel1.add(chercher_Medicament);
        chercher_Medicament.setBounds(860, 270, 150, 23);

        Détails_Medicament.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Détails_Medicament.setForeground(new java.awt.Color(0, 51, 51));
        Détails_Medicament.setText("Details Medicament");
        Détails_Medicament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Détails_MedicamentActionPerformed(evt);
            }
        });
        jPanel1.add(Détails_Medicament);
        Détails_Medicament.setBounds(670, 100, 150, 34);

        Ajoute.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Ajoute.setText("Ajouter Fournisseur ");
        Ajoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouteActionPerformed(evt);
            }
        });
        jPanel1.add(Ajoute);
        Ajoute.setBounds(176, 154, 130, 23);

        Résilier.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Résilier.setText("Résilier contrat");
        Résilier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RésilierActionPerformed(evt);
            }
        });
        jPanel1.add(Résilier);
        Résilier.setBounds(176, 195, 130, 23);

        Modifier.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Modifier.setText("Modifier");
        Modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierActionPerformed(evt);
            }
        });
        jPanel1.add(Modifier);
        Modifier.setBounds(177, 236, 130, 23);

        liste_Medicament.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        liste_Medicament.setText("liste Medicament");
        liste_Medicament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liste_MedicamentActionPerformed(evt);
            }
        });
        jPanel1.add(liste_Medicament);
        liste_Medicament.setBounds(860, 350, 150, 23);

        Paramètres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Paramètres.setForeground(new java.awt.Color(0, 51, 51));
        Paramètres.setText("Paramètres");
        Paramètres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParamètresActionPerformed(evt);
            }
        });
        jPanel1.add(Paramètres);
        Paramètres.setBounds(10, 102, 141, 34);

        Info_Auth.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Info_Auth.setText("Info Auth");
        Info_Auth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Info_AuthActionPerformed(evt);
            }
        });
        jPanel1.add(Info_Auth);
        Info_Auth.setBounds(10, 154, 141, 23);

        Modifier_MDP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Modifier_MDP.setText("Modifier MDP");
        Modifier_MDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modifier_MDPActionPerformed(evt);
            }
        });
        jPanel1.add(Modifier_MDP);
        Modifier_MDP.setBounds(10, 195, 140, 23);

        Fournisseur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Fournisseur.setForeground(new java.awt.Color(0, 51, 51));
        Fournisseur.setText("Fournisseur ");
        Fournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FournisseurActionPerformed(evt);
            }
        });
        jPanel1.add(Fournisseur);
        Fournisseur.setBounds(176, 102, 130, 34);

        Editer_Prix.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Editer_Prix.setText("Editer Prix");
        Editer_Prix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editer_PrixActionPerformed(evt);
            }
        });
        jPanel1.add(Editer_Prix);
        Editer_Prix.setBounds(670, 190, 150, 23);

        Achats.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Achats.setForeground(new java.awt.Color(0, 51, 51));
        Achats.setText("Achats");
        Achats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AchatsActionPerformed(evt);
            }
        });
        jPanel1.add(Achats);
        Achats.setBounds(520, 100, 130, 34);

        Renouveler_validité.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Renouveler_validité.setText("Renouveler validité");
        Renouveler_validité.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Renouveler_validitéActionPerformed(evt);
            }
        });
        jPanel1.add(Renouveler_validité);
        Renouveler_validité.setBounds(670, 270, 150, 23);

        Acheter_med.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Acheter_med.setText("acheter Medicament");
        Acheter_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Acheter_medActionPerformed(evt);
            }
        });
        jPanel1.add(Acheter_med);
        Acheter_med.setBounds(520, 150, 130, 23);

        modifier_offre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        modifier_offre.setText("Update les offres");
        modifier_offre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifier_offreActionPerformed(evt);
            }
        });
        jPanel1.add(modifier_offre);
        modifier_offre.setBounds(520, 190, 130, 23);

        listedesAchats.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        listedesAchats.setText("Toutes les offres");
        listedesAchats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listedesAchatsActionPerformed(evt);
            }
        });
        jPanel1.add(listedesAchats);
        listedesAchats.setBounds(520, 230, 130, 23);

        Ventes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Ventes.setForeground(new java.awt.Color(0, 51, 51));
        Ventes.setText("Ventes");
        Ventes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentesActionPerformed(evt);
            }
        });
        jPanel1.add(Ventes);
        Ventes.setBounds(338, 102, 150, 34);

        Factures.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Factures.setText("Factures ventes");
        Factures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturesActionPerformed(evt);
            }
        });
        jPanel1.add(Factures);
        Factures.setBounds(338, 154, 150, 23);

        Déconnexion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Déconnexion.setText("Déconnexion");
        Déconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DéconnexionActionPerformed(evt);
            }
        });
        jPanel1.add(Déconnexion);
        Déconnexion.setBounds(10, 236, 141, 23);

        vente_equipe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vente_equipe.setText("vente d'équipe");
        vente_equipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vente_equipeActionPerformed(evt);
            }
        });
        jPanel1.add(vente_equipe);
        vente_equipe.setBounds(338, 195, 150, 23);

        checker_place.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checker_place.setText("Checker Places");
        checker_place.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checker_placeActionPerformed(evt);
            }
        });
        jPanel1.add(checker_place);
        checker_place.setBounds(670, 150, 150, 23);

        Liste_Médicament.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Liste_Médicament.setText("Drugs_List");
        Liste_Médicament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Liste_MédicamentActionPerformed(evt);
            }
        });
        jPanel1.add(Liste_Médicament);
        Liste_Médicament.setBounds(0, 0, 93, 23);

        Déplacer_Medicament.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Déplacer_Medicament.setText("déplacer Medicament");
        Déplacer_Medicament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Déplacer_MedicamentActionPerformed(evt);
            }
        });
        jPanel1.add(Déplacer_Medicament);
        Déplacer_Medicament.setBounds(860, 310, 150, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/kisspng-esquire-it-world-askib-engineers-pvt-ltd-email-s-contact-us-5b19a0b56f9d21.6410621415284061974572.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 450, 90, 80);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(90, 490, 390, 0);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("+33XXXXXXXXXX");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(80, 460, 390, 29);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Blois");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(110, 550, 380, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Location : ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 550, 94, 22);

        Medicaments_expirés.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Medicaments_expirés.setText("Medicaments expirés");
        Medicaments_expirés.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Medicaments_expirésActionPerformed(evt);
            }
        });
        jPanel1.add(Medicaments_expirés);
        Medicaments_expirés.setBounds(670, 230, 150, 23);

        presque_finis.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        presque_finis.setText("presque finis");
        presque_finis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presque_finisActionPerformed(evt);
            }
        });
        jPanel1.add(presque_finis);
        presque_finis.setBounds(670, 310, 150, 23);

        med_recup.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        med_recup.setText("Médicament de récupération   ");
        med_recup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                med_recupActionPerformed(evt);
            }
        });
        jPanel1.add(med_recup);
        med_recup.setBounds(338, 235, 150, 23);

        jLabel13.setBackground(new java.awt.Color(0, 255, 102));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/1621379.jpg"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(-2050, 20, 3320, 1060);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1215, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1231, 646));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void Déplacer_MedicamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Déplacer_MedicamentActionPerformed
        new Deplacer_Medicament().setVisible(true);
    }//GEN-LAST:event_Déplacer_MedicamentActionPerformed
    
    private void Liste_MédicamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Liste_MédicamentActionPerformed
        new Médicament_Liste().setVisible(true);
    }//GEN-LAST:event_Liste_MédicamentActionPerformed
    
    private void checker_placeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checker_placeActionPerformed
        new Deplacer_Medicament().setVisible(true);
    }//GEN-LAST:event_checker_placeActionPerformed
    
    private void DéconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DéconnexionActionPerformed
        this.dispose();
        new Authentification().setVisible(true);
    }//GEN-LAST:event_DéconnexionActionPerformed
    
    private void VentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentesActionPerformed
        Ventes();
    }//GEN-LAST:event_VentesActionPerformed
    
    private void AchatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AchatsActionPerformed
        if(!Nom_utilisateur.getText().equals("Employee")){
            Saisir_achat();
        }else {
            String pass = JOptionPane.showInputDialog("Vous n’êtes pas autorisé à vérifier l’inforamtion de l’utilisateur\nPour entrer, veuillez confirmer le mot de passe administrateur");
              String sql = "select NOM,MOT_DE_PASSE from utilisateur where NOM='admin' ";
            
            if (!pass.equals("")) {
                
                try{
                    pre=con.prepareStatement(sql);
                    res=pre.executeQuery();
                    if(res.next()){
                        if(res.getString("MOT_DE_PASSE").equals(pass)){
                            Saisir_achat();
                        }else if(pass.isEmpty()){
                            JOptionPane.showMessageDialog(null,"Vous devez écrire le mot de passe administrateur","Échec de l’accès",2);
                        }else {
                            JOptionPane.showMessageDialog(null,"Mot de passe erroné","Échec de l’accès",2);
                        }}
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
                }
            } else {
                JOptionPane.showMessageDialog(null,"Vous devez écrire le mot de passe administrateur","Échec de l’accès",2);
                
            }
            
        }
    }//GEN-LAST:event_AchatsActionPerformed
    
    private void Editer_PrixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editer_PrixActionPerformed
        new Editer_Prix().setVisible(true);
    }//GEN-LAST:event_Editer_PrixActionPerformed
    
    private void FournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FournisseurActionPerformed
        Fournisseur();
    }//GEN-LAST:event_FournisseurActionPerformed
    
    private void Modifier_MDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modifier_MDPActionPerformed
        new Changer_Motdepasse().setVisible(true);
    }//GEN-LAST:event_Modifier_MDPActionPerformed
    
    private void ParamètresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParamètresActionPerformed
        Paramètre();
    }//GEN-LAST:event_ParamètresActionPerformed
    
    private void liste_MedicamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liste_MedicamentActionPerformed
        new Médicament_Liste().setVisible(true);
    }//GEN-LAST:event_liste_MedicamentActionPerformed
    
    private void ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierActionPerformed
        Fourni.setVisible(true);
        Fourni.sauvgarder.setEnabled(false);
        Fourni.mettre_a_jour.setEnabled(true);
        Fourni.Supprimer.setEnabled(false);
    }//GEN-LAST:event_ModifierActionPerformed
    
    private void RésilierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RésilierActionPerformed
        Fourni.setVisible(true);
        Fourni.sauvgarder.setEnabled(false);
        Fourni.mettre_a_jour.setEnabled(false);
        Fourni.Supprimer.setEnabled(true);
    }//GEN-LAST:event_RésilierActionPerformed
    
    private void AjouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouteActionPerformed
        Fourni.setVisible(true);
        Fourni.sauvgarder.setEnabled(true);
        Fourni.mettre_a_jour.setEnabled(false);
        Fourni.Supprimer.setEnabled(false);
    }//GEN-LAST:event_AjouteActionPerformed
    
    private void Détails_MedicamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Détails_MedicamentActionPerformed
        EntrerMédicament_détails();
    }//GEN-LAST:event_Détails_MedicamentActionPerformed
    
    private void chercher_MedicamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chercher_MedicamentActionPerformed
        new Chercher_Medicament().setVisible(true);
    }//GEN-LAST:event_chercher_MedicamentActionPerformed
    
    private void Modifier_MedicamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modifier_MedicamentActionPerformed
        Médi.setVisible(true);
        Médi.ajouter_Med.setEnabled(false);
        Médi.Supprimer_med.setEnabled(false);
        Médi.Modifier_Med.setEnabled(true);
    }//GEN-LAST:event_Modifier_MedicamentActionPerformed
    
    private void supprimer_MedicamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimer_MedicamentActionPerformed
        Médi.setVisible(true);
        Médi.Modifier_Med.setEnabled(false);
        Médi.ajouter_Med.setEnabled(false);
        Médi.Supprimer_med.setEnabled(true);
    }//GEN-LAST:event_supprimer_MedicamentActionPerformed
    
    private void ajouter_MedicamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter_MedicamentActionPerformed
        Médi.setVisible(true);
        Médi.Modifier_Med.setEnabled(false);
        Médi.Supprimer_med.setEnabled(false);
        Médi.ajouter_Med.setEnabled(true);
    }//GEN-LAST:event_ajouter_MedicamentActionPerformed
    
    private void modifier_UtilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifier_UtilisateurActionPerformed
        Utilisateur_.setVisible(true);
        Utilisateur_.Supprimer_Utilisateur.setEnabled(false);
        Utilisateur_.Ajouter_Utilisateur.setEnabled(false);
        Utilisateur_.Modifier_utilisateur.setEnabled(true);
        Utilisateur_.id.setEditable(false);
    }//GEN-LAST:event_modifier_UtilisateurActionPerformed
    
    private void Supprimer_UtilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Supprimer_UtilisateurActionPerformed
        Utilisateur_.setVisible(true);
        Utilisateur_.Ajouter_Utilisateur.setEnabled(false);
        Utilisateur_.Modifier_utilisateur.setEnabled(false);
        Utilisateur_.Supprimer_Utilisateur.setEnabled(true);
    }//GEN-LAST:event_Supprimer_UtilisateurActionPerformed
    
    private void Ajouter_UtilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ajouter_UtilisateurActionPerformed
        Utilisateur_.setVisible(true);
        Utilisateur_.Supprimer_Utilisateur.setEnabled(false);
        Utilisateur_.Modifier_utilisateur.setEnabled(false);
        Utilisateur_.Ajouter_Utilisateur.setEnabled(true);
    }//GEN-LAST:event_Ajouter_UtilisateurActionPerformed
    
    private void MedicamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicamentActionPerformed
        Entrer_Médicament();
    }//GEN-LAST:event_MedicamentActionPerformed
    
    private void UtilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UtilisateurActionPerformed
        if(!Nom_utilisateur.getText().equals("Employee")){
            Entrer_Utilisateur();
        }else{
            String pass = JOptionPane.showInputDialog(null,"Vous n’êtes pas autorisé à vérifier l’inforamtion de l’utilisateur\nPour entrer, veuillez confirmer le mot de passe administrateur");
              String sql = "select NOM,MOT_DE_PASSE from utilisateur where NOM='admin' ";
            
            if (!pass.equals("")) {
                try{
                pre=con.prepareStatement(sql);
                res=pre.executeQuery();
                if(res.next()){
                    if(res.getString("MOT_DE_PASSE").equals(pass)){ 
                        Entrer_Utilisateur();
                    }else if(pass.isEmpty()){
                        JOptionPane.showMessageDialog(null,"Vous devez écrire le mot de passe administrateur","Échec de l’accès",2);
                    }else {
                        JOptionPane.showMessageDialog(null,"Mot de passe erroné","Échec de l’accès",2);
                    }
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
            }
            } else {
                JOptionPane.showMessageDialog(null,"Veuillez saisir le mot de passe administrateur","Échec de l’accès",2);
            }
            
            
        }
    }//GEN-LAST:event_UtilisateurActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new Authentification().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void Renouveler_validitéActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Renouveler_validitéActionPerformed
        new Renouvellement_validite().setVisible(true);
    }//GEN-LAST:event_Renouveler_validitéActionPerformed
    
    private void Medicaments_expirésActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Medicaments_expirésActionPerformed
        new Medicaments_expires().setVisible(true);
    }//GEN-LAST:event_Medicaments_expirésActionPerformed
    
    private void Info_AuthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Info_AuthActionPerformed
        new Auth_Details().setVisible(true);
    }//GEN-LAST:event_Info_AuthActionPerformed
    
    private void Acheter_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Acheter_medActionPerformed
        Achat.setVisible(true);
        Achat.passer_un_marcher.setEnabled(true);
        Achat.mettre_a_jour.setEnabled(false);
    }//GEN-LAST:event_Acheter_medActionPerformed
    
    private void modifier_offreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifier_offreActionPerformed
        Achat.setVisible(true);
        Achat.mettre_a_jour.setEnabled(true);
        Achat.passer_un_marcher.setEnabled(false);
    }//GEN-LAST:event_modifier_offreActionPerformed
    
    private void listedesAchatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listedesAchatsActionPerformed
        new Les_offres().setVisible(true);
    }//GEN-LAST:event_listedesAchatsActionPerformed
    
    private void FacturesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturesActionPerformed
        new Facture_vente().setVisible(true);
    }//GEN-LAST:event_FacturesActionPerformed
    
    private void presque_finisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presque_finisActionPerformed
        new Médicament_Presquefinis().setVisible(true);
    }//GEN-LAST:event_presque_finisActionPerformed
    
    private void vente_equipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vente_equipeActionPerformed
        new Vente_Equipe().setVisible(true);
    }//GEN-LAST:event_vente_equipeActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Boite_de_reception().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void med_recupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_med_recupActionPerformed
        new Recuperation_Medicaments().setVisible(true);
    }//GEN-LAST:event_med_recupActionPerformed

    private void afficher_messageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficher_messageActionPerformed
        msgAlerte.setVisible(false);
        new Afficher_Message().setVisible(true);
        Supprimer_Msg();
    }//GEN-LAST:event_afficher_messageActionPerformed
    
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
            java.util.logging.Logger.getLogger(Pharmacie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pharmacie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pharmacie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pharmacie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Pharmacie().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Achats;
    private javax.swing.JButton Acheter_med;
    private javax.swing.JButton Ajoute;
    private javax.swing.JButton Ajouter_Utilisateur;
    private javax.swing.JButton Déconnexion;
    private javax.swing.JButton Déplacer_Medicament;
    private javax.swing.JButton Détails_Medicament;
    private javax.swing.JButton Editer_Prix;
    private javax.swing.JButton Factures;
    private javax.swing.JButton Fournisseur;
    private javax.swing.JButton Info_Auth;
    private javax.swing.JButton Liste_Médicament;
    private javax.swing.JButton Medicament;
    private javax.swing.JButton Medicaments_expirés;
    private javax.swing.JButton Modifier;
    private javax.swing.JButton Modifier_MDP;
    private javax.swing.JButton Modifier_Medicament;
    private javax.swing.JLabel Nom_utilisateur;
    public static javax.swing.JLabel Nom_utilisateur1;
    private javax.swing.JButton Paramètres;
    private javax.swing.JButton Renouveler_validité;
    private javax.swing.JButton Résilier;
    private javax.swing.JButton Supprimer_Utilisateur;
    public static javax.swing.JLabel Time;
    public static javax.swing.JLabel Today;
    public javax.swing.JButton Utilisateur;
    private javax.swing.JButton Ventes;
    private javax.swing.JButton afficher_message;
    private javax.swing.JButton ajouter_Medicament;
    private javax.swing.JButton annuler;
    private javax.swing.JButton checker_place;
    private javax.swing.JButton chercher_Medicament;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton liste_Medicament;
    private javax.swing.JButton listedesAchats;
    private javax.swing.JButton med_recup;
    private javax.swing.JButton modifier_Utilisateur;
    private javax.swing.JButton modifier_offre;
    private javax.swing.JPanel msgAlerte;
    private javax.swing.JButton presque_finis;
    private javax.swing.JButton supprimer_Medicament;
    private javax.swing.JButton vente_equipe;
    // End of variables declaration//GEN-END:variables
    private void Afficher_Date(){
        d = new Date();
        dd = new SimpleDateFormat("dd-MM-yyyy");
        Today.setText(dd.format(d));
        
        new Timer(0,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date d = new Date();
                SimpleDateFormat dd = new SimpleDateFormat("hh:mm:ss a");
                Time.setText(dd.format(d));
            }
        }).start();
    }
    private void buttonvis(){
        Ajouter_Utilisateur.setVisible(false);
        Supprimer_Utilisateur.setVisible(false);
        modifier_Utilisateur.setVisible(false);
        
        ajouter_Medicament.setVisible(false);
        supprimer_Medicament.setVisible(false);
        Modifier_Medicament.setVisible(false);
        chercher_Medicament.setVisible(false);
        liste_Medicament.setVisible(false);
        Déplacer_Medicament.setVisible(false);
        
        checker_place.setVisible(false);
        Editer_Prix.setVisible(false);
        Renouveler_validité.setVisible(false);
        Medicaments_expirés.setVisible(false);
        presque_finis.setVisible(false);
        
        Acheter_med.setVisible(false);
        modifier_offre.setVisible(false);
        listedesAchats.setVisible(false);
        
        Factures.setVisible(false);
        vente_equipe.setVisible(false);
        med_recup.setVisible(false);
        
        Ajoute.setVisible(false);
        Résilier.setVisible(false);
        Modifier.setVisible(false);
        
        Info_Auth.setVisible(false);
        Modifier_MDP.setVisible(false);
        Déconnexion.setVisible(false);
    }
    private void Utilisateurs(){
        Ajouter_Utilisateur.setVisible(true);
        Supprimer_Utilisateur.setVisible(true);
        modifier_Utilisateur.setVisible(true);
        
    }
    private void Entrer_Utilisateur(){
        Utilisateur.setEnabled(false);
        Medicament.setEnabled(true);
        Détails_Medicament.setEnabled(true);
        Ventes.setEnabled(true);
        Achats.setEnabled(true);
        Paramètres.setEnabled(true);
        Fournisseur.setEnabled(true);
        
        Ajouter_Utilisateur.setVisible(true);
        Supprimer_Utilisateur.setVisible(true);
        modifier_Utilisateur.setVisible(true);
        
        ajouter_Medicament.setVisible(false);
        supprimer_Medicament.setVisible(false);
        Modifier_Medicament.setVisible(false);
        chercher_Medicament.setVisible(false);
        liste_Medicament.setVisible(false);
        Déplacer_Medicament.setVisible(false);
        
        Editer_Prix.setVisible(false);
        checker_place.setVisible(false);
        Renouveler_validité.setVisible(false);
        Medicaments_expirés.setVisible(false);
        presque_finis.setVisible(false);
        
        Acheter_med.setVisible(false);
        modifier_offre.setVisible(false);
        listedesAchats.setVisible(false);
        
        Factures.setVisible(false);
        vente_equipe.setVisible(false);
        med_recup.setVisible(false);
        
        Ajoute.setVisible(false);
        Résilier.setVisible(false);
        Modifier.setVisible(false);
        
        Info_Auth.setVisible(false);
        Modifier_MDP.setVisible(false);
        Déconnexion.setVisible(false);
    }
    private void Entrer_Médicament(){
        Medicament.setEnabled(false);
        Utilisateur.setEnabled(true);
        Détails_Medicament.setEnabled(true);
        Ventes.setEnabled(true);
        Achats.setEnabled(true);
        Paramètres.setEnabled(true);
        Fournisseur.setEnabled(true);
        
        Ajouter_Utilisateur.setVisible(false);
        Supprimer_Utilisateur.setVisible(false);
        modifier_Utilisateur.setVisible(false);
        
        ajouter_Medicament.setVisible(true);
        supprimer_Medicament.setVisible(true);
        Modifier_Medicament.setVisible(true);
        chercher_Medicament.setVisible(true);
        liste_Medicament.setVisible(true);
        Déplacer_Medicament.setVisible(true);
        
        Editer_Prix.setVisible(false);
        checker_place.setVisible(false);
        Renouveler_validité.setVisible(false);
        Medicaments_expirés.setVisible(false);
        presque_finis.setVisible(false);
        
        Acheter_med.setVisible(false);
        modifier_offre.setVisible(false);
        listedesAchats.setVisible(false);
        
        Factures.setVisible(false);
        vente_equipe.setVisible(false);
        med_recup.setVisible(false);
        
        Ajoute.setVisible(false);
        Résilier.setVisible(false);
        Modifier.setVisible(false);
        
        Info_Auth.setVisible(false);
        Modifier_MDP.setVisible(false);
        Déconnexion.setVisible(false);
    }
    private void EntrerMédicament_détails(){
        Détails_Medicament.setEnabled(false);
        Utilisateur.setEnabled(true);
        Medicament.setEnabled(true);
        Ventes.setEnabled(true);
        Achats.setEnabled(true);
        Paramètres.setEnabled(true);
        Fournisseur.setEnabled(true);
        
        Ajouter_Utilisateur.setVisible(false);
        Supprimer_Utilisateur.setVisible(false);
        modifier_Utilisateur.setVisible(false);
        
        ajouter_Medicament.setVisible(false);
        supprimer_Medicament.setVisible(false);
        Modifier_Medicament.setVisible(false);
        chercher_Medicament.setVisible(false);
        liste_Medicament.setVisible(false);
        Déplacer_Medicament.setVisible(false);
        
        Editer_Prix.setVisible(true);
        checker_place.setVisible(true);
        Renouveler_validité.setVisible(true);
        Medicaments_expirés.setVisible(true);
        presque_finis.setVisible(true);
        
        Acheter_med.setVisible(false);
        modifier_offre.setVisible(false);
        listedesAchats.setVisible(false);
        
        Factures.setVisible(false);
        vente_equipe.setVisible(false);
        med_recup.setVisible(false);
        
        Ajoute.setVisible(false);
        Résilier.setVisible(false);
        Modifier.setVisible(false);
        
        Info_Auth.setVisible(false);
        Modifier_MDP.setVisible(false);
        Déconnexion.setVisible(false);
    }
    private void Saisir_achat(){
        Achats.setEnabled(false);
        Utilisateur.setEnabled(true);
        Medicament.setEnabled(true);
        Détails_Medicament.setEnabled(true);
        Ventes.setEnabled(true);
        Paramètres.setEnabled(true);
        Fournisseur.setEnabled(true);
        
        Ajouter_Utilisateur.setVisible(false);
        Supprimer_Utilisateur.setVisible(false);
        modifier_Utilisateur.setVisible(false);
        
        ajouter_Medicament.setVisible(false);
        supprimer_Medicament.setVisible(false);
        Modifier_Medicament.setVisible(false);
        chercher_Medicament.setVisible(false);
        liste_Medicament.setVisible(false);
        Déplacer_Medicament.setVisible(false);
        
        Editer_Prix.setVisible(false);
        checker_place.setVisible(false);
        Renouveler_validité.setVisible(false);
        Medicaments_expirés.setVisible(false);
        presque_finis.setVisible(false);
        
        Acheter_med.setVisible(true);
        modifier_offre.setVisible(true);
        listedesAchats.setVisible(true);
        
        Factures.setVisible(false);
        vente_equipe.setVisible(false);
        med_recup.setVisible(false);
        
        Ajoute.setVisible(false);
        Résilier.setVisible(false);
        Modifier.setVisible(false);
        
        Info_Auth.setVisible(false);
        Modifier_MDP.setVisible(false);
        Déconnexion.setVisible(false);
    }
    private void Ventes(){
        Ventes.setEnabled(false);
        Utilisateur.setEnabled(true);
        Medicament.setEnabled(true);
        Détails_Medicament.setEnabled(true);
        Achats.setEnabled(true);
        Paramètres.setEnabled(true);
        Fournisseur.setEnabled(true);
        
        Ajouter_Utilisateur.setVisible(false);
        Supprimer_Utilisateur.setVisible(false);
        modifier_Utilisateur.setVisible(false);
        
        ajouter_Medicament.setVisible(false);
        supprimer_Medicament.setVisible(false);
        Modifier_Medicament.setVisible(false);
        chercher_Medicament.setVisible(false);
        liste_Medicament.setVisible(false);
        Déplacer_Medicament.setVisible(false);
        
        Editer_Prix.setVisible(false);
        checker_place.setVisible(false);
        Renouveler_validité.setVisible(false);
        Medicaments_expirés.setVisible(false);
        presque_finis.setVisible(false);
        
        Acheter_med.setVisible(false);
        modifier_offre.setVisible(false);
        listedesAchats.setVisible(false);
        
        Factures.setVisible(true);
        vente_equipe.setVisible(true);
        med_recup.setVisible(true);
        
        Ajoute.setVisible(false);
        Résilier.setVisible(false);
        Modifier.setVisible(false);
        
        Info_Auth.setVisible(false);
        Modifier_MDP.setVisible(false);
        Déconnexion.setVisible(false);
    }
    private void Paramètre(){
        Paramètres.setEnabled(false);
        Utilisateur.setEnabled(true);
        Medicament.setEnabled(true);
        Détails_Medicament.setEnabled(true);
        Ventes.setEnabled(true);
        Achats.setEnabled(true);
        Fournisseur.setEnabled(true);
        
        Ajouter_Utilisateur.setVisible(false);
        Supprimer_Utilisateur.setVisible(false);
        modifier_Utilisateur.setVisible(false);
        
        ajouter_Medicament.setVisible(false);
        supprimer_Medicament.setVisible(false);
        Modifier_Medicament.setVisible(false);
        chercher_Medicament.setVisible(false);
        liste_Medicament.setVisible(false);
        Déplacer_Medicament.setVisible(false);
        
        Editer_Prix.setVisible(false);
        checker_place.setVisible(false);
        Renouveler_validité.setVisible(false);
        Medicaments_expirés.setVisible(false);
        presque_finis.setVisible(false);
        
        Acheter_med.setVisible(false);
        modifier_offre.setVisible(false);
        listedesAchats.setVisible(false);
        
        Factures.setVisible(false);
        vente_equipe.setVisible(false);
        med_recup.setVisible(false);
        
        Ajoute.setVisible(false);
        Résilier.setVisible(false);
        Modifier.setVisible(false);
        
        Info_Auth.setVisible(true);
        Modifier_MDP.setVisible(true);
        Déconnexion.setVisible(true);
    }
    private void Fournisseur(){
        Fournisseur.setEnabled(false);
        Utilisateur.setEnabled(true);
        Medicament.setEnabled(true);
        Détails_Medicament.setEnabled(true);
        Ventes.setEnabled(true);
        Achats.setEnabled(true);
        Paramètres.setEnabled(true);
        
        Ajouter_Utilisateur.setVisible(false);
        Supprimer_Utilisateur.setVisible(false);
        modifier_Utilisateur.setVisible(false);
        
        ajouter_Medicament.setVisible(false);
        supprimer_Medicament.setVisible(false);
        Modifier_Medicament.setVisible(false);
        chercher_Medicament.setVisible(false);
        liste_Medicament.setVisible(false);
        Déplacer_Medicament.setVisible(false);
        
        Editer_Prix.setVisible(false);
        checker_place.setVisible(false);
        Renouveler_validité.setVisible(false);
        Medicaments_expirés.setVisible(false);
        presque_finis.setVisible(false);
        
        Acheter_med.setVisible(false);
        modifier_offre.setVisible(false);
        listedesAchats.setVisible(false);
        
        Factures.setVisible(false);
        vente_equipe.setVisible(false);
        med_recup.setVisible(false);
        
        Ajoute.setVisible(true);
        Résilier.setVisible(true);
        Modifier.setVisible(true);
        
        Info_Auth.setVisible(false);
        Modifier_MDP.setVisible(false);
        Déconnexion.setVisible(false);
    }
    private void Authentification(){
         String sql = "select ID,NOM from utilisateur where ID='"+Authentification.id.getText()+"' ";
        try{
            pre=con.prepareStatement(sql);
            res=pre.executeQuery();
            if(res.next()){
                Nom_utilisateur1.setText(res.getString("NOM"));
                if(res.getString("ID").equals("1")){
                    Nom_utilisateur.setText("Admin");
                }else{
                    Nom_utilisateur.setText("Employee");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
        }
    }
    private void Alerte(){
        //vérifier l’expiration des médicaments;
        
        int ex_Année ;
        int année_en_cours ;
        int ex_mois ;
        int ex_jour ;
        int Mois_en_cours ;
        int Jour_en_cours ;
       String sql = "select CODE_BARRES,DATE_EXPIRATION from medicament";
        try{
            pre=con.prepareStatement(sql);
            res=pre.executeQuery();
            while(res.next()){
                Alerte warning = new Alerte();
                ex_Année = Integer.parseInt(res.getString("DATE_EXPIRATION").split("-")[2]); 
                ex_mois = Integer.parseInt(res.getString("DATE_EXPIRATION").split("-")[1]);
                ex_jour = Integer.parseInt(res.getString("DATE_EXPIRATION").split("-")[0]);
                année_en_cours = Integer.parseInt(dd.format(d).split("-")[2]);
                Mois_en_cours = Integer.parseInt(dd.format(d).split("-")[1]);
                Jour_en_cours = Integer.parseInt(dd.format(d).split("-")[0]);
                if(ex_Année==année_en_cours){
                    if(ex_mois-Mois_en_cours==2){
                        ex=1;
                        barre_presque_expirée = res.getString("CODE_BARRES"); 
                        warning.setVisible(true);
                    }else if(ex_mois==Mois_en_cours){
                        if(ex_jour==Jour_en_cours){
                            ex=0;
                            barre_expirée = res.getString("CODE_BARRES"); 
                            Miseàjour_vers_expiré();
                            warning.setVisible(true);
                        }
                    }
                }
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
            }
    }
    private void Miseàjour_vers_expiré(){
         String sql = "update medicament set EXPIRATION='Périmé' where CODE_BARRES='"+barre_expirée+"' ";
        try{
            pre=con.prepareStatement(sql);
            pre.execute();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
        }
    }
    private void Auth(){
        Date d = new Date();
        SimpleDateFormat dd = new SimpleDateFormat("hh:mm:ss");
         String sql = "insert into login (NOM,TYPE,DATE,TEMPS) values ('"+Nom_utilisateur1.getText()+"' ,'"+Nom_utilisateur.getText()+"' ,'"+Today.getText()+"' ,'"+dd.format(d)+"' )";
        try {
            pre=con.prepareStatement(sql);
            pre.execute();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
        }
    }
    
    private void alert_message(){
         String sql = "select MESSAGE_DE,MESSAGE_A,MESSAGE_TEXT from historique_message where MESSAGE_A='"+Nom_utilisateur1.getText()+"' ";
        try{
            pre=con.prepareStatement(sql);
            res=pre.executeQuery();
            
            
            if(res.next()){
                à=res.getString("MESSAGE_DE"); 
                de=res.getString("MESSAGE_A"); 
                texte=res.getString("MESSAGE_TEXT");
                msgAlerte.setVisible(true);
            }else{
                msgAlerte.setVisible(false);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
        }
    }
    
    private void Supprimer_Msg(){
         String sql = "delete from historique_message";
        try {
            pre=con.prepareStatement(sql);
            pre.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
        }
    }
}
