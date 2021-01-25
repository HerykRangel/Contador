package contador;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ContadorForm extends javax.swing.JFrame {
    
    // SE DEFINEN LOS HILOS DE CADA CONTADOR
    private Contador hilo1;                    
    private Contador hilo2;
    private Contador hilo3;
    private Contador hilo4;
    
 
    public ContadorForm() {
        initComponents();
       
        hilo1 = new Contador(JTHilo1);          // SE CREA UN OBJETO DE TIPO CONTADOR Y SE ENVIA LA ETIQUETA DE DICHO CONTADOR.
        hilo1.setSleep(true);                   // SE SETEA EL VALOR "TRUE" A LA VARIABLE "sleep" LA CUAL PERMITE QUE EL HILO ENTRE EN EL CONDICIONAL QUE LO DUERME "sleepTime" MILISEGUNDOS
        
        hilo2 = new Contador(JTHilo2);
        hilo2.setSleep(true); 
        
        hilo3 = new Contador(JTHilo3);
        hilo3.setSleep(true);
        
        hilo4 = new Contador(JTHilo4);
        hilo4.setSleep(true);
        
        // SE CARGAN LOS VALORES DEL 1 AL 10 A LOS JCOMBOBOX USANDO EL METODO "cargarComboPrioridad"
        cargarComboPrioridad(priorityHilo1);
        cargarComboPrioridad(priorityHilo2);
        cargarComboPrioridad(priorityHilo3);
        cargarComboPrioridad(priorityHilo4);
        
        // EVENTOS DE DOCUMENTOS - ("JTextField") 
        JTHilo1.getDocument().addDocumentListener(new DocumentListener() {

                    public void changedUpdate(DocumentEvent e) {
                        verificarMaximo(JTHilo1, hilo1, hilo4, hilo3, hilo2);
                    }

                    public void removeUpdate(DocumentEvent e) {
                        verificarMaximo(JTHilo1, hilo1, hilo4, hilo3, hilo2);
                    }

                    public void insertUpdate(DocumentEvent e) {
                        verificarMaximo(JTHilo1, hilo1, hilo4, hilo3, hilo2);
                    }
                }
        );

        JTHilo2.getDocument().addDocumentListener(new DocumentListener() {

                    public void changedUpdate(DocumentEvent e) {
                        verificarMaximo(JTHilo2, hilo2, hilo1, hilo3, hilo4);
                    }

                    public void removeUpdate(DocumentEvent e) {
                        verificarMaximo(JTHilo2, hilo2, hilo1, hilo3, hilo4);
                    }

                    public void insertUpdate(DocumentEvent e) {
                        verificarMaximo(JTHilo2, hilo2, hilo1, hilo3, hilo4);
                    }
                }
        );

        JTHilo3.getDocument().addDocumentListener(new DocumentListener() {

                    public void changedUpdate(DocumentEvent e) {
                        verificarMaximo(JTHilo3, hilo3, hilo1, hilo2, hilo4);
                    }

                    public void removeUpdate(DocumentEvent e) {
                        verificarMaximo(JTHilo3, hilo3, hilo1, hilo2, hilo4);
                    }

                    public void insertUpdate(DocumentEvent e) {
                        verificarMaximo(JTHilo3, hilo3, hilo1, hilo2, hilo4);
                    }
                }
        );

        JTHilo4.getDocument().addDocumentListener(new DocumentListener() {

                    public void changedUpdate(DocumentEvent e) {
                        verificarMaximo(JTHilo4, hilo4, hilo1, hilo2, hilo3);
                    }

                    public void removeUpdate(DocumentEvent e) {
                        verificarMaximo(JTHilo4, hilo4, hilo1, hilo2, hilo3);
                    }

                    public void insertUpdate(DocumentEvent e) {
                        verificarMaximo(JTHilo4, hilo4, hilo1, hilo2, hilo3);
                    }
                }
        );
    
    }
    
    // METODO QUE VERIFICA CUAL DE LOS CONTADORES ES EL MAYOR.
    private void verificarMaximo(JTextField tf, Contador c, Contador c1, Contador c2, Contador c3) {
        if(c != null && c.getI() > c1.getI() && c.getI()>c2.getI() && c.getI() > c3.getI()) {
            tf.setBackground(Color.red);
            if (!JTHilo1.equals(tf)) JTHilo1.setBackground(Color.WHITE);
            if (!JTHilo2.equals(tf)) JTHilo2.setBackground(Color.WHITE);
            if (!JTHilo3.equals(tf)) JTHilo3.setBackground(Color.WHITE);
            if (!JTHilo4.equals(tf)) JTHilo4.setBackground(Color.WHITE);
        }
        else tf.setBackground(Color.WHITE);
    }
    
    // METODO QUE AUTOMATIZA LA CARGAR DE LOS VALORES DEL 1 AL 10 A LOS JCOMBOBOX  
    private void cargarComboPrioridad(JComboBox combo) {
        for (Integer i = 1; i <= 10; i++) {
            combo.addItem(i);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        jTextField5 = new javax.swing.JTextField();
        tiempo1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        startHilo1 = new javax.swing.JButton();
        startHilo2 = new javax.swing.JButton();
        startHilo3 = new javax.swing.JButton();
        startHilo4 = new javax.swing.JButton();
        waitHilo1 = new javax.swing.JButton();
        waitHilo2 = new javax.swing.JButton();
        waitHilo3 = new javax.swing.JButton();
        waitHilo4 = new javax.swing.JButton();
        notifyHilo1 = new javax.swing.JButton();
        notifyHilo2 = new javax.swing.JButton();
        notifyHilo3 = new javax.swing.JButton();
        notifyHilo4 = new javax.swing.JButton();
        resetHilo1 = new javax.swing.JButton();
        resetHilo2 = new javax.swing.JButton();
        resetHilo3 = new javax.swing.JButton();
        resetHilo4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        priorityHilo1 = new javax.swing.JComboBox();
        priorityHilo3 = new javax.swing.JComboBox();
        priorityHilo2 = new javax.swing.JComboBox();
        priorityHilo4 = new javax.swing.JComboBox();
        pauseHilo1 = new javax.swing.JCheckBox();
        pauseHilo2 = new javax.swing.JCheckBox();
        pauseHilo3 = new javax.swing.JCheckBox();
        pauseHilo4 = new javax.swing.JCheckBox();
        JTHilo1 = new javax.swing.JTextField();
        JTHilo2 = new javax.swing.JTextField();
        JTHilo3 = new javax.swing.JTextField();
        JTHilo4 = new javax.swing.JTextField();
        sleepTimeHilo1 = new javax.swing.JTextField();
        sleepTimeHilo2 = new javax.swing.JTextField();
        sleepTimeHilo3 = new javax.swing.JTextField();
        sleepTimeHilo4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jTextField5.setText("jTextField5");

        jLabel10.setText("sg");

        jLabel12.setText("sg");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Contador 1");

        jLabel2.setText("Contador 2");

        jLabel4.setText("Contador 4");

        jLabel3.setText("Contador 3");

        startHilo1.setText("Start");
        startHilo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startHilo1ActionPerformed(evt);
            }
        });

        startHilo2.setText("Start");
        startHilo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startHilo2ActionPerformed(evt);
            }
        });

        startHilo3.setText("Start");
        startHilo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startHilo3ActionPerformed(evt);
            }
        });

        startHilo4.setText("Start");
        startHilo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startHilo4ActionPerformed(evt);
            }
        });

        waitHilo1.setText("Stop");
        waitHilo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waitHilo1ActionPerformed(evt);
            }
        });

        waitHilo2.setText("Stop");
        waitHilo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waitHilo2ActionPerformed(evt);
            }
        });

        waitHilo3.setText("Stop");
        waitHilo3.setToolTipText("");
        waitHilo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waitHilo3ActionPerformed(evt);
            }
        });

        waitHilo4.setText("Stop");
        waitHilo4.setToolTipText("");
        waitHilo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waitHilo4ActionPerformed(evt);
            }
        });

        notifyHilo1.setText("Resume");
        notifyHilo1.setToolTipText("");
        notifyHilo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifyHilo1ActionPerformed(evt);
            }
        });

        notifyHilo2.setText("Resume");
        notifyHilo2.setToolTipText("");
        notifyHilo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifyHilo2ActionPerformed(evt);
            }
        });

        notifyHilo3.setText("Resume");
        notifyHilo3.setToolTipText("");
        notifyHilo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifyHilo3ActionPerformed(evt);
            }
        });

        notifyHilo4.setText("Resume");
        notifyHilo4.setToolTipText("");
        notifyHilo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifyHilo4ActionPerformed(evt);
            }
        });

        resetHilo1.setText("Reset");
        resetHilo1.setToolTipText("");
        resetHilo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetHilo1ActionPerformed(evt);
            }
        });

        resetHilo2.setText("Reset");
        resetHilo2.setToolTipText("");
        resetHilo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetHilo2ActionPerformed(evt);
            }
        });

        resetHilo3.setText("Reset");
        resetHilo3.setToolTipText("");
        resetHilo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetHilo3ActionPerformed(evt);
            }
        });

        resetHilo4.setText("Reset");
        resetHilo4.setToolTipText("");
        resetHilo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetHilo4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Priority");

        jLabel6.setText("Priority");

        jLabel7.setText("Priority");

        jLabel8.setText("Priority");

        priorityHilo1.setMaximumRowCount(10);
        priorityHilo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityHilo1ActionPerformed(evt);
            }
        });

        priorityHilo3.setMaximumRowCount(10);
        priorityHilo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityHilo3ActionPerformed(evt);
            }
        });

        priorityHilo2.setMaximumRowCount(10);
        priorityHilo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityHilo2ActionPerformed(evt);
            }
        });

        priorityHilo4.setMaximumRowCount(10);
        priorityHilo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityHilo4ActionPerformed(evt);
            }
        });

        pauseHilo1.setSelected(true);
        pauseHilo1.setText("Pause");
        pauseHilo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseHilo1ActionPerformed(evt);
            }
        });

        pauseHilo2.setSelected(true);
        pauseHilo2.setText("Pause");
        pauseHilo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseHilo2ActionPerformed(evt);
            }
        });

        pauseHilo3.setSelected(true);
        pauseHilo3.setText("Pause");
        pauseHilo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseHilo3ActionPerformed(evt);
            }
        });

        pauseHilo4.setSelected(true);
        pauseHilo4.setText("Pause");
        pauseHilo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseHilo4ActionPerformed(evt);
            }
        });

        JTHilo1.setEditable(false);
        JTHilo1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        JTHilo1.setText("0");
        JTHilo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTHilo1ActionPerformed(evt);
            }
        });

        JTHilo2.setEditable(false);
        JTHilo2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        JTHilo2.setText("0");

        JTHilo3.setEditable(false);
        JTHilo3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        JTHilo3.setText("0");
        JTHilo3.setToolTipText("");

        JTHilo4.setEditable(false);
        JTHilo4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        JTHilo4.setText("0");

        sleepTimeHilo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sleepTimeHilo1.setText("1");
        sleepTimeHilo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sleepTimeHilo1ActionPerformed(evt);
            }
        });

        sleepTimeHilo2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sleepTimeHilo2.setText("1");
        sleepTimeHilo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sleepTimeHilo2ActionPerformed(evt);
            }
        });

        sleepTimeHilo3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sleepTimeHilo3.setText("1");
        sleepTimeHilo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sleepTimeHilo3ActionPerformed(evt);
            }
        });

        sleepTimeHilo4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sleepTimeHilo4.setText("1");
        sleepTimeHilo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sleepTimeHilo4ActionPerformed(evt);
            }
        });

        jLabel9.setText("sg");

        jLabel11.setText("sg");

        jLabel13.setText("sg");

        jLabel14.setText("sg");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTHilo3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTHilo4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JTHilo1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTHilo2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startHilo4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(waitHilo4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(notifyHilo4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetHilo4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priorityHilo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pauseHilo4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sleepTimeHilo4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startHilo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(waitHilo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(notifyHilo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetHilo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priorityHilo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pauseHilo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sleepTimeHilo3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(startHilo2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(waitHilo2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notifyHilo2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(startHilo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(waitHilo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notifyHilo1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resetHilo2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(priorityHilo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pauseHilo2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sleepTimeHilo2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resetHilo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(priorityHilo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pauseHilo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sleepTimeHilo1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startHilo2)
                            .addComponent(jLabel2)
                            .addComponent(waitHilo2)
                            .addComponent(notifyHilo2)
                            .addComponent(resetHilo2)
                            .addComponent(priorityHilo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pauseHilo2)
                            .addComponent(JTHilo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sleepTimeHilo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(startHilo1)
                            .addComponent(waitHilo1)
                            .addComponent(notifyHilo1)
                            .addComponent(resetHilo1)
                            .addComponent(jLabel5)
                            .addComponent(priorityHilo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pauseHilo1)
                            .addComponent(JTHilo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sleepTimeHilo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startHilo3)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notifyHilo3)
                    .addComponent(resetHilo3)
                    .addComponent(jLabel7)
                    .addComponent(waitHilo3)
                    .addComponent(priorityHilo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pauseHilo3)
                    .addComponent(JTHilo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sleepTimeHilo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(startHilo4)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(waitHilo4)
                        .addComponent(notifyHilo4)
                        .addComponent(resetHilo4)
                        .addComponent(JTHilo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(priorityHilo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pauseHilo4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(sleepTimeHilo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    // JBUTTONS START - "start" METODO DE LA CLASE THREAD QUE EJECUTA EL METODO "RUN" DEL HILO
    private void startHilo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startHilo1ActionPerformed
        
        // SE ACTIVA LOS EVENTOS "priorityHilo1" Y " sleepTime"
        priorityHilo1ActionPerformed(evt);                          // DE ESTA MANERA AL MOMENTO DE "Start" DE UN HILO, ESTE ACTIVA LOS EVENTOS CORRESPONDIENTES 
        sleepTimeHilo1ActionPerformed(evt);                         // DE ESTA FORMA EL RELOJ SE ADAPTA A LOS CAMBIOS DE "Pause" Y "SleepTime" EN TIEMPO REAL.
        
       // CODIGO DE CONTROL - EJECUTA UNA VEZ EL HILO EVITANDO LA SUPERPOSICION DEL MISMO.
       if(!hilo1.isAlive()){     
            hilo1.start();
            System.out.println("SE COMIENZA EL HILO 1");
       }else{
           hilo1.reanuda();          // REANUDA EL HILO SIEMPRE Y CUANDO ESTE VIVO
           System.out.println("SE REANUDA EL HILO 1");
       }
        startHilo1.setEnabled(false);
        waitHilo1.setEnabled(true); 
        notifyHilo1.setEnabled(false);
        resetHilo1.setEnabled(false);
        
    }//GEN-LAST:event_startHilo1ActionPerformed

    private void startHilo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startHilo2ActionPerformed
        
        priorityHilo2ActionPerformed(evt);
        sleepTimeHilo2ActionPerformed(evt);
       
        if(!hilo2.isAlive()){     
            hilo2.start();
        }else{
           hilo2.reanuda();          
        }
        startHilo2.setEnabled(false);
        waitHilo2.setEnabled(true); 
        notifyHilo2.setEnabled(false);
        resetHilo2.setEnabled(false);
        
    }//GEN-LAST:event_startHilo2ActionPerformed

    private void startHilo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startHilo3ActionPerformed
        
        priorityHilo3ActionPerformed(evt);
        sleepTimeHilo3ActionPerformed(evt);
        
        if(!hilo3.isAlive()){     
            hilo3.start();
        }else{
           hilo3.reanuda();          
        }
        startHilo3.setEnabled(false);
        waitHilo3.setEnabled(true); 
        notifyHilo3.setEnabled(false);
        resetHilo3.setEnabled(false);
        
    }//GEN-LAST:event_startHilo3ActionPerformed

    private void startHilo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startHilo4ActionPerformed
        
        priorityHilo4ActionPerformed(evt);
        sleepTimeHilo4ActionPerformed(evt);
        
        if(!hilo4.isAlive()){     
            hilo4.start();
        }else{
           hilo4.reanuda();          
        }
        
        startHilo4.setEnabled(false);
        waitHilo4.setEnabled(true); 
        notifyHilo4.setEnabled(false);
        resetHilo4.setEnabled(false);
        
    }//GEN-LAST:event_startHilo4ActionPerformed
    
    // JBUTTONS WAIT - METODO CREADO EN LA CLASE "Contador" PARA DETENER EL HILO.
    private void waitHilo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waitHilo1ActionPerformed
        
        hilo1.suspender();
        System.out.println("SE DETIENE EL HILO 1");
        startHilo1.setEnabled(false);
        waitHilo1.setEnabled(false);
        notifyHilo1.setEnabled(true); 
        resetHilo1.setEnabled(true);
        
    }//GEN-LAST:event_waitHilo1ActionPerformed

    private void waitHilo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waitHilo2ActionPerformed
        
        hilo2.suspender();
        startHilo2.setEnabled(false);
        waitHilo2.setEnabled(false);
        notifyHilo2.setEnabled(true);
        resetHilo2.setEnabled(true);
        
    }//GEN-LAST:event_waitHilo2ActionPerformed

    private void waitHilo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waitHilo3ActionPerformed
        
        hilo3.suspender();
        startHilo3.setEnabled(false);
        waitHilo3.setEnabled(false);
        notifyHilo3.setEnabled(true);
        resetHilo3.setEnabled(true);
        
    }//GEN-LAST:event_waitHilo3ActionPerformed

    private void waitHilo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waitHilo4ActionPerformed
        
        hilo4.suspender();
        startHilo4.setEnabled(false);
        waitHilo4.setEnabled(false);
        notifyHilo4.setEnabled(true);    
        resetHilo4.setEnabled(true);
        
    }//GEN-LAST:event_waitHilo4ActionPerformed
    
    //JBUTTONS NOTIFY - METODO QUE SACA DEL ESTADO DE ESPERA AL HILO
    private void notifyHilo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notifyHilo1ActionPerformed
        
        hilo1.reanuda();
        startHilo1.setEnabled(false);
        System.out.println("SE REAUNDA EL HILO 1");
        waitHilo1.setEnabled(true);
        notifyHilo1.setEnabled(false);
        resetHilo1.setEnabled(true);
        
    }//GEN-LAST:event_notifyHilo1ActionPerformed

    private void notifyHilo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notifyHilo2ActionPerformed
        
        hilo2.reanuda();
        startHilo2.setEnabled(false);
        waitHilo2.setEnabled(true);
        notifyHilo2.setEnabled(false);
        resetHilo2.setEnabled(true);
        
    }//GEN-LAST:event_notifyHilo2ActionPerformed

    private void notifyHilo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notifyHilo3ActionPerformed
       
        hilo3.reanuda();
        startHilo3.setEnabled(false);
        waitHilo3.setEnabled(true);
        notifyHilo3.setEnabled(false);
        resetHilo3.setEnabled(true);
        
    }//GEN-LAST:event_notifyHilo3ActionPerformed

    private void notifyHilo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notifyHilo4ActionPerformed
        
        hilo4.reanuda();
        startHilo4.setEnabled(false);
        waitHilo4.setEnabled(true);
        notifyHilo4.setEnabled(false);
        resetHilo4.setEnabled(true);
        
    }//GEN-LAST:event_notifyHilo4ActionPerformed

    // JBUTTONS RESET - METODO QUE RESETEA EL HILO.
    private void resetHilo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetHilo1ActionPerformed
       
        hilo1.reset();
        startHilo1.setEnabled(true);
        waitHilo1.setEnabled(false);
        notifyHilo1.setEnabled(false);
        resetHilo1.setEnabled(false);
        
    }//GEN-LAST:event_resetHilo1ActionPerformed

    private void resetHilo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetHilo2ActionPerformed
        
        hilo2.reset();
        startHilo2.setEnabled(true);
        waitHilo2.setEnabled(false);
        notifyHilo2.setEnabled(false);
        resetHilo2.setEnabled(false);
        
    }//GEN-LAST:event_resetHilo2ActionPerformed

    private void resetHilo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetHilo3ActionPerformed
        
        hilo3.reset();
        startHilo3.setEnabled(true);
        waitHilo3.setEnabled(false);
        notifyHilo3.setEnabled(false);
        resetHilo3.setEnabled(false);
        
    }//GEN-LAST:event_resetHilo3ActionPerformed

    private void resetHilo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetHilo4ActionPerformed
        
        hilo4.reset();
        startHilo4.setEnabled(true);
        waitHilo4.setEnabled(false);
        notifyHilo4.setEnabled(false);
        resetHilo4.setEnabled(false);
        
    }//GEN-LAST:event_resetHilo4ActionPerformed

    // JCOMBOBOX PRIORITY - SE CASTEA A Integer - "setPriority" DE LA CLASE THREAD Y QUE RECIBE UN INT.
    private void priorityHilo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priorityHilo1ActionPerformed
       
        hilo1.setPriority((Integer)priorityHilo1.getSelectedItem());                // SE ESTABLECE LA PRIORIDAD DEL HILO - SE CASTEA EL CONTENIDO DE LOS "JComboBOX"
        
    }//GEN-LAST:event_priorityHilo1ActionPerformed

    private void priorityHilo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priorityHilo2ActionPerformed
        
        hilo2.setPriority((Integer)priorityHilo2.getSelectedItem());
        
    }//GEN-LAST:event_priorityHilo2ActionPerformed

    private void priorityHilo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priorityHilo3ActionPerformed
       
        hilo3.setPriority((Integer)priorityHilo3.getSelectedItem());
        
    }//GEN-LAST:event_priorityHilo3ActionPerformed

    private void priorityHilo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priorityHilo4ActionPerformed
       
        hilo4.setPriority((Integer)priorityHilo4.getSelectedItem());
        
    }//GEN-LAST:event_priorityHilo4ActionPerformed

    // JCHECKBOX PAUSE - "setSleep" METODO CREADO EN LA CLASE "Contador" QUE RECIBE UN BOOLEANO - SI "Sleep" ES "TRUE", EL HILO SE SUSPENDE "sleepTime" SEGUNDOS
    private void pauseHilo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseHilo1ActionPerformed
        
        hilo1.setSleep(pauseHilo1.isSelected());                                // SI "Sleep" ES "TRUE", EL HILO SE SUSPENDE "sleepTime" MILISEGUNDOS.    
        System.out.println("PAUSA DEL HILO 1 : " + pauseHilo1.isSelected());    // SI "Sleep" ES "FALSE" EL HILO CORRE A LA VELOCIDAD DEL BUCLE.
        
    }//GEN-LAST:event_pauseHilo1ActionPerformed

    private void pauseHilo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseHilo2ActionPerformed
        
        hilo2.setSleep(pauseHilo2.isSelected());
        
    }//GEN-LAST:event_pauseHilo2ActionPerformed

    private void pauseHilo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseHilo3ActionPerformed
        
        hilo3.setSleep(pauseHilo3.isSelected());
        
    }//GEN-LAST:event_pauseHilo3ActionPerformed

    private void pauseHilo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseHilo4ActionPerformed
        
        hilo4.setSleep(pauseHilo4.isSelected());
        
    }//GEN-LAST:event_pauseHilo4ActionPerformed

    //JTEXTFIELDS SLEEPTIME - "setSleepTime" METODO CREADO DE LA CLASE "Contador" EL RECIBE UN INT Y LO SETEA A LA VARIABLE "sleepTime" - SE CASTEA EL VALO
    private void sleepTimeHilo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sleepTimeHilo1ActionPerformed
        
        hilo1.setSleepTime(new Integer(sleepTimeHilo1.getText()));              // "sleepTime" TIEMPO EN MILISEGUNDOS EN QUE DUERME EL HILO
        System.out.println("SLEEPTIME: " + new Integer(sleepTimeHilo1.getText()));
        
    }//GEN-LAST:event_sleepTimeHilo1ActionPerformed

    private void sleepTimeHilo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sleepTimeHilo2ActionPerformed
        
        hilo2.setSleepTime(new Integer(sleepTimeHilo2.getText()));
        
    }//GEN-LAST:event_sleepTimeHilo2ActionPerformed

    private void sleepTimeHilo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sleepTimeHilo3ActionPerformed
        
        hilo3.setSleepTime(new Integer(sleepTimeHilo3.getText()));
        
    }//GEN-LAST:event_sleepTimeHilo3ActionPerformed

    private void sleepTimeHilo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sleepTimeHilo4ActionPerformed
       
        hilo4.setSleepTime(new Integer(sleepTimeHilo4.getText()));
        
    }//GEN-LAST:event_sleepTimeHilo4ActionPerformed

    private void JTHilo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTHilo1ActionPerformed
   
    }//GEN-LAST:event_JTHilo1ActionPerformed
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContadorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTHilo1;
    private javax.swing.JTextField JTHilo2;
    private javax.swing.JTextField JTHilo3;
    private javax.swing.JTextField JTHilo4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField5;
    private java.awt.List list1;
    private javax.swing.JButton notifyHilo1;
    private javax.swing.JButton notifyHilo2;
    private javax.swing.JButton notifyHilo3;
    private javax.swing.JButton notifyHilo4;
    private javax.swing.JCheckBox pauseHilo1;
    private javax.swing.JCheckBox pauseHilo2;
    private javax.swing.JCheckBox pauseHilo3;
    private javax.swing.JCheckBox pauseHilo4;
    private javax.swing.JComboBox priorityHilo1;
    private javax.swing.JComboBox priorityHilo2;
    private javax.swing.JComboBox priorityHilo3;
    private javax.swing.JComboBox priorityHilo4;
    private javax.swing.JButton resetHilo1;
    private javax.swing.JButton resetHilo2;
    private javax.swing.JButton resetHilo3;
    private javax.swing.JButton resetHilo4;
    private javax.swing.JTextField sleepTimeHilo1;
    private javax.swing.JTextField sleepTimeHilo2;
    private javax.swing.JTextField sleepTimeHilo3;
    private javax.swing.JTextField sleepTimeHilo4;
    private javax.swing.JButton startHilo1;
    private javax.swing.JButton startHilo2;
    private javax.swing.JButton startHilo3;
    private javax.swing.JButton startHilo4;
    private javax.swing.JTextField tiempo1;
    private javax.swing.JButton waitHilo1;
    private javax.swing.JButton waitHilo2;
    private javax.swing.JButton waitHilo3;
    private javax.swing.JButton waitHilo4;
    // End of variables declaration//GEN-END:variables
}
