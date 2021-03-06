/*Lenguaje y autómatas
Francisco Vázquez Delgado.
Actividad: Programa para, potencia, Inversa de cadenas.
Este programa consiste en crear un programa ejecutable  que realize alagunas operaciones con cadenas, utilizando recursividad para cada 
operacion, las operaciones que el programa realiza son potencia e inversa.
En esta ventana se llevara acabo la logica de la operacion inversa.
*/
package pkg1546013901;

/**
 *
 * @author Francisco
 */
public class Inversa extends javax.swing.JFrame {

   static String nueva2="";
   
    
    public Inversa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtI = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtRI = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Inversa de una cdena");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 30, 220, 22);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cadena:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 110, 70, 17);

        txtI.setToolTipText("En este campo ingrese la cedena que deseé.");
        getContentPane().add(txtI);
        txtI.setBounds(160, 89, 200, 40);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.setToolTipText("Ejecuta la operación.");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 210, 110, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Resultado:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 150, 80, 17);

        txtRI.setToolTipText("Te muestra el resultado de la operación.");
        txtRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRIActionPerformed(evt);
            }
        });
        getContentPane().add(txtRI);
        txtRI.setBounds(160, 140, 200, 40);

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Atras");
        jButton2.setToolTipText("Te lleva a la ventana anteriror(menú principal).");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(290, 210, 110, 30);

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("Limpiar");
        jButton3.setToolTipText("Limpias los campos.");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(170, 210, 110, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Lenguajes y autómatas.");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 10, 130, 13);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Potencia, inversa de cadenas.");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 10, 150, 15);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Frnacisco Vázquez Delgado.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 270, 170, 13);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("15460139.");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(250, 270, 70, 13);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cuadricula.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 670, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
      String cadena=txtI.getText();
      txtRI.setText(Cadena(cadena,0));
       
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void txtRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRIActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // b4Boton atras de de el jFrame inversa que te lleva al menu principal
        Menu menu=new Menu();//Creamos un objeto para poder mandar llamar al JFrmae menu
        menu.setVisible(true);//Hacemos visible el jfrmae cuando precionan el  boton
        this.dispose();
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // boton limpiar del jframe inversa
      txtI.setText(null);//En esta linea limpiamos el campo ingresar cadena
      txtRI.setText(null);//En este linea limpiamos el campo limpiamos el campo inversa de la cadena.
    }//GEN-LAST:event_jButton3MouseClicked
 String Cadena(String cadena, int pos){
     //Este metodo nos genera la inversa de una cadena, tenemos que ingresar dos parametros, la cadena a la cual queremos generar la inversa y pos es contador que tiene 0
     //para de este modo posicionarnos en el primer caracter de la cadena.
       String resultado;//variable donde se retornara el resultado la cadena inversa
       
       if(cadena.length()>pos){//este if nos controla el tamaño de la cadena
           resultado=Cadena(cadena,pos+1)+cadena.charAt(pos);//concatenamos los caracteres, la esencia de la recursividad es ir dejando operaciones sin realizar
           //hasta que encuentra una condicion base, que detiene la recursividad y ejecuta las operaciones pendientes en memoria, y de este modo nos arroja la inversa
           //sinergicamente la primera letra sera la ultima en imprimirse ya que ejecutara antes las demas operaciones pendientes.
       }else{
           resultado="";//Con esto detenemos la recursividad ya que no cumple la condicion y deja de llamarse asi mismo
       }
       return resultado;//imprime el resultado.
   }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Inversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inversa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtI;
    private javax.swing.JTextField txtRI;
    // End of variables declaration//GEN-END:variables
}
