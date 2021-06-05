

package Interface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    Connection conn;

    public Login() {
        super("Login");
        initComponents();
        conn = DBConnect.connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtuname = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        txtpword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ระบบบริหารจัดการโรงรับจำนำ");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48));
        jLabel1.setForeground(new java.awt.Color(143, 60, 16));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/img/Logo4.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 240, 120));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20));
        jLabel2.setForeground(new java.awt.Color(143, 60, 16));
        jLabel2.setText("๊User");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20));
        jLabel3.setForeground(new java.awt.Color(143, 60, 16));
        jLabel3.setText("Pass");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        txtuname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(txtuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 240, 30));

        btnlogin.setFont(new java.awt.Font("Tahoma", 1, 24));
        btnlogin.setForeground(new java.awt.Color(143, 60, 16));
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 120, 40));

        btnreset.setFont(new java.awt.Font("Tahoma", 1, 24));
        btnreset.setForeground(new java.awt.Color(143, 60, 16));
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 120, 40));

        btnexit.setFont(new java.awt.Font("Tahoma", 1, 24));
        btnexit.setForeground(new java.awt.Color(143, 60, 16));
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 120, 40));

        txtpword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(txtpword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 240, 30));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-618)/2, (screenSize.height-447)/2, 618, 447);
    }// </editor-fold>//GEN-END:initComponents

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        txtuname.setText("");
        txtpword.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
         if (txtuname.getText().trim().isEmpty() && txtpword.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ชื่อหรือรหัสผ่านผู้ใช้ไม่ได้กรอก", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtuname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ชื่อหรือรหัสผ่านผู้ใช้ไม่ได้กรอก", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtpword.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ชื่อหรือรหัสผ่านผู้ใช้ไม่ได้กรอก", "error!!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String sql = "Select * from admin where username=? and password=?";
                PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
                pst.setString(1, txtuname.getText());
                pst.setString(2, txtpword.getText());
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "ระบบบริหารจัดการโรงรับจำนำ ยินดีต้อนรับ");
                    setVisible(false);
                    Loading ld = new Loading();
                    ld.setUpLoading();
                    ld.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "ชื่อและรหัสผ่านไม่ถูกต้อง", "Warning", JOptionPane.WARNING_MESSAGE);
                    txtuname.setText("");
                    txtpword.setText("");
                }
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnloginActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnreset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtpword;
    private javax.swing.JTextField txtuname;
    // End of variables declaration//GEN-END:variables

}
