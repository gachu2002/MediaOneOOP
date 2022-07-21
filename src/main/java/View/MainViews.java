/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.*;

/**
 *
 * @author Administrator
 */
public class MainViews extends javax.swing.JFrame {
//    public JFrame MainViews;
//    public JFrame KhoHangViews;
//    public JFrame ThanhToanView;
//    public JFrame ChiPhiViews;

    /**
     * Creates new form MainViews
     */
    public MainViews() {
        initComponents();
        this.setLocationRelativeTo(null);      
//        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tieudemain = new javax.swing.JLabel();
        BtnKhoHang = new javax.swing.JButton();
        BtnHoaDon = new javax.swing.JButton();
        BtnNhanVien = new javax.swing.JButton();
        BtnChiPhi = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tieudemain.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tieudemain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tieudemain.setText("Hệ Thống Quản Lý Cửa Hàng Media");
        tieudemain.setAlignmentX(0.5F);

        BtnKhoHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnKhoHang.setForeground(new java.awt.Color(153, 153, 0));
        BtnKhoHang.setText("KHO HÀNG");
        BtnKhoHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKhoHangActionPerformed(evt);
            }
        });

        BtnHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnHoaDon.setForeground(new java.awt.Color(153, 153, 0));
        BtnHoaDon.setText("TẠO HÓA ĐƠN");
        BtnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHoaDonActionPerformed(evt);
            }
        });

        BtnNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnNhanVien.setForeground(new java.awt.Color(153, 153, 0));
        BtnNhanVien.setText("QUAN LY NHAN VIEN");
        BtnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNhanVienActionPerformed(evt);
            }
        });

        BtnChiPhi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnChiPhi.setForeground(new java.awt.Color(153, 153, 0));
        BtnChiPhi.setText("QUAN LY CHI PHI");
        BtnChiPhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnChiPhiActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Bell-icon.jpg"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setMaximumSize(new java.awt.Dimension(70, 70));
        jButton1.setMinimumSize(new java.awt.Dimension(70, 70));
        jButton1.setPreferredSize(new java.awt.Dimension(70, 70));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tieudemain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnKhoHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnChiPhi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(246, 246, 246)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(tieudemain, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnKhoHang, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BtnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BtnChiPhi, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(BtnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addGap(80, 80, 80))
        );

        tieudemain.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnKhoHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKhoHangActionPerformed
        // TODO add your handling code here:
        JFrame KhoHangViews = new KhoHangViews();
        KhoHangViews.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnKhoHangActionPerformed

    private void BtnChiPhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnChiPhiActionPerformed
        // TODO add your handling code here:
        
        JFrame LichSuView = new LichSuView();
        LichSuView.setVisible(true);
        this.setVisible(false);
        
//        JFrame ChiPhiViews = new ChiPhiViews();
//        ChiPhiViews.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_BtnChiPhiActionPerformed

    private void BtnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHoaDonActionPerformed
        // TODO add your handling code here:
        JFrame HoaDonViews = new ThanhToanView();
        HoaDonViews.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnHoaDonActionPerformed

    private void BtnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNhanVienActionPerformed
        // TODO add your handling code here:
        JFrame NhanVienViews = new NhanVienDuc();
        NhanVienViews.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnNhanVienActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFrame ThongBao1 = new ThongBaoView();
        ThongBao1.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnChiPhi;
    private javax.swing.JButton BtnHoaDon;
    private javax.swing.JButton BtnKhoHang;
    private javax.swing.JButton BtnNhanVien;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel tieudemain;
    // End of variables declaration//GEN-END:variables
}
