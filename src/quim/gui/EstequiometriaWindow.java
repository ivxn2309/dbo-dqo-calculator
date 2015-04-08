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
        
        desktopBinarios.setBorder(new BorderBackImage());
        
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
        jToolBar1 = new javax.swing.JToolBar();
        botonOxB = new javax.swing.JButton();
        botonOxA = new javax.swing.JButton();
        panelHidrogenados = new javax.swing.JPanel();
        jToolBar3 = new javax.swing.JToolBar();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        jButton3 = new javax.swing.JButton();
        desktopBinarios = new javax.swing.JDesktopPane();
        panelTernarios = new javax.swing.JPanel();
        panelCuaternarios = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cálculos Estequiométricos");
        setLocationByPlatform(true);
        setResizable(false);

        paneCompuestos.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N

        paneBinarios.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        paneBinarios.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N

        jToolBar1.setBorder(null);
        jToolBar1.setFloatable(false);
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        botonOxB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/oxb.png"))); // NOI18N
        botonOxB.setText("Óxidos Básicos");
        botonOxB.setFocusable(false);
        botonOxB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonOxB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(botonOxB);

        botonOxA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/oxa.png"))); // NOI18N
        botonOxA.setText("Óxidos Ácidos");
        botonOxA.setFocusable(false);
        botonOxA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonOxA.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(botonOxA);

        javax.swing.GroupLayout panelOxigenadosLayout = new javax.swing.GroupLayout(panelOxigenados);
        panelOxigenados.setLayout(panelOxigenadosLayout);
        panelOxigenadosLayout.setHorizontalGroup(
            panelOxigenadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
        );
        panelOxigenadosLayout.setVerticalGroup(
            panelOxigenadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        paneBinarios.addTab("tab1", panelOxigenados);

        jToolBar3.setBorder(null);
        jToolBar3.setFloatable(false);
        jToolBar3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/hmet.png"))); // NOI18N
        jButton5.setText("Hidruros Metálicos");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/hnmet.png"))); // NOI18N
        jButton6.setText("Hidruros No Metálicos");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(jButton6);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/hac.png"))); // NOI18N
        jButton7.setText("Ácidos Hidrácidos");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(jButton7);

        javax.swing.GroupLayout panelHidrogenadosLayout = new javax.swing.GroupLayout(panelHidrogenados);
        panelHidrogenados.setLayout(panelHidrogenadosLayout);
        panelHidrogenadosLayout.setHorizontalGroup(
            panelHidrogenadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
        );
        panelHidrogenadosLayout.setVerticalGroup(
            panelHidrogenadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        paneBinarios.addTab("tab2", panelHidrogenados);

        jToolBar2.setBorder(null);
        jToolBar2.setFloatable(false);
        jToolBar2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/salbin.png"))); // NOI18N
        jButton3.setText("Sal Binaria");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton3);

        paneBinarios.addTab("tab4", jToolBar2);

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
            .addComponent(paneBinarios, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
            .addComponent(desktopBinarios)
        );

        paneCompuestos.addTab("tab1", panelBinarios);

        javax.swing.GroupLayout panelTernariosLayout = new javax.swing.GroupLayout(panelTernarios);
        panelTernarios.setLayout(panelTernariosLayout);
        panelTernariosLayout.setHorizontalGroup(
            panelTernariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1019, Short.MAX_VALUE)
        );
        panelTernariosLayout.setVerticalGroup(
            panelTernariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );

        paneCompuestos.addTab("tab2", panelTernarios);

        javax.swing.GroupLayout panelCuaternariosLayout = new javax.swing.GroupLayout(panelCuaternarios);
        panelCuaternarios.setLayout(panelCuaternariosLayout);
        panelCuaternariosLayout.setHorizontalGroup(
            panelCuaternariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1019, Short.MAX_VALUE)
        );
        panelCuaternariosLayout.setVerticalGroup(
            panelCuaternariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonOxA;
    private javax.swing.JButton botonOxB;
    private javax.swing.JDesktopPane desktopBinarios;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JTabbedPane paneBinarios;
    private javax.swing.JTabbedPane paneCompuestos;
    private javax.swing.JPanel panelBinarios;
    private javax.swing.JPanel panelCuaternarios;
    private javax.swing.JPanel panelHidrogenados;
    private javax.swing.JPanel panelOxigenados;
    private javax.swing.JPanel panelTernarios;
    // End of variables declaration//GEN-END:variables
}
