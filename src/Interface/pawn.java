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

public class pawn extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public pawn() {
        initComponents();
        conn = DBConnect.connect();
        autoId();
        LocalDate today = LocalDate.now();
        LocalDate reday = today.plusDays(90);
        txtdaypawn.setText(today.toString());
        txtdayend.setText(reday.toString());
        showdata();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtmid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txttname = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        cbtype = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtpawn = new javax.swing.JTextField();
        btnok = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtdaypawn = new javax.swing.JTextField();
        txtdayend = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbpawn = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtprint = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(980, 560));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 5, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtmid.setFont(new java.awt.Font("Tahoma", 0, 14));
        txtmid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmidKeyReleased(evt);
            }
        });
        jPanel1.add(txtmid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 180, -1));

        txtname.setEditable(false);
        txtname.setFont(new java.awt.Font("Tahoma", 0, 14));
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 260, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel5.setForeground(new java.awt.Color(143, 60, 16));
        jLabel5.setText("รหัสลูกค้า");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel6.setForeground(new java.awt.Color(143, 60, 16));
        jLabel6.setText("ชื่อ-สกุล");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 90, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel8.setForeground(new java.awt.Color(143, 60, 16));
        jLabel8.setText("ชื่อสินค้า");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel9.setForeground(new java.awt.Color(143, 60, 16));
        jLabel9.setText("ประเภทสินค้า");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel10.setForeground(new java.awt.Color(143, 60, 16));
        jLabel10.setText("ราคา (บาท)");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        txttname.setFont(new java.awt.Font("Tahoma", 0, 14));
        jPanel1.add(txttname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 260, -1));

        txtprice.setFont(new java.awt.Font("Tahoma", 0, 14));
        jPanel1.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 180, -1));

        cbtype.setFont(new java.awt.Font("Tahoma", 0, 14));
        cbtype.setForeground(new java.awt.Color(143, 60, 16));
        cbtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ประเภทสินค้า", "อุปกรณ์เครื่องเขียน", "อุปกรณ์คอมพิวเตอร์และไอที", "อุปกรณ์ช่าง", "เครื่องใช้ภายในบ้าน", "เครื่องประดับ", "อื่นๆ...", " " }));
        jPanel1.add(cbtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 180, -1));

        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 490, 180));

        txtbill.setColumns(20);
        txtbill.setEditable(false);
        txtbill.setRows(5);
        jScrollPane2.setViewportView(txtbill);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 220, 210));

        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 240, 230));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel11.setForeground(new java.awt.Color(143, 60, 16));
        jLabel11.setText("เลขที่ตั๋วจำนำ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 120, -1));

        txtpawn.setEditable(false);
        txtpawn.setFont(new java.awt.Font("Tahoma", 0, 16));
        txtpawn.setForeground(new java.awt.Color(0, 0, 255));
        txtpawn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpawn.setPreferredSize(new java.awt.Dimension(110, 30));
        jPanel1.add(txtpawn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 120, -1));

        btnok.setFont(new java.awt.Font("Tahoma", 0, 18));
        btnok.setForeground(new java.awt.Color(143, 60, 16));
        btnok.setText("จำนำ");
        btnok.setPreferredSize(new java.awt.Dimension(110, 30));
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });
        jPanel1.add(btnok, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 120, -1));

        btnedit.setFont(new java.awt.Font("Tahoma", 0, 18));
        btnedit.setForeground(new java.awt.Color(143, 60, 16));
        btnedit.setText("แก้ไข");
        btnedit.setPreferredSize(new java.awt.Dimension(110, 30));
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        jPanel1.add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 120, -1));

        btncancel.setFont(new java.awt.Font("Tahoma", 0, 18));
        btncancel.setForeground(new java.awt.Color(143, 60, 16));
        btncancel.setText("เคลียร์");
        btncancel.setPreferredSize(new java.awt.Dimension(110, 30));
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 120, -1));

        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 170, 230));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel12.setForeground(new java.awt.Color(143, 60, 16));
        jLabel12.setText("วันที่จำนำ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel13.setForeground(new java.awt.Color(143, 60, 16));
        jLabel13.setText("วันหมดอายุ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        txtdaypawn.setEditable(false);
        txtdaypawn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtdaypawn.setForeground(new java.awt.Color(0, 0, 255));
        txtdaypawn.setPreferredSize(new java.awt.Dimension(100, 22));
        jPanel1.add(txtdaypawn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 120, -1));

        txtdayend.setEditable(false);
        txtdayend.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtdayend.setForeground(new java.awt.Color(0, 0, 255));
        txtdayend.setPreferredSize(new java.awt.Dimension(100, 22));
        jPanel1.add(txtdayend, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 120, -1));

        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 490, 40));

        tbpawn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbpawn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbpawnMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbpawn);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 930, 200));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36));
        jLabel7.setForeground(new java.awt.Color(143, 60, 16));
        jLabel7.setText("จำนำของ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, -1));

        txtprint.setBackground(new java.awt.Color(0, 0, 255));
        txtprint.setFont(new java.awt.Font("Tahoma", 0, 36));
        txtprint.setForeground(new java.awt.Color(255, 255, 255));
        txtprint.setText("พิมพ์ใบเสร็จ");
        txtprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprintActionPerformed(evt);
            }
        });
        jPanel1.add(txtprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 240, 40));

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
            String sql = "SELECT `p_no` FROM `pawn` ORDER BY m_id DESC LIMIT 1";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String rnno = rs.getString("p_no");
                int co = rnno.length();
                String txt = rnno.substring(0, 2); // เพื่อให้เป็น PN101
                String num = rnno.substring(2, co);
                int n = Integer.parseInt(num);
                n++;
                String snum = Integer.toString(n);
                String ftxt = txt + snum;
                txtpawn.setText(ftxt);
            } else {
                txtpawn.setText("PN101");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void txtmidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmidKeyReleased
         try {
            String sql = "SELECT `mname` FROM `addmember` WHERE mid='" + txtmid.getText() + "'";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                txtname.setText(rs.getString("mname"));
            } else {
                txtname.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtmidKeyReleased

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        String pno = txtpawn.getText();
        String mid = txtmid.getText().toUpperCase();
        String mname = txtname.getText();
        String tname = txttname.getText();
        String type = cbtype.getSelectedItem().toString();
        String pdate = txtdaypawn.getText();
        String edate = txtdayend.getText();
        String price = txtprice.getText();

           if (txtname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ข้อมูลไม่ครบ", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (txttname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ข้อมูลไม่ครบ", "Warning", JOptionPane.WARNING_MESSAGE);
            txtmid.setText("");
            txtname.setText("");
            txttname.setText("");
            cbtype.setSelectedIndex(0);
            txtprice.setText("");
            txtbill.setText("");
        } else {
            try {
                String sql = "INSERT INTO `pawn`(`p_no`, `m_id`, `m_name`, `t_name`, `t_type`, `t_date`, `t_end`, `t_price`, `mark`) VALUES "
                        + "('" + pno + "','" + mid + "','" + mname + "','" + tname + "','" + type + "','" + pdate + "','" + edate + "','" + price + "','จำนำอยู่')";
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

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
            clear();
    }//GEN-LAST:event_btncancelActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        String pno = txtpawn.getText();
        String mid = txtmid.getText().toUpperCase();
        String mname = txtname.getText();
        String tname = txttname.getText();
        String type = cbtype.getSelectedItem().toString();
        String pdate = txtdaypawn.getText();
        String edate = txtdayend.getText();
        String price = txtprice.getText();

                String sql = "UPDATE `pawn` SET `m_id`='" + mid + "',`m_name`='" + mname + "',`t_name`='" + tname+ "',`t_type`='" + type + "',`t_date`='" + pdate + "',`t_end`='"
                + edate + "',`t_price`='" + price + "' WHERE p_no='" + pno + "'";
           if (txtname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ข้อมูลไม่ครบ", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (txttname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ข้อมูลไม่ครบ", "Warning", JOptionPane.WARNING_MESSAGE);
            txtmid.setText("");
            txtname.setText("");
            txttname.setText("");
            cbtype.setSelectedIndex(0);
            txtprice.setText("");
            txtbill.setText("");
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

    private void tbpawnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbpawnMouseClicked

        DefaultTableModel model = (DefaultTableModel) tbpawn.getModel();
        int selectrowindex = tbpawn.getSelectedRow();
        txtmid.setText(model.getValueAt(selectrowindex, 0).toString());
        txtname.setText(model.getValueAt(selectrowindex, 1).toString());
        txttname.setText(model.getValueAt(selectrowindex, 2).toString());
        cbtype.setSelectedItem(model.getValueAt(selectrowindex, 3).toString());
        txtdaypawn.setText(model.getValueAt(selectrowindex, 4).toString());
        txtdayend.setText(model.getValueAt(selectrowindex, 5).toString());
        txtprice.setText(model.getValueAt(selectrowindex, 6).toString());
    }//GEN-LAST:event_tbpawnMouseClicked

    private void txtprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprintActionPerformed

    private void showdata() {

        tbpawn.getTableHeader().setBackground(new Color(255, 204, 51));
        String sql = "SELECT `p_no`AS เลขที่ตั๋วจำนำ, `m_id`AS รหัสลูกค้า, `m_name`AS ชื่อลูกค้า, `t_name`AS ชื่อสินค้า, `t_type`AS ประเภทสินค้า, `t_date`AS วันที่จำนำ,"
                + " `t_end`AS วันหมดอายุ, `t_price`AS ราคาจำนำุ, `mark`AS สถานะ FROM `pawn`";
        try {
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tbpawn.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clear() {
        txtmid.setText("");
        txtname.setText("");
        txttname.setText("");
        cbtype.setSelectedIndex(0);
        txtprice.setText("");
        txtbill.setText("");
    }

    private void bill() {
        Format nowDay = new SimpleDateFormat(" dd MMMM yyyy", new Locale("th", "TH"));
        txtbill.setText("            โรงรับจำนำ Fats Money" + "\n"
                + "============================" + "\n"
                + "   วันที่" + nowDay.format(new Date()) + "\n"
                + "   เลขตั๋วจำนำ  " + txtpawn.getText() + "\n"
                + "   ชื่อลูกค้า  " + txtname.getText() + "\n"
                + "   ชื่อสินค้า  " + txttname.getText() + "\n"
                + "   วันที่จำนำ\t" + txtdaypawn.getText() + "  \n"
                + "   วันหมดอายุ\t" + txtdayend.getText() + "  \n"
                + "   ราคา\t" + txtprice.getText() + "  บาท\n"
                + "\n"
                + "        ***** ขอบคุณที่ใช้บริการ *****" + "\n");
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnok;
    private javax.swing.JComboBox cbtype;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbpawn;
    private javax.swing.JTextArea txtbill;
    private javax.swing.JTextField txtdayend;
    private javax.swing.JTextField txtdaypawn;
    private javax.swing.JTextField txtmid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpawn;
    private javax.swing.JTextField txtprice;
    private javax.swing.JButton txtprint;
    private javax.swing.JTextField txttname;
    // End of variables declaration//GEN-END:variables

}
