package main;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Changer_Motdepasse extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pre = null;
    ResultSet res= null;
    public Changer_Motdepasse() {
        initComponents();
        con=Connexion.connexion();
        id_utilisateur.setText(Authentification.id.getText());
        déjaconfirmée.setVisible(false);
        we_st.setVisible(false);
    }



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        confirmer = new javax.swing.JPasswordField();
        nouveau_mot_passe = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ancien_mot_passe = new javax.swing.JPasswordField();
        id_utilisateur = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        déjaconfirmée = new javax.swing.JLabel();
        we_st = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Changer Mot de passe");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 255, 102));

        jPanel2.setBackground(new java.awt.Color(0, 255, 102));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Changer Mot de passe");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel5)
                                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Change Your Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        confirmer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased (java.awt.event.KeyEvent evt) {
                confirmerKeyReleased(evt);
            }
        });

        nouveau_mot_passe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased (java.awt.event.KeyEvent evt) {
                nouveau_mot_passeKeyReleased(evt);
            }
        });

        jLabel3.setText("nouveau mot de passe: ");

        jLabel1.setText("Id_Utilisateur : ");

        jLabel4.setText("Confirmer nouveau mot de passe : ");

        id_utilisateur.setEditable(false);

        jLabel2.setText("Ancien mot de passe: ");

        déjaconfirmée.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        déjaconfirmée.setForeground(new java.awt.Color(0, 153, 0));
        déjaconfirmée.setText("Confirmé");

        we_st.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        we_st.setText("trés faible");
    }