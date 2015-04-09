package quim.gui;

import java.awt.Component;
import java.awt.Dimension;

public class CalculadorCompuestoBinario extends javax.swing.JInternalFrame {
    public static int OXIDOS_BASICOS = 0;
    public static int OXIDOS_ACIDOS = 0;
    public static int HIDRUROS_METALICOS = 0;
    public static int HIDRUROS_NO_METALICOS = 0;
    public static int ACIDOS_HIDRACIDOS = 0;
    public static int SAL_BINARIA = 0;
    
    private final int tipo;
    
    public CalculadorCompuestoBinario(int tipo) {
        initComponents();
        
        panelResultado.setVisible(false);
        panelCalculosExtra.setVisible(false);
        this.pack();
        
        this.setSize(new Dimension(600, 180));
        this.tipo = tipo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCalculos = new javax.swing.JPanel();
        coefA = new javax.swing.JSpinner();
        elementoA = new javax.swing.JComboBox();
        subA = new javax.swing.JSpinner();
        valenciaA = new javax.swing.JComboBox();
        labelPlus = new javax.swing.JLabel();
        coefB = new javax.swing.JSpinner();
        elementoB = new javax.swing.JComboBox();
        valenciaB = new javax.swing.JComboBox();
        subB = new javax.swing.JSpinner();
        calcular = new javax.swing.JButton();
        panelResultado = new javax.swing.JPanel();
        coefRes = new javax.swing.JLabel();
        elemARes = new javax.swing.JLabel();
        subARes = new javax.swing.JLabel();
        elemBRes = new javax.swing.JLabel();
        subBRes = new javax.swing.JLabel();
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
        setTitle("Compuestos Binarios");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/bin.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 500));

        panelCalculos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        coefA.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        coefA.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        coefA.setToolTipText("Coeficiente");
        coefA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        elementoA.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        elementoA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne" }));
        elementoA.setToolTipText("Elemento");

        subA.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        subA.setToolTipText("Átomos");

        valenciaA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1" }));
        valenciaA.setToolTipText("Número de valencia");

        labelPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/plus.png"))); // NOI18N

        coefB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        coefB.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        coefB.setToolTipText("Coeficiente");
        coefB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        elementoB.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        elementoB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne" }));
        elementoB.setToolTipText("Elemento");

        valenciaB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1" }));
        valenciaB.setToolTipText("Número de valencia");

        subB.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

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

        javax.swing.GroupLayout panelCalculosLayout = new javax.swing.GroupLayout(panelCalculos);
        panelCalculos.setLayout(panelCalculosLayout);
        panelCalculosLayout.setHorizontalGroup(
            panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalculosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(coefA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(elementoA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCalculosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valenciaA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCalculosLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(labelPlus)))
                .addGap(18, 18, 18)
                .addComponent(coefB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(elementoB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valenciaB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelCalculosLayout.setVerticalGroup(
            panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalculosLayout.createSequentialGroup()
                .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCalculosLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(elementoA)
                            .addComponent(coefA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCalculosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(valenciaA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCalculosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCalculosLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(elementoB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(coefB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelCalculosLayout.createSequentialGroup()
                                .addComponent(valenciaB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(subB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelCalculosLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(calcular)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        panelResultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        coefRes.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        coefRes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        coefRes.setText("33");
        coefRes.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        elemARes.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        elemARes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        elemARes.setText("Am");
        elemARes.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        subARes.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        subARes.setText("2");
        subARes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        elemBRes.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        elemBRes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        elemBRes.setText("Am");
        elemBRes.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        subBRes.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        subBRes.setText("2");
        subBRes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        nombreResultado.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        nombreResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreResultado.setText("<html>Bióxido de <br>Carbono</html>");

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
                .addComponent(coefRes, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(elemARes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(subARes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(elemBRes, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subBRes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nombreResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mostrarMas)
                .addContainerGap())
        );
        panelResultadoLayout.setVerticalGroup(
            panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mostrarMas)
                    .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelResultadoLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                .addComponent(subARes)
                                .addComponent(subBRes)))
                        .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(coefRes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(elemARes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelResultadoLayout.createSequentialGroup()
                                .addComponent(elemBRes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))))
                    .addComponent(nombreResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelSolventesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSolventesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblSoluto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(soluto, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addGroup(panelSolventesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblSolvente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(solvente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
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
                .addGroup(panelSolventesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSolventesLayout.createSequentialGroup()
                        .addContainerGap()
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
                .addContainerGap()
                .addComponent(nuevo)
                .addGap(0, 0, Short.MAX_VALUE))
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
                    .addComponent(panelSolventes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDatosExtra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelCalculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCalculosExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        panelResultado.setVisible(true);
        this.setSize(new Dimension(600, 280));
    }//GEN-LAST:event_calcularActionPerformed

    private void mostrarMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarMasActionPerformed
        panelCalculosExtra.setVisible(true);
        for(Component com : panelCalculos.getComponents()){
            com.setEnabled(false);
        }
        this.setSize(new Dimension(600, 448));
    }//GEN-LAST:event_mostrarMasActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        panelResultado.setVisible(false);
        panelCalculosExtra.setVisible(false);
        panelCalculos.setVisible(true);
        for(Component com : panelCalculos.getComponents()){
            com.setEnabled(true);
        }
        this.setSize(new Dimension(600, 180));
    }//GEN-LAST:event_nuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JSpinner coefA;
    private javax.swing.JSpinner coefB;
    private javax.swing.JLabel coefRes;
    private javax.swing.JLabel elemARes;
    private javax.swing.JLabel elemBRes;
    private javax.swing.JComboBox elementoA;
    private javax.swing.JComboBox elementoB;
    private javax.swing.JLabel labelPlus;
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
    private javax.swing.JLabel subARes;
    private javax.swing.JSpinner subB;
    private javax.swing.JLabel subBRes;
    private javax.swing.JComboBox valenciaA;
    private javax.swing.JComboBox valenciaB;
    // End of variables declaration//GEN-END:variables
}
