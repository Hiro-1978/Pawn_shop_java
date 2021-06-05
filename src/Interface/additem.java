package Interface;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class additem extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public additem() {
        initComponents();
        conn = DBConnect.connect();
        autoId();
        showdata();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnadd = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txttid = new javax.swing.JTextField();
        txttname = new javax.swing.JTextField();
        txttband = new javax.swing.JTextField();
        cbtype = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txttdetail = new javax.swing.JTextArea();
        txttprice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbitem = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(980, 560));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 5, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(143, 60, 16));
        btnadd.setText("เพิ่มสินค้า");
        btnadd.setPreferredSize(new java.awt.Dimension(100, 30));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 120, -1));

        btnclear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnclear.setForeground(new java.awt.Color(143, 60, 16));
        btnclear.setText("เคลียร์ข้อมูล");
        btnclear.setPreferredSize(new java.awt.Dimension(100, 30));
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel1.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, 120, -1));

        btnedit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnedit.setForeground(new java.awt.Color(143, 60, 16));
        btnedit.setText("แก้ไขข้อมูล");
        btnedit.setPreferredSize(new java.awt.Dimension(100, 30));
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        jPanel1.add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 120, -1));

        btndel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndel.setForeground(new java.awt.Color(143, 60, 16));
        btndel.setText("ลบข้อมูล");
        btndel.setPreferredSize(new java.awt.Dimension(100, 30));
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });
        jPanel1.add(btndel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, 120, -1));

        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 160, 190));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel3.setForeground(new java.awt.Color(143, 60, 16));
        jLabel3.setText("สินค้าหลุดจำนำ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 170, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel4.setForeground(new java.awt.Color(143, 60, 16));
        jLabel4.setText("รหัสสินค้า");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel5.setForeground(new java.awt.Color(143, 60, 16));
        jLabel5.setText("ชื่อสินค้า");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel6.setForeground(new java.awt.Color(143, 60, 16));
        jLabel6.setText("ยี่ห้อสินค้า");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel8.setForeground(new java.awt.Color(143, 60, 16));
        jLabel8.setText("ประเภทสินค้า");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel9.setForeground(new java.awt.Color(143, 60, 16));
        jLabel9.setText("รายละเอียดสินค้า");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel11.setForeground(new java.awt.Color(143, 60, 16));
        jLabel11.setText("ราคาขาย (บาท)");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        txttid.setEditable(false);
        txttid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttid.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(txttid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 200, -1));

        txttname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txttname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 200, -1));

        txttband.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txttband, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 200, -1));

        cbtype.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbtype.setForeground(new java.awt.Color(143, 60, 16));
        cbtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ประเภทสินค้า", "อุปกรณ์เครื่องเขียน", "อุปกรณ์คอมพิวเตอร์และไอที", "อุปกรณ์ช่าง", "เครื่องใช้ภายในบ้าน", "เครื่องประดับ", "อื่นๆ...", " " }));
        jPanel1.add(cbtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 200, -1));

        txttdetail.setColumns(20);
        txttdetail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttdetail.setRows(5);
        jScrollPane1.setViewportView(txttdetail);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 240, 120));

        txttprice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttprice.setForeground(new java.awt.Color(143, 60, 16));
        jPanel1.add(txttprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 100, -1));

        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 280));

        tbitem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbitem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbitemMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbitem);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 930, 220));

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

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        String id = txttid.getText();
        String name = txttname.getText();
        String band = txttband.getText();
        String type = cbtype.getSelectedItem().toString();
        String detail = txttdetail.getText();
        String price = txttprice.getText();

        if (txttid.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txttname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txttband.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (cbtype.getSelectedItem().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txttdetail.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txttprice.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else {
            String sql = "INSERT INTO `additem`(`tid`, `tname`, `tband`, `ttype`, `tdetail`, `tprice`) VALUES "
                    + "('" + id + "','" + name + "','" + band + "','" + type + "','" + detail + "','" + price + "')";
            try {
                pst = (PreparedStatement) conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "เพิ่มข้อมูลลูกค้าแล้ว");
            } catch (Exception e) {
                e.printStackTrace();
            }
            clearFild();
            autoId();
            showdata();
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        clearFild();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        String id = txttid.getText();
        String name = txttname.getText();
        String band = txttband.getText();
        String type = cbtype.getSelectedItem().toString();
        String detail = txttdetail.getText();
        String price = txttprice.getText();
      
        String sql = "UPDATE `additem` SET `tname`='" + name + "',`tband`='" + band + "',`ttype`='" + type + "',`tdetail`='" + detail + "',`tprice`='"
                + price + "' WHERE tid='" + id + "'";
         if (txttid.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txttname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txttband.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (cbtype.getSelectedItem().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txttdetail.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txttprice.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                pst = (PreparedStatement) conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "แก้ไขข้อมูลแล้ว");
            } catch (Exception e) {
                e.printStackTrace();
            }
            clearFild();
            autoId();
            showdata();
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        String sql = "DELETE FROM `additem` WHERE tid='" + txttid.getText() + "'";
        if (txttname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "เลือกสินค้าที่ต้องการลบข้อมูล", "error!!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                pst = (PreparedStatement) conn.prepareStatement(sql);
                if (pst.executeUpdate(sql) != 1) {
                    JOptionPane.showMessageDialog(null, "ลบข้อมูลแล้ว");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            clearFild();
            autoId();
            showdata();
        }
    }//GEN-LAST:event_btndelActionPerformed

    private void tbitemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbitemMouseClicked
        DefaultTableModel model = (DefaultTableModel) tbitem.getModel();
        int selectrowindex = tbitem.getSelectedRow();
        txttid.setText(model.getValueAt(selectrowindex, 0).toString());
        txttname.setText(model.getValueAt(selectrowindex, 1).toString());
        txttband.setText(model.getValueAt(selectrowindex, 2).toString());
        cbtype.setSelectedItem(model.getValueAt(selectrowindex, 3).toString());
        txttdetail.setText(model.getValueAt(selectrowindex, 4).toString());
        txttprice.setText(model.getValueAt(selectrowindex, 5).toString());
    }//GEN-LAST:event_tbitemMouseClicked


    private void clearFild() {
        txttid.setText("");
        txttname.setText("");
        txttband.setText("");
        cbtype.setSelectedIndex(0);
        txttdetail.setText("");
        txttprice.setText("");
    }

    private void autoId() {
        try {
            String sql = "SELECT `tid` FROM `additem` ORDER BY tid DESC LIMIT 1";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String rnno = rs.getString("tid");
                int co = rnno.length();
                String txt = rnno.substring(0, 2);
                String num = rnno.substring(2, co);
                int n = Integer.parseInt(num);
                n++;
                String snum = Integer.toString(n);
                String ftxt = txt + snum;
                txttid.setText(ftxt);
            } else {
                txttid.setText("IT101");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        private void showdata() {

        tbitem.getTableHeader().setBackground(new Color(255, 204, 51));
        String sql = "SELECT `tid`AS รหัสสินค้า, `tname`AS ชื่อสินค้า, `tband`AS ยี่ห้อสินค้า, `ttype`AS ประเภทสินค้าุ, `tdetail`AS รายละเอียด,"
                + " `tprice`AS ราคา FROM `additem`";
        try {
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tbitem.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndel;
    private javax.swing.JButton btnedit;
    private javax.swing.JComboBox cbtype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbitem;
    private javax.swing.JTextField txttband;
    private javax.swing.JTextArea txttdetail;
    private javax.swing.JTextField txttid;
    private javax.swing.JTextField txttname;
    private javax.swing.JTextField txttprice;
    // End of variables declaration//GEN-END:variables

}
