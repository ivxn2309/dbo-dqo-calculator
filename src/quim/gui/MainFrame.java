package quim.gui;

import java.awt.Toolkit;
import javax.swing.JPanel;
import quim.utilidades.ImagePanel;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("res/icon.png"));
        initComponents();
        JPanel objPanel = new ImagePanel("res/background5.jpg");
        objPanel.setSize(this.getWidth(), this.getHeight());
        this.add(objPanel);
        this.validate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBar1 = new javax.swing.JToolBar();
        botonEstequiometria = new javax.swing.JButton();
        botonDBO = new javax.swing.JButton();
        toolBar2 = new javax.swing.JToolBar();
        botonDQO = new javax.swing.JButton();
        botonMacromedidor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cálculos DBO y DQO");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        setLocationByPlatform(true);
        setName("mainFrame"); // NOI18N
        setResizable(false);

        toolBar1.setBorder(null);
        toolBar1.setFloatable(false);
        toolBar1.setBorderPainted(false);

        botonEstequiometria.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        botonEstequiometria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/estequio.png"))); // NOI18N
        botonEstequiometria.setText("Estequiometría");
        botonEstequiometria.setToolTipText("Cálculos estequiométricos");
        botonEstequiometria.setFocusable(false);
        botonEstequiometria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonEstequiometria.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonEstequiometria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEstequiometriaActionPerformed(evt);
            }
        });
        toolBar1.add(botonEstequiometria);

        botonDBO.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        botonDBO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/dbo.png"))); // NOI18N
        botonDBO.setText("DBO");
        botonDBO.setToolTipText("Demanda Biológica de Oxígeno");
        botonDBO.setFocusable(false);
        botonDBO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonDBO.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar1.add(botonDBO);

        toolBar2.setBorder(null);
        toolBar2.setFloatable(false);
        toolBar2.setBorderPainted(false);

        botonDQO.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        botonDQO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/dqo.png"))); // NOI18N
        botonDQO.setText("DQO");
        botonDQO.setToolTipText("Demanda Química de Oxígeno");
        botonDQO.setFocusable(false);
        botonDQO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonDQO.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar2.add(botonDQO);

        botonMacromedidor.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        botonMacromedidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/medidor.png"))); // NOI18N
        botonMacromedidor.setText("Macromedidor");
        botonMacromedidor.setToolTipText("Cálculos de Macromedidor");
        botonMacromedidor.setFocusable(false);
        botonMacromedidor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonMacromedidor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar2.add(botonMacromedidor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(toolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEstequiometriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEstequiometriaActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new EstequiometriaWindow().setVisible(true);
        });
    }//GEN-LAST:event_botonEstequiometriaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDBO;
    private javax.swing.JButton botonDQO;
    private javax.swing.JButton botonEstequiometria;
    private javax.swing.JButton botonMacromedidor;
    private javax.swing.JToolBar toolBar1;
    private javax.swing.JToolBar toolBar2;
    // End of variables declaration//GEN-END:variables
}

