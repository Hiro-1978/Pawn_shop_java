package Interface;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class addmember extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public addmember() {
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txttel = new javax.swing.JTextField();
        txtmid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtidnum = new javax.swing.JTextField();
        txtdayexpire = new com.toedter.calendar.JDateChooser();
        cbgen = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtadd = new javax.swing.JTextArea();
        txtemail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbmember = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(980, 560));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 5, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(143, 60, 16));
        btnadd.setText("เพิ่มลูกค้า");
        btnadd.setPreferredSize(new java.awt.Dimension(120, 30));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, -1, -1));

        btnclear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnclear.setForeground(new java.awt.Color(143, 60, 16));
        btnclear.setText("เคลียร์ข้อมูล");
        btnclear.setPreferredSize(new java.awt.Dimension(120, 30));
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel1.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, -1, -1));

        btnedit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnedit.setForeground(new java.awt.Color(143, 60, 16));
        btnedit.setText("แก้ไขข้อมูล");
        btnedit.setPreferredSize(new java.awt.Dimension(120, 30));
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        jPanel1.add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, -1, -1));

        btndel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndel.setForeground(new java.awt.Color(143, 60, 16));
        btndel.setText("ลบข้อมูล");
        btndel.setPreferredSize(new java.awt.Dimension(120, 30));
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });
        jPanel1.add(btndel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, -1, -1));

        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 160, 190));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel3.setForeground(new java.awt.Color(143, 60, 16));
        jLabel3.setText("เพิ่มรายชื่อลูกค้า");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 190, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel4.setForeground(new java.awt.Color(143, 60, 16));
        jLabel4.setText("รหัสลูกค้า");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel5.setForeground(new java.awt.Color(143, 60, 16));
        jLabel5.setText("ชื่อ-นามสกุล");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 120, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel6.setForeground(new java.awt.Color(143, 60, 16));
        jLabel6.setText("เลขที่บัตรประชาชน");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 160, 150, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel7.setForeground(new java.awt.Color(143, 60, 16));
        jLabel7.setText("วันหมดอายุ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 200, 90, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel8.setForeground(new java.awt.Color(143, 60, 16));
        jLabel8.setText("เพศ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 240, 40, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel9.setForeground(new java.awt.Color(143, 60, 16));
        jLabel9.setText("ที่อยู่");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 80, 40, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel10.setForeground(new java.awt.Color(143, 60, 16));
        jLabel10.setText("หมายเลขโทรศัพท์");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 180, 140, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel11.setForeground(new java.awt.Color(143, 60, 16));
        jLabel11.setText("อีเมลล์");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 220, 50, -1));

        txttel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 200, -1));

        txtmid.setEditable(false);
        txtmid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtmid.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(txtmid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 210, -1));

        txtname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 210, -1));

        txtidnum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtidnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 210, -1));

        txtdayexpire.setDateFormatString("dd MMM yyyy");
        txtdayexpire.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtdayexpire, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 150, -1));

        cbgen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbgen.setForeground(new java.awt.Color(143, 60, 16));
        cbgen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ระบุเพศ", "ชาย", "หญิง" }));
        jPanel1.add(cbgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 110, -1));

        txtadd.setColumns(20);
        txtadd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtadd.setRows(5);
        jScrollPane1.setViewportView(txtadd);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 290, 70));

        txtemail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 200, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 280));

        tbmember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbmember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbmemberMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbmember);

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
        String mid = txtmid.getText();
        String name = txtname.getText();
        String idnum = txtidnum.getText();
        String dexpire = ((JTextField) txtdayexpire.getDateEditor().getUiComponent()).getText();
        String gender = cbgen.getSelectedItem().toString();
        String adress = txtadd.getText();
        String tel = txttel.getText();
        String email = txtemail.getText();

        if (txtmid.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "เลือกข้อมูลที่จะแก้ไข", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtidnum.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (((JTextField) txtdayexpire.getDateEditor().getUiComponent()).getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (cbgen.getSelectedItem().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtadd.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txttel.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtemail.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
       
        } else {
            String sql = "INSERT INTO `addmember`(`mid`, `mname`, `idnum`, `dexpire`, `gen`, `address`, `tel`, `email`) VALUES "
                    + "('" + mid + "','" + name + "','" + idnum + "','" + dexpire + "','" + gender + "','" + adress + "','" + tel + "','" + email + "')";

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
        String mid = txtmid.getText();
        String name = txtname.getText();
        String idnum = txtidnum.getText();
        String dexpire = ((JTextField) txtdayexpire.getDateEditor().getUiComponent()).getText();
        String gender = cbgen.getSelectedItem().toString();
        String adress = txtadd.getText();
        String tel = txttel.getText();
        String email = txtemail.getText();

        String sql = "UPDATE `addmember` SET `mname`='" + name + "',`idnum`='" + idnum+ "',`dexpire`='" + dexpire + "',`gen`='" + gender + "',`address`='"
                + adress + "',`tel`='" + tel + "',`email`='" + email + "' WHERE mid='" + mid + "'";

        if (txtmid.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtidnum.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (((JTextField) txtdayexpire.getDateEditor().getUiComponent()).getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (cbgen.getSelectedItem().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtadd.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txttel.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtemail.getText().trim().isEmpty()) {
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

        String sql = "DELETE FROM `addmember` WHERE mid='" + txtmid.getText() + "'";
        if (txtname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "เลือกลูกค้าที่ต้องการลบข้อมูล", "error!!", JOptionPane.ERROR_MESSAGE);
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

    private void tbmemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbmemberMouseClicked
        DefaultTableModel model = (DefaultTableModel) tbmember.getModel();
        int selectrowindex = tbmember.getSelectedRow();
        txtmid.setText(model.getValueAt(selectrowindex, 0).toString());
        txtname.setText(model.getValueAt(selectrowindex, 1).toString());
        txtidnum.setText(model.getValueAt(selectrowindex, 2).toString());
        ((JTextField) txtdayexpire.getDateEditor().getUiComponent()).setText(model.getValueAt(selectrowindex, 3).toString());
        cbgen.setSelectedItem(model.getValueAt(selectrowindex, 4).toString());
        txtadd.setText(model.getValueAt(selectrowindex, 5).toString());
        txttel.setText(model.getValueAt(selectrowindex, 6).toString());
        txtemail.setText(model.getValueAt(selectrowindex, 7).toString());
    }//GEN-LAST:event_tbmemberMouseClicked


    private void clearFild() {
        txtmid.setText("");
        txtname.setText("");
        txtidnum.setText("");
        ((JTextField) txtdayexpire.getDateEditor().getUiComponent()).setText("");
        cbgen.setSelectedIndex(0);
        txtadd.setText("");
        txttel.setText("");
        txtemail.setText("");
    }

    private void autoId() {
        try {
            String sql = "SELECT `mid` FROM `addmember` ORDER BY mid DESC LIMIT 1";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String rnno = rs.getString("mid");
                int co = rnno.length();
                String txt = rnno.substring(0, 2);
                String num = rnno.substring(2, co);
                int n = Integer.parseInt(num);
                n++;
                String snum = Integer.toString(n);
                String ftxt = txt + snum;
                txtmid.setText(ftxt);
            } else {
                txtmid.setText("FM101");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        private void showdata() {
        tbmember.getTableHeader().setBackground(new Color(255, 204, 51));
        String sql = "SELECT `mid`AS รหัสลูกค้า, `mname`AS ชื่อลูกค้า, `idnum`AS เลขที่บัตรประชาชน, `dexpire`AS บัตรหมดอายุ, `gen`AS เพศ,"
                + " `address`AS ที่อยู่, `tel`AS เบอร์โทร, `email`AS อีเมล FROM `addmember`";
        try {
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tbmember.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndel;
    private javax.swing.JButton btnedit;
    private javax.swing.JComboBox cbgen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTable tbmember;
    private javax.swing.JTextArea txtadd;
    private com.toedter.calendar.JDateChooser txtdayexpire;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtidnum;
    private javax.swing.JTextField txtmid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables

}
