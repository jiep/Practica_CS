 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcfutbol;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


/**
 *
 */
public class Ventana extends javax.swing.JFrame {
        ArrayList<JPanel> panelesJug;
    /**
     * Creates new form Ventana
     */
    public Ventana() {
       Ventana.mercado = new Mercado();
       panelesJug=new ArrayList<JPanel>();
        for (int i=0;i<4;i++){
            JPanel p = new JPanel();
            panelesJug.add(p);
        }
        initComponents();
    }
    
public JPanel porteroNuevo(JPanel p){
        String[]auxCombo=new String[]{"1","2","3","4","5"};
        JLabel introduzca=new JLabel("Introduzca a su nuevo jugador (portero)");
        introduzca.setForeground(new java.awt.Color(0, 0, 255));
        p.setLayout(new BorderLayout());
        JTextField nombreInbox = new javax.swing.JTextField("Nombre");
        nombreInbox.setForeground(new java.awt.Color(204, 204, 204));
        JTextField apellidosInbox = new javax.swing.JTextField("Apellidos");
        apellidosInbox.setForeground(new java.awt.Color(204, 204, 204));
        JTextField nombreDepInbox = new javax.swing.JTextField("Nombre deportivo");
        nombreDepInbox.setForeground(new java.awt.Color(204, 204, 204));
        JTextField edadInbox = new javax.swing.JTextField("Edad");
        edadInbox.setForeground(new java.awt.Color(204, 204, 204));
        JTextField pesoInbox = new javax.swing.JTextField("Peso");
        pesoInbox.setForeground(new java.awt.Color(204, 204, 204));
        JTextField alturaInbox = new javax.swing.JTextField("Altura");
        alturaInbox.setForeground(new java.awt.Color(204, 204, 204));
        JLabel co=new JLabel("Colocacion: ");
        JComboBox colocacionInbox=new javax.swing.JComboBox(auxCombo);
        colocacionInbox.setForeground(new java.awt.Color(204, 204, 204));
        JLabel sal=new JLabel("Salidas: ");
        JComboBox salidasInbox=new javax.swing.JComboBox(auxCombo);
        salidasInbox.setForeground(new java.awt.Color(204, 204, 204));
        JLabel ref=new JLabel("Reflejos: ");
        JComboBox reflejosInbox=new javax.swing.JComboBox(auxCombo);
        reflejosInbox.setForeground(new java.awt.Color(204, 204, 204));
        JLabel man=new JLabel("Mano a mano: ");
        JComboBox manoamanoInbox=new javax.swing.JComboBox(auxCombo);
        manoamanoInbox.setForeground(new java.awt.Color(204, 204, 204));
        JLabel pen=new JLabel("Penaltis: ");
        JComboBox penaltisInbox=new javax.swing.JComboBox(auxCombo);
        penaltisInbox.setForeground(new java.awt.Color(204, 204, 204));
        JButton generarport=new JButton("Generar");
        
        
        
// Code adding the component to the parent container - not shown here
        javax.swing.GroupLayout pLayout = new javax.swing.GroupLayout(p);
        p.setLayout(pLayout);
        pLayout.setHorizontalGroup(
            pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(introduzca)
                    .addComponent(nombreInbox)
                    .addComponent(apellidosInbox)
                    .addComponent(nombreDepInbox)
                    .addComponent(edadInbox)
                    .addComponent(pesoInbox)
                    .addComponent(alturaInbox)
                    .addComponent(co)
                    .addComponent(colocacionInbox)
                    .addComponent(sal)
                    .addComponent(salidasInbox)
                    .addComponent(ref)
                    .addComponent(reflejosInbox)
                    .addComponent(man)
                    .addComponent(manoamanoInbox)
                    .addComponent(pen)
                    .addComponent(penaltisInbox)
                    .addComponent(generarport)
                    )));
        pLayout.setVerticalGroup(
            pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(introduzca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apellidosInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreDepInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edadInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesoInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alturaInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(co,javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)    
                .addComponent(colocacionInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(salidasInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(reflejosInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(man, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(manoamanoInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(penaltisInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(generarport,javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            ));

        return p;
    }


public JPanel jugadorNuevo(JPanel p){
        String[]auxCombo=new String[]{"1","2","3","4","5"};
        JLabel introduzca=new JLabel("Introduzca a su nuevo jugador (Jugador de Campo)");
        introduzca.setForeground(new java.awt.Color(0, 0, 255));
        p.setLayout(new BorderLayout());
        JTextField nombreInbox = new javax.swing.JTextField("Nombre");
        nombreInbox.setForeground(new java.awt.Color(204, 204, 204));
        JTextField apellidosInbox = new javax.swing.JTextField("Apellidos");
        apellidosInbox.setForeground(new java.awt.Color(204, 204, 204));
        JTextField nombreDepInbox = new javax.swing.JTextField("Nombre deportivo");
        nombreDepInbox.setForeground(new java.awt.Color(204, 204, 204));
        JTextField edadInbox = new javax.swing.JTextField("Edad");
        edadInbox.setForeground(new java.awt.Color(204, 204, 204));
        JTextField pesoInbox = new javax.swing.JTextField("Peso");
        pesoInbox.setForeground(new java.awt.Color(204, 204, 204));
        JTextField alturaInbox = new javax.swing.JTextField("Altura");
        alturaInbox.setForeground(new java.awt.Color(204, 204, 204));
        JLabel co=new JLabel("Colocacion: ");
        JComboBox colocacionInbox=new javax.swing.JComboBox(auxCombo);
        colocacionInbox.setForeground(new java.awt.Color(204, 204, 204));
        JLabel vel=new JLabel("Velocidad: ");
        JComboBox velocidadInbox=new javax.swing.JComboBox(auxCombo);
        velocidadInbox.setForeground(new java.awt.Color(204, 204, 204));
        JLabel pot=new JLabel("Potencia: ");
        JComboBox potenciaInbox=new javax.swing.JComboBox(auxCombo);
        potenciaInbox.setForeground(new java.awt.Color(204, 204, 204));
        JLabel reg=new JLabel("Regate: ");
        JComboBox regateInbox=new javax.swing.JComboBox(auxCombo);
        regateInbox.setForeground(new java.awt.Color(204, 204, 204));
        JLabel tiro=new JLabel("Tiro: ");
        JComboBox tiroInbox=new javax.swing.JComboBox(auxCombo);
        tiroInbox.setForeground(new java.awt.Color(204, 204, 204));
        JButton generarport=new JButton("Generar");
        
        
// Code adding the component to the parent container - not shown here
        javax.swing.GroupLayout pLayout = new javax.swing.GroupLayout(p);
        p.setLayout(pLayout);
        pLayout.setHorizontalGroup(
            pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(introduzca)
                    .addComponent(nombreInbox)
                    .addComponent(apellidosInbox)
                    .addComponent(nombreDepInbox)
                    .addComponent(edadInbox)
                    .addComponent(pesoInbox)
                    .addComponent(alturaInbox)
                    .addComponent(co)
                    .addComponent(colocacionInbox)
                    .addComponent(vel)
                    .addComponent(velocidadInbox)
                    .addComponent(pot)
                    .addComponent(potenciaInbox)
                    .addComponent(reg)
                    .addComponent(regateInbox)
                    .addComponent(tiro)
                    .addComponent(tiroInbox)
                    .addComponent(generarport)
                    )));
        pLayout.setVerticalGroup(
            pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(introduzca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apellidosInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreDepInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edadInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesoInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alturaInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(co,javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)    
                .addComponent(colocacionInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(velocidadInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(potenciaInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(regateInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tiroInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(generarport,javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        ));

        return p;
    }
    
    public JPanel listaEq(JPanel p){
        return (p);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaPrinc = new javax.swing.JTabbedPane();
        panelJug = new javax.swing.JPanel();
        toolbarJugador = new javax.swing.JToolBar();
        porteroNuevo = new javax.swing.JButton();
        jugNuevo = new javax.swing.JButton();
        jugadoresPanel = new javax.swing.JPanel();
        ImageIcon image=new ImageIcon("portada.jpg");
        jButton1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        panelEq = new javax.swing.JPanel();
        equipo = new javax.swing.JTabbedPane();
        panelListaEq = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListEquipos = new javax.swing.JList();
        verIntegrantes = new javax.swing.JButton();
        nuevEqPanel = new javax.swing.JPanel();
        nombreEqInbox = new javax.swing.JTextField();
        banderaEqInbox = new javax.swing.JTextField();
        himnoEqInbox = new javax.swing.JTextField();
        domicilioEqInbox = new javax.swing.JTextField();
        añoEqInbox = new javax.swing.JTextField();
        dineroEqInbox = new javax.swing.JTextField();
        generarEqButton = new javax.swing.JButton();
        panelficharmerc = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        mercadoLista = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        mercadoEqLista = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        Aceptar = new javax.swing.JButton();
        panelficharOtroEq = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listillaEquipos = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        jugEquipo = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pagarPrecio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jugACambiar = new javax.swing.JList();
        jScrollPane7 = new javax.swing.JScrollPane();
        tuEquipoList = new javax.swing.JList();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        intercambiar = new javax.swing.JButton();
        paneldescartarJugador = new javax.swing.JPanel();
        jugadorCombobox = new javax.swing.JComboBox();
        jScrollPane8 = new javax.swing.JScrollPane();
        jugAdescartar = new javax.swing.JList();
        jLabel9 = new javax.swing.JLabel();
        descartarJugButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        eliminarJugButton = new javax.swing.JButton();
        modificarJugButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        panelmodificarEq = new javax.swing.JPanel();
        eqcombobox = new javax.swing.JComboBox();
        modificarEq = new javax.swing.JButton();
        nombreEqtext = new javax.swing.JTextField();
        domicilioEq = new javax.swing.JTextField();
        añoEq = new javax.swing.JTextField();
        himnoEq = new javax.swing.JTextField();
        banderaEq = new javax.swing.JTextField();
        dineroEq = new javax.swing.JTextField();
        eliminarEq = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jTextNombre = new javax.swing.JTextField();
        jTextApellidos = new javax.swing.JTextField();
        jTextAño = new javax.swing.JTextField();
        jTextCargo = new javax.swing.JTextField();
        directivoNuevo = new javax.swing.JButton();
        setDirectivos = new javax.swing.JButton();
        equipoTuCombobox = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        paneldescartarJugador1 = new javax.swing.JPanel();
        jugadorCombobox1 = new javax.swing.JComboBox();
        jScrollPane13 = new javax.swing.JScrollPane();
        jugAdescartar1 = new javax.swing.JList();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        eliminarJugButton1 = new javax.swing.JButton();
        modificarJugButton1 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        panelTorneos = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        torneosCombobox = new javax.swing.JComboBox();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTablaTorneo = new javax.swing.JTable();
        jugarTorneo = new javax.swing.JButton();
        generarCalTor = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        nombreTInbox = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        jListEquiposTorneo = new javax.swing.JList();
        jcrearTorneoButton = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        torneosCombobox1 = new javax.swing.JComboBox();
        nombreTInbox1 = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane12 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        cambiarNombreTorneo = new javax.swing.JButton();
        eliminarEqTor = new javax.swing.JButton();
        agregarEqTor = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        eliminarTor = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        guardarDatos = new javax.swing.JButton();
        cargarDatos = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ventanaPrinc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 255), null, null));
        ventanaPrinc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ventanaPrincMouseClicked(evt);
            }
        });

        toolbarJugador.setRollover(true);

        porteroNuevo.setText("Nuevo Portero");
        porteroNuevo.setFocusable(false);
        porteroNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        porteroNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        porteroNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porteroNuevoActionPerformed(evt);
            }
        });
        toolbarJugador.add(porteroNuevo);

        jugNuevo.setText("Nuevo Jugador");
        jugNuevo.setFocusable(false);
        jugNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jugNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jugNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugNuevoActionPerformed(evt);
            }
        });
        toolbarJugador.add(jugNuevo);

        jButton1.setText("");
        jButton1.setIcon(image);

        jLabel25.setText("Simulador creado por David Ángel Leo y Silvia Moreno");

        javax.swing.GroupLayout jugadoresPanelLayout = new javax.swing.GroupLayout(jugadoresPanel);
        jugadoresPanel.setLayout(jugadoresPanelLayout);
        jugadoresPanelLayout.setHorizontalGroup(
            jugadoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jugadoresPanelLayout.createSequentialGroup()
                .addGroup(jugadoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jugadoresPanelLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jugadoresPanelLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel25)))
                .addContainerGap(257, Short.MAX_VALUE))
        );
        jugadoresPanelLayout.setVerticalGroup(
            jugadoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jugadoresPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jLabel25)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelJugLayout = new javax.swing.GroupLayout(panelJug);
        panelJug.setLayout(panelJugLayout);
        panelJugLayout.setHorizontalGroup(
            panelJugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJugLayout.createSequentialGroup()
                .addComponent(toolbarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 442, Short.MAX_VALUE))
            .addGroup(panelJugLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jugadoresPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelJugLayout.setVerticalGroup(
            panelJugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJugLayout.createSequentialGroup()
                .addComponent(toolbarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jugadoresPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ventanaPrinc.addTab("Jugadores", panelJug);

        panelListaEq.setBackground(new java.awt.Color(204, 204, 204));

        jListEquipos.setModel(new javax.swing.AbstractListModel() {

            public int getSize() { return listaEquipos.size(); }
            public Object getElementAt(int i) { return listaEquipos.get(i).toString(); }
        }
    );
    jListEquipos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
        public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
            jListEquiposValueChanged(evt);
        }
    });
    jScrollPane2.setViewportView(jListEquipos);

    verIntegrantes.setText("Ver integrantes");
    verIntegrantes.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            verIntegrantesActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout panelListaEqLayout = new javax.swing.GroupLayout(panelListaEq);
    panelListaEq.setLayout(panelListaEqLayout);
    panelListaEqLayout.setHorizontalGroup(
        panelListaEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panelListaEqLayout.createSequentialGroup()
            .addGroup(panelListaEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelListaEqLayout.createSequentialGroup()
                    .addGap(206, 206, 206)
                    .addComponent(verIntegrantes))
                .addGroup(panelListaEqLayout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(338, Short.MAX_VALUE))
    );
    panelListaEqLayout.setVerticalGroup(
        panelListaEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panelListaEqLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(verIntegrantes)
            .addContainerGap(398, Short.MAX_VALUE))
    );

    equipo.addTab("Lista", panelListaEq);

    nombreEqInbox.setForeground(new java.awt.Color(204, 204, 204));
    nombreEqInbox.setText("Nombre");
    nombreEqInbox.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            nombreEqInboxActionPerformed(evt);
        }
    });
    nombreEqInbox.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            nombreEqInboxFocusGained(evt);
        }
    });

    banderaEqInbox.setForeground(new java.awt.Color(204, 204, 204));
    banderaEqInbox.setText("Bandera");
    banderaEqInbox.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            banderaEqInboxActionPerformed(evt);
        }
    });
    banderaEqInbox.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            banderaEqInboxFocusGained(evt);
        }
    });

    himnoEqInbox.setForeground(new java.awt.Color(204, 204, 204));
    himnoEqInbox.setText("Himno");
    himnoEqInbox.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            himnoEqInboxActionPerformed(evt);
        }
    });
    himnoEqInbox.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            himnoEqInboxFocusGained(evt);
        }
    });

    domicilioEqInbox.setForeground(new java.awt.Color(204, 204, 204));
    domicilioEqInbox.setText("Domicilio");
    domicilioEqInbox.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            domicilioEqInboxFocusGained(evt);
        }
    });

    añoEqInbox.setForeground(new java.awt.Color(204, 204, 204));
    añoEqInbox.setText("Año de creación");
    añoEqInbox.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            añoEqInboxActionPerformed(evt);
        }
    });
    añoEqInbox.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            añoEqInboxFocusGained(evt);
        }
    });

    dineroEqInbox.setForeground(new java.awt.Color(204, 204, 204));
    dineroEqInbox.setText("Dinero");
    dineroEqInbox.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dineroEqInboxFocusGained(evt);
        }
    });

    generarEqButton.setText("Generar");
    generarEqButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            generarEqButtonActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout nuevEqPanelLayout = new javax.swing.GroupLayout(nuevEqPanel);
    nuevEqPanel.setLayout(nuevEqPanelLayout);
    nuevEqPanelLayout.setHorizontalGroup(
        nuevEqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(nuevEqPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(nuevEqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(añoEqInbox)
                .addComponent(dineroEqInbox)
                .addComponent(domicilioEqInbox)
                .addComponent(himnoEqInbox)
                .addComponent(banderaEqInbox)
                .addComponent(nombreEqInbox)
                .addComponent(generarEqButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap(735, Short.MAX_VALUE))
    );
    nuevEqPanelLayout.setVerticalGroup(
        nuevEqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(nuevEqPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(nombreEqInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(banderaEqInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(himnoEqInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(domicilioEqInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(añoEqInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(dineroEqInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(generarEqButton)
            .addContainerGap(526, Short.MAX_VALUE))
    );

    equipo.addTab("Nuevo Equipo", nuevEqPanel);

    mercadoLista.setModel(new javax.swing.AbstractListModel() {

        public int getSize() { return mercado.guardarMercado().size(); }
        public Object getElementAt(int i) { return (mercado.guardarMercado().get(i).getNombreDeportivo()+" - "+((mercado.guardarMercado().get(i).esDeCampo())?"C":"P")); }
    }
    );
    mercadoLista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
        public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
            mercadoListaValueChanged(evt);
        }
    });
    jScrollPane3.setViewportView(mercadoLista);

    jLabel1.setText("Seleccione los jugadores");

    mercadoEqLista.setModel(new javax.swing.AbstractListModel() {
        public int getSize() { return listaEquipos.size(); }
        public Object getElementAt(int i) { return listaEquipos.get(i).toString(); }
    }
    );
    jScrollPane5.setViewportView(mercadoEqLista);

    jLabel2.setText("Seleccione el equipo");

    Aceptar.setText("Aceptar");
    Aceptar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            AceptarActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout panelficharmercLayout = new javax.swing.GroupLayout(panelficharmerc);
    panelficharmerc.setLayout(panelficharmercLayout);
    panelficharmercLayout.setHorizontalGroup(
        panelficharmercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panelficharmercLayout.createSequentialGroup()
            .addGroup(panelficharmercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelficharmercLayout.createSequentialGroup()
                    .addGap(208, 208, 208)
                    .addGroup(panelficharmercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGap(105, 105, 105)
                    .addGroup(panelficharmercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelficharmercLayout.createSequentialGroup()
                    .addGap(428, 428, 428)
                    .addComponent(Aceptar)))
            .addContainerGap(216, Short.MAX_VALUE))
    );
    panelficharmercLayout.setVerticalGroup(
        panelficharmercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panelficharmercLayout.createSequentialGroup()
            .addGap(24, 24, 24)
            .addGroup(panelficharmercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(jLabel2))
            .addGap(18, 18, 18)
            .addGroup(panelficharmercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jScrollPane5)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
            .addGap(14, 14, 14)
            .addComponent(Aceptar)
            .addContainerGap(311, Short.MAX_VALUE))
    );

    equipo.addTab("Fichar desde Mercado", panelficharmerc);

    listillaEquipos.setModel(new javax.swing.AbstractListModel() {
        public int getSize() { return listaEquipos.size(); }
        public Object getElementAt(int i) { return listaEquipos.get(i).toString(); }
    });
    listillaEquipos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
        public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
            listillaEquiposValueChanged(evt);
        }
    });
    jScrollPane1.setViewportView(listillaEquipos);

    jugEquipo.setModel(new javax.swing.AbstractListModel() {
        String[] strings = { "-Jugadores-" };
        public int getSize() { return strings.length; }
        public Object getElementAt(int i) { return strings[i]; }
    });
    jScrollPane4.setViewportView(jugEquipo);

    jLabel3.setText("Seleccione el equipo");

    jLabel4.setText("Seleccione el jugador a fichar");

    pagarPrecio.setText("Precio");
    pagarPrecio.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            pagarPrecioActionPerformed(evt);
        }
    });

    jLabel5.setText("Elija el método de pago");

    jLabel6.setText("(Seleccione sus jugadores)");

    jugACambiar.setModel(new javax.swing.AbstractListModel() {
        String[] strings = { "-Jugadores-" };
        public int getSize() { return strings.length; }
        public Object getElementAt(int i) { return strings[i]; }

    });
    jugACambiar.setFocusable(false);
    jugACambiar.setName("pene"); // NOI18N
    jugACambiar.setRequestFocusEnabled(false);
    jScrollPane6.setViewportView(jugACambiar);

    tuEquipoList.setModel(new javax.swing.AbstractListModel() {
        public int getSize() { return listaEquipos.size(); }
        public Object getElementAt(int i) { return listaEquipos.get(i).toString(); }
    });
    tuEquipoList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
        public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
            tuEquipoListValueChanged(evt);
        }
    });
    jScrollPane7.setViewportView(tuEquipoList);

    jLabel7.setText("Su equipo");

    jLabel8.setText("Los jugadores a cambiar");

    intercambiar.setText("Intercambiar");
    intercambiar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            intercambiarActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout panelficharOtroEqLayout = new javax.swing.GroupLayout(panelficharOtroEq);
    panelficharOtroEq.setLayout(panelficharOtroEqLayout);
    panelficharOtroEqLayout.setHorizontalGroup(
        panelficharOtroEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panelficharOtroEqLayout.createSequentialGroup()
            .addGap(34, 34, 34)
            .addGroup(panelficharOtroEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelficharOtroEqLayout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addGroup(panelficharOtroEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelficharOtroEqLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel6))
                        .addGroup(panelficharOtroEqLayout.createSequentialGroup()
                            .addGroup(panelficharOtroEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pagarPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(intercambiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(62, 62, 62)
                            .addComponent(jLabel7))))
                .addGroup(panelficharOtroEqLayout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jLabel8))
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(panelficharOtroEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelficharOtroEqLayout.createSequentialGroup()
            .addGroup(panelficharOtroEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelficharOtroEqLayout.createSequentialGroup()
                    .addContainerGap(160, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(67, 67, 67))
                .addGroup(panelficharOtroEqLayout.createSequentialGroup()
                    .addGap(144, 144, 144)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(panelficharOtroEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(114, 114, 114))
    );
    panelficharOtroEqLayout.setVerticalGroup(
        panelficharOtroEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panelficharOtroEqLayout.createSequentialGroup()
            .addGap(14, 14, 14)
            .addGroup(panelficharOtroEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(jLabel4))
            .addGap(27, 27, 27)
            .addGroup(panelficharOtroEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addComponent(jScrollPane1))
            .addGroup(panelficharOtroEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelficharOtroEqLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panelficharOtroEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pagarPrecio)
                        .addComponent(jLabel7))
                    .addGap(25, 25, 25)
                    .addComponent(intercambiar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel6)
                    .addGap(74, 74, 74)
                    .addComponent(jLabel8))
                .addGroup(panelficharOtroEqLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(46, Short.MAX_VALUE))
    );

    equipo.addTab("Fichar de otro equipo", panelficharOtroEq);

    jugadorCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{" - Equipos - "}));
    jugadorCombobox.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jugadorComboboxActionPerformed(evt);
        }
    });
    jugadorCombobox.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            jugadorComboboxFocusGained(evt);
        }
    });

    jugAdescartar.setModel(new javax.swing.AbstractListModel() {
        String[] strings = { "-Jugadores-" };
        public int getSize() { return strings.length; }
        public Object getElementAt(int i) { return strings[i]; }
    });
    jugAdescartar.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
        public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
            jugAdescartarValueChanged(evt);
        }
    });
    jScrollPane8.setViewportView(jugAdescartar);

    jLabel9.setText("Seleccione el equipo");

    descartarJugButton.setText("Descartar");
    descartarJugButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            descartarJugButtonActionPerformed(evt);
        }
    });

    jLabel10.setText("Seleccione el jugador a descartar");

    eliminarJugButton.setText("Eliminar");
    eliminarJugButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            eliminarJugButtonActionPerformed(evt);
        }
    });

    modificarJugButton.setText("Modificar");
    modificarJugButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            modificarJugButtonActionPerformed(evt);
        }
    });

    jTextField1.setText("Nombre");
    jTextField1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField1ActionPerformed(evt);
        }
    });

    jTextField2.setText("Apellidos");

    jTextField3.setText("Nombre deportivo");

    jTextField4.setText("Edad");

    jTextField5.setText("Peso");

    jTextField6.setText("Altura");
    jTextField6.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField6ActionPerformed(evt);
        }
    });

    jLabel11.setText("Atributo 1");

    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

    jLabel12.setText("Atributo 2");

    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

    jLabel13.setText("Atributo 3");

    jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

    jLabel14.setText("Atributo 4");

    jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

    jLabel15.setText("Atributo 5");

    jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

    javax.swing.GroupLayout paneldescartarJugadorLayout = new javax.swing.GroupLayout(paneldescartarJugador);
    paneldescartarJugador.setLayout(paneldescartarJugadorLayout);
    paneldescartarJugadorLayout.setHorizontalGroup(
        paneldescartarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(paneldescartarJugadorLayout.createSequentialGroup()
            .addGap(33, 33, 33)
            .addGroup(paneldescartarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(paneldescartarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jugadorCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descartarJugButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarJugButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificarJugButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4)
                    .addComponent(jTextField5)
                    .addComponent(jTextField6))
                .addComponent(jLabel11)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel12)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel15)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel14)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel13))
            .addGap(71, 71, 71)
            .addGroup(paneldescartarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(paneldescartarJugadorLayout.createSequentialGroup()
                    .addComponent(jLabel10)
                    .addGap(0, 376, Short.MAX_VALUE))
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE))
            .addContainerGap())
    );
    paneldescartarJugadorLayout.setVerticalGroup(
        paneldescartarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(paneldescartarJugadorLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(paneldescartarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel10)
                .addComponent(jLabel9))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(paneldescartarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(paneldescartarJugadorLayout.createSequentialGroup()
                    .addComponent(jugadorCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(descartarJugButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(eliminarJugButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(modificarJugButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel11)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel12)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel13)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel14)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel15)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jScrollPane8))
            .addContainerGap(197, Short.MAX_VALUE))
    );

    equipo.addTab("Ver y modificar Jugadores", paneldescartarJugador);

    eqcombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{" - Equipos - "}));
    eqcombobox.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            eqcomboboxActionPerformed(evt);
        }
    });
    eqcombobox.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            eqcomboboxFocusGained(evt);
        }
    });

    modificarEq.setText("Modificar");
    modificarEq.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            modificarEqActionPerformed(evt);
        }
    });

    nombreEqtext.setText("Nombre");
    nombreEqtext.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            nombreEqtextActionPerformed(evt);
        }
    });

    domicilioEq.setText("Domicilio");
    domicilioEq.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            domicilioEqActionPerformed(evt);
        }
    });

    añoEq.setText("Año");

    himnoEq.setText("Himno");

    banderaEq.setText("Bandera");

    dineroEq.setText("Dinero");

    eliminarEq.setText("Eliminar");
    eliminarEq.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            eliminarEqActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout panelmodificarEqLayout = new javax.swing.GroupLayout(panelmodificarEq);
    panelmodificarEq.setLayout(panelmodificarEqLayout);
    panelmodificarEqLayout.setHorizontalGroup(
        panelmodificarEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panelmodificarEqLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(panelmodificarEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(dineroEq)
                .addComponent(banderaEq, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addComponent(himnoEq, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(añoEq, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(domicilioEq)
                .addComponent(nombreEqtext, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(eqcombobox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(35, 35, 35)
            .addGroup(panelmodificarEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(modificarEq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eliminarEq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap(608, Short.MAX_VALUE))
    );
    panelmodificarEqLayout.setVerticalGroup(
        panelmodificarEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panelmodificarEqLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(panelmodificarEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(eqcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(modificarEq))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelmodificarEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(nombreEqtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(eliminarEq))
            .addGap(4, 4, 4)
            .addComponent(domicilioEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(añoEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(himnoEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(banderaEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(dineroEq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(530, Short.MAX_VALUE))
    );

    equipo.addTab("Modificar Equipo", panelmodificarEq);

    jTextNombre.setText("Nombre");

    jTextApellidos.setText("Apellidos");

    jTextAño.setText("Año de Nacimiento");

    jTextCargo.setText("Cargo");

    directivoNuevo.setText("Crear directivo");
    directivoNuevo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            directivoNuevoActionPerformed(evt);
        }
    });

    setDirectivos.setText("Contratar directivos");
    setDirectivos.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            setDirectivosActionPerformed(evt);
        }
    });

    equipoTuCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{" - Equipos - "}));
    equipoTuCombobox.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            equipoTuComboboxFocusGained(evt);
        }
    });

    jLabel21.setText("Ingrese tantos directivos como desee");

    jLabel22.setText("Seleccione su equipo para agregar los directivos creados");

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTextCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel21)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextAño, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(jTextApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(directivoNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel22)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(setDirectivos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(equipoTuCombobox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .addContainerGap(317, Short.MAX_VALUE))
    );
    jPanel6Layout.setVerticalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel21)
                .addComponent(jLabel22))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(equipoTuCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(setDirectivos))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jTextCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(9, 9, 9)
            .addComponent(jTextAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(directivoNuevo)
            .addContainerGap(542, Short.MAX_VALUE))
    );

    equipo.addTab("Añadir Directivos", jPanel6);

    jugadorCombobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[]{" - Equipos - "}));
    jugadorCombobox1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jugadorCombobox1ActionPerformed(evt);
        }
    });
    jugadorCombobox1.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            jugadorCombobox1FocusGained(evt);
        }
    });

    jugAdescartar1.setModel(new javax.swing.AbstractListModel() {
        String[] strings = { "-Jugadores-" };
        public int getSize() { return strings.length; }
        public Object getElementAt(int i) { return strings[i]; }
    });
    jugAdescartar1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
        public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
            jugAdescartar1ValueChanged(evt);
        }
    });
    jScrollPane13.setViewportView(jugAdescartar1);

    jLabel23.setText("Seleccione el equipo");

    jLabel24.setText("Seleccione el directivo");

    eliminarJugButton1.setText("Eliminar");
    eliminarJugButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            eliminarJugButton1ActionPerformed(evt);
        }
    });

    modificarJugButton1.setText("Modificar");
    modificarJugButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            modificarJugButton1ActionPerformed(evt);
        }
    });

    jTextField8.setText("Nombre");
    jTextField8.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField8ActionPerformed(evt);
        }
    });

    jTextField9.setText("Apellidos");

    jTextField10.setText("Cargo");

    jTextField11.setText("Edad");

    javax.swing.GroupLayout paneldescartarJugador1Layout = new javax.swing.GroupLayout(paneldescartarJugador1);
    paneldescartarJugador1.setLayout(paneldescartarJugador1Layout);
    paneldescartarJugador1Layout.setHorizontalGroup(
        paneldescartarJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(paneldescartarJugador1Layout.createSequentialGroup()
            .addGap(33, 33, 33)
            .addGroup(paneldescartarJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jugadorCombobox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eliminarJugButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modificarJugButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField8)
                .addComponent(jTextField9)
                .addComponent(jTextField10)
                .addComponent(jTextField11))
            .addGap(71, 71, 71)
            .addGroup(paneldescartarJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel24)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(421, Short.MAX_VALUE))
    );
    paneldescartarJugador1Layout.setVerticalGroup(
        paneldescartarJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(paneldescartarJugador1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(paneldescartarJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel24)
                .addComponent(jLabel23))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(paneldescartarJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(paneldescartarJugador1Layout.createSequentialGroup()
                    .addComponent(jugadorCombobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(eliminarJugButton1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(modificarJugButton1)
                    .addGap(25, 25, 25)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(427, Short.MAX_VALUE))
    );

    equipo.addTab("Modificar Directivos", paneldescartarJugador1);

    javax.swing.GroupLayout panelEqLayout = new javax.swing.GroupLayout(panelEq);
    panelEq.setLayout(panelEqLayout);
    panelEqLayout.setHorizontalGroup(
        panelEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panelEqLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(equipo)
            .addContainerGap())
    );
    panelEqLayout.setVerticalGroup(
        panelEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(equipo, javax.swing.GroupLayout.Alignment.TRAILING)
    );

    ventanaPrinc.addTab("Equipos", panelEq);

    torneosCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{" - Equipos - "}));
    torneosCombobox.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            torneosComboboxActionPerformed(evt);
        }
    });
    torneosCombobox.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            torneosComboboxFocusGained(evt);
        }
    });

    jTablaTorneo.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            null, null, null, null
        }
    ));
    jScrollPane9.setViewportView(jTablaTorneo);

    jugarTorneo.setText("Jugar Torneo");
    jugarTorneo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jugarTorneoActionPerformed(evt);
        }
    });

    generarCalTor.setText("Generar Calendario");
    generarCalTor.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            generarCalTorActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(torneosCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
        .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(204, 204, 204)
            .addComponent(generarCalTor, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jugarTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(305, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(torneosCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jugarTorneo)
                .addComponent(generarCalTor))
            .addGap(0, 252, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Ver torneos", jPanel1);

    nombreTInbox.setForeground(new java.awt.Color(204, 204, 204));
    nombreTInbox.setText("Nombre del torneo");
    nombreTInbox.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            nombreTInboxActionPerformed(evt);
        }
    });
    nombreTInbox.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            nombreTInboxFocusGained(evt);
        }
    });

    jListEquiposTorneo.setModel(new javax.swing.AbstractListModel() {
        public int getSize() { return listaEquipos.size(); }
        public Object getElementAt(int i) { return listaEquipos.get(i).toString(); }
    });
    jListEquiposTorneo.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
        public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
            jListEquiposTorneoValueChanged(evt);
        }
    });
    jScrollPane10.setViewportView(jListEquiposTorneo);

    jcrearTorneoButton.setText("Crear torneo");
    jcrearTorneoButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jcrearTorneoButtonActionPerformed(evt);
        }
    });

    jLabel16.setText("Selecciones los equipos");

    jLabel17.setText("Equipos seleccionados = 0");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jcrearTorneoButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(nombreTInbox, javax.swing.GroupLayout.Alignment.LEADING)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(165, 165, 165)
                    .addComponent(jLabel16))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(145, 145, 145)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(312, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(nombreTInbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel16))
            .addGap(32, 32, 32)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jcrearTorneoButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel17))
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(415, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Nuevo Torneo", jPanel2);

    torneosCombobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[]{" - Equipos - "}));
    torneosCombobox1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            torneosCombobox1ActionPerformed(evt);
        }
    });
    torneosCombobox1.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            torneosCombobox1FocusGained(evt);
        }
    });

    nombreTInbox1.setForeground(new java.awt.Color(204, 204, 204));
    nombreTInbox1.setText("Nombre del torneo");
    nombreTInbox1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            nombreTInbox1ActionPerformed(evt);
        }
    });
    nombreTInbox1.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            nombreTInbox1FocusGained(evt);
        }
    });

    jList1.setModel(new javax.swing.AbstractListModel() {
        String[] strings = { "-Equipos-" };
        public int getSize() { return strings.length; }
        public Object getElementAt(int i) { return strings[i]; }
    });
    jScrollPane11.setViewportView(jList1);

    jList2.setModel(new javax.swing.AbstractListModel() {
        String[] strings = { "-Equipos-" };
        public int getSize() { return strings.length; }
        public Object getElementAt(int i) { return strings[i]; }
    });
    jScrollPane12.setViewportView(jList2);

    cambiarNombreTorneo.setText("Cambiar Nombre");
    cambiarNombreTorneo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cambiarNombreTorneoActionPerformed(evt);
        }
    });

    eliminarEqTor.setText("Eliminar Equipo");
    eliminarEqTor.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            eliminarEqTorActionPerformed(evt);
        }
    });

    agregarEqTor.setText("Agregar Equipo");
    agregarEqTor.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            agregarEqTorActionPerformed(evt);
        }
    });

    jLabel18.setText("Equipos participantes");

    jLabel19.setText("Equipos no participantes");

    eliminarTor.setText("Eliminar Torneo");
    eliminarTor.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            eliminarTorActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(eliminarTor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(torneosCombobox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nombreTInbox1, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(cambiarNombreTorneo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(agregarEqTor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eliminarEqTor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(243, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(torneosCombobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel19))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(nombreTInbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cambiarNombreTorneo)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(eliminarEqTor)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(agregarEqTor))
                .addComponent(jScrollPane11))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(eliminarTor)
            .addGap(0, 525, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Editar torneo", jPanel3);

    javax.swing.GroupLayout panelTorneosLayout = new javax.swing.GroupLayout(panelTorneos);
    panelTorneos.setLayout(panelTorneosLayout);
    panelTorneosLayout.setHorizontalGroup(
        panelTorneosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jTabbedPane1)
    );
    panelTorneosLayout.setVerticalGroup(
        panelTorneosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jTabbedPane1)
    );

    ventanaPrinc.addTab("Torneos", panelTorneos);

    guardarDatos.setText("Guardar Datos");
    guardarDatos.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            guardarDatosActionPerformed(evt);
        }
    });

    cargarDatos.setText("Cargar Datos");
    cargarDatos.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cargarDatosActionPerformed(evt);
        }
    });

    jTextField7.setForeground(new java.awt.Color(204, 204, 204));
    jTextField7.setText("datosPractica");
    jTextField7.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField7ActionPerformed(evt);
        }
    });
    jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            jTextField7FocusGained(evt);
        }
    });

    jLabel20.setText("Escriba el nombre del fichero en el que desea guardar o cargar");

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel20)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 553, Short.MAX_VALUE))
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addGap(42, 42, 42)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(guardarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cargarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addComponent(jLabel20)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(guardarDatos)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cargarDatos)
            .addContainerGap(651, Short.MAX_VALUE))
    );

    ventanaPrinc.addTab("Archivo", jPanel5);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(ventanaPrinc)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(ventanaPrinc, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 11, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ventanaPrincMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventanaPrincMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ventanaPrincMouseClicked

    private void porteroNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porteroNuevoActionPerformed
        jugadoresPanel.removeAll();
        jugadoresPanel.setLayout(new BorderLayout());
        jugadoresPanel.add(porteroNuevo(panelesJug.get(0)),BorderLayout.NORTH);
        jugadoresPanel.updateUI();
        JButton botonGenerar = (JButton) ((JPanel) jugadoresPanel.getComponent(0)).getComponent(17);
        botonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try{    
                JPanel panel = ((JPanel) jugadoresPanel.getComponent(0));
                Portero p=new Portero(
                             Integer.parseInt((String)((JComboBox) panel.getComponent(10)).getSelectedItem()), //salidas
                             Integer.parseInt((String)((JComboBox) panel.getComponent(14)).getSelectedItem()), //mano a mano
                             Integer.parseInt((String)((JComboBox) panel.getComponent(12)).getSelectedItem()), // reflejos
                             Integer.parseInt((String)((JComboBox) panel.getComponent(16)).getSelectedItem()), // penaltis
                             ((JTextField) panel.getComponent(3)).getText(), //nombre deportivo
                             Integer.parseInt((String)((JComboBox) panel.getComponent(8)).getSelectedItem()), //colocacion
                             ((JTextField) panel.getComponent(1)).getText(), //nombre
                             ((JTextField) panel.getComponent(2)).getText(), //apellidos
                             Integer.parseInt((String)((JTextField) panel.getComponent(4)).getText()), //fecha nacimiento (date)
                             Double.parseDouble(((JTextField) panel.getComponent(5)).getText()), //peso (double)
                             Double.parseDouble(((JTextField) panel.getComponent(6)).getText()) //altura
                            );
               Mercado.jugadores.add(p);

                        ImageIcon image=new ImageIcon("guau.png");
                        JOptionPane.showMessageDialog(
                        null,
                        new JLabel("Jugador creado con exito!", image, JLabel.LEFT),
                        "Aviso", JOptionPane.PLAIN_MESSAGE);
                             //JOptionPane.showMessageDialog(null, "A basic JOptionPane message dialog");

                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(
                        null,
                        new JLabel("Error: uno o varios de los campos no son válidos.", null, JLabel.LEFT),
                        "Aviso", JOptionPane.WARNING_MESSAGE);
                }
                             
            }
        });
        updateUIS();
    }//GEN-LAST:event_porteroNuevoActionPerformed

    private void jugNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugNuevoActionPerformed
        jugadoresPanel.removeAll();
        jugadoresPanel.setLayout(new BorderLayout());
        jugadoresPanel.add(jugadorNuevo(panelesJug.get(1)),BorderLayout.NORTH);
        jugadoresPanel.updateUI();
        JPanel panel =(JPanel) jugadoresPanel.getComponent(0);
        JButton generar = (JButton) panel.getComponent(17);
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              try{    
                    JPanel panel = ((JPanel) jugadoresPanel.getComponent(0));
                    Jugador jug=new JugadorCampo(
                                Integer.parseInt((String)((JComboBox) panel.getComponent(10)).getSelectedItem()), //velocidad
                                Integer.parseInt((String)((JComboBox) panel.getComponent(14)).getSelectedItem()), //potencia
                                Integer.parseInt((String)((JComboBox) panel.getComponent(12)).getSelectedItem()), // regate
                                Integer.parseInt((String)((JComboBox) panel.getComponent(16)).getSelectedItem()), // tiro
                                ((JTextField) panel.getComponent(3)).getText(), //nombre deportivo
                                Integer.parseInt((String)((JComboBox) panel.getComponent(8)).getSelectedItem()), //colocacion
                                ((JTextField) panel.getComponent(1)).getText(), //nombre
                                ((JTextField) panel.getComponent(2)).getText(), //apellidos
                                Integer.parseInt((String)((JTextField) panel.getComponent(4)).getText()), //fecha nacimiento (date)
                                Double.parseDouble(((JTextField) panel.getComponent(5)).getText()), //peso (double)
                                Double.parseDouble(((JTextField) panel.getComponent(6)).getText()) //altura
                            );
                     Mercado.jugadores.add(jug);
                             ImageIcon image=new ImageIcon("guau.png");
                             JOptionPane.showMessageDialog(
                            null,
                            new JLabel("Jugador creado con exito!", image, JLabel.LEFT),
                            "Aviso", JOptionPane.PLAIN_MESSAGE);
                             //JOptionPane.showMessageDialog(null, "A basic JOptionPane message dialog");
                             mercadoLista.updateUI();
                     
              }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(
                        null,
                        new JLabel("Error: uno o varios de los campos no son válidos.", null, JLabel.LEFT),
                        "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            } 
        });
         updateUIS();
    }//GEN-LAST:event_jugNuevoActionPerformed

    private void intercambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intercambiarActionPerformed
        String [] s=listillaEquipos.getSelectedValue().toString().split(" - ");
        Equipo eq=listaEquipos.get(listaEquipos.indexOf(new Equipo(s[0],null,0,null,null,0,null)));
        String [] s1=jugEquipo.getSelectedValue().toString().split(" - ");
        JugadorCampo j=new JugadorCampo();
        Portero j2=new Portero();
        if (eq.getJugCampo().contains(new JugadorCampo(0,0,0,0,s1[0],0,null,null,0,0.0,0.0))){
             j=convertirSelectedAJugadorCampo(jugEquipo,eq);}
        else {
             j2=convertirSelectedAPortero(jugEquipo,eq);}
        String s4=tuEquipoList.getSelectedValue().toString();
        String [] s5=s4.split(" - ");
        Equipo tu=listaEquipos.get(listaEquipos.indexOf(new Equipo(s5[0],null,0,null,null,0,null)));
        Jugador[] arrayintercambiados=new Jugador[jugACambiar.getSelectedValuesList().size()];
        List l=jugACambiar.getSelectedValuesList();
        int i=0;
        for (Object o:l){
            String a=o.toString();
            String[] b=a.split(" - ");
            if(tu.getJugCampo().indexOf(new JugadorCampo(0,0,0,0,b[0],0,null,null,0,0.0,0.0))!=-1){
                JugadorCampo jeje=tu.getJugCampo().get(tu.getJugCampo().indexOf(new JugadorCampo(0,0,0,0,b[0],0,null,null,0,0.0,0.0)));
                arrayintercambiados[i]=jeje;
            }
            else if (tu.getPorteros().indexOf(new Portero(0,0,0,0,b[0],0,null,null,0,0.0,0.0))!=-1){
                Portero jaja=tu.getPorteros().get(tu.getPorteros().indexOf(new Portero(0,0,0,0,b[0],0,null,null,0,0.0,0.0)));
                arrayintercambiados[i]=jaja;
            }
            i++;
        }
        if(eq.getJugCampo().indexOf(j)!=-1){
            //JugadorCampo jug=eq.getJugCampo().get(eq.getJugCampo().indexOf(j));
            try{
                tu.fichar(j,eq,arrayintercambiados);
                JOptionPane.showMessageDialog(
                    null,
                    new JLabel("Hecho.", null, JLabel.LEFT),
                    "Aviso", JOptionPane.WARNING_MESSAGE);
            }
            catch(ErrorNumero e){
                JOptionPane.showMessageDialog(
                    null,
                    new JLabel("Error: El intercambio no es justo.", null, JLabel.LEFT),
                    "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        }
        else if(eq.getPorteros().indexOf(j2)!=-1){
            //Portero port=eq.getPorteros().get(eq.getPorteros().indexOf(j2));
            try{
                tu.fichar(j2,eq,arrayintercambiados);
                JOptionPane.showMessageDialog(
                    null,
                    new JLabel("Hecho.", null, JLabel.LEFT),
                    "Aviso", JOptionPane.WARNING_MESSAGE);
            }
            catch(ErrorNumero e){
                JOptionPane.showMessageDialog(
                    null,
                    new JLabel("Error: El intercambio no es justo.", null, JLabel.LEFT),
                    "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        }
        updateUIS();
        jugEquipo.setListData(new String[]{"- Jugadores -"});
        jugACambiar.setListData(new String[]{"- Jugadores -"});
    }//GEN-LAST:event_intercambiarActionPerformed

    private void tuEquipoListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_tuEquipoListValueChanged
        Equipo e=convertirSelectedAEquipo(tuEquipoList);
        String[] listj= new String[(e.getJugCampo().size()+e.getPorteros().size())];
        int i=0;
        for (Jugador j:e.getJugCampo()){
            listj[i]=j.getNombreDeportivo()+" - "+j.getValoracion()+" - "+j.getPrecio()+"€";
            i++;
        }
        for (Jugador k:e.getPorteros()){
            listj[i]=k.getNombreDeportivo()+" - "+k.getValoracion()+" - "+k.getPrecio()+"€";
            i++;
        }
        jugACambiar.setListData(listj);
        jugACambiar.updateUI();
    }//GEN-LAST:event_tuEquipoListValueChanged

    private void pagarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarPrecioActionPerformed
        Equipo eq=convertirSelectedAEquipo(listillaEquipos);
        JugadorCampo j=convertirSelectedAJugadorCampo(jugEquipo,eq);
        Portero j2=convertirSelectedAPortero(jugEquipo,eq);
        Equipo tu=convertirSelectedAEquipo(tuEquipoList);
        if(eq.getJugCampo().indexOf(j)!=-1){
            JugadorCampo jug=eq.getJugCampo().get(eq.getJugCampo().indexOf(j));
            try{
                tu.fichar(jug, eq);
                JOptionPane.showMessageDialog(
                    null,
                    new JLabel("Hecho", null, JLabel.LEFT),
                    "Aviso", JOptionPane.WARNING_MESSAGE);
            }
            catch(ErrorNumero e){
                JOptionPane.showMessageDialog(
                    null,
                    new JLabel("Error: no hay suficiente dinero.", null, JLabel.LEFT),
                    "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        }
        else if(eq.getPorteros().indexOf(j2)!=-1){
            Portero port=eq.getPorteros().get(eq.getPorteros().indexOf(j2));
            try{
                tu.fichar(port,eq);
                JOptionPane.showMessageDialog(
                    null,
                    new JLabel("Hecho", null, JLabel.LEFT),
                    "Aviso", JOptionPane.WARNING_MESSAGE);
            }
            catch(ErrorNumero e){
                JOptionPane.showMessageDialog(
                    null,
                    new JLabel("Error: no hay suficiente dinero.", null, JLabel.LEFT),
                    "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        }
        updateUIS();
    }//GEN-LAST:event_pagarPrecioActionPerformed

    private void listillaEquiposValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listillaEquiposValueChanged
        listillaEquipos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jugEquipo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tuEquipoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jugACambiar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Equipo e=convertirSelectedAEquipo(listillaEquipos);
        String[] listj= new String[(e.getJugCampo().size()+e.getPorteros().size())];
        int i=0;
        for (Jugador j:e.getJugCampo()){
            listj[i]=j.getNombreDeportivo()+" - "+j.getValoracion()+" - "+j.getPrecio()+"€";
            i++;
        }
        for (Jugador k:e.getPorteros()){
            listj[i]=k.getNombreDeportivo()+" - "+k.getValoracion()+" - "+k.getPrecio()+"€";
            i++;
        }
        jugEquipo.setListData(listj);
        jugEquipo.updateUI();
    }//GEN-LAST:event_listillaEquiposValueChanged

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        if ((mercadoLista.getSelectedValuesList()!=null)&&(mercadoEqLista.getSelectedValue()!=null)){
            ArrayList<Jugador> listaJugs=new ArrayList<Jugador>();
            List<String> nombredepjugs=(List <String>)mercadoLista.getSelectedValuesList();
            for (String s:nombredepjugs){
                String[] b=s.split(" - ");
                int p=Mercado.jugadores.indexOf(new JugadorCampo(0, 0, 0, 0, b[0], 0, null, null, 0, null, null));
                listaJugs.add(Mercado.jugadores.get(p));
            }
            Equipo equip=convertirSelectedAEquipo(mercadoEqLista);
            for(Jugador j:listaJugs){
                equip.fichar(j);}
            panelficharmerc.updateUI();
            ImageIcon image=new ImageIcon("equipo.gif");
            JOptionPane.showMessageDialog(
                null,
                new JLabel("Hecho", image, JLabel.LEFT),
                "Aviso", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void mercadoListaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_mercadoListaValueChanged
        mercadoEqLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }//GEN-LAST:event_mercadoListaValueChanged

//EQUIPO
    private void generarEqButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarEqButtonActionPerformed
        try{
            Equipo eq=(new Equipo(
                nombreEqInbox.getText(),//nombre
                domicilioEqInbox.getText(),//domicilio
                Integer.parseInt(añoEqInbox.getText()),//año (int)
                himnoEqInbox.getText(),//himno
                banderaEqInbox.getText(),//bandera
                Double.parseDouble(dineroEqInbox.getText()),//dinero (doub)
                mercado
            ));
                listaEquipos.add(eq);
                ImageIcon image2=new ImageIcon("equipo.gif");
                JOptionPane.showMessageDialog(
                    null,
                    new JLabel("Equipo creado con exito!", image2, JLabel.LEFT),
                    "Aviso", JOptionPane.PLAIN_MESSAGE);
                mercadoEqLista.updateUI();
                listillaEquipos.updateUI();
                tuEquipoList.updateUI();
                jListEquipos.updateUI();
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(
                null,
                new JLabel("Error: uno o varios de los campos no son válidos.", null, JLabel.LEFT),
                "Aviso", JOptionPane.WARNING_MESSAGE);
        }
        updateUIS();
    }//GEN-LAST:event_generarEqButtonActionPerformed

    private void dineroEqInboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dineroEqInboxFocusGained
        dineroEqInbox.setText("");
        dineroEqInbox.setForeground(Color.black);
    }//GEN-LAST:event_dineroEqInboxFocusGained

    private void añoEqInboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_añoEqInboxFocusGained
        añoEqInbox.setText("");
        añoEqInbox.setForeground(Color.black);
    }//GEN-LAST:event_añoEqInboxFocusGained

    private void añoEqInboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añoEqInboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añoEqInboxActionPerformed

    private void domicilioEqInboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_domicilioEqInboxFocusGained
        domicilioEqInbox.setText("");
        domicilioEqInbox.setForeground(Color.black);
    }//GEN-LAST:event_domicilioEqInboxFocusGained

    private void himnoEqInboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_himnoEqInboxFocusGained
        himnoEqInbox.setText("");
        himnoEqInbox.setForeground(Color.black);
    }//GEN-LAST:event_himnoEqInboxFocusGained

    private void himnoEqInboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_himnoEqInboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_himnoEqInboxActionPerformed

    private void banderaEqInboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_banderaEqInboxFocusGained
        banderaEqInbox.setText("");
        banderaEqInbox.setForeground(Color.black);
    }//GEN-LAST:event_banderaEqInboxFocusGained

    private void banderaEqInboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banderaEqInboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_banderaEqInboxActionPerformed

    private void nombreEqInboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreEqInboxFocusGained
        nombreEqInbox.setText("");
        nombreEqInbox.setForeground(Color.black);
    }//GEN-LAST:event_nombreEqInboxFocusGained

    private void nombreEqInboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEqInboxActionPerformed

    }//GEN-LAST:event_nombreEqInboxActionPerformed

    private void verIntegrantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verIntegrantesActionPerformed
        Equipo equiposel=convertirSelectedAEquipo(jListEquipos);
        JTable tablaJug = new javax.swing.JTable();
        Object[][] tabla = new Object[(equiposel.getPorteros().size())+(equiposel.getJugCampo().size())][3];
        int i = 0;
        for (Jugador jug:equiposel.getJugCampo()){
            tabla[i][0] = jug.getNombreDeportivo();
            tabla[i][1] = jug.getValoracion();
            tabla[i][2] = jug.getPrecio();
            i++;
        }
        for (Jugador jug:equiposel.getPorteros()){
            tabla[i][0] = jug.getNombreDeportivo();
            tabla[i][1] = jug.getValoracion();
            tabla[i][2] = jug.getPrecio();
            i++;
        }
        String[] cabecera = new String[3];
        cabecera[0]="Nombre deportivo";cabecera[1]="Valoracion";cabecera[2]="Precio";
        tablaJug.setModel(new javax.swing.table.DefaultTableModel(
            tabla,cabecera));
    tablaJug.setAutoResizeMode(5);
    JOptionPane.showMessageDialog(
        null,tablaJug);
    }//GEN-LAST:event_verIntegrantesActionPerformed

    private void jListEquiposValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListEquiposValueChanged
        jListEquipos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }//GEN-LAST:event_jListEquiposValueChanged

    private void jugadorComboboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jugadorComboboxFocusGained
            String[] comboEquipos= new String[listaEquipos.size()+1];
            comboEquipos[0]="-Mercado-";
            int a = 1;
            for (Equipo e:listaEquipos){
                comboEquipos[a]=e.getNombre();
                a++;
            }
            jugadorCombobox.setModel(new javax.swing.DefaultComboBoxModel(comboEquipos));
            jugAdescartar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }//GEN-LAST:event_jugadorComboboxFocusGained

    private void jugadorComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugadorComboboxActionPerformed
        if (jugadorCombobox.getSelectedIndex()==0){
            String[] listj= new String[mercado.guardarMercado().size()];
            int i=0;
            for (Jugador j:mercado.guardarMercado()){
                listj[i]=j.getNombreDeportivo()+" - "+j.getValoracion()+" - "+j.getPrecio()+"€";
                i++;
            }
            jugAdescartar.setListData(listj);
        }else{
            String s=jugadorCombobox.getSelectedItem().toString();
            String[] s2=s.split(" - ");
            Equipo e=listaEquipos.get(listaEquipos.indexOf(new Equipo(s2[0],null,0,null,null,0,null)));
            String[] listj= new String[(e.getJugCampo().size()+e.getPorteros().size())];
            int i=0;
            for (Jugador j:e.getJugCampo()){
                listj[i]=j.getNombreDeportivo()+" - "+j.getValoracion()+" - "+j.getPrecio()+"€";
                i++;
            }     
            for (Jugador k:e.getPorteros()){
                listj[i]=k.getNombreDeportivo()+" - "+k.getValoracion()+" - "+k.getPrecio()+"€";
                i++;
            }
            jugAdescartar.setListData(listj);
        }
            jugAdescartar.updateUI();
    }//GEN-LAST:event_jugadorComboboxActionPerformed

    private void descartarJugButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descartarJugButtonActionPerformed
        if (jugadorCombobox.getSelectedIndex()!=0){
            String s1=jugadorCombobox.getSelectedItem().toString();
            String[] s=s1.split(" - ");
            Equipo eq=listaEquipos.get(listaEquipos.indexOf(new Equipo(s[0],null,0,null,null,0,null)));
            String s2=(String) jugAdescartar.getSelectedValue();
            String[] s3=s2.split(" - ");
            JugadorCampo j=new JugadorCampo(0,0,0,0,s3[0],0,null,null,0,0.0,0.0);
            Portero j2=new Portero(0,0,0,0,s3[0],0,null,null,0,0.0,0.0);
            if(eq.getJugCampo().indexOf(j)!=-1){
                JugadorCampo jug=eq.getJugCampo().get(eq.getJugCampo().indexOf(j));
                eq.descartar(jug);
                ImageIcon image=new ImageIcon("equipo.gif");
            JOptionPane.showMessageDialog(
                null,
                new JLabel("Hecho", image, JLabel.LEFT),
                "Aviso", JOptionPane.PLAIN_MESSAGE);
            }else if(eq.getPorteros().indexOf(j2)!=-1){
                Portero port=eq.getPorteros().get(eq.getPorteros().indexOf(j2));
                eq.descartar(port);
                ImageIcon image=new ImageIcon("equipo.gif");
                JOptionPane.showMessageDialog(
                null,
                new JLabel("Hecho", image, JLabel.LEFT),
                "Aviso", JOptionPane.PLAIN_MESSAGE);
            }else{
                String nombreJug =jugAdescartar.getSelectedValue().toString().split(" - ")[0];
                if ((eq.getPorteros().indexOf(new Portero(0,0,0,0,nombreJug,0,null,null,0,0.0,0.0)))!=-1){
                    Portero p=convertirSelectedAPortero(jugAdescartar,eq);
                    eq.descartar(p);
                    mercado.eliminarJugador(p);
                }
                else if ((eq.getPorteros().indexOf(new JugadorCampo(0,0,0,0,nombreJug,0,null,null,0,0.0,0.0)))!=-1){
                    Jugador ju=convertirSelectedAJugadorCampo(jugAdescartar,eq);
                    eq.descartar(ju);
                    mercado.eliminarJugador(ju);
                }
            }
            updateUIS();
        }
    }//GEN-LAST:event_descartarJugButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jugAdescartarValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jugAdescartarValueChanged
        try{
        if (jugadorCombobox.getSelectedIndex()!=0){
            Equipo eq = listaEquipos.get(listaEquipos.indexOf(new Equipo((String)jugadorCombobox.getSelectedItem(),null,0,null,null,0,null)));
            String nombreJug =jugAdescartar.getSelectedValue().toString().split(" - ")[0];
            Jugador jug;
            if ((eq.getPorteros().indexOf(new Portero(0,0,0,0,nombreJug,0,null,null,0,0.0,0.0)))!=-1){
               jLabel11.setText("Salidas");
               jLabel12.setText("Mano a mano");
               jLabel13.setText("Reflejos");
               jLabel14.setText("Penaltis");
               jLabel15.setText("Colocacion");
               paneldescartarJugador.updateUI();
               jug = (Jugador)eq.getPorteros().get(eq.getPorteros().indexOf(new Portero(0,0,0,0,nombreJug,0,null,null,0,0.0,0.0)));
            }else{
               jLabel11.setText("Velocidad");
               jLabel12.setText("Potencia");
               jLabel13.setText("Regate");
               jLabel14.setText("Tiro");
               jLabel15.setText("Colocacion");
               jug = (Jugador)eq.getJugCampo().get(eq.getJugCampo().indexOf(new JugadorCampo(0,0,0,0,nombreJug,0,null,null,0,0.0,0.0)));
            }
            jTextField1.setText(jug.getNombre());
            jTextField2.setText(jug.getApellidos());
            jTextField3.setText(jug.getNombreDeportivo());
            jTextField4.setText(Integer.toString(jug.getFechaNacimiento()));
            jTextField5.setText(Double.toString(jug.getPeso()));
            jTextField6.setText(Double.toString(jug.getAltura()));
        }else{
            String nombreJug =jugAdescartar.getSelectedValue().toString().split(" - ")[0];
            Jugador jug = mercado.guardarMercado().get(mercado.guardarMercado().indexOf(new Portero(0,0,0,0,nombreJug,0,null,null,0,0.0,0.0)));
            if (jug.getClass().equals(new Portero(0,0,0,0,nombreJug,0,null,null,0,0.0,0.0).getClass())){
               jLabel11.setText("Salidas");
               jLabel12.setText("Mano a mano");
               jLabel13.setText("Reflejos");
               jLabel14.setText("Penaltis");
               jLabel15.setText("Colocacion");
               paneldescartarJugador.updateUI();
            }else{
               jLabel11.setText("Velocidad");
               jLabel12.setText("Potencia");
               jLabel13.setText("Regate");
               jLabel14.setText("Tiro");
               jLabel15.setText("Colocacion");
            }
            jTextField1.setText(jug.getNombre());
            jTextField2.setText(jug.getApellidos());
            jTextField3.setText(jug.getNombreDeportivo());
            jTextField4.setText(Integer.toString(jug.getFechaNacimiento()));
            jTextField5.setText(Double.toString(jug.getPeso()));
            jTextField6.setText(Double.toString(jug.getAltura()));
        }
        }catch (NullPointerException e){
            jugAdescartar.clearSelection();
        }
        paneldescartarJugador.updateUI();       
    }//GEN-LAST:event_jugAdescartarValueChanged

    private void modificarJugButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarJugButtonActionPerformed
        if (jugadorCombobox.getSelectedIndex()==0){
            try{
            String nombreJug =jugAdescartar.getSelectedValue().toString().split(" - ")[0];
            Jugador jug = mercado.guardarMercado().get(mercado.guardarMercado().indexOf(new Portero(0,0,0,0,nombreJug,0,null,null,0,0.0,0.0)));
            if (jug.getClass().equals(new Portero(0,0,0,0,nombreJug,0,null,null,0,0.0,0.0).getClass())){
               Portero portero = (Portero) jug;
               portero.setNombre(jTextField1.getText());
               portero.setApellidos(jTextField2.getText());
               portero.setNombreDeportivo(jTextField3.getText());
               portero.setFechaNacimiento(Integer.parseInt(jTextField4.getText()));
               portero.setPeso(Double.parseDouble(jTextField5.getText()));
               portero.setAltura(Double.parseDouble(jTextField6.getText()));
               portero.setSalidas(Integer.parseInt(jComboBox1.getSelectedItem().toString()));
               portero.setManoAmano(Integer.parseInt(jComboBox2.getSelectedItem().toString()));
               portero.setReflejos(Integer.parseInt(jComboBox3.getSelectedItem().toString()));
               portero.setPenaltis(Integer.parseInt(jComboBox4.getSelectedItem().toString()));
               portero.setColocacion(Integer.parseInt(jComboBox5.getSelectedItem().toString()));
            }else{
               JugadorCampo jugCampo = (JugadorCampo) jug;
               jugCampo.setNombre(jTextField1.getText());
               jugCampo.setApellidos(jTextField2.getText());
               jugCampo.setNombreDeportivo(jTextField3.getText());
               jugCampo.setFechaNacimiento(Integer.parseInt(jTextField4.getText()));
               jugCampo.setPeso(Double.parseDouble(jTextField5.getText()));
               jugCampo.setAltura(Double.parseDouble(jTextField6.getText()));
               jugCampo.setVelocidad(Integer.parseInt(jComboBox1.getSelectedItem().toString()));
               jugCampo.setPotencia(Integer.parseInt(jComboBox2.getSelectedItem().toString()));
               jugCampo.setRegate(Integer.parseInt(jComboBox3.getSelectedItem().toString()));
               jugCampo.setTiro(Integer.parseInt(jComboBox4.getSelectedItem().toString()));
               jugCampo.setColocacion(Integer.parseInt(jComboBox5.getSelectedItem().toString()));
            }
                ImageIcon image=new ImageIcon("equipo.gif");
                JOptionPane.showMessageDialog(
                    null,
                    new JLabel("Hecho", image, JLabel.LEFT),
                    "Aviso", JOptionPane.PLAIN_MESSAGE);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(
                    null,
                    new JLabel("ERROR", null, JLabel.LEFT),
                    "Aviso: Tipo incorrecto", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            try{
            Equipo eq = listaEquipos.get(listaEquipos.indexOf(new Equipo((String)jugadorCombobox.getSelectedItem(),null,0,null,null,0,null)));
            String nombreJug =jugAdescartar.getSelectedValue().toString().split(" - ")[0];
            if ((eq.getPorteros().indexOf(new Portero(0,0,0,0,nombreJug,0,null,null,0,0.0,0.0)))!=-1){
               Portero portero = eq.getPorteros().get(eq.getPorteros().indexOf(new Portero(0,0,0,0,nombreJug,0,null,null,0,0.0,0.0)));
               portero.setNombre(jTextField1.getText());
               portero.setApellidos(jTextField2.getText());
               portero.setNombreDeportivo(jTextField3.getText());
               portero.setFechaNacimiento(Integer.parseInt(jTextField4.getText()));
               portero.setPeso(Double.parseDouble(jTextField5.getText()));
               portero.setAltura(Double.parseDouble(jTextField6.getText()));
               portero.setSalidas(Integer.parseInt(jComboBox1.getSelectedItem().toString()));
               portero.setManoAmano(Integer.parseInt(jComboBox2.getSelectedItem().toString()));
               portero.setReflejos(Integer.parseInt(jComboBox3.getSelectedItem().toString()));
               portero.setPenaltis(Integer.parseInt(jComboBox4.getSelectedItem().toString()));
               portero.setColocacion(Integer.parseInt(jComboBox5.getSelectedItem().toString()));
            }else{
               JugadorCampo jugCampo = eq.getJugCampo().get(eq.getJugCampo().indexOf(new Portero(0,0,0,0,nombreJug,0,null,null,0,0.0,0.0)));
               jugCampo.setNombre(jTextField1.getText());
               jugCampo.setApellidos(jTextField2.getText());
               jugCampo.setNombreDeportivo(jTextField3.getText());
               jugCampo.setFechaNacimiento(Integer.parseInt(jTextField4.getText()));
               jugCampo.setPeso(Double.parseDouble(jTextField5.getText()));
               jugCampo.setAltura(Double.parseDouble(jTextField6.getText()));
               jugCampo.setVelocidad(Integer.parseInt(jComboBox1.getSelectedItem().toString()));
               jugCampo.setPotencia(Integer.parseInt(jComboBox2.getSelectedItem().toString()));
               jugCampo.setRegate(Integer.parseInt(jComboBox3.getSelectedItem().toString()));
               jugCampo.setTiro(Integer.parseInt(jComboBox4.getSelectedItem().toString()));
               jugCampo.setColocacion(Integer.parseInt(jComboBox5.getSelectedItem().toString()));
            }
                ImageIcon image=new ImageIcon("equipo.gif");
                JOptionPane.showMessageDialog(
                null,
                new JLabel("Hecho", image, JLabel.LEFT),
                "Aviso", JOptionPane.PLAIN_MESSAGE);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(
                    null,
                    new JLabel("ERROR", null, JLabel.LEFT),
                    "Aviso: Tipo incorrecto", JOptionPane.ERROR_MESSAGE);
            }
        }
        jugadorCombobox.setSelectedIndex(jugadorCombobox.getSelectedIndex());          
    }//GEN-LAST:event_modificarJugButtonActionPerformed

    private void eliminarJugButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarJugButtonActionPerformed
      if (!(jugadorCombobox.getSelectedItem().toString().equals("-Mercado-"))){
        Equipo eq = listaEquipos.get(listaEquipos.indexOf(new Equipo((String)jugadorCombobox.getSelectedItem(),null,0,null,null,0,null)));
        String nombreJug =jugAdescartar.getSelectedValue().toString().split(" - ")[0];
        if ((eq.getPorteros().indexOf(new Portero(0,0,0,0,nombreJug,0,null,null,0,0.0,0.0)))!=-1){
            Portero p=convertirSelectedAPortero(jugAdescartar,eq);
            eq.descartar(p);
            mercado.eliminarJugador(p);
        }
        else if ((eq.getPorteros().indexOf(new JugadorCampo(0,0,0,0,nombreJug,0,null,null,0,0.0,0.0)))!=-1){
            Jugador j=convertirSelectedAJugadorCampo(jugAdescartar,eq);
            eq.descartar(j);
	    mercado.eliminarJugador(j);
        }     
        }
     else{
         String nombreJug=jugAdescartar.getSelectedValue().toString().split(" - ")[0];
         if ((mercado.guardarMercado().indexOf(new Portero(0,0,0,0,nombreJug,0,null,null,0,0.0,0.0)))!=-1){
            Portero p=new Portero(0,0,0,0,nombreJug,0,null,null,0,0.0,0.0);
            mercado.eliminarJugador(p);
        }
        else if ((mercado.guardarMercado().indexOf(new JugadorCampo(0,0,0,0,nombreJug,0,null,null,0,0.0,0.0)))!=-1){
            Jugador j=new JugadorCampo(0,0,0,0,nombreJug,0,null,null,0,0.0,0.0);
	    mercado.eliminarJugador(j);
        }     
     }
            ImageIcon image=new ImageIcon("equipo.gif");
            JOptionPane.showMessageDialog(
                null,
                new JLabel("Hecho", image, JLabel.LEFT),
                "Aviso", JOptionPane.PLAIN_MESSAGE);
     jugadorCombobox.setSelectedIndex(jugadorCombobox.getSelectedIndex());
    }//GEN-LAST:event_eliminarJugButtonActionPerformed

    private void eqcomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eqcomboboxActionPerformed
            String datosEq =eqcombobox.getSelectedItem().toString();
            Equipo eq = listaEquipos.get(listaEquipos.indexOf(new Equipo(datosEq,null,0,null,null,0.0,null)));
            nombreEqtext.setText(eq.getNombre());
            domicilioEq.setText(eq.getDomicilio());
            añoEq.setText(Integer.toString(eq.getAño()));
            banderaEq.setText(eq.getBandera());
            himnoEq.setText(eq.getHimno());
            dineroEq.setText(Double.toString(eq.getDinero()));                          
    }//GEN-LAST:event_eqcomboboxActionPerformed

    private void modificarEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarEqActionPerformed
        try{
            String datosEq =eqcombobox.getSelectedItem().toString();
            Equipo eq = listaEquipos.get(listaEquipos.indexOf(new Equipo(datosEq,null,0,null,null,0.0,null)));
            eq.setNombre(nombreEqtext.getText());
            eq.setDomicilio(domicilioEq.getText());
            eq.setAño(Integer.parseInt(añoEq.getText()));
            eq.setBandera(banderaEq.getText());
            eq.setHimno(himnoEq.getText());
            eq.setDinero(Double.parseDouble(dineroEq.getText()));     

            ImageIcon image=new ImageIcon("equipo.gif");
            JOptionPane.showMessageDialog(
                null,
                new JLabel("Hecho", image, JLabel.LEFT),
                "Aviso", JOptionPane.PLAIN_MESSAGE);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(
                    null,
                    new JLabel("ERROR", null, JLabel.LEFT),
                    "Aviso: Tipo incorrecto", JOptionPane.ERROR_MESSAGE);
            }
        
        updateUIS();          
    }//GEN-LAST:event_modificarEqActionPerformed

    private void nombreEqtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEqtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEqtextActionPerformed

    private void domicilioEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domicilioEqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_domicilioEqActionPerformed

    private void eqcomboboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eqcomboboxFocusGained
            String[] comboEquipos= new String[listaEquipos.size()];
            int a = 0;
            for (Equipo e:listaEquipos){
                comboEquipos[a]=e.getNombre();
                a++;
            }
            eqcombobox.setModel(new javax.swing.DefaultComboBoxModel(comboEquipos));
    }//GEN-LAST:event_eqcomboboxFocusGained

    private void eliminarEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEqActionPerformed
            String datosEq =eqcombobox.getSelectedItem().toString();
            listaEquipos.remove(listaEquipos.indexOf(new Equipo(datosEq,null,0,null,null,0.0,null)));  
            ImageIcon image=new ImageIcon("equipo.gif");
            JOptionPane.showMessageDialog(
                null,
                new JLabel("Hecho", image, JLabel.LEFT),
                "Aviso", JOptionPane.PLAIN_MESSAGE);
            eqcombobox.setSelectedIndex(-1);
            updateUIS();
    }//GEN-LAST:event_eliminarEqActionPerformed

    private void torneosComboboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_torneosComboboxFocusGained
        String[] comboTorneos= new String[listaTorneo.size()];
            int a = 0;
            for (Torneo t:listaTorneo){
                comboTorneos[a]=t.getNombre();
                a++;
            }
            torneosCombobox.setModel(new javax.swing.DefaultComboBoxModel(comboTorneos));
    }//GEN-LAST:event_torneosComboboxFocusGained

    private void torneosComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_torneosComboboxActionPerformed
            String datosEq =torneosCombobox.getSelectedItem().toString();
            Torneo t = listaTorneo.get(listaTorneo.indexOf(new Torneo(datosEq)));
          try{
            Partido[][] calendario = t.getCalendario().getCalendario();
            int rondas = calendario.length;
            String[][] tabla = new String[calendario[0].length*3][1+rondas];
            String[] cabecera = new String[rondas+1];
            int numpartidos = calendario[0].length;
            for (int i = 0; i<rondas;i++){
                int a = 0;
                for(int j=0;j<(numpartidos);j++){          //CHANGED
                    if(calendario[i][j]!=null){
                        tabla[a][i] = calendario[i][j].getLocal().getNombre();          
                        a++;
                        tabla[a][i] = calendario[i][j].getVisitante().getNombre();
                        a++;
                        tabla[a][i] =" - ";
                        a++;
                    }
                    else{
                        tabla[a][i]="Por determinar";
                        a++;
                        tabla[a][i]="Por determinar";
                        a++;
                        tabla[a][i]=" - ";
                        a++;
                    }
                }
                numpartidos = numpartidos/2;
                cabecera[i]="Ronda"+i;
            }
            if(t.getCampeon()!=null){
                tabla[0][tabla[0].length-1]=t.getCampeon().getNombre();
            }else{
                tabla[0][tabla[0].length-1]="Por Determinar";
                
            }
            cabecera[cabecera.length-1]= "Ganador";
            jTablaTorneo.setModel(new javax.swing.table.DefaultTableModel(tabla,cabecera));
            updateUIS();
          }catch(NullPointerException e){
              }
    }//GEN-LAST:event_torneosComboboxActionPerformed

    private void nombreTInboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTInboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTInboxActionPerformed

    private void nombreTInboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreTInboxFocusGained
        nombreTInbox.setText("");
        nombreTInbox.setForeground(Color.black);
    }//GEN-LAST:event_nombreTInboxFocusGained

    private void jcrearTorneoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcrearTorneoButtonActionPerformed
        if(!nombreTInbox.getText().equals("")){
            Torneo t = new Torneo(nombreTInbox.getText());
            listaTorneo.add(t);
            Object[] equipos=(jListEquiposTorneo.getSelectedValuesList()).toArray();
            for (Object o:equipos){
                try {
                    t.addEquipo(listaEquipos.get(listaEquipos.indexOf(new Equipo((((String) o)).split(" - ")[0],null,0,null,null,0,null))));
                } catch (ErrorNumero ex) {
                    JOptionPane.showMessageDialog(
                    null,
                    new JLabel("El equipo "+((String) o).split(" - ")[0]+" tiene un número incorrecto de jugadores", null, JLabel.LEFT),
                    "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            ImageIcon image=new ImageIcon("copa.gif");
            JOptionPane.showMessageDialog(
                null,
                new JLabel("Hecho", image, JLabel.LEFT),
                "Aviso", JOptionPane.PLAIN_MESSAGE);
            updateUIS();
            nombreTInbox.setText("Nombre del torneo");
            nombreTInbox.setForeground(Color.GRAY);
           /* try {
                t.setCalendario();
            } catch (ErrorNumero ex) {
                JOptionPane.showMessageDialog(
                    null,
                    new JLabel("El torneo tiene un número de equipos incorrecto. Elimina o añade equipos en 'Editar torneo' y genera el calendario para poder jugar", null, JLabel.LEFT),
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            }*/
        }

    }//GEN-LAST:event_jcrearTorneoButtonActionPerformed

    private void jListEquiposTorneoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListEquiposTorneoValueChanged
        int i = jListEquiposTorneo.getSelectedValuesList().size();
        jLabel17.setText("<html><font color='red'>Equipos seleccionados = </font></html>");
        if (((Math.log(i))/Math.log(2)!=(Math.round(Math.log(i)/Math.log(2))))||(i<2)){
            String a= "<html><font color='red'>Numero incorrecto de equipos </font></html>";
            jLabel17.setText(a);
        }else{
            String a= "<html><font color='green'>Numero correcto de equipos </font></html>";
            jLabel17.setText(a);
        }
        jLabel11.updateUI();
    }//GEN-LAST:event_jListEquiposTorneoValueChanged

    private void torneosCombobox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_torneosCombobox1ActionPerformed
        nombreTInbox1.setText(torneosCombobox1.getSelectedItem().toString());
        nombreTInbox1.setForeground(Color.BLACK);
        jList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jList2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Torneo t = listaTorneo.get(listaTorneo.indexOf(new Torneo(torneosCombobox1.getSelectedItem().toString())));
        String[] listj;
        if (!(t.getEquipos().isEmpty())){
            listj = new String[t.getEquipos().size()];
            int i=0;
            for (Equipo e:t.getEquipos()){
                listj[i]=e.getNombre();
                i++;
            }
            jList1.setListData(listj);
            jList1.updateUI();
            i=0;
            ArrayList<Equipo> aux = new ArrayList<Equipo>();
            aux.addAll(listaEquipos);
            aux.removeAll(t.getEquipos());
            listj = new String[aux.size()];
            for (Equipo e:aux){
                listj[i]=e.getNombre();
                i++;
            }
            jList2.setListData(listj);
            jList2.updateUI();
        }else{
            jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "-Equipos-" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
            });
            int i=0;
            listj = new String[listaEquipos.size()];
            for (Equipo e:listaEquipos){
                listj[i]=e.getNombre();
                i++;
            }
            jList2.setListData(listj);
            jList2.updateUI();
        }    
    }//GEN-LAST:event_torneosCombobox1ActionPerformed

    private void torneosCombobox1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_torneosCombobox1FocusGained
        String[] comboTorneos= new String[listaTorneo.size()];
            int a = 0;
            for (Torneo t:listaTorneo){
                comboTorneos[a]=t.getNombre();
                a++;
            }
            torneosCombobox1.setModel(new javax.swing.DefaultComboBoxModel(comboTorneos));
    }//GEN-LAST:event_torneosCombobox1FocusGained

    private void nombreTInbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTInbox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTInbox1ActionPerformed

    private void nombreTInbox1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreTInbox1FocusGained
        nombreTInbox1.setText("");
        nombreTInbox1.setForeground(Color.black);
    }//GEN-LAST:event_nombreTInbox1FocusGained

    private void eliminarTorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarTorActionPerformed
        Torneo t=listaTorneo.get(listaTorneo.indexOf(new Torneo(torneosCombobox1.getSelectedItem().toString())));
        listaTorneo.remove(t);
        ImageIcon image=new ImageIcon("copa.gif");
        JOptionPane.showMessageDialog(
            null,
            new JLabel("Hecho", image, JLabel.LEFT),
            "Aviso", JOptionPane.PLAIN_MESSAGE);
        updateUIS();
    }//GEN-LAST:event_eliminarTorActionPerformed

    private void guardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarDatosActionPerformed
    ObjectOutputStream fichero = null;
    OutputStream tmpSerFileStream = null;
    BufferedOutputStream bufferedStream = null;
    try {

        tmpSerFileStream = new FileOutputStream(jTextField7.getText());
        bufferedStream = new BufferedOutputStream(tmpSerFileStream);

        fichero = new ObjectOutputStream(bufferedStream);
        fichero.writeObject(listaEquipos.size());
        fichero.flush();
        for(Equipo e:listaEquipos){
            fichero.writeObject(e);
        }
        fichero.writeObject(listaTorneo.size());
        fichero.flush();
        for(Torneo t:listaTorneo){
            fichero.writeObject(t);
        }
        fichero.writeObject(Mercado.jugadores.size());
        for(Jugador j:Mercado.jugadores){
            fichero.writeObject(j);
        }
    } catch (IOException ex){
        JOptionPane.showMessageDialog(
                    null,
                    new JLabel("ERROR, no se ha podido guardar", null, JLabel.LEFT),
                    "ERROR", JOptionPane.ERROR_MESSAGE);
   
    } finally {
        if (fichero != null) {
            try {
                fichero.close();
                if(null!=tmpSerFileStream)tmpSerFileStream.close();
                if(null!=bufferedStream)bufferedStream.close();
            } catch (IOException ioEx) {
                JOptionPane.showMessageDialog(
                    null,
                    new JLabel("ERROR, no se ha podido guardar", null, JLabel.LEFT),
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        JOptionPane.showMessageDialog(
                    null,
                    new JLabel("Guardado con éxito", null, JLabel.LEFT),
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }}
    }//GEN-LAST:event_guardarDatosActionPerformed

    private void jTextField7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusGained
        jTextField7.setText("");
        jTextField7.setForeground(Color.black);
    }//GEN-LAST:event_jTextField7FocusGained

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void cargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarDatosActionPerformed
        ObjectInputStream fichero = null;
        InputStream tmpSerFileStream = null;
        BufferedInputStream bufferedStream = null;
        ArrayList<Equipo> e=new ArrayList<Equipo>();
        ArrayList<Torneo> t=new ArrayList<Torneo>();
        try{
            tmpSerFileStream = new FileInputStream(jTextField7.getText());
            bufferedStream = new BufferedInputStream(tmpSerFileStream);
            fichero = new ObjectInputStream(bufferedStream);
            int numEqs=(Integer) fichero.readObject();
            for(int i=0;i<numEqs;i++){
                e.add((Equipo)fichero.readObject());
            }
            listaEquipos=e;
            int numTorns=(Integer) fichero.readObject();
            for(int i=0;i<numTorns;i++){
                t.add((Torneo)fichero.readObject());
            }
            listaTorneo=t;
            int numJM=(Integer) fichero.readObject();
            Mercado.jugadores.clear();
            for(int i=0;i<numJM;i++){
                Mercado.jugadores.add((Jugador) fichero.readObject());
            }
        }
        catch(IOException ex){} catch (ClassNotFoundException ex) { 
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            } 
        finally {
            try {
                fichero.close();
                if(null!=tmpSerFileStream)tmpSerFileStream.close();
                if(null!=bufferedStream)bufferedStream.close();
            } catch (IOException exp) {
                JOptionPane.showMessageDialog(
                    null,
                    new JLabel("ERROR, no se ha podido cargar", null, JLabel.LEFT),
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        JOptionPane.showMessageDialog(
                    null,
                    new JLabel("Cargado con éxito", null, JLabel.LEFT),
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
        updateUIS();
        }
    }//GEN-LAST:event_cargarDatosActionPerformed

   private void cambiarNombreTorneoActionPerformed(java.awt.event.ActionEvent evt) { 
        Torneo t=listaTorneo.get(listaTorneo.indexOf(new Torneo(torneosCombobox1.getSelectedItem().toString())));
        if((t.getCalendario()==null)||(!t.getCalendario().finalizado())){
            (listaTorneo.get(listaTorneo.indexOf(new Torneo(torneosCombobox1.getSelectedItem().toString())))).setNombre(nombreTInbox1.getText());
            ImageIcon image=new ImageIcon("copa.gif");
            JOptionPane.showMessageDialog(
                null,
                new JLabel("Hecho", image, JLabel.LEFT),
                "Aviso", JOptionPane.PLAIN_MESSAGE);
       }
       else{
          JOptionPane.showMessageDialog(
                    null,
                    new JLabel("No puede modificar, el torneo ha finalizado", null, JLabel.LEFT),
                    "ERROR", JOptionPane.ERROR_MESSAGE);
      }
   }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jList1.getSelectedValue()!=null){
            Torneo t = listaTorneo.get(listaTorneo.indexOf(new Torneo(torneosCombobox1.getSelectedItem().toString())));
            t.getEquipos().remove(listaEquipos.get(listaEquipos.indexOf(new Equipo((jList1.getSelectedValue().toString()),null,0,null,null,0,null))));
            ImageIcon image=new ImageIcon("copa.gif");
            JOptionPane.showMessageDialog(
                null,
                new JLabel("Hecho", image, JLabel.LEFT),
                "Aviso", JOptionPane.PLAIN_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(
                    null,
                    new JLabel("Selecciona un equipo para eliminarlo", null, JLabel.LEFT),
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        torneosCombobox1.setSelectedIndex(torneosCombobox1.getSelectedIndex());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jugarTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarTorneoActionPerformed
        String tnombre=(torneosCombobox.getSelectedItem().toString());
        Torneo t=listaTorneo.get(listaTorneo.indexOf(new Torneo(tnombre)));
        try{
            t.disputar();
        }catch(ErrorNumero e){
             JOptionPane.showMessageDialog(
                    null,
                    new JLabel(e.getMessage(), null, JLabel.LEFT),
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(
                    null,
                    new JLabel("Debes generar el calendario", null, JLabel.LEFT),
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        torneosCombobox.setSelectedIndex(torneosCombobox.getSelectedIndex());
        updateUIS();
    }//GEN-LAST:event_jugarTorneoActionPerformed

    private void eliminarEqTorActionPerformed(java.awt.event.ActionEvent evt){
        Torneo t=listaTorneo.get(listaTorneo.indexOf(new Torneo(torneosCombobox1.getSelectedItem().toString())));
        if((t.getCalendario()==null)||(!t.getCalendario().finalizado())){   //Si torneo está finalizado no puedes realizar cambios
        if (jList1.getSelectedValue()!=null){
            t.getEquipos().remove(listaEquipos.get(listaEquipos.indexOf(new Equipo((jList1.getSelectedValue().toString()),null,0,null,null,0,null))));
            JOptionPane.showMessageDialog(
                    null,
                    new JLabel("Hecho", null, JLabel.LEFT),
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(
                    null,
                    new JLabel("Selecciona un equipo para eliminarlo", null, JLabel.LEFT),
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        torneosCombobox1.setSelectedIndex(torneosCombobox1.getSelectedIndex());
            ImageIcon image=new ImageIcon("copa.gif");
            JOptionPane.showMessageDialog(
                null,
                new JLabel("Hecho", image, JLabel.LEFT),
                "Aviso", JOptionPane.PLAIN_MESSAGE);
        updateUIS();
      }
      else{
          JOptionPane.showMessageDialog(
                    null,
                    new JLabel("No puede modificar, el torneo ha finalizado", null, JLabel.LEFT),
                    "ERROR", JOptionPane.ERROR_MESSAGE);
      }
    }
    
    private void agregarEqTorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEqTorActionPerformed
        Torneo t=listaTorneo.get(listaTorneo.indexOf(new Torneo(torneosCombobox1.getSelectedItem().toString())));
        if((t.getCalendario()==null)||(!t.getCalendario().finalizado())){
            if(jList2.getSelectedValue()!=null){
            try{
                t.addEquipo(listaEquipos.get(listaEquipos.indexOf(new Equipo((jList2.getSelectedValue().toString()),null,0,null,null,0,null))));
            }
            catch(ErrorNumero e){
                JOptionPane.showMessageDialog(
                    null,
                    new JLabel("El número de jugadores de ese equipo es incorrecto", null, JLabel.LEFT),
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            ImageIcon image=new ImageIcon("copa.gif");
            JOptionPane.showMessageDialog(
                null,
                new JLabel("Hecho", image, JLabel.LEFT),
                "Aviso", JOptionPane.PLAIN_MESSAGE);
        }
      }
      else{
          JOptionPane.showMessageDialog(
                    null,
                    new JLabel("No puede modificar, el torneo ha finalizado", null, JLabel.LEFT),
                    "ERROR", JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_agregarEqTorActionPerformed

    private void generarCalTorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarCalTorActionPerformed
      if(!(torneosCombobox.getSelectedItem().toString().equals("- Equipos -"))){
        Torneo t=listaTorneo.get(listaTorneo.indexOf(new Torneo(torneosCombobox.getSelectedItem().toString())));
        try{
                  t.setCalendario();
                  torneosCombobox.setSelectedIndex(torneosCombobox.getSelectedIndex());

               
        }
        catch(ErrorNumero e){
            JOptionPane.showMessageDialog(
                    null,
                    new JLabel("ERROR: Numero incorrecto de equipos", null, JLabel.LEFT),
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_generarCalTorActionPerformed

    private void directivoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directivoNuevoActionPerformed
        Directivo d=new Directivo(jTextNombre.getText(),jTextApellidos.getText(),Integer.parseInt(jTextAño.getText()),jTextCargo.getText());
        directivos.add(d);
             JOptionPane.showMessageDialog(
                null,
                new JLabel("Hecho", null, JLabel.LEFT),
                "Aviso", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_directivoNuevoActionPerformed

    private void setDirectivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDirectivosActionPerformed
       Equipo tu=listaEquipos.get(listaEquipos.indexOf(new Equipo(equipoTuCombobox.getSelectedItem().toString(),null,0,null,null,0.0,null)));
       ArrayList<Directivo> ds=new ArrayList<Directivo>();
       for(Directivo d:directivos){
           ds.add(d);
       }
       tu.setDirectivos(ds);
       directivos.clear();
            ImageIcon image=new ImageIcon("equipo.gif");
            JOptionPane.showMessageDialog(
                null,
                new JLabel("Hecho", image, JLabel.LEFT),
                "Aviso", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_setDirectivosActionPerformed

    private void equipoTuComboboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_equipoTuComboboxFocusGained
            String[] comboEquipos= new String[listaEquipos.size()];
            int a = 0;
            for (Equipo e:listaEquipos){
                comboEquipos[a]=e.getNombre();
                a++;
            }
            equipoTuCombobox.setModel(new javax.swing.DefaultComboBoxModel(comboEquipos));
    }//GEN-LAST:event_equipoTuComboboxFocusGained

    private void jugadorCombobox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugadorCombobox1ActionPerformed
        String s=jugadorCombobox1.getSelectedItem().toString();
        String[] s2=s.split(" - ");
        Equipo e=listaEquipos.get(listaEquipos.indexOf(new Equipo(s2[0],null,0,null,null,0,null)));
        String[] listj= new String[e.getDirectivos().size()];
        int i=0;
        for (Directivo j:e.getDirectivos()){
            listj[i]=j.getNombre()+" - "+j.getApellidos()+" - "+j.getCargo();
            i++;
        }
        jugAdescartar1.setListData(listj);
    }//GEN-LAST:event_jugadorCombobox1ActionPerformed

    private void jugadorCombobox1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jugadorCombobox1FocusGained
            String[] comboEquipos= new String[listaEquipos.size()];
            int a = 0;
            for (Equipo e:listaEquipos){
                comboEquipos[a]=e.getNombre();
                a++;
            }
            jugadorCombobox1.setModel(new javax.swing.DefaultComboBoxModel(comboEquipos));
            jugAdescartar1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }//GEN-LAST:event_jugadorCombobox1FocusGained

    private void jugAdescartar1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jugAdescartar1ValueChanged
        try{
            Equipo eq = listaEquipos.get(listaEquipos.indexOf(new Equipo((String)jugadorCombobox1.getSelectedItem(),null,0,null,null,0,null)));
            String nombre =jugAdescartar1.getSelectedValue().toString().split(" - ")[0];
            String apellidos =jugAdescartar1.getSelectedValue().toString().split(" - ")[1];
            Directivo jug = eq.getDirectivos().get(eq.getDirectivos().indexOf(new Directivo(nombre,apellidos)));
            jTextField8.setText(jug.getNombre());
            jTextField9.setText(jug.getApellidos());
            jTextField10.setText(jug.getCargo());
            jTextField11.setText(Integer.toString(jug.getFechaNacimiento()));
        } catch (NullPointerException e){}
    }//GEN-LAST:event_jugAdescartar1ValueChanged

    private void eliminarJugButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarJugButton1ActionPerformed
        Equipo eq = listaEquipos.get(listaEquipos.indexOf(new Equipo((String)jugadorCombobox1.getSelectedItem(),null,0,null,null,0,null)));
        String nombre =jugAdescartar1.getSelectedValue().toString().split(" - ")[0];
        String apellidos =jugAdescartar1.getSelectedValue().toString().split(" - ")[1];
        Directivo jug = eq.getDirectivos().get(eq.getDirectivos().indexOf(new Directivo(nombre,apellidos)));
        eq.getDirectivos().remove(jug);
        jugAdescartar1.clearSelection();
        jugadorCombobox1.setSelectedIndex(jugadorCombobox1.getSelectedIndex());
        JOptionPane.showMessageDialog(
                    null,
                    new JLabel("Hecho", null, JLabel.LEFT),
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_eliminarJugButton1ActionPerformed

    private void modificarJugButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarJugButton1ActionPerformed
        Equipo eq = listaEquipos.get(listaEquipos.indexOf(new Equipo((String)jugadorCombobox1.getSelectedItem(),null,0,null,null,0,null)));
        String nombre =jugAdescartar1.getSelectedValue().toString().split(" - ")[0];
        String apellidos =jugAdescartar1.getSelectedValue().toString().split(" - ")[1];
        Directivo jug = eq.getDirectivos().get(eq.getDirectivos().indexOf(new Directivo(nombre,apellidos)));
        jug.setNombre(jTextField8.getText());
        jug.setApellidos(jTextField9.getText());
        jug.setCargo(jTextField10.getText());
        jug.setFechaNacimiento(Integer.parseInt(jTextField11.getText()));
        jugAdescartar1.clearSelection();
        jugadorCombobox1.setSelectedIndex(jugadorCombobox1.getSelectedIndex());
        JOptionPane.showMessageDialog(
                    null,
                    new JLabel("Hecho", null, JLabel.LEFT),
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_modificarJugButton1ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    
    public void updateUIS(){
        jListEquipos.updateUI();
        jugACambiar.updateUI();
        listillaEquipos.updateUI();
        mercadoEqLista.updateUI();
        mercadoLista.updateUI();
        tuEquipoList.updateUI();
        jugEquipo.updateUI();
        jugadorCombobox.updateUI();
        jListEquiposTorneo.updateUI();
        eqcombobox.updateUI();
        jComboBox1.updateUI();
        jComboBox2.updateUI();
        jComboBox3.updateUI();
        jComboBox4.updateUI();
        jComboBox5.updateUI();
        jList1.updateUI();
        jList2.updateUI();
        jTablaTorneo.updateUI();
        jugAdescartar.updateUI();
        torneosCombobox.updateUI();
        torneosCombobox1.updateUI();
        tuEquipoList.updateUI();
        equipoTuCombobox.updateUI();
        jugAdescartar1.updateUI();
    }
    
    public Equipo convertirSelectedAEquipo(JList l){
	String s=l.getSelectedValue().toString();
	String s1[]=s.split(" - ");
	return(listaEquipos.get(listaEquipos.indexOf(new Equipo(s1[0],null,0,null,null,0,null))));
    }

    public JugadorCampo convertirSelectedAJugadorCampo(JList l,Equipo e){
	String s=l.getSelectedValue().toString();
	String s1[]=s.split(" - ");
        if(e.getJugCampo().indexOf(new JugadorCampo(0,0,0,0,s1[0],0,null,null,0,0.0,0.0))!=-1){
            return (e.getJugCampo().get(e.getJugCampo().indexOf(new JugadorCampo(0,0,0,0,s1[0],0,null,null,0,0.0,0.0))));
        }
        else{return null;
        } 
}   
    
        public Portero convertirSelectedAPortero(JList l,Equipo e){
	String s=l.getSelectedValue().toString();
	String s1[]=s.split(" - ");
        if(e.getPorteros().indexOf(new Portero(0,0,0,0,s1[0],0,null,null,0,0.0,0.0))!=-1){
            return (e.getPorteros().get(e.getPorteros().indexOf(new Portero(0,0,0,0,s1[0],0,null,null,0,0.0,0.0))));
        }
        else{return null;
        } 
}   
    
    public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (    ClassNotFoundException  ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }   catch (InstantiationException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Ventana().setVisible(true);
            }
        });
 
    }
    static public ArrayList<Equipo> listaEquipos = new ArrayList<Equipo>();
    static public ArrayList<Torneo> listaTorneo = new ArrayList<Torneo>();
    static public Mercado mercado = new Mercado();
    static public ArrayList<Directivo> directivos=new ArrayList<Directivo>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton agregarEqTor;
    private javax.swing.JTextField añoEq;
    private javax.swing.JTextField añoEqInbox;
    private javax.swing.JTextField banderaEq;
    private javax.swing.JTextField banderaEqInbox;
    private javax.swing.JButton cambiarNombreTorneo;
    private javax.swing.JButton cargarDatos;
    private javax.swing.JButton descartarJugButton;
    private javax.swing.JTextField dineroEq;
    private javax.swing.JTextField dineroEqInbox;
    private javax.swing.JButton directivoNuevo;
    private javax.swing.JTextField domicilioEq;
    private javax.swing.JTextField domicilioEqInbox;
    private javax.swing.JButton eliminarEq;
    private javax.swing.JButton eliminarEqTor;
    private javax.swing.JButton eliminarJugButton;
    private javax.swing.JButton eliminarJugButton1;
    private javax.swing.JButton eliminarTor;
    private javax.swing.JComboBox eqcombobox;
    private javax.swing.JTabbedPane equipo;
    private javax.swing.JComboBox equipoTuCombobox;
    private javax.swing.JButton generarCalTor;
    private javax.swing.JButton generarEqButton;
    private javax.swing.JButton guardarDatos;
    private javax.swing.JTextField himnoEq;
    private javax.swing.JTextField himnoEqInbox;
    private javax.swing.JButton intercambiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jListEquipos;
    private javax.swing.JList jListEquiposTorneo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTablaTorneo;
    private javax.swing.JTextField jTextApellidos;
    private javax.swing.JTextField jTextAño;
    private javax.swing.JTextField jTextCargo;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JButton jcrearTorneoButton;
    private javax.swing.JList jugACambiar;
    private javax.swing.JList jugAdescartar;
    private javax.swing.JList jugAdescartar1;
    private javax.swing.JList jugEquipo;
    private javax.swing.JButton jugNuevo;
    private javax.swing.JComboBox jugadorCombobox;
    private javax.swing.JComboBox jugadorCombobox1;
    private javax.swing.JPanel jugadoresPanel;
    private javax.swing.JButton jugarTorneo;
    private javax.swing.JList listillaEquipos;
    private javax.swing.JList mercadoEqLista;
    private javax.swing.JList mercadoLista;
    private javax.swing.JButton modificarEq;
    private javax.swing.JButton modificarJugButton;
    private javax.swing.JButton modificarJugButton1;
    private javax.swing.JTextField nombreEqInbox;
    private javax.swing.JTextField nombreEqtext;
    private javax.swing.JTextField nombreTInbox;
    private javax.swing.JTextField nombreTInbox1;
    private javax.swing.JPanel nuevEqPanel;
    private javax.swing.JButton pagarPrecio;
    private javax.swing.JPanel panelEq;
    private javax.swing.JPanel panelJug;
    private javax.swing.JPanel panelListaEq;
    private javax.swing.JPanel panelTorneos;
    private javax.swing.JPanel paneldescartarJugador;
    private javax.swing.JPanel paneldescartarJugador1;
    private javax.swing.JPanel panelficharOtroEq;
    private javax.swing.JPanel panelficharmerc;
    private javax.swing.JPanel panelmodificarEq;
    private javax.swing.JButton porteroNuevo;
    private javax.swing.JButton setDirectivos;
    private javax.swing.JToolBar toolbarJugador;
    private javax.swing.JComboBox torneosCombobox;
    private javax.swing.JComboBox torneosCombobox1;
    private javax.swing.JList tuEquipoList;
    private javax.swing.JTabbedPane ventanaPrinc;
    private javax.swing.JButton verIntegrantes;
    // End of variables declaration//GEN-END:variables
}