package quim.gui;

import java.awt.Component;
import java.awt.Dimension;

public class CalculadorCompuestoCuaternario extends javax.swing.JInternalFrame {
    
    public CalculadorCompuestoCuaternario() {
        initComponents();
        
        panelResultado.setVisible(false);
        panelCalculosExtra.setVisible(false);
        this.pack();
        
        this.setSize(new Dimension(754, 170));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCalculos = new javax.swing.JPanel();
        coefA = new javax.swing.JSpinner();
        elementoA = new javax.swing.JComboBox();
        subA = new javax.swing.JSpinner();
        valenciaA = new javax.swing.JComboBox();
        calcular = new javax.swing.JButton();
        labelPlus1 = new javax.swing.JLabel();
        coefC = new javax.swing.JSpinner();
        elementoC = new javax.swing.JComboBox();
        valenciaB = new javax.swing.JComboBox();
        subB = new javax.swing.JSpinner();
        subC = new javax.swing.JSpinner();
        labelParentesis1 = new javax.swing.JLabel();
        elementoD = new javax.swing.JComboBox();
        valenciaD = new javax.swing.JComboBox();
        valenciaE = new javax.swing.JComboBox();
        subD = new javax.swing.JSpinner();
        subE = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        elementoB = new javax.swing.JComboBox();
        elementoE = new javax.swing.JComboBox();
        panelResultado = new javax.swing.JPanel();
        coefRes = new javax.swing.JLabel();
        nombreResultado = new javax.swing.JLabel();
        mostrarMas = new javax.swing.JButton();
        panelCalculosExtra = new javax.swing.JPanel();
        panelDatosExtra = new javax.swing.JPanel();
        lblMoles = new javax.swing.JLabel();
        lblGramos = new javax.swing.JLabel();
        lblLitros = new javax.swing.JLabel();
        lblMoleculas = new javax.swing.JLabel();
        resMoles = new javax.swing.JLabel();
        resGramos = new javax.swing.JLabel();
        resLitros = new javax.swing.JLabel();
        resMoleculas = new javax.swing.JLabel();
        panelSolventes = new javax.swing.JPanel();
        lblLitros1 = new javax.swing.JLabel();
        resMolaridad = new javax.swing.JLabel();
        lblGramos1 = new javax.swing.JLabel();
        resMolalidad = new javax.swing.JLabel();
        lblMoleculas1 = new javax.swing.JLabel();
        resNormalidad = new javax.swing.JLabel();
        lblMoles1 = new javax.swing.JLabel();
        resPorcentual = new javax.swing.JLabel();
        lblSoluto = new javax.swing.JLabel();
        soluto = new javax.swing.JSpinner();
        lblSolvente = new javax.swing.JLabel();
        solvente = new javax.swing.JSpinner();
        nuevo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Compuestos cuaternarios");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/tri.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(730, 445));

        panelCalculos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        coefA.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        coefA.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        coefA.setToolTipText("Coeficiente");
        coefA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        coefA.setPreferredSize(new java.awt.Dimension(50, 60));

        elementoA.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        elementoA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne" }));
        elementoA.setToolTipText("Elemento");

        subA.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        subA.setToolTipText("Átomos");

        valenciaA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1" }));
        valenciaA.setToolTipText("Número de valencia");

        calcular.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        calcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/arrow.png"))); // NOI18N
        calcular.setText("Calcular");
        calcular.setToolTipText("Realiza los calculos");
        calcular.setFocusable(false);
        calcular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calcular.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        labelPlus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/plus.png"))); // NOI18N

        coefC.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        coefC.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        coefC.setToolTipText("Coeficiente");
        coefC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        coefC.setPreferredSize(new java.awt.Dimension(50, 60));

        elementoC.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        elementoC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne" }));
        elementoC.setToolTipText("Elemento");

        valenciaB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1" }));
        valenciaB.setToolTipText("Número de valencia");

        subB.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        subB.setToolTipText("Átomos");

        subC.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        subC.setToolTipText("Átomos");

        labelParentesis1.setFont(new java.awt.Font("Gulim", 0, 90)); // NOI18N
        labelParentesis1.setForeground(new java.awt.Color(153, 51, 0));
        labelParentesis1.setText("(");

        elementoD.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        elementoD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne" }));
        elementoD.setToolTipText("Elemento");

        valenciaD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1" }));
        valenciaD.setToolTipText("Número de valencia");

        valenciaE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1" }));
        valenciaE.setToolTipText("Número de valencia");

        subD.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        subD.setToolTipText("Átomos");

        subE.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        subE.setToolTipText("Átomos");

        jLabel2.setFont(new java.awt.Font("Gulim", 0, 90)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText(")");

        elementoB.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        elementoB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne" }));
        elementoB.setToolTipText("Elemento");

        elementoE.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        elementoE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne" }));
        elementoE.setToolTipText("Elemento");

        javax.swing.GroupLayout panelCalculosLayout = new javax.swing.GroupLayout(panelCalculos);
        panelCalculos.setLayout(panelCalculosLayout);
        panelCalculosLayout.setHorizontalGroup(
            panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalculosLayout.createSequentialGroup()
                .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCalculosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(coefA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(elementoA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(elementoB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelPlus1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(coefC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(elementoC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCalculosLayout.createSequentialGroup()
                        .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelCalculosLayout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(subA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(subB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCalculosLayout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(valenciaA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(valenciaB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(111, 111, 111)
                        .addComponent(subC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelParentesis1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCalculosLayout.createSequentialGroup()
                        .addComponent(elementoD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(elementoE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panelCalculosLayout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(subD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCalculosLayout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(valenciaD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(valenciaE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelCalculosLayout.setVerticalGroup(
            panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalculosLayout.createSequentialGroup()
                .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCalculosLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valenciaA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valenciaB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(coefA, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(elementoA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(elementoB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(coefC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(elementoC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCalculosLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(labelPlus1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCalculosLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelParentesis1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calcular)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCalculosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valenciaD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valenciaE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(elementoD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elementoE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelResultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        coefRes.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        coefRes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coefRes.setText("<html>H<sub><big>2</big></sub>O</html>");

        nombreResultado.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        nombreResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreResultado.setText("<html>Trióxido de <br>Carbono</html>");

        mostrarMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/more.png"))); // NOI18N
        mostrarMas.setText("Más");
        mostrarMas.setFocusable(false);
        mostrarMas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mostrarMas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mostrarMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarMasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelResultadoLayout = new javax.swing.GroupLayout(panelResultado);
        panelResultado.setLayout(panelResultadoLayout);
        panelResultadoLayout.setHorizontalGroup(
            panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(coefRes, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mostrarMas)
                .addContainerGap())
        );
        panelResultadoLayout.setVerticalGroup(
            panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelResultadoLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(coefRes))
                    .addGroup(panelResultadoLayout.createSequentialGroup()
                        .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mostrarMas)
                            .addComponent(nombreResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panelCalculosExtra.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        panelDatosExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos extra"));

        lblMoles.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMoles.setText("Moles:");

        lblGramos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGramos.setText("Gramos:");

        lblLitros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLitros.setText("Litros:");

        lblMoleculas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMoleculas.setText("Moleculas:");

        resMoles.setText("000");

        resGramos.setText("000");

        resLitros.setText("000");

        resMoleculas.setText("000");

        javax.swing.GroupLayout panelDatosExtraLayout = new javax.swing.GroupLayout(panelDatosExtra);
        panelDatosExtra.setLayout(panelDatosExtraLayout);
        panelDatosExtraLayout.setHorizontalGroup(
            panelDatosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosExtraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblMoleculas, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(lblLitros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGramos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMoles, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resMoles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resGramos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(resLitros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resMoleculas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelDatosExtraLayout.setVerticalGroup(
            panelDatosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosExtraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMoles)
                    .addComponent(resMoles))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGramos)
                    .addComponent(resGramos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLitros)
                    .addComponent(resLitros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMoleculas)
                    .addComponent(resMoleculas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelSolventes.setBorder(javax.swing.BorderFactory.createTitledBorder("Calculos Extra"));

        lblLitros1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLitros1.setText("Molaridad:");

        resMolaridad.setText("000");

        lblGramos1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGramos1.setText("Molalidad:");

        resMolalidad.setText("000");

        lblMoleculas1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMoleculas1.setText("Normalidad:");

        resNormalidad.setText("000");

        lblMoles1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMoles1.setText("Porcentual:");

        resPorcentual.setText("000");

        lblSoluto.setText("Soluto");

        soluto.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(0.0d), Double.valueOf(0.0d), null, Double.valueOf(0.1d)));

        lblSolvente.setText("Solvente");

        solvente.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(0.0d), Double.valueOf(0.0d), null, Double.valueOf(0.1d)));

        nuevo.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/new.png"))); // NOI18N
        nuevo.setText("Nuevo");
        nuevo.setFocusable(false);
        nuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSolventesLayout = new javax.swing.GroupLayout(panelSolventes);
        panelSolventes.setLayout(panelSolventesLayout);
        panelSolventesLayout.setHorizontalGroup(
            panelSolventesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSolventesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSolventesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSoluto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSolvente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soluto, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(solvente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelSolventesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelSolventesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblMoleculas1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addComponent(lblLitros1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblGramos1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblMoles1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSolventesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resMolaridad, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(resMolalidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resPorcentual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resNormalidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nuevo))
        );
        panelSolventesLayout.setVerticalGroup(
            panelSolventesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSolventesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSolventesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSolventesLayout.createSequentialGroup()
                        .addGroup(panelSolventesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSolventesLayout.createSequentialGroup()
                                .addGroup(panelSolventesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMoles1)
                                    .addComponent(resPorcentual))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelSolventesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblGramos1)
                                    .addComponent(resMolalidad)))
                            .addGroup(panelSolventesLayout.createSequentialGroup()
                                .addComponent(lblSoluto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(soluto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSolventesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSolventesLayout.createSequentialGroup()
                                .addGroup(panelSolventesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLitros1)
                                    .addComponent(resMolaridad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelSolventesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMoleculas1)
                                    .addComponent(resNormalidad)))
                            .addGroup(panelSolventesLayout.createSequentialGroup()
                                .addComponent(lblSolvente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(solvente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelSolventesLayout.createSequentialGroup()
                        .addComponent(nuevo)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout panelCalculosExtraLayout = new javax.swing.GroupLayout(panelCalculosExtra);
        panelCalculosExtra.setLayout(panelCalculosExtraLayout);
        panelCalculosExtraLayout.setHorizontalGroup(
            panelCalculosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalculosExtraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatosExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSolventes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCalculosExtraLayout.setVerticalGroup(
            panelCalculosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalculosExtraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCalculosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelDatosExtra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSolventes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCalculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelCalculosExtra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCalculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCalculosExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        panelResultado.setVisible(true);
        this.setSize(new Dimension(754, 280));
    }//GEN-LAST:event_calcularActionPerformed

    private void mostrarMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarMasActionPerformed
        panelCalculosExtra.setVisible(true);
        for(Component com : panelCalculos.getComponents()){
            com.setEnabled(false);
        }
        this.setSize(new Dimension(754, 448));
    }//GEN-LAST:event_mostrarMasActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        panelResultado.setVisible(false);
        panelCalculosExtra.setVisible(false);
        panelCalculos.setVisible(true);
        for(Component com : panelCalculos.getComponents()){
            com.setEnabled(true);
        }
        this.setSize(new Dimension(754, 170));
    }//GEN-LAST:event_nuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JSpinner coefA;
    private javax.swing.JSpinner coefC;
    private javax.swing.JLabel coefRes;
    private javax.swing.JComboBox elementoA;
    private javax.swing.JComboBox elementoB;
    private javax.swing.JComboBox elementoC;
    private javax.swing.JComboBox elementoD;
    private javax.swing.JComboBox elementoE;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelParentesis1;
    private javax.swing.JLabel labelPlus1;
    private javax.swing.JLabel lblGramos;
    private javax.swing.JLabel lblGramos1;
    private javax.swing.JLabel lblLitros;
    private javax.swing.JLabel lblLitros1;
    private javax.swing.JLabel lblMoleculas;
    private javax.swing.JLabel lblMoleculas1;
    private javax.swing.JLabel lblMoles;
    private javax.swing.JLabel lblMoles1;
    private javax.swing.JLabel lblSoluto;
    private javax.swing.JLabel lblSolvente;
    private javax.swing.JButton mostrarMas;
    private javax.swing.JLabel nombreResultado;
    private javax.swing.JButton nuevo;
    private javax.swing.JPanel panelCalculos;
    private javax.swing.JPanel panelCalculosExtra;
    private javax.swing.JPanel panelDatosExtra;
    private javax.swing.JPanel panelResultado;
    private javax.swing.JPanel panelSolventes;
    private javax.swing.JLabel resGramos;
    private javax.swing.JLabel resLitros;
    private javax.swing.JLabel resMolalidad;
    private javax.swing.JLabel resMolaridad;
    private javax.swing.JLabel resMoleculas;
    private javax.swing.JLabel resMoles;
    private javax.swing.JLabel resNormalidad;
    private javax.swing.JLabel resPorcentual;
    private javax.swing.JSpinner soluto;
    private javax.swing.JSpinner solvente;
    private javax.swing.JSpinner subA;
    private javax.swing.JSpinner subB;
    private javax.swing.JSpinner subC;
    private javax.swing.JSpinner subD;
    private javax.swing.JSpinner subE;
    private javax.swing.JComboBox valenciaA;
    private javax.swing.JComboBox valenciaB;
    private javax.swing.JComboBox valenciaD;
    private javax.swing.JComboBox valenciaE;
    // End of variables declaration//GEN-END:variables
}
