package quim.gui;

import java.awt.Toolkit;
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
        botonHidrox1 = new javax.swing.JButton();
        botonOxisal1 = new javax.swing.JButton();
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
        toolBarHidro.add(botonHidrM);

        botonHidrNM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/hnmet.png"))); // NOI18N
        botonHidrNM.setText("Hidruros No Metálicos");
        botonHidrNM.setFocusable(false);
        botonHidrNM.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonHidrNM.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBarHidro.add(botonHidrNM);

        botonAcidHidr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/hac.png"))); // NOI18N
        botonAcidHidr.setText("Ácidos Hidrácidos");
        botonAcidHidr.setFocusable(false);
        botonAcidHidr.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAcidHidr.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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
        toolBarSal.add(botonSalBin);

        paneBinarios.addTab("tab4", toolBarSal);

        javax.swing.GroupLayout desktopBinariosLayout = new javax.swing.GroupLayout(desktopBinarios);
        desktopBinarios.setLayout(desktopBinariosLayout);
        desktopBinariosLayout.setHorizontalGroup(
            desktopBinariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
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
        toolBarTernarios.add(botonOxacidos);

        botonHidrox.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        botonHidrox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/hidroxido.png"))); // NOI18N
        botonHidrox.setText("Hidróxidos");
        botonHidrox.setFocusable(false);
        botonHidrox.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonHidrox.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBarTernarios.add(botonHidrox);

        botonOxisal.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        botonOxisal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/oxisal.png"))); // NOI18N
        botonOxisal.setText("Oxisal");
        botonOxisal.setFocusable(false);
        botonOxisal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonOxisal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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
            .addGap(0, 685, Short.MAX_VALUE)
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

        botonHidrox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/salagua.png"))); // NOI18N
        botonHidrox1.setText("Sal más Agua");
        botonHidrox1.setFocusable(false);
        botonHidrox1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonHidrox1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBarCuaternarios.add(botonHidrox1);

        botonOxisal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/oxisalagua.png"))); // NOI18N
        botonOxisal1.setText("Oxisal mas Agua");
        botonOxisal1.setFocusable(false);
        botonOxisal1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonOxisal1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBarCuaternarios.add(botonOxisal1);

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
            .addGap(0, 685, Short.MAX_VALUE)
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
            .addComponent(paneCompuestos, javax.swing.GroupLayout.Alignment.TRAILING)
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
        CalculadorCompuestoBinario ccb 
                = new CalculadorCompuestoBinario(CalculadorCompuestoBinario.OXIDOS_BASICOS);
        ccb.setVisible(true);
        desktopBinarios.add(ccb);
        ccb.moveToFront();
    }//GEN-LAST:event_botonOxBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAcidHidr;
    private javax.swing.JButton botonHidrM;
    private javax.swing.JButton botonHidrNM;
    private javax.swing.JButton botonHidrox;
    private javax.swing.JButton botonHidrox1;
    private javax.swing.JButton botonOxA;
    private javax.swing.JButton botonOxB;
    private javax.swing.JButton botonOxacidos;
    private javax.swing.JButton botonOxisal;
    private javax.swing.JButton botonOxisal1;
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
