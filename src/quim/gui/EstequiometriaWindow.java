package quim.gui;

import java.awt.Component;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import quim.utilidades.BorderBackImage;
import quim.utilidades.ImagePanel;

public class EstequiometriaWindow extends javax.swing.JFrame {

    public EstequiometriaWindow() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("res/estequio.png"));
        initComponents();
        
        addTabTo("Binarios", "bin", paneCompuestos, 0);
        addTabTo("Ternarios", "tri", paneCompuestos, 1);
        addTabTo("Cuaternarios", "cua", paneCompuestos, 2);
        
        addTabTo("Oxigenados  ", "o", paneBinarios, 0);
        addTabTo("Hidrogenados", "h", paneBinarios, 1);
        addTabTo("Sales       ", "sal", paneBinarios, 2);
        
        addTabTo("Compuestos  ", "compuesto", paneTernarios, 0);
        
        addTabTo("Sales Neutras  ", "salneu", paneCuaternarios, 0);
        
        desktopBinarios.setBorder(new BorderBackImage());
        desktopTernarios.setBorder(new BorderBackImage());
        desktopCuaternarios.setBorder(new BorderBackImage());
        
        JPanel objPanel = new ImagePanel("res/background5.jpg");
        objPanel.setSize(this.getWidth(), this.getHeight());
        this.add(objPanel);
        this.validate();
    }
    
    private void addTabTo(String title, String img, JTabbedPane pane, int idx){
        JLabel lbl = new JLabel(title);
        Icon icon = new ImageIcon(getClass().getResource("/quim/img/"+img+".png"));
        lbl.setIcon(icon);

        lbl.setIconTextGap(2);
        lbl.setHorizontalTextPosition(SwingConstants.RIGHT);
        
        pane.setTabComponentAt(idx, lbl);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneCompuestos = new javax.swing.JTabbedPane();
        panelBinarios = new javax.swing.JPanel();
        paneBinarios = new javax.swing.JTabbedPane();
        panelOxigenados = new javax.swing.JPanel();
        toolBarOxi = new javax.swing.JToolBar();
        botonOxB = new javax.swing.JButton();
        botonOxA = new javax.swing.JButton();
        panelHidrogenados = new javax.swing.JPanel();
        toolBarHidro = new javax.swing.JToolBar();
        botonHidrM = new javax.swing.JButton();
        botonHidrNM = new javax.swing.JButton();
        botonAcidHidr = new javax.swing.JButton();
        toolBarSal = new javax.swing.JToolBar();
        botonSalBin = new javax.swing.JButton();
        desktopBinarios = new javax.swing.JDesktopPane();
        panelTernarios = new javax.swing.JPanel();
        paneTernarios = new javax.swing.JTabbedPane();
        panelCompuestosTernarios = new javax.swing.JPanel();
        toolBarTernarios = new javax.swing.JToolBar();
        botonOxacidos = new javax.swing.JButton();
        botonHidrox = new javax.swing.JButton();
        botonOxisal = new javax.swing.JButton();
        desktopTernarios = new javax.swing.JDesktopPane();
        panelCuaternarios = new javax.swing.JPanel();
        paneCuaternarios = new javax.swing.JTabbedPane();
        panelCompuestosTernarios1 = new javax.swing.JPanel();
        toolBarCuaternarios = new javax.swing.JToolBar();
        botonSalAgua = new javax.swing.JButton();
        botonOxisalAgua = new javax.swing.JButton();
        desktopCuaternarios = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cálculos Estequiométricos");
        setLocationByPlatform(true);
        setResizable(false);

        paneCompuestos.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N

        paneBinarios.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        paneBinarios.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N

        toolBarOxi.setBorder(null);
        toolBarOxi.setFloatable(false);
        toolBarOxi.setOrientation(javax.swing.SwingConstants.VERTICAL);
        toolBarOxi.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        botonOxB.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        botonOxB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/oxb.png"))); // NOI18N
        botonOxB.setText("Óxidos Básicos");
        botonOxB.setFocusable(false);
        botonOxB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonOxB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonOxB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOxBActionPerformed(evt);
            }
        });
        toolBarOxi.add(botonOxB);

        botonOxA.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        botonOxA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/oxa.png"))); // NOI18N
        botonOxA.setText("Óxidos Ácidos");
        botonOxA.setFocusable(false);
        botonOxA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonOxA.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonOxA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOxAActionPerformed(evt);
            }
        });
        toolBarOxi.add(botonOxA);

        javax.swing.GroupLayout panelOxigenadosLayout = new javax.swing.GroupLayout(panelOxigenados);
        panelOxigenados.setLayout(panelOxigenadosLayout);
        panelOxigenadosLayout.setHorizontalGroup(
            panelOxigenadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBarOxi, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
        );
        panelOxigenadosLayout.setVerticalGroup(
            panelOxigenadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBarOxi, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        paneBinarios.addTab("tab1", panelOxigenados);

        toolBarHidro.setBorder(null);
        toolBarHidro.setFloatable(false);
        toolBarHidro.setOrientation(javax.swing.SwingConstants.VERTICAL);

        botonHidrM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/hmet.png"))); // NOI18N
        botonHidrM.setText("Hidruros Metálicos");
        botonHidrM.setFocusable(false);
        botonHidrM.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonHidrM.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonHidrM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHidrMActionPerformed(evt);
            }
        });
        toolBarHidro.add(botonHidrM);

        botonHidrNM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/hnmet.png"))); // NOI18N
        botonHidrNM.setText("Hidruros No Metálicos");
        botonHidrNM.setFocusable(false);
        botonHidrNM.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonHidrNM.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonHidrNM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHidrNMActionPerformed(evt);
            }
        });
        toolBarHidro.add(botonHidrNM);

        botonAcidHidr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/hac.png"))); // NOI18N
        botonAcidHidr.setText("Ácidos Hidrácidos");
        botonAcidHidr.setFocusable(false);
        botonAcidHidr.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAcidHidr.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAcidHidr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcidHidrActionPerformed(evt);
            }
        });
        toolBarHidro.add(botonAcidHidr);

        javax.swing.GroupLayout panelHidrogenadosLayout = new javax.swing.GroupLayout(panelHidrogenados);
        panelHidrogenados.setLayout(panelHidrogenadosLayout);
        panelHidrogenadosLayout.setHorizontalGroup(
            panelHidrogenadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBarHidro, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
        );
        panelHidrogenadosLayout.setVerticalGroup(
            panelHidrogenadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBarHidro, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        paneBinarios.addTab("tab2", panelHidrogenados);

        toolBarSal.setBorder(null);
        toolBarSal.setFloatable(false);
        toolBarSal.setOrientation(javax.swing.SwingConstants.VERTICAL);

        botonSalBin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/salbin.png"))); // NOI18N
        botonSalBin.setText("Sal Binaria");
        botonSalBin.setFocusable(false);
        botonSalBin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSalBin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonSalBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalBinActionPerformed(evt);
            }
        });
        toolBarSal.add(botonSalBin);

        paneBinarios.addTab("tab4", toolBarSal);

        javax.swing.GroupLayout desktopBinariosLayout = new javax.swing.GroupLayout(desktopBinarios);
        desktopBinarios.setLayout(desktopBinariosLayout);
        desktopBinariosLayout.setHorizontalGroup(
            desktopBinariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 911, Short.MAX_VALUE)
        );
        desktopBinariosLayout.setVerticalGroup(
            desktopBinariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBinariosLayout = new javax.swing.GroupLayout(panelBinarios);
        panelBinarios.setLayout(panelBinariosLayout);
        panelBinariosLayout.setHorizontalGroup(
            panelBinariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBinariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneBinarios, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopBinarios))
        );
        panelBinariosLayout.setVerticalGroup(
            panelBinariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneBinarios)
            .addComponent(desktopBinarios)
        );

        paneCompuestos.addTab("tab1", panelBinarios);

        paneTernarios.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        paneTernarios.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        paneTernarios.setPreferredSize(new java.awt.Dimension(318, 551));

        toolBarTernarios.setBorder(null);
        toolBarTernarios.setFloatable(false);
        toolBarTernarios.setOrientation(javax.swing.SwingConstants.VERTICAL);

        botonOxacidos.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        botonOxacidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/oxacidos.png"))); // NOI18N
        botonOxacidos.setText("Oxácidos");
        botonOxacidos.setFocusable(false);
        botonOxacidos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonOxacidos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonOxacidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOxacidosActionPerformed(evt);
            }
        });
        toolBarTernarios.add(botonOxacidos);

        botonHidrox.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        botonHidrox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/hidroxido.png"))); // NOI18N
        botonHidrox.setText("Hidróxidos");
        botonHidrox.setFocusable(false);
        botonHidrox.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonHidrox.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonHidrox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHidroxActionPerformed(evt);
            }
        });
        toolBarTernarios.add(botonHidrox);

        botonOxisal.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        botonOxisal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/oxisal.png"))); // NOI18N
        botonOxisal.setText("Oxisal");
        botonOxisal.setFocusable(false);
        botonOxisal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonOxisal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonOxisal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOxisalActionPerformed(evt);
            }
        });
        toolBarTernarios.add(botonOxisal);

        javax.swing.GroupLayout panelCompuestosTernariosLayout = new javax.swing.GroupLayout(panelCompuestosTernarios);
        panelCompuestosTernarios.setLayout(panelCompuestosTernariosLayout);
        panelCompuestosTernariosLayout.setHorizontalGroup(
            panelCompuestosTernariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBarTernarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelCompuestosTernariosLayout.setVerticalGroup(
            panelCompuestosTernariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBarTernarios, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        paneTernarios.addTab("tab1", panelCompuestosTernarios);

        javax.swing.GroupLayout desktopTernariosLayout = new javax.swing.GroupLayout(desktopTernarios);
        desktopTernarios.setLayout(desktopTernariosLayout);
        desktopTernariosLayout.setHorizontalGroup(
            desktopTernariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 911, Short.MAX_VALUE)
        );
        desktopTernariosLayout.setVerticalGroup(
            desktopTernariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelTernariosLayout = new javax.swing.GroupLayout(panelTernarios);
        panelTernarios.setLayout(panelTernariosLayout);
        panelTernariosLayout.setHorizontalGroup(
            panelTernariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTernariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneTernarios, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopTernarios))
        );
        panelTernariosLayout.setVerticalGroup(
            panelTernariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneTernarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktopTernarios)
        );

        paneCompuestos.addTab("tab2", panelTernarios);

        paneCuaternarios.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        paneCuaternarios.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        paneCuaternarios.setPreferredSize(new java.awt.Dimension(318, 551));

        toolBarCuaternarios.setBorder(null);
        toolBarCuaternarios.setFloatable(false);
        toolBarCuaternarios.setOrientation(javax.swing.SwingConstants.VERTICAL);

        botonSalAgua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/salagua.png"))); // NOI18N
        botonSalAgua.setText("Sal más Agua");
        botonSalAgua.setFocusable(false);
        botonSalAgua.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSalAgua.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonSalAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalAguaActionPerformed(evt);
            }
        });
        toolBarCuaternarios.add(botonSalAgua);

        botonOxisalAgua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/oxisalagua.png"))); // NOI18N
        botonOxisalAgua.setText("Oxisal mas Agua");
        botonOxisalAgua.setFocusable(false);
        botonOxisalAgua.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonOxisalAgua.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonOxisalAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOxisalAguaActionPerformed(evt);
            }
        });
        toolBarCuaternarios.add(botonOxisalAgua);

        javax.swing.GroupLayout panelCompuestosTernarios1Layout = new javax.swing.GroupLayout(panelCompuestosTernarios1);
        panelCompuestosTernarios1.setLayout(panelCompuestosTernarios1Layout);
        panelCompuestosTernarios1Layout.setHorizontalGroup(
            panelCompuestosTernarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBarCuaternarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelCompuestosTernarios1Layout.setVerticalGroup(
            panelCompuestosTernarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBarCuaternarios, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        paneCuaternarios.addTab("tab1", panelCompuestosTernarios1);

        javax.swing.GroupLayout desktopCuaternariosLayout = new javax.swing.GroupLayout(desktopCuaternarios);
        desktopCuaternarios.setLayout(desktopCuaternariosLayout);
        desktopCuaternariosLayout.setHorizontalGroup(
            desktopCuaternariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 911, Short.MAX_VALUE)
        );
        desktopCuaternariosLayout.setVerticalGroup(
            desktopCuaternariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelCuaternariosLayout = new javax.swing.GroupLayout(panelCuaternarios);
        panelCuaternarios.setLayout(panelCuaternariosLayout);
        panelCuaternariosLayout.setHorizontalGroup(
            panelCuaternariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuaternariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneCuaternarios, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopCuaternarios))
        );
        panelCuaternariosLayout.setVerticalGroup(
            panelCuaternariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneCuaternarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktopCuaternarios)
        );

        paneCompuestos.addTab("tab3", panelCuaternarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneCompuestos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(paneCompuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonOxBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOxBActionPerformed
        try {
            CalculadorCompuestoBinario ccb
                    = new CalculadorCompuestoBinario(CalculadorCompuestoBinario.OXIDOS_BASICOS);
            ccb.setVisible(true);
            ccb.setName("OxB");
            boolean exists = false;
            for(Component com : desktopBinarios.getAllFrames()) {
                if(com.getName() != null && com.getName().equals("OxB"))
                    exists = true;
            }
            if(!exists)
                desktopBinarios.add("OxB", ccb);
            ccb.moveToFront();
        } catch (IOException ex) {
            Logger.getLogger(EstequiometriaWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonOxBActionPerformed

    private void botonOxAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOxAActionPerformed
        try {
            CalculadorCompuestoBinario ccb
                    = new CalculadorCompuestoBinario(CalculadorCompuestoBinario.OXIDOS_ACIDOS);
            ccb.setVisible(true);
            ccb.setName("OxA");
            for(Component com : desktopBinarios.getComponents()) {
                if(com.getName() != null && com.getName().equals("OxA"))
                    return;
            }
            desktopBinarios.add("OxA", ccb);
            ccb.moveToFront();
        } catch (IOException ex) {
            Logger.getLogger(EstequiometriaWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonOxAActionPerformed

    private void botonHidrMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHidrMActionPerformed
        try {
            CalculadorCompuestoBinario ccb
                    = new CalculadorCompuestoBinario(CalculadorCompuestoBinario.HIDRUROS_METALICOS);
            ccb.setVisible(true);
            ccb.setName("HiM");
            for(Component com : desktopBinarios.getComponents()) {
                if(com.getName().equals("HiM"))
                    return;
            }
            desktopBinarios.add("HiM", ccb);
            ccb.moveToFront();
        } catch (IOException ex) {
            Logger.getLogger(EstequiometriaWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonHidrMActionPerformed

    private void botonHidrNMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHidrNMActionPerformed
        try {
            CalculadorCompuestoBinario ccb
                    = new CalculadorCompuestoBinario(CalculadorCompuestoBinario.HIDRUROS_NO_METALICOS);
            ccb.setVisible(true);
            ccb.setName("HnM");
            for(Component com : desktopBinarios.getComponents()) {
                if(com.getName().equals("HnM"))
                    return;
            }
            desktopBinarios.add("HnM", ccb);
            ccb.moveToFront();
        } catch (IOException ex) {
            Logger.getLogger(EstequiometriaWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonHidrNMActionPerformed

    private void botonAcidHidrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAcidHidrActionPerformed
        try {
            CalculadorCompuestoBinario ccb
                    = new CalculadorCompuestoBinario(CalculadorCompuestoBinario.ACIDOS_HIDRACIDOS);
            ccb.setVisible(true);
            ccb.setName("AcH");
            for(Component com : desktopBinarios.getComponents()) {
                if(com.getName().equals("AcH"))
                    return;
            }
            desktopBinarios.add("AcH", ccb);
            ccb.moveToFront();
        } catch (IOException ex) {
            Logger.getLogger(EstequiometriaWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonAcidHidrActionPerformed

    private void botonSalBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalBinActionPerformed
        try {
            CalculadorCompuestoBinario ccb
                    = new CalculadorCompuestoBinario(CalculadorCompuestoBinario.SAL_BINARIA);
            ccb.setVisible(true);
            ccb.setName("SaB");
            for(Component com : desktopBinarios.getComponents()) {
                if(com.getName().equals("SaB"))
                    return;
            }
            desktopBinarios.add("SaB", ccb);
            ccb.moveToFront();
        } catch (IOException ex) {
            Logger.getLogger(EstequiometriaWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonSalBinActionPerformed

    private void botonOxacidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOxacidosActionPerformed
        CalculadorCompuestoTernario cct 
                = new CalculadorCompuestoTernario();
        cct.setVisible(true);
        cct.setName("OiA");
        for(Component com : desktopTernarios.getComponents()) {
            if(com.getName().equals("OiA"))
                return;
        }
        desktopTernarios.add("OiA", cct);
        cct.moveToFront();
    }//GEN-LAST:event_botonOxacidosActionPerformed

    private void botonHidroxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHidroxActionPerformed
        CalculadorCompuestoTernario2 cct 
                = new CalculadorCompuestoTernario2(0);
        cct.setVisible(true);
        cct.setName("HxA");
        for(Component com : desktopTernarios.getComponents()) {
            if(com.getName().equals("HxA"))
                return;
        }
        desktopTernarios.add("HxA", cct);
        cct.moveToFront();
    }//GEN-LAST:event_botonHidroxActionPerformed

    private void botonOxisalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOxisalActionPerformed
        CalculadorCompuestoTernario2 cct 
                = new CalculadorCompuestoTernario2(1);
        cct.setVisible(true);
        cct.setName("OxS");
        for(Component com : desktopTernarios.getComponents()) {
            if(com.getName().equals("OxS"))
                return;
        }
        desktopTernarios.add("OxS", cct);
        cct.moveToFront();
    }//GEN-LAST:event_botonOxisalActionPerformed

    private void botonSalAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalAguaActionPerformed
        CalculadorCompuestoCuaternario ccc 
                = new CalculadorCompuestoCuaternario();
        ccc.setVisible(true);
        ccc.setName("SaA");
        for(Component com : desktopCuaternarios.getComponents()) {
            if(com.getName().equals("SaA"))
                return;
        }
        desktopCuaternarios.add("SaA", ccc);
        ccc.moveToFront();
    }//GEN-LAST:event_botonSalAguaActionPerformed

    private void botonOxisalAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOxisalAguaActionPerformed
        CalculadorCompuestoCuaternario2 ccc2 
                = new CalculadorCompuestoCuaternario2();
        ccc2.setVisible(true);
        ccc2.setName("OsA");
        for(Component com : desktopCuaternarios.getComponents()) {
            if(com.getName().equals("OsA"))
                return;
        }
        desktopCuaternarios.add("OsA", ccc2);
        ccc2.moveToFront();
    }//GEN-LAST:event_botonOxisalAguaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAcidHidr;
    private javax.swing.JButton botonHidrM;
    private javax.swing.JButton botonHidrNM;
    private javax.swing.JButton botonHidrox;
    private javax.swing.JButton botonOxA;
    private javax.swing.JButton botonOxB;
    private javax.swing.JButton botonOxacidos;
    private javax.swing.JButton botonOxisal;
    private javax.swing.JButton botonOxisalAgua;
    private javax.swing.JButton botonSalAgua;
    private javax.swing.JButton botonSalBin;
    private javax.swing.JDesktopPane desktopBinarios;
    private javax.swing.JDesktopPane desktopCuaternarios;
    private javax.swing.JDesktopPane desktopTernarios;
    private javax.swing.JTabbedPane paneBinarios;
    private javax.swing.JTabbedPane paneCompuestos;
    private javax.swing.JTabbedPane paneCuaternarios;
    private javax.swing.JTabbedPane paneTernarios;
    private javax.swing.JPanel panelBinarios;
    private javax.swing.JPanel panelCompuestosTernarios;
    private javax.swing.JPanel panelCompuestosTernarios1;
    private javax.swing.JPanel panelCuaternarios;
    private javax.swing.JPanel panelHidrogenados;
    private javax.swing.JPanel panelOxigenados;
    private javax.swing.JPanel panelTernarios;
    private javax.swing.JToolBar toolBarCuaternarios;
    private javax.swing.JToolBar toolBarHidro;
    private javax.swing.JToolBar toolBarOxi;
    private javax.swing.JToolBar toolBarSal;
    private javax.swing.JToolBar toolBarTernarios;
    // End of variables declaration//GEN-END:variables
}
