
package Interface;

import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.joda.time.LocalDate;

    public class sellitem extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public sellitem() {
        initComponents();
        conn = DBConnect.connect();
        autoId();
        LocalDate today = LocalDate.now();
        LocalDate reday = today.plusDays(90);
        txtdsell.setText(today.toString());
        showdata();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txttid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txttype = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtsid = new javax.swing.JTextField();
        btnok = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtdsell = new javax.swing.JTextField();
        txtmsell = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbsell = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(980, 560));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 5, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txttid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttidKeyReleased(evt);
            }
        });
        jPanel1.add(txttid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 110, -1));

        txtname.setEditable(false);
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 280, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel5.setForeground(new java.awt.Color(143, 60, 16));
        jLabel5.setText("รหัสสินค้า");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel6.setForeground(new java.awt.Color(143, 60, 16));
        jLabel6.setText("ชื่อสินค้า");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 90, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel9.setForeground(new java.awt.Color(143, 60, 16));
        jLabel9.setText("ประเภทสินค้า");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel10.setForeground(new java.awt.Color(143, 60, 16));
        jLabel10.setText("ราคา (บาท)");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        txttype.setEditable(false);
        jPanel1.add(txttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 280, -1));

        txtprice.setEditable(false);
        jPanel1.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 110, -1));

        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 500, 180));

        txtbill.setColumns(20);
        txtbill.setEditable(false);
        txtbill.setRows(5);
        jScrollPane2.setViewportView(txtbill);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 220, 210));

        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 240, 230));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel11.setForeground(new java.awt.Color(143, 60, 16));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("เลขที่ใบเสร็จ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 150, -1));

        txtsid.setEditable(false);
        txtsid.setFont(new java.awt.Font("Tahoma", 0, 16));
        txtsid.setForeground(new java.awt.Color(0, 0, 255));
        txtsid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtsid.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(txtsid, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 130, -1));

        btnok.setFont(new java.awt.Font("Tahoma", 0, 18));
        btnok.setForeground(new java.awt.Color(143, 60, 16));
        btnok.setText("ขายสินค้า");
        btnok.setPreferredSize(new java.awt.Dimension(100, 30));
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });
        jPanel1.add(btnok, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 130, -1));

        btnedit.setFont(new java.awt.Font("Tahoma", 0, 18));
        btnedit.setForeground(new java.awt.Color(143, 60, 16));
        btnedit.setText("แก้ไข");
        btnedit.setPreferredSize(new java.awt.Dimension(100, 30));
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        jPanel1.add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 130, -1));

        btncancel.setFont(new java.awt.Font("Tahoma", 0, 18));
        btncancel.setForeground(new java.awt.Color(143, 60, 16));
        btncancel.setText("ยกเลิก");
        btncancel.setPreferredSize(new java.awt.Dimension(100, 30));
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 130, -1));

        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 170, 230));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel12.setForeground(new java.awt.Color(143, 60, 16));
        jLabel12.setText("วันที่ขาย");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel13.setForeground(new java.awt.Color(143, 60, 16));
        jLabel13.setText("ผู้ขาย");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 60, -1));

        txtdsell.setEditable(false);
        txtdsell.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtdsell.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(txtdsell, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 120, -1));

        txtmsell.setFont(new java.awt.Font("Tahoma", 0, 16));
        txtmsell.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(txtmsell, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 190, -1));

        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 500, 50));

        tbsell.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbsell);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 930, 190));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36));
        jLabel7.setForeground(new java.awt.Color(143, 60, 16));
        jLabel7.setText("ขายสินค้าหลุดจำนำ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 4, -1, 60));

        jButton4.setBackground(new java.awt.Color(0, 0, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 36));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("พิมพ์ใบเสร็จ");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 15, 240, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );

        setBounds(0, 0, 980, 560);
    }// </editor-fold>//GEN-END:initComponents

    private void autoId() {
        try {
            String sql = "SELECT `s_no` FROM `sell` ORDER BY t_id DESC LIMIT 1";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String rnno = rs.getString("s_no");
                int co = rnno.length();
                String txt = rnno.substring(0, 2); 
                String num = rnno.substring(2, co);
                int n = Integer.parseInt(num);
                n++;
                String snum = Integer.toString(n);
                String ftxt = txt + snum;
                txtsid.setText(ftxt);
            } else {
                txtsid.setText("SN101");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        String sno = txtsid.getText();
        String tid = txttid.getText().toUpperCase();
        String name = txtname.getText();
        String type = txttype.getText();
        String dsell = txtdsell.getText();
        String msell = txtmsell.getText();
        String price = txtprice.getText();

           if (txtname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ข้อมูลไม่ครบ", "Warning", JOptionPane.WARNING_MESSAGE);
            txtsid.setText("");
            txtname.setText("");
            txttype.setText("");
            txtmsell.setText("");
            txtprice.setText("");
            txtbill.setText("");
        } else {
            try {
                String sql = "INSERT INTO `sell`(`s_no`, `t_id`, `t_name`, `t_type`, `t_dsell`, `t_msell`, `t_price`) VALUES "
                        + "('" + sno + "','" + tid + "','" + name + "','" + type + "','" + dsell + "','" + msell + "','" + price + "')";
                PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
                pst.execute();
                bill();
                JOptionPane.showMessageDialog(null, "รายการเสร็จเรียบร้อย");
            } catch (Exception e) {
                e.printStackTrace();
            }
            autoId();
            showdata();
        }
    }//GEN-LAST:event_btnokActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        String sno = txtsid.getText();
        String tid = txttid.getText().toUpperCase();
        String name = txtname.getText();
        String type = txttype.getText();
        String dsell = txtdsell.getText();
        String msell = txtmsell.getText();
        String price = txtprice.getText();

                String sql = "UPDATE `sell` SET `t_id`='" + tid + "',`t_name`='" + name + "',`t_type`='" + type + "',`t_dsell`='" + dsell + "',`t_msell`='"
                + msell + "',`t_price`='" + price + "' WHERE s_no='" + sno + "'";

           if (txtname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ข้อมูลไม่ครบ", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (txtname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ข้อมูลไม่ครบ", "Warning", JOptionPane.WARNING_MESSAGE);
            clear();
        } else {
            try {
                pst = (PreparedStatement) conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "แก้ไขข้อมูลแล้ว");
            } catch (Exception e) {
                e.printStackTrace();
            }
            clear();
            autoId();
            showdata();
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
         clear();
    }//GEN-LAST:event_btncancelActionPerformed

    private void txttidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttidKeyReleased
         try {
            String sql = "SELECT `tname` FROM `additem` WHERE tid='" + txttid.getText() + "'";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                txtname.setText(rs.getString("tname"));
            } else {
                txtname.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txttidKeyReleased


    private void showdata() {

        tbsell.getTableHeader().setBackground(new Color(255, 204, 51));
        String sql = "SELECT `s_no`AS เลขที่ใบเสร็จ, `t_id`AS รหัสสินค้า, `t_name`AS ชื่อสินค้า, `t_type`AS ประเภทสินค้า, `t_dsell`AS วันที่ขาย,"
                + " `t_msell`AS ผู้ขาย, `t_price`AS ราคา FROM `sell`";
        try {
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tbsell.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clear() {
        txtsid.setText("");
        txtname.setText("");
        txttype.setText("");
        txtdsell.setText("");
        txtmsell.setText("");
        txtprice.setText("");
    }

     private void bill() {
        Format nowDay = new SimpleDateFormat(" dd MMMM yyyy", new Locale("th", "TH"));
        txtbill.setText("            โรงรับจำนำ Fats Money" + "\n"
                + "============================" + "\n"
                + "   วันที่" + nowDay.format(new Date()) + "\n"
                + "   เลขที่ใบเสร็จ  " + txtsid.getText() + "\n"
                + "   ชื่อลูกค้า  " + txtname.getText() + "\n"
                + "   วันที่ซื้อ\t" + txtdsell.getText() + "  วัน\n"
                + "   ราคา\t" + txtprice.getText() + "  บาท\n"
                + "   ผู้ขาย\t" + txtmsell.getText() + "  วัน\n"
                + "\n"
                + "        ***** ขอบคุณที่ใช้บริการ *****" + "\n");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnok;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbsell;
    private javax.swing.JTextArea txtbill;
    private javax.swing.JTextField txtdsell;
    private javax.swing.JTextField txtmsell;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtsid;
    private javax.swing.JTextField txttid;
    private javax.swing.JTextField txttype;
    // End of variables declaration//GEN-END:variables

}
