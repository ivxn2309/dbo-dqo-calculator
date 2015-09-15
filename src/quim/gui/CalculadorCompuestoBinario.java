package quim.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ChangeListener;
import javax.swing.JComboBox;
import javax.swing.event.ChangeEvent;
import quim.connection.CompuestoConnector;
import quim.connection.ElementConnector;
import quim.connection.ValenciaConnector;
import quim.entities.Elemento;
import quim.entities.Valencia;

public class CalculadorCompuestoBinario extends javax.swing.JInternalFrame {
    public static final int OXIDOS_BASICOS = 0;
    public static final int OXIDOS_ACIDOS = 1;
    public static final int HIDRUROS_METALICOS = 2;
    public static final int HIDRUROS_NO_METALICOS = 3;
    public static final int ACIDOS_HIDRACIDOS = 4;
    public static final int SAL_BINARIA = 5;
    public static final int PEROXIDOS = 6;
    
    private int tipo;
    
    private final ElementConnector elemConn;
    private final ValenciaConnector valeConn;
    private final CompuestoConnector compConn;
    
    List<Elemento> elementosA;
    List<Elemento> elementosB;
    
    public CalculadorCompuestoBinario(int tipo) throws IOException {
        initComponents();
        
        elemConn = ElementConnector.getInstance();
        valeConn = ValenciaConnector.getInstance();
        compConn = CompuestoConnector.getInstance();
        
        panelResultado.setVisible(false);
        panelCalculosExtra.setVisible(false);
        this.pack();
        
        this.setSize(new Dimension(600, 180));
        this.tipo = tipo;
        
        //if(!(tipo == ACIDOS_HIDRACIDOS || tipo == SAL_BINARIA))
            //mostrarMas.setVisible(false);
        
        initElements();
        elementoA.addItemListener(getElementListener());
        elementoB.addItemListener(getElementListener());
        
        valenciaA.addItemListener(getValenciaListener());
        valenciaB.addItemListener(getValenciaListener());
        
        subA.addChangeListener(getChangeListener());
        subB.addChangeListener(getChangeListener());
        coefA.addChangeListener(getChangeListener());
        coefB.addChangeListener(getChangeListener());
        
        updateFormulaStatus();
        
        this.setTitle(this.getTitleFromType());
        this.validate();
    }
    
    //Gestor de cambios para coeficientes y subindices
    public final ChangeListener getChangeListener() {
        ChangeListener listener = (ChangeEvent e) -> {
            updateFormulaStatus();
        };
        return listener;
    }
    
    //Gestor de cambios para valencias
    public final ItemListener getValenciaListener() {
        ItemListener listener = (ItemEvent e) -> {
            updateFormulaStatus();
        };
        return listener;
    }
    
    //Gestor de cambios para los elementos
    public final ItemListener getElementListener() {
        ItemListener listener = (ItemEvent e) -> {
            try {
                valenciaA.removeAllItems();
                valenciaB.removeAllItems();
                fitComboValencia(((Elemento)elementoA.getSelectedItem()).getSimbolo(), valenciaA, true);
                fitComboValencia(((Elemento)elementoB.getSelectedItem()).getSimbolo(), valenciaB, false);
                updateFormulaStatus();
            } catch (IOException ex) {
                Logger.getLogger(CalculadorCompuestoBinario.class.getName()).log(Level.SEVERE, null, ex);
            }
        };
        return listener;
    }
    
    //Metodo que es llamado para verificar el balance de la formula
    private void updateFormulaStatus(){
        String elementA = ((Elemento) elementoA.getSelectedItem()).getNombre();
        String elementB = ((Elemento) elementoB.getSelectedItem()).getNombre();
        
        int valA = 0;
        int valB = 0;
        //System.out.println("ElemA: " + elementoA.getSelectedItem().toString());
        //System.out.println("ValA: " + valenciaA.getSelectedItem().toString());
        if (valenciaA.getSelectedItem() != null)
            valA = Integer.parseInt(valenciaA.getSelectedItem().toString());
        if (valenciaB.getSelectedItem() != null)
            valB = Integer.parseInt(valenciaB.getSelectedItem().toString());
        
        int subidxA = (Integer) this.subA.getValue();
        int subidxB = (Integer) this.subB.getValue();
        int coeficientA = (Integer)coefA.getValue();
        int coeficientB = (Integer)coefB.getValue();
        
        boolean isBalanced = (coeficientA * subidxA * valA + coeficientB * subidxB * valB) == 0;
        String balance = isBalanced ? "El compuesto esta balanceado" : "El compuesto no tiene balance";
        
        statusFormula.setText(elementA + " + " +elementB + " :: " + balance);
        if(!isBalanced) {
            statusFormula.setForeground(Color.red);
        }
        else {
            statusFormula.setForeground(Color.black);
        }
        calcular.setEnabled(isBalanced);
    }
    
    //Determina el titulo de la ventana interna en base a la opción elegida
    public final String getTitleFromType(){
        switch(tipo) {
            case 0:
                return "Óxidos Básicos";
            case 1:
                return "Óxidos Ácidos";
            case 2:
                return "Hidruros Metálicos";
            case 3:
                return "Hidruros no Metálicos";
            case 4:
                return "Ácidos Hidrácidos";
            case 5:
                return "Sal Binaria"; 
        }
        return "";
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
        statusFormula = new javax.swing.JLabel();
        panelResultado = new javax.swing.JPanel();
        formulaRes = new javax.swing.JLabel();
        nombreResultado = new javax.swing.JLabel();
        mostrarMas = new javax.swing.JButton();
        panelCalculosExtra = new javax.swing.JPanel();
        lblMoles = new javax.swing.JLabel();
        resMoles = new javax.swing.JLabel();
        lblGramos = new javax.swing.JLabel();
        resGramos = new javax.swing.JLabel();
        lblMoleculas = new javax.swing.JLabel();
        resMoleculas = new javax.swing.JLabel();
        resLitros = new javax.swing.JLabel();
        lblLitros = new javax.swing.JLabel();
        lblUMA = new javax.swing.JLabel();
        resUMA = new javax.swing.JLabel();
        nuevo = new javax.swing.JButton();
        panelSolventes = new javax.swing.JPanel();
        panelMolaridad = new javax.swing.JPanel();
        lblSoluto1 = new javax.swing.JLabel();
        solutoMolalidad = new javax.swing.JSpinner();
        solventeMolalidad = new javax.swing.JSpinner();
        lblSolvente1 = new javax.swing.JLabel();
        resMolalidad1 = new javax.swing.JLabel();
        calculaMolalidad = new javax.swing.JButton();
        panelMolalidad = new javax.swing.JPanel();
        lblSoluto = new javax.swing.JLabel();
        solutoMolaridad = new javax.swing.JSpinner();
        solucionMolaridad = new javax.swing.JSpinner();
        lblSolucion = new javax.swing.JLabel();
        resMolaridad = new javax.swing.JLabel();
        calculaMolaridad = new javax.swing.JButton();
        panelNormalidad = new javax.swing.JPanel();
        lblSoluto2 = new javax.swing.JLabel();
        solutoMolaridad1 = new javax.swing.JSpinner();
        solucionMolaridad1 = new javax.swing.JSpinner();
        lblSolucion1 = new javax.swing.JLabel();
        resMolaridad1 = new javax.swing.JLabel();
        calculaNormalidad = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Compuestos Binarios");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/bin.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(660, 160));
        setPreferredSize(new java.awt.Dimension(660, 500));

        panelCalculos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelCalculos.setPreferredSize(new java.awt.Dimension(700, 148));

        coefA.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        coefA.setModel(new javax.swing.SpinnerNumberModel(1, 1, 15, 1));
        coefA.setToolTipText("Coeficiente");
        coefA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        elementoA.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        elementoA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne" }));
        elementoA.setToolTipText("Elemento");

        subA.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));
        subA.setToolTipText("Átomos");

        valenciaA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1" }));
        valenciaA.setToolTipText("Número de valencia");
        valenciaA.setMinimumSize(new java.awt.Dimension(39, 28));
        valenciaA.setPreferredSize(new java.awt.Dimension(39, 28));

        labelPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quim/img/plus.png"))); // NOI18N

        coefB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        coefB.setModel(new javax.swing.SpinnerNumberModel(1, 1, 15, 1));
        coefB.setToolTipText("Coeficiente");
        coefB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        elementoB.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        elementoB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne" }));
        elementoB.setToolTipText("Elemento");

        valenciaB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1" }));
        valenciaB.setToolTipText("Número de valencia");
        valenciaB.setMinimumSize(new java.awt.Dimension(39, 28));
        valenciaB.setPreferredSize(new java.awt.Dimension(39, 28));

        subB.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));

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

        statusFormula.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        statusFormula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statusFormula.setText("...");

        javax.swing.GroupLayout panelCalculosLayout = new javax.swing.GroupLayout(panelCalculos);
        panelCalculos.setLayout(panelCalculosLayout);
        panelCalculosLayout.setHorizontalGroup(
            panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCalculosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(statusFormula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelCalculosLayout.createSequentialGroup()
                        .addComponent(coefA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(elementoA, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCalculosLayout.createSequentialGroup()
                                .addComponent(subA, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelPlus))
                            .addComponent(valenciaA, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(coefB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(elementoB, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(valenciaB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subB, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        panelCalculosLayout.setVerticalGroup(
            panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalculosLayout.createSequentialGroup()
                .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelCalculosLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(elementoB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(coefB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(calcular)
                            .addGroup(panelCalculosLayout.createSequentialGroup()
                                .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCalculosLayout.createSequentialGroup()
                                        .addComponent(valenciaA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(valenciaB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(subA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(subB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelCalculosLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(elementoA)
                            .addComponent(coefA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statusFormula)
                .addContainerGap())
        );

        panelResultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        formulaRes.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        formulaRes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formulaRes.setText("<html>H<sub><big>2</big></sub>O</html>");

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
                .addComponent(formulaRes, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nombreResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addComponent(formulaRes))
                    .addGroup(panelResultadoLayout.createSequentialGroup()
                        .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mostrarMas)
                            .addComponent(nombreResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panelCalculosExtra.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblMoles.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMoles.setText("Moles:");

        resMoles.setText("000");

        lblGramos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGramos.setText("Gramos:");

        resGramos.setText("000");

        lblMoleculas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMoleculas.setText("Moleculas:");

        resMoleculas.setText("000");

        resLitros.setText("000");

        lblLitros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLitros.setText("Litros:");

        lblUMA.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUMA.setText("U.M.A.");

        resUMA.setText("000");

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

        panelSolventes.setBorder(javax.swing.BorderFactory.createTitledBorder("Calculos Extra"));

        javax.swing.GroupLayout panelSolventesLayout = new javax.swing.GroupLayout(panelSolventes);
        panelSolventes.setLayout(panelSolventesLayout);
        panelSolventesLayout.setHorizontalGroup(
            panelSolventesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );
        panelSolventesLayout.setVerticalGroup(
            panelSolventesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelCalculosExtraLayout = new javax.swing.GroupLayout(panelCalculosExtra);
        panelCalculosExtra.setLayout(panelCalculosExtraLayout);
        panelCalculosExtraLayout.setHorizontalGroup(
            panelCalculosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalculosExtraLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelCalculosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCalculosExtraLayout.createSequentialGroup()
                        .addComponent(lblGramos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resGramos)
                        .addGap(57, 57, 57)
                        .addComponent(lblMoleculas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCalculosExtraLayout.createSequentialGroup()
                        .addComponent(lblMoles, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resMoles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLitros, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCalculosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resMoleculas)
                    .addComponent(resLitros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelSolventes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nuevo)
                .addContainerGap())
            .addGroup(panelCalculosExtraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUMA, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resUMA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCalculosExtraLayout.setVerticalGroup(
            panelCalculosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalculosExtraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCalculosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUMA)
                    .addComponent(resUMA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCalculosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCalculosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nuevo)
                        .addComponent(panelSolventes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCalculosExtraLayout.createSequentialGroup()
                        .addGroup(panelCalculosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLitros)
                            .addComponent(resLitros)
                            .addComponent(lblMoles)
                            .addComponent(resMoles))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCalculosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCalculosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblGramos)
                                .addComponent(resGramos)
                                .addComponent(lblMoleculas))
                            .addComponent(resMoleculas))))
                .addGap(30, 30, 30))
        );

        panelMolaridad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Molalidad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lblSoluto1.setText("Soluto");

        solutoMolalidad.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(0.0d), Double.valueOf(0.0d), null, Double.valueOf(0.1d)));

        solventeMolalidad.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(0.0d), Double.valueOf(0.0d), null, Double.valueOf(0.1d)));

        lblSolvente1.setText("Solvente");

        resMolalidad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resMolalidad1.setText("0000000.0000");

        calculaMolalidad.setText("Calcular");

        javax.swing.GroupLayout panelMolaridadLayout = new javax.swing.GroupLayout(panelMolaridad);
        panelMolaridad.setLayout(panelMolaridadLayout);
        panelMolaridadLayout.setHorizontalGroup(
            panelMolaridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMolaridadLayout.createSequentialGroup()
                .addGroup(panelMolaridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelMolaridadLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelMolaridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSoluto1)
                            .addComponent(lblSolvente1))
                        .addGap(18, 18, 18)
                        .addGroup(panelMolaridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(solventeMolalidad, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(solutoMolalidad)))
                    .addGroup(panelMolaridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(calculaMolalidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resMolalidad1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        panelMolaridadLayout.setVerticalGroup(
            panelMolaridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMolaridadLayout.createSequentialGroup()
                .addGroup(panelMolaridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoluto1)
                    .addComponent(solutoMolalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMolaridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(solventeMolalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSolvente1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calculaMolalidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resMolalidad1))
        );

        panelMolalidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Molaridad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lblSoluto.setText("Soluto");

        solutoMolaridad.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(0.0d), Double.valueOf(0.0d), null, Double.valueOf(0.1d)));

        solucionMolaridad.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(0.0d), Double.valueOf(0.0d), null, Double.valueOf(0.1d)));

        lblSolucion.setText("Solucion");

        resMolaridad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resMolaridad.setText("0000000.0000");

        calculaMolaridad.setText("Calcular");

        javax.swing.GroupLayout panelMolalidadLayout = new javax.swing.GroupLayout(panelMolalidad);
        panelMolalidad.setLayout(panelMolalidadLayout);
        panelMolalidadLayout.setHorizontalGroup(
            panelMolalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMolalidadLayout.createSequentialGroup()
                .addGroup(panelMolalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelMolalidadLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelMolalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSoluto)
                            .addComponent(lblSolucion))
                        .addGap(18, 18, 18)
                        .addGroup(panelMolalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(solucionMolaridad, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(solutoMolaridad)))
                    .addGroup(panelMolalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(calculaMolaridad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resMolaridad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        panelMolalidadLayout.setVerticalGroup(
            panelMolalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMolalidadLayout.createSequentialGroup()
                .addGroup(panelMolalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoluto)
                    .addComponent(solutoMolaridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMolalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(solucionMolaridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSolucion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calculaMolaridad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resMolaridad))
        );

        panelNormalidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Normalidad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lblSoluto2.setText("Soluto");

        solutoMolaridad1.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(0.0d), Double.valueOf(0.0d), null, Double.valueOf(0.1d)));

        solucionMolaridad1.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(0.0d), Double.valueOf(0.0d), null, Double.valueOf(0.1d)));

        lblSolucion1.setText("Solucion");

        resMolaridad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resMolaridad1.setText("0000000.0000");

        calculaNormalidad.setText("Calcular");

        javax.swing.GroupLayout panelNormalidadLayout = new javax.swing.GroupLayout(panelNormalidad);
        panelNormalidad.setLayout(panelNormalidadLayout);
        panelNormalidadLayout.setHorizontalGroup(
            panelNormalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNormalidadLayout.createSequentialGroup()
                .addGroup(panelNormalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelNormalidadLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelNormalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSoluto2)
                            .addComponent(lblSolucion1))
                        .addGap(18, 18, 18)
                        .addGroup(panelNormalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(solucionMolaridad1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(solutoMolaridad1)))
                    .addGroup(panelNormalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(calculaNormalidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resMolaridad1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        panelNormalidadLayout.setVerticalGroup(
            panelNormalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNormalidadLayout.createSequentialGroup()
                .addGroup(panelNormalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoluto2)
                    .addComponent(solutoMolaridad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelNormalidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(solucionMolaridad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSolucion1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calculaNormalidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(resMolaridad1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelCalculosExtra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelCalculos, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMolaridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelMolalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(panelNormalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelCalculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCalculosExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelNormalidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMolalidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMolaridad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Este metodo es llamado al presionar el boton calcular
    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        if(tipo == OXIDOS_BASICOS) {
            int valencia = (Integer)valenciaB.getSelectedItem();
            if (valencia == -1)
                tipo = PEROXIDOS;
        }
        
        try {
            String compuestoStr = coefA.getValue() +":"+ ((Elemento) elementoA.getSelectedItem()).getNombre() + ":" + subA.getValue() + ":" +
                    coefB.getValue() +":"+ ((Elemento) elementoB.getSelectedItem()).getNombre() + ":" + subB.getValue();
            
            String formula = buildFormula();
            
            String answer = compConn.getCompuestoName(compuestoStr, tipo);
            nombreResultado.setText(answer);
            formulaRes.setText(formula);
            panelResultado.setVisible(true);
            this.setSize(new Dimension(660, 280));
        } catch (IOException ex) {
            Logger.getLogger(CalculadorCompuestoBinario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_calcularActionPerformed
    
    //Construye la formula a partir de los elementos seleccionados
    private String buildFormula() {
        int coefiA = (Integer)coefA.getValue();
        int coefiB = (Integer)coefB.getValue();
        String subidxA = (Integer)subA.getValue() * coefiA < 2 ? "" : (Integer)subA.getValue() * coefiA + "";
        String subidxB = (Integer)subB.getValue() * coefiB < 2 ? "" : (Integer)subB.getValue() * coefiB + "";
        String elemA = ((Elemento) elementoA.getSelectedItem()).getSimbolo();
        String elemB = ((Elemento) elementoB.getSelectedItem()).getSimbolo();
        
        String formula = "<html>" + elemA + "<sub><small>" + subidxA + "</small></sub>" + 
                elemB + "<sub><small>" + subidxB + "</small></sub></html>";
        return formula;
    }
    
    private void mostrarMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarMasActionPerformed
        panelCalculosExtra.setVisible(true);
        for(Component com : panelCalculos.getComponents()){
            com.setEnabled(false);
        }
        this.setSize(new Dimension(660, 605));
    }//GEN-LAST:event_mostrarMasActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        panelResultado.setVisible(false);
        panelCalculosExtra.setVisible(false);
        panelCalculos.setVisible(true);
        for(Component com : panelCalculos.getComponents()){
            com.setEnabled(true);
        }
        this.setSize(new Dimension(660, 180));
    }//GEN-LAST:event_nuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculaMolalidad;
    private javax.swing.JButton calculaMolaridad;
    private javax.swing.JButton calculaNormalidad;
    private javax.swing.JButton calcular;
    private javax.swing.JSpinner coefA;
    private javax.swing.JSpinner coefB;
    private javax.swing.JComboBox elementoA;
    private javax.swing.JComboBox elementoB;
    private javax.swing.JLabel formulaRes;
    private javax.swing.JLabel labelPlus;
    private javax.swing.JLabel lblGramos;
    private javax.swing.JLabel lblLitros;
    private javax.swing.JLabel lblMoleculas;
    private javax.swing.JLabel lblMoles;
    private javax.swing.JLabel lblSolucion;
    private javax.swing.JLabel lblSolucion1;
    private javax.swing.JLabel lblSoluto;
    private javax.swing.JLabel lblSoluto1;
    private javax.swing.JLabel lblSoluto2;
    private javax.swing.JLabel lblSolvente1;
    private javax.swing.JLabel lblUMA;
    private javax.swing.JButton mostrarMas;
    private javax.swing.JLabel nombreResultado;
    private javax.swing.JButton nuevo;
    private javax.swing.JPanel panelCalculos;
    private javax.swing.JPanel panelCalculosExtra;
    private javax.swing.JPanel panelMolalidad;
    private javax.swing.JPanel panelMolaridad;
    private javax.swing.JPanel panelNormalidad;
    private javax.swing.JPanel panelResultado;
    private javax.swing.JPanel panelSolventes;
    private javax.swing.JLabel resGramos;
    private javax.swing.JLabel resLitros;
    private javax.swing.JLabel resMolalidad1;
    private javax.swing.JLabel resMolaridad;
    private javax.swing.JLabel resMolaridad1;
    private javax.swing.JLabel resMoleculas;
    private javax.swing.JLabel resMoles;
    private javax.swing.JLabel resUMA;
    private javax.swing.JSpinner solucionMolaridad;
    private javax.swing.JSpinner solucionMolaridad1;
    private javax.swing.JSpinner solutoMolalidad;
    private javax.swing.JSpinner solutoMolaridad;
    private javax.swing.JSpinner solutoMolaridad1;
    private javax.swing.JSpinner solventeMolalidad;
    private javax.swing.JLabel statusFormula;
    private javax.swing.JSpinner subA;
    private javax.swing.JSpinner subB;
    private javax.swing.JComboBox valenciaA;
    private javax.swing.JComboBox valenciaB;
    // End of variables declaration//GEN-END:variables

    private void initElements() throws IOException {
        elementosA = new ArrayList<>();
        elementosB = new ArrayList<>();
        switch(tipo) {
            case OXIDOS_BASICOS:
                elementosA = elemConn.getElementsByType("metal");
                elementosB.add(elemConn.getElement("O"));
                break;    
            case OXIDOS_ACIDOS:
                elementosA = elemConn.getElementsByType("¬metal?exclude=gas-noble");
                elementosB.add(elemConn.getElement("O"));
                //Se agregan los anfoteros 
                List<Elemento> anfoteros = getAnfoteros();
                System.out.println("Anfo: " + anfoteros);
                anfoteros.stream().forEach((elem) -> {
                    elementosA.add(elem);
                });
                break;
            case HIDRUROS_METALICOS:
                elementosA = elemConn.getElementsByType("metal");
                elementosB.add(elemConn.getElement("H"));
                break;
            case HIDRUROS_NO_METALICOS:
                elementosA = getNitroCarbonoides();
                elementosB.add(elemConn.getElement("H"));
                break;
            case ACIDOS_HIDRACIDOS:
                elementosA.add(elemConn.getElement("H"));
                elementosB = getAnfiAlogeno();
                break;
            case SAL_BINARIA:
                elementosA = elemConn.getElementsByType("metal");
                elementosB = elemConn.getElementsByType("¬metal?exclude=gas-noble");
                Elemento removible = elemConn.getElement("H");
                elementosB.remove(removible);
                removible = elemConn.getElement("O");
                elementosB.remove(removible);
                break;
        }
        
        elementoA.removeAllItems();
        elementoB.removeAllItems();        
        valenciaA.removeAllItems();
        valenciaB.removeAllItems();
        
        elementosA.stream().forEach((e) -> {
            elementoA.addItem(e);
        });
        
        elementosB.stream().forEach((e) -> {
            elementoB.addItem(e);
        });
        
        fitComboValencia(((Elemento)elementoA.getSelectedItem()).getSimbolo(), valenciaA, true);
        fitComboValencia(((Elemento)elementoB.getSelectedItem()).getSimbolo(), valenciaB, false);
    }
    
    private List<Elemento> getNitroCarbonoides() throws IOException {
        String simbolos [] = {"B","C","Si","Ge","N","P","As","Sb"};
        List<Elemento> elementos = new ArrayList<>();
        for(String e : simbolos) {
            elementos.add(elemConn.getElement(e));
        }
        return elementos;
    }
    
    private List<Elemento> getAnfiAlogeno() throws IOException {
        String simbolos [] = {"O","S","Se","Te","F","Cl","Br","I","At"};
        List<Elemento> elementos = new ArrayList<>();
        for(String e : simbolos) {
            elementos.add(elemConn.getElement(e));
        }
        return elementos;
    }
    
    private List<Elemento> getAnfoteros() throws IOException {
        String simbolos [] = {"Be", "Al", "Bi", "Ti", "V", "Ga", "Co", "Mn", "Fe", "Pd", "Mo", "Ni", "Pt", "Zn", "Sn", "W", "U", "Cr", "In", "Pb", "Zr"};
        List<Elemento> elementos = new ArrayList<>();
        for(String e : simbolos) {
            elementos.add(elemConn.getElement(e));
        }
        return elementos;
    }
    
    private void fitComboValencia(String elem, JComboBox combo, boolean isLeft) throws IOException {
        List<Integer> valencias = valeConn.getValuesOf(elem);
        if(valencias.isEmpty()) {
            //combo.addItem("");
        }
        else if(isLeft) {
            valencias.stream().filter((vale) -> (vale > 0)).forEach((vale) -> { 
                combo.addItem(vale);
            });
        }
        else {
            valencias.stream().filter((vale) -> (vale < 0)).forEach((vale) -> { 
                combo.addItem(vale);
            });
        }
        //Si es un oxido acido, se sabe de antemano que estara presente el oxigeno
        if(tipo == OXIDOS_ACIDOS) {
            //Por lo tanto eliminamos la valencia que no corresponde
            valenciaB.removeItem(-1);
            if(elem.equals("F")){
                combo.addItem(1);
                combo.addItem(3);
                combo.addItem(5);
                combo.addItem(7);
            }
            
            String anfoteros = "Be, Al, Bi, Ti, V, Ga, Co, Mn, Fe, Pd, Mo, Ni, Pt, Zn, Sn, W, U, Cr, In, Pb, Zr";
            if(anfoteros.contains(elem)) {
                combo.removeAllItems();
                int max = valencias.get(0);
                for(Integer val : valencias){
                    if(val > max) max = val;
                }
                combo.addItem(max);
            }
        }
    }
}
