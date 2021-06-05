package Interface;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {
    
    public Home() {
        initComponents();
        clock();
    }

    public void clock() {
        Thread clock = new Thread() {

            public void run() {
                try {
                    while (true) {
                        Calendar cal = new GregorianCalendar();
                        int day = cal.get(Calendar.DAY_OF_MONTH);
                        int month = cal.get(Calendar.MONTH) + 1;
                        int year = cal.get(Calendar.YEAR);

                        int second = cal.get(Calendar.SECOND);
                        int minute = cal.get(Calendar.MINUTE);
                        int hour = cal.get(Calendar.HOUR);

                        lbTime.setText(hour + ":" + minute + ":" + second);
                        lbDate.setText(day + "-" + month + "-" + year);
                        sleep(1000);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        clock.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnallmember = new javax.swing.JButton();
        btnallitem = new javax.swing.JButton();
        btnpawnding = new javax.swing.JButton();
        btnpawnhis = new javax.swing.JButton();
        btnsellhis = new javax.swing.JButton();
        btnbackup = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnpawn = new javax.swing.JButton();
        btnadditem = new javax.swing.JButton();
        btnreturn = new javax.swing.JButton();
        btnaddmember = new javax.swing.JButton();
        btnhome2 = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        btnsell = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        homeDesktop = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ระบบบริหารจัดการโรงรับจำนำ");
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 5, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnallmember.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnallmember.setForeground(new java.awt.Color(143, 60, 16));
        btnallmember.setText("รายชื่อลูกค้า");
        btnallmember.setFocusable(false);
        btnallmember.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnallmember.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnallmember.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnallmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnallmemberActionPerformed(evt);
            }
        });
        jToolBar1.add(btnallmember);

        btnallitem.setFont(new java.awt.Font("Tahoma", 1, 16));
        btnallitem.setForeground(new java.awt.Color(143, 60, 16));
        btnallitem.setText("รายการสินค้าหลุดจำนำ");
        btnallitem.setFocusable(false);
        btnallitem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnallitem.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnallitem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnallitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnallitemActionPerformed(evt);
            }
        });
        jToolBar1.add(btnallitem);

        btnpawnding.setFont(new java.awt.Font("Tahoma", 1, 16));
        btnpawnding.setForeground(new java.awt.Color(143, 60, 16));
        btnpawnding.setText("ของที่จำนำไว้");
        btnpawnding.setFocusable(false);
        btnpawnding.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnpawnding.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnpawnding.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnpawnding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpawndingActionPerformed(evt);
            }
        });
        jToolBar1.add(btnpawnding);

        btnpawnhis.setFont(new java.awt.Font("Tahoma", 1, 16));
        btnpawnhis.setForeground(new java.awt.Color(143, 60, 16));
        btnpawnhis.setText("ประวัติการจำนำ");
        btnpawnhis.setFocusable(false);
        btnpawnhis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnpawnhis.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnpawnhis.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnpawnhis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpawnhisActionPerformed(evt);
            }
        });
        jToolBar1.add(btnpawnhis);

        btnsellhis.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnsellhis.setForeground(new java.awt.Color(143, 60, 16));
        btnsellhis.setText("ประวัติการขายสินค้า");
        btnsellhis.setFocusable(false);
        btnsellhis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsellhis.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnsellhis.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnsellhis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsellhisActionPerformed(evt);
            }
        });
        jToolBar1.add(btnsellhis);

        btnbackup.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnbackup.setForeground(new java.awt.Color(143, 60, 16));
        btnbackup.setText("Backup and Restore");
        btnbackup.setFocusable(false);
        btnbackup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnbackup.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnbackup.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnbackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackupActionPerformed(evt);
            }
        });
        jToolBar1.add(btnbackup);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1190, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 48));
        jLabel9.setForeground(new java.awt.Color(143, 60, 16));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/img/Logo3.png"))); // NOI18N
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 138, 160, 80));

        lbTime.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbTime.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lbTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 60, 190, 40));

        lbDate.setFont(new java.awt.Font("Tahoma", 0, 36));
        lbDate.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(lbDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 190, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 52)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(143, 60, 16));
        jLabel12.setText("โรงรับจำนำ Fast Money");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 80));

        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1210, 80));

        btnpawn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnpawn.setForeground(new java.awt.Color(143, 60, 16));
        btnpawn.setText("จำนำของ");
        btnpawn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpawnActionPerformed(evt);
            }
        });
        jPanel1.add(btnpawn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 180, 40));

        btnadditem.setFont(new java.awt.Font("Tahoma", 1, 16));
        btnadditem.setForeground(new java.awt.Color(143, 60, 16));
        btnadditem.setText("สินค้าหลุดจำนำ");
        btnadditem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadditemActionPerformed(evt);
            }
        });
        jPanel1.add(btnadditem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 180, 40));

        btnreturn.setFont(new java.awt.Font("Tahoma", 1, 16));
        btnreturn.setForeground(new java.awt.Color(143, 60, 16));
        btnreturn.setText("ไถ่คืนของ");
        btnreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnreturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 180, 40));

        btnaddmember.setFont(new java.awt.Font("Tahoma", 1, 16));
        btnaddmember.setForeground(new java.awt.Color(143, 60, 16));
        btnaddmember.setText("เพิ่มข้อมูลลูกค้า");
        btnaddmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddmemberActionPerformed(evt);
            }
        });
        jPanel1.add(btnaddmember, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 180, 40));

        btnhome2.setFont(new java.awt.Font("Tahoma", 1, 16));
        btnhome2.setForeground(new java.awt.Color(143, 60, 16));
        btnhome2.setText("หน้าแรก");
        btnhome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhome2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnhome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 180, 40));

        btnexit.setFont(new java.awt.Font("Tahoma", 1, 16));
        btnexit.setForeground(new java.awt.Color(143, 60, 16));
        btnexit.setText("ออกจากระบบ");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel1.add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 180, 40));

        btnsell.setFont(new java.awt.Font("Tahoma", 1, 16));
        btnsell.setForeground(new java.awt.Color(143, 60, 16));
        btnsell.setText("ขายสินค้าหลุดจำนำ");
        btnsell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsellActionPerformed(evt);
            }
        });
        jPanel1.add(btnsell, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 180, 40));

        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 590));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/img/ww2.png"))); // NOI18N
        jLabel3.setBounds(0, 0, 980, 560);
        homeDesktop.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.add(homeDesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 980, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1218)/2, (screenSize.height-747)/2, 1218, 747);
    }// </editor-fold>//GEN-END:initComponents

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
    if(JOptionPane.showConfirmDialog(this ,"ยืนยันการออกจากโปรแกรม","ยืนยัน",JOptionPane.YES_NO_CANCEL_OPTION)==JOptionPane.YES_NO_OPTION)
    {System.exit(0);}
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnpawnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpawnActionPerformed
        homeDesktop.removeAll();
        pawn pn = new pawn();
        homeDesktop.add(pn).setVisible(true);
    }//GEN-LAST:event_btnpawnActionPerformed

    private void btnreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreturnActionPerformed
        homeDesktop.removeAll();
        Return rn = new Return();
        homeDesktop.add(rn).setVisible(true);
    }//GEN-LAST:event_btnreturnActionPerformed

    private void btnadditemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadditemActionPerformed
        homeDesktop.removeAll();
        additem it = new additem();
        homeDesktop.add(it).setVisible(true);
    }//GEN-LAST:event_btnadditemActionPerformed

    private void btnsellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsellActionPerformed
        homeDesktop.removeAll();
        sellitem sl = new sellitem();
        homeDesktop.add(sl).setVisible(true);
    }//GEN-LAST:event_btnsellActionPerformed

    private void btnaddmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddmemberActionPerformed
        homeDesktop.removeAll();
        addmember am = new addmember();
        homeDesktop.add(am).setVisible(true);
    }//GEN-LAST:event_btnaddmemberActionPerformed

    private void btnhome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhome2ActionPerformed
        homeDesktop.removeAll();
        Home2 h2 = new Home2();
        homeDesktop.add(h2).setVisible(true);
    }//GEN-LAST:event_btnhome2ActionPerformed

    private void btnallmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnallmemberActionPerformed
        homeDesktop.removeAll();
        allmember alm = new allmember();
        homeDesktop.add(alm).setVisible(true);
    }//GEN-LAST:event_btnallmemberActionPerformed

    private void btnallitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnallitemActionPerformed
        homeDesktop.removeAll();
        allitem ait = new allitem();
        homeDesktop.add(ait).setVisible(true);
    }//GEN-LAST:event_btnallitemActionPerformed

    private void btnpawndingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpawndingActionPerformed
        homeDesktop.removeAll();
        pawnding pd = new pawnding();
        homeDesktop.add(pd).setVisible(true);
    }//GEN-LAST:event_btnpawndingActionPerformed

    private void btnpawnhisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpawnhisActionPerformed
        homeDesktop.removeAll();
        pawnhis ph = new pawnhis();
        homeDesktop.add(ph).setVisible(true);
    }//GEN-LAST:event_btnpawnhisActionPerformed

    private void btnsellhisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsellhisActionPerformed
        homeDesktop.removeAll();
        sellhis sh = new sellhis();
        homeDesktop.add(sh).setVisible(true);
    }//GEN-LAST:event_btnsellhisActionPerformed

    private void btnbackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackupActionPerformed
        homeDesktop.removeAll();
        SQLBackupAndRestore bk = new SQLBackupAndRestore();
        homeDesktop.add(bk).setVisible(true);
    }//GEN-LAST:event_btnbackupActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadditem;
    private javax.swing.JButton btnaddmember;
    private javax.swing.JButton btnallitem;
    private javax.swing.JButton btnallmember;
    private javax.swing.JButton btnbackup;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnhome2;
    private javax.swing.JButton btnpawn;
    private javax.swing.JButton btnpawnding;
    private javax.swing.JButton btnpawnhis;
    private javax.swing.JButton btnreturn;
    private javax.swing.JButton btnsell;
    private javax.swing.JButton btnsellhis;
    private javax.swing.JDesktopPane homeDesktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbTime;
    // End of variables declaration//GEN-END:variables

}
