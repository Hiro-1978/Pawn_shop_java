
package Interface;

import com.mysql.jdbc.PreparedStatement;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.joda.time.Days;
import org.joda.time.LocalDate;

public class Return extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Return() {
        initComponents();
        conn = DBConnect.connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnreturn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtp_no = new javax.swing.JTextField();
        txtm_id = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btncl = new javax.swing.JButton();
        btnpt = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtmname = new javax.swing.JLabel();
        txttname = new javax.swing.JLabel();
        txtdpawn = new javax.swing.JLabel();
        txtdend = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtpprice = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(980, 560));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 5, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48));
        jLabel1.setForeground(new java.awt.Color(143, 60, 16));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("รายการไถ่คืนของและดอกเบี้ย");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 954, 79));

        btnreturn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnreturn.setForeground(new java.awt.Color(143, 60, 16));
        btnreturn.setText("ไถ่คืนสินค้า");
        btnreturn.setPreferredSize(new java.awt.Dimension(80, 40));
        btnreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnreturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 200, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel4.setForeground(new java.awt.Color(143, 60, 16));
        jLabel4.setText("เลขตั๋วจำนำ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 150, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel5.setForeground(new java.awt.Color(143, 60, 16));
        jLabel5.setText("รหัสลูกค้า");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 150, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel6.setForeground(new java.awt.Color(143, 60, 16));
        jLabel6.setText("จำนวนวันที่จำนำ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 150, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel7.setForeground(new java.awt.Color(143, 60, 16));
        jLabel7.setText("ค่าไถ่คืนรวมดอกเบี้ย");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 170, -1));

        txtp_no.setFont(new java.awt.Font("Tahoma", 0, 14));
        txtp_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtp_noKeyReleased(evt);
            }
        });
        jPanel1.add(txtp_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 120, 30));

        txtm_id.setEditable(false);
        txtm_id.setFont(new java.awt.Font("Tahoma", 0, 14));
        jPanel1.add(txtm_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 120, 30));

        txtdate.setEditable(false);
        txtdate.setFont(new java.awt.Font("Tahoma", 0, 14));
        jPanel1.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 120, 30));

        txtprice.setEditable(false);
        txtprice.setFont(new java.awt.Font("Tahoma", 0, 14));
        jPanel1.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 120, 30));

        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 91, 320, 311));

        txtbill.setColumns(20);
        txtbill.setEditable(false);
        txtbill.setFont(new java.awt.Font("Tahoma", 0, 14));
        txtbill.setRows(5);
        jScrollPane1.setViewportView(txtbill);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 250, 300));

        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 270, 320));

        btncl.setFont(new java.awt.Font("Tahoma", 1, 24));
        btncl.setForeground(new java.awt.Color(143, 60, 16));
        btncl.setText("ยกเลิก");
        btncl.setPreferredSize(new java.awt.Dimension(80, 40));
        btncl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclActionPerformed(evt);
            }
        });
        jPanel1.add(btncl, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 200, 50));

        btnpt.setFont(new java.awt.Font("Tahoma", 1, 24));
        btnpt.setForeground(new java.awt.Color(143, 60, 16));
        btnpt.setText("พิมพ์ใบเสร็จ");
        btnpt.setPreferredSize(new java.awt.Dimension(80, 40));
        btnpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnptActionPerformed(evt);
            }
        });
        jPanel1.add(btnpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 200, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36));
        jLabel8.setForeground(new java.awt.Color(143, 60, 16));
        jLabel8.setText("รายละเอียด");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(143, 60, 16));
        jLabel9.setText("ชื่อลูกค้า");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 70, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(143, 60, 16));
        jLabel10.setText("ชื่อสินค้า");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 80, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(143, 60, 16));
        jLabel11.setText("วันที่จำนำ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 80, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(143, 60, 16));
        jLabel12.setText("วันหมดอายุ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 100, -1));

        txtmname.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtmname.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(txtmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 190, 40));

        txttname.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txttname.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(txttname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 190, 40));

        txtdpawn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtdpawn.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(txtdpawn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 190, 40));

        txtdend.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtdend.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(txtdend, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 190, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(143, 60, 16));
        jLabel13.setText("ราคาที่จำนำไว้");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        txtpprice.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtpprice.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(txtpprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 190, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 980, 560);
    }// </editor-fold>//GEN-END:initComponents

    private void txtp_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtp_noKeyReleased
        try {
            String sql = "SELECT `p_no`, `m_id`, `m_name`, `t_name`, `t_type`, `t_date`, `t_end`, `t_price`, `mark` FROM `pawn` "
                    + "WHERE pawn.p_no='" + txtp_no.getText() + "' and pawn.mark='จำนำอยู่'";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                txtm_id.setText(rs.getString("m_id").toUpperCase());
                String days = rs.getString("t_date");
                txtmname.setText(rs.getString("m_name"));
                txttname.setText(rs.getString("t_name"));
                txtdpawn.setText(rs.getString("t_date"));
                txtpprice.setText(rs.getString("t_price"));
                String m = txtpprice.getText();
                txtdend.setText(rs.getString("t_end"));
                LocalDate today = LocalDate.now();
                LocalDate reday = LocalDate.parse(days);
                int ldays = Days.daysBetween(reday, today).getDays();
                if (ldays > 0) {
                    double pprice = Double.parseDouble(m);
                    double fine = (ldays * 0.042)*100;
                    double total = pprice+fine;
                    txtprice.setText(Double.toString(Math.round(total)));
                    txtdate.setText(Integer.toString(ldays));
                } else {
                     txtdate.setText("0");
                     txtprice.setText("0");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtp_noKeyReleased

    private void btnreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreturnActionPerformed
        String pno = txtp_no.getText();
        String mid = txtm_id.getText();
        String date = txtdate.getText();
        String price = txtprice.getText();
        if (txtp_no.getText().trim().isEmpty()) {
            btnreturn.setEnabled(false);
        } else if (txtm_id.getText().trim().isEmpty()) {
            btnreturn.setEnabled(false);
        } else {
            try {
                String sql = "INSERT INTO `return`(`p_no`, `m_id`, `dpawn`, `price`) VALUES "
                        + "('" + pno + "','" + mid + "','" + date + "','" + price + "')";
                PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
                pst.execute();
                bill();
                retunMark();
                JOptionPane.showMessageDialog(null, "คืนหนังสือเสร็จเรียบร้อย");
                clear();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnreturnActionPerformed

    private void btnclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclActionPerformed
        clear();
    }//GEN-LAST:event_btnclActionPerformed

    private void btnptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnptActionPerformed
        if (txtbill.getText().trim().isEmpty()) {
            btnpt.setEnabled(false);
        } else {
            try {
                txtbill.print();
            } catch (PrinterException ex) {
                Logger.getLogger(Return.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnptActionPerformed

    private void bill() {
        Format nowDay = new SimpleDateFormat(" dd MMMM yyyy", new Locale("th", "TH"));
        txtbill.setText("========================" + "\n"
                + "            โรงรับจำนำ Fast Money" + "\n"
                + "========================" + "\n"
                + "\n"
                + " วันที่" + nowDay.format(new Date()) + "\n"
                + "\n"
                + " รหัสลูกค้า  " + txtm_id.getText().toUpperCase() + "\n"
                + " ชื่อลูกค้า  " + txtmname.getText() + "\n"
                + " วันที่เกินกำหนด\t" + txtdate.getText() + "  วัน\n"
                + " ค่าไถ่คืนรวมดอกเบี้ย\t" + txtprice.getText() + "  บาท\n"
                + "\n"
                + "\n"
                + "      ***** ขอบคุณที่ใช้บริการ *****" + "\n"
                + "\n"
                + "========================");
    }

    private void retunMark() {
        try {
            String sql = "UPDATE `pawn` SET `mark`='ไถ่คืนไปแล้ว' WHERE m_id='" + txtm_id.getText() + "'";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clear() {
        txtp_no.setText("");
        txtm_id.setText("");
        txtbill.setText("");
        txtdate.setText("");
        txtdend.setText("");
        txtdpawn.setText("");
        txtmname.setText("");
        txtprice.setText("");
        txttname.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncl;
    private javax.swing.JButton btnpt;
    private javax.swing.JButton btnreturn;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtbill;
    private javax.swing.JTextField txtdate;
    private javax.swing.JLabel txtdend;
    private javax.swing.JLabel txtdpawn;
    private javax.swing.JTextField txtm_id;
    private javax.swing.JLabel txtmname;
    private javax.swing.JTextField txtp_no;
    private javax.swing.JLabel txtpprice;
    private javax.swing.JTextField txtprice;
    private javax.swing.JLabel txttname;
    // End of variables declaration//GEN-END:variables

}
