package Interface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Loading extends javax.swing.JFrame implements Runnable {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    int s = 0;
    Thread th;

    public Loading() {
        super("Loading");
        initComponents();
        conn = DBConnect.connect();
        th = new Thread((Runnable) this);
    }

    public void setUpLoading() {
        setVisible(false);
        th.start();
    }

    public void run() {
        try {
            for (int i = 0; i <= 300; i++) {
                int m = pgbar.getMaximum();
                int v = pgbar.getValue();
                if (v < m) {
                    pgbar.setValue(pgbar.getValue() + 1);
                } else {
                    i = 301;
                    setVisible(false);
                    Home ho = new Home();
                    ho.setVisible(true);
                }
                Thread.sleep(50);
            }
        } catch (Exception e) {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pgbar = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(143, 60, 16));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/img/Logo3.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48));
        jLabel2.setForeground(new java.awt.Color(143, 60, 16));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("โรงรับจำนำ Fast Money");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        pgbar.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(pgbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 390, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/img/giphy.gif"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(278, 85));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Pawn Shop Management System Version 1.03");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("@Copyright 2019 Project STOU");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-618)/2, (screenSize.height-447)/2, 618, 447);
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JProgressBar pgbar;
    // End of variables declaration//GEN-END:variables

}
