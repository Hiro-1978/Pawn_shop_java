package Interface;

import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class sellhis extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public sellhis() {

        initComponents();
        conn = DBConnect.connect();
        showdata();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        datebegin = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        dateend = new com.toedter.calendar.JDateChooser();
        btnok = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbsell = new javax.swing.JTable();
        btncl = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(980, 560));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 5, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48));
        jLabel2.setForeground(new java.awt.Color(143, 60, 16));
        jLabel2.setText("ประวัติการขายสินค้า");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 410, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel3.setForeground(new java.awt.Color(143, 60, 16));
        jLabel3.setText("ชื่อสินค้า");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 70, 30));

        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 160, 30));

        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 70));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel4.setForeground(new java.awt.Color(143, 60, 16));
        jLabel4.setText("ตั้งแต่");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        datebegin.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(datebegin, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 150, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel5.setForeground(new java.awt.Color(143, 60, 16));
        jLabel5.setText("ถึง");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, -1, -1));

        dateend.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(dateend, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 150, 30));

        btnok.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnok.setForeground(new java.awt.Color(143, 60, 16));
        btnok.setText("ค้นข้อมูล");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });
        jPanel1.add(btnok, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, -1, -1));

        tbsell.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbsell);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 940, 330));

        btncl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btncl.setForeground(new java.awt.Color(143, 60, 16));
        btncl.setText("เคลียร์");
        btncl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclActionPerformed(evt);
            }
        });
        jPanel1.add(btncl, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 470, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 973, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );

        setBounds(0, 0, 989, 560);
    }// </editor-fold>//GEN-END:initComponents

    private void btnclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclActionPerformed
        txtsearch.setText("");
        showdata();
        ((JTextField) datebegin.getDateEditor().getUiComponent()).setText("");
        ((JTextField) dateend.getDateEditor().getUiComponent()).setText("");
    }//GEN-LAST:event_btnclActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        try {
            String sql = "SELECT `s_no`AS เลขที่ใบเสร็จ, `t_id`AS รหัสสินค้า, `t_name`AS ชื่อสินค้า, `t_type`AS ชนิดสินค้า, `t_dsell`AS วันที่ขาย, `t_msell`AS ผู้ขาย, `t_price`AS ราคาขาย  "
                    + "FROM `sell`WHERE t_id LIKE '%" + txtsearch.getText() + "%'";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tbsell.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }//GEN-LAST:event_txtsearchKeyReleased

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        lendFilter();
    }//GEN-LAST:event_btnokActionPerformed

    private void lendFilter() {
        String FDate = ((JTextField) datebegin.getDateEditor().getUiComponent()).getText().toString();
        String TDate = ((JTextField) dateend.getDateEditor().getUiComponent()).getText().toString();
        if (FDate.length() > 0 && TDate.isEmpty() && FDate.isEmpty() && TDate.length() > 0) {
            JOptionPane.showMessageDialog(rootPane, "กรุณาระบุช่วงวันที่จะค้นหา", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (FDate.length() > 0 && TDate.length() > 0) {
            try {
                String reportSql = "SELECT `s_no`AS เลขที่ใบเสร็จ, `t_id`AS รหัสสินค้า, `t_name`AS ชื่อสินค้า, `t_type`AS ชนิดสินค้า, `t_dsell`AS วันที่ขาย, `t_msell`AS ผู้ขาย, `t_price`AS ราคาขาย  "
                    + "FROM `sell` WHERE t_id LIKE '%" + txtsearch.getText() + "%' and t_dsell between'" + FDate + "' and '" + TDate + "' ";
                pst = (PreparedStatement) conn.prepareStatement(reportSql);
                rs = pst.executeQuery();
                tbsell.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "เลือกช่วงวันที่เพื่อดูข้อมูล");
        }
    }

    private void showdata() {
        //tblend.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        //tblend.getTableHeader().setForeground(new Color(255, 255, 255));
        tbsell.getTableHeader().setBackground(new Color(255, 204, 51));
        String sql =  "SELECT `s_no`AS เลขที่ใบเสร็จ, `t_id`AS รหัสสินค้า, `t_name`AS ชื่อสินค้า, `t_type`AS ชนิดสินค้า, `t_dsell`AS วันที่ขาย, "
                + "`t_msell`AS ผู้ขาย, `t_price`AS ราคาขาย  FROM `sell`";
        try {
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tbsell.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncl;
    private javax.swing.JButton btnok;
    private com.toedter.calendar.JDateChooser datebegin;
    private com.toedter.calendar.JDateChooser dateend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbsell;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables

}
