/*Lenguaje y autómatas
Francisco Vázquez Delgado.
Actividad: Programa para, potencia, Inversa de cadenas.
Este programa consiste en crear un programa ejecutable  que realize alagunas operaciones con cadenas, utilizando recursividad para cada 
operacion, las operaciones que el programa realiza son potencia e inversa.
En esta ventana es el menú principal, el cual proporciona las operaciones principales conn cadenas, las opeciones estan en combo box
donde el usuario selecciona la operacion deseada, tambien cuenta con ayudas y una documentacion externa.
*/
package pkg1546013901;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {
static int visible=0;//esta variable me controla el cuadro de informacion con ayuda externa.
   
    public Menu() {
        initComponents();
        txtArea.setVisible(false);
        
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Combo = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Operaciones  con cadenas");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 40, 480, 43);

        Combo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Combo.setForeground(new java.awt.Color(255, 255, 255));
        Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Potencia", "Inversa" }));
        Combo.setToolTipText("En este apartado (combo box) se muestra todas las operaciones con cadenas con las que cuenta el programa.");
        getContentPane().add(Combo);
        Combo.setBounds(110, 150, 180, 40);

        btnAceptar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/if_Accept_85350.png"))); // NOI18N
        btnAceptar.setToolTipText("Este es el boton aceptar, para dirigirte a la operación seleccionada.");
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });
        getContentPane().add(btnAceptar);
        btnAceptar.setBounds(120, 350, 60, 50);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/if_exit_3226.png"))); // NOI18N
        jButton1.setToolTipText("Este es el boton salir del programa.");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(230, 350, 60, 50);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Lenguajes y autómatas.");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 20, 130, 13);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Potencia, inversa de cadenas.");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(250, 20, 150, 15);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Francisco Vázquez Delgado.");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 420, 136, 13);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("14560139.");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 420, 80, 13);

        txtAm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/if_help-browser_118806 (1).png"))); // NOI18N
        txtAm.setText("hola");
        txtAm.setToolTipText("Este boton es el de ayuda, contiene informacion sobre la logica de funcionamiento del programa.");
        txtAm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAmMouseClicked(evt);
            }
        });
        getContentPane().add(txtAm);
        txtAm.setBounds(310, 80, 50, 50);

        txtArea.setColumns(20);
        txtArea.setRows(5);
        txtArea.setText("Esta aplicacion calcula la inversa y potencia de una cedana.\nPara poder ingreesar a las operaciones tiene que dirgirse a la\npestaña donde se le deprenderan dichas operaciones, seleccione\nuna y de en el boton aceptar, despues se le madara a otra\nventana donde realizara la operacion seleccionada.");
        jScrollPane1.setViewportView(txtArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(23, 190, 380, 150);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cuadricula.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 650, 526);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        // boton aceptar potencia o inversa
                int posicion=Combo.getSelectedIndex();
        
        if(posicion==0){
            Potencia p=new Potencia();
            p.setVisible(true);
            this.dispose();
        }else if(posicion==1){
            Inversa e=new Inversa();
            e.setVisible(true);
            this.dispose();
        }
            
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // Este boton salir; nos termina la aplicacion la cierra.
        System.exit(0);
    }//GEN-LAST:event_jButton1MouseClicked

    private void txtAmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAmMouseClicked
        // boton ayuda externa.
      /*el contador inicia en 0 si el usuario le da clik muestra la ayuda y posteriormente se incrementa el contador
        como el contador incrementos si vuelve hacer click en el mismo boton entra al else if que acepta solo valores mayores que cero
        ingresa y la hace invisible la ayuda externna y el contador vuelve a 0*/
        if(visible==0){
        txtArea.setVisible(true);
       visible++;
        }else if(visible>=1){
            txtArea.setVisible(false);
            visible=0;
        }
    }//GEN-LAST:event_txtAmMouseClicked

    
    public static void main(String args[]) {
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton txtAm;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
