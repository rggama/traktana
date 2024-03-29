/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ConfigDialog.java
 *
 * Created on 15/09/2010, 02:16:27
 */

package Interface;

import gnu.io.SerialPort;
import io.SerialInterface;
import javax.swing.DefaultComboBoxModel;
import main.ParametersSerial;

/**
 *
 * @author victor
 */
public class ConfigSerialDialog extends javax.swing.JDialog {

    /** Creates new form ConfigDialog */
    public ConfigSerialDialog(java.awt.Frame parent, boolean modal) {
        super(parent,modal);
        initComponents();
        config = new ParametersSerial();
        refreshComponents();
    }
    
    public void setConfig(ParametersSerial config) {
        this.config = config;
        refreshComponents();
    }

    public ParametersSerial getConfig() {
        return config;
    }

    private void refreshComponents(){
       // Port Name
       jComboBoxPort.setModel(new DefaultComboBoxModel (SerialInterface.listPorts()));
       String port = config.getPortName();
       String ports[] = SerialInterface.listPorts();
       for(int i = 0;i < ports.length;i++){
           if(ports[i].equals(port)){
               jComboBoxPort.setSelectedItem(port);break;
           }else{
               jComboBoxPort.setSelectedItem(null);
           }
       }
       // Baud
       switch(config.getBaud()){
           case 9600:    jComboBoxBaud.setSelectedIndex(0);break;
           case 19200:   jComboBoxBaud.setSelectedIndex(1);break;
           case 38400:   jComboBoxBaud.setSelectedIndex(2);break;
           case 57600:   jComboBoxBaud.setSelectedIndex(3);break;
           case 115200:  jComboBoxBaud.setSelectedIndex(4);break;
           default: break;
       }
        // Data Bits
       switch(config.getDataBits()){
           case SerialPort.DATABITS_5: jComboBoxDatabits.setSelectedIndex(0);break;
           case SerialPort.DATABITS_6: jComboBoxDatabits.setSelectedIndex(1);break;
           case SerialPort.DATABITS_7: jComboBoxDatabits.setSelectedIndex(2);break;
           case SerialPort.DATABITS_8: jComboBoxDatabits.setSelectedIndex(3);break;
           default: break;
       }
       // Parity
       switch(config.getParity()){
           case SerialPort.PARITY_NONE: jComboBoxParity.setSelectedIndex(0);break;
           case SerialPort.PARITY_EVEN: jComboBoxParity.setSelectedIndex(1);break;
           case SerialPort.PARITY_ODD:  jComboBoxParity.setSelectedIndex(2);break;
           default: break;
       }
       // Stop Bits
       switch(config.getStopBits()){
           case SerialPort.STOPBITS_1: jComboBoxStopBits.setSelectedIndex(0);break;
           case SerialPort.STOPBITS_1_5: jComboBoxStopBits.setSelectedIndex(1);break;
           case SerialPort.STOPBITS_2: jComboBoxStopBits.setSelectedIndex(2);break;
           default: break;
       }
       //Flow Control
       switch(config.getFlowControl()){
           case SerialPort.FLOWCONTROL_NONE:        jComboBoxFlowControl.setSelectedIndex(0);break;
           case SerialPort.FLOWCONTROL_RTSCTS_OUT:  jComboBoxFlowControl.setSelectedIndex(1);break;
           case SerialPort.FLOWCONTROL_XONXOFF_OUT: jComboBoxFlowControl.setSelectedIndex(2);break;
           default: break;
       }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonOK = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jComboBoxPort = new javax.swing.JComboBox();
        jLabelPort = new javax.swing.JLabel();
        jLabelBaud = new javax.swing.JLabel();
        jComboBoxBaud = new javax.swing.JComboBox();
        jLabelDatabits = new javax.swing.JLabel();
        jLabelParity = new javax.swing.JLabel();
        jLabelStopbits = new javax.swing.JLabel();
        jLabelFlow = new javax.swing.JLabel();
        jComboBoxDatabits = new javax.swing.JComboBox();
        jComboBoxParity = new javax.swing.JComboBox();
        jComboBoxStopBits = new javax.swing.JComboBox();
        jComboBoxFlowControl = new javax.swing.JComboBox();
        jButtonDefault = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Serial Configuration");
        setAlwaysOnTop(true);
        setResizable(false);

        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jLabelPort.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        jLabelPort.setText("Port:");

        jLabelBaud.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        jLabelBaud.setText("Baud:");

        jComboBoxBaud.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9600", "19200", "38400", "57600", "115200" }));

        jLabelDatabits.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        jLabelDatabits.setText("Databits:");

        jLabelParity.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        jLabelParity.setText("Parity:");

        jLabelStopbits.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        jLabelStopbits.setText("Stopbits:");

        jLabelFlow.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        jLabelFlow.setText("FlowControl:");

        jComboBoxDatabits.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "6", "7", "8" }));
        jComboBoxDatabits.setSelectedIndex(3);

        jComboBoxParity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "none", "even", "odd" }));

        jComboBoxStopBits.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "1,5", "2" }));

        jComboBoxFlowControl.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "none", "RTS/CTS", "Xon/Xoff" }));

        jButtonDefault.setText("Default");
        jButtonDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDefaultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabelBaud)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelPort)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonDefault)
                            .addComponent(jLabelFlow)
                            .addComponent(jLabelDatabits)
                            .addComponent(jLabelParity)
                            .addComponent(jLabelStopbits))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonOK, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancel))
                    .addComponent(jComboBoxFlowControl, javax.swing.GroupLayout.Alignment.TRAILING, 0, 106, Short.MAX_VALUE)
                    .addComponent(jComboBoxStopBits, javax.swing.GroupLayout.Alignment.TRAILING, 0, 106, Short.MAX_VALUE)
                    .addComponent(jComboBoxParity, javax.swing.GroupLayout.Alignment.TRAILING, 0, 106, Short.MAX_VALUE)
                    .addComponent(jComboBoxDatabits, javax.swing.GroupLayout.Alignment.TRAILING, 0, 106, Short.MAX_VALUE)
                    .addComponent(jComboBoxBaud, javax.swing.GroupLayout.Alignment.TRAILING, 0, 106, Short.MAX_VALUE)
                    .addComponent(jComboBoxPort, javax.swing.GroupLayout.Alignment.TRAILING, 0, 106, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPort))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxBaud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBaud))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDatabits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDatabits))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxParity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelParity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxStopBits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStopbits))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxFlowControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFlow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonOK)
                        .addComponent(jButtonDefault))
                    .addComponent(jButtonCancel))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDefaultActionPerformed
        // TODO add your handling code here:
        jComboBoxBaud.setSelectedIndex(0);
        jComboBoxDatabits.setSelectedIndex(3);
        jComboBoxStopBits.setSelectedIndex(0);
        jComboBoxParity.setSelectedIndex(0);
        jComboBoxFlowControl.setSelectedIndex(0);
    }//GEN-LAST:event_jButtonDefaultActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        // TODO add your handling code here:
        // Define configurations
        config.setPortName((String)jComboBoxPort.getSelectedItem());
        switch(jComboBoxBaud.getSelectedIndex()){
            case 0: config.setBaud(9600);break;
            case 1: config.setBaud(19200);break;
            case 2: config.setBaud(38400);break;
            case 3: config.setBaud(57600);break;
            case 4: config.setBaud(115200);break;
            default:break;
        }
        switch(jComboBoxDatabits.getSelectedIndex()){
            case 0: config.setDataBits(SerialPort.DATABITS_5);break;
            case 1: config.setDataBits(SerialPort.DATABITS_6);break;
            case 2: config.setDataBits(SerialPort.DATABITS_7);break;
            case 3: config.setDataBits(SerialPort.DATABITS_8);break;
            default:break;
        }
        switch(jComboBoxStopBits.getSelectedIndex()){
            case 0: config.setStopBits(SerialPort.STOPBITS_1);break;
            case 1: config.setStopBits(SerialPort.STOPBITS_1_5);break;
            case 2: config.setStopBits(SerialPort.STOPBITS_2);break;
            default:break;
        }
        switch(jComboBoxParity.getSelectedIndex()){
            case 0: config.setParity(SerialPort.PARITY_NONE);break;
            case 1: config.setParity(SerialPort.PARITY_EVEN);break;
            case 2: config.setParity(SerialPort.PARITY_ODD);break;
            default:break;
        }
        switch(jComboBoxFlowControl.getSelectedIndex()){
            case 0: config.setFlowControl(SerialPort.FLOWCONTROL_NONE);break;
            case 1: config.setFlowControl(SerialPort.FLOWCONTROL_RTSCTS_OUT);break;
            case 2: config.setFlowControl(SerialPort.FLOWCONTROL_XONXOFF_OUT);break;
            default:break;
        }
        setVisible(false);
    }//GEN-LAST:event_jButtonOKActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConfigSerialDialog dialog = new ConfigSerialDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDefault;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JComboBox jComboBoxBaud;
    private javax.swing.JComboBox jComboBoxDatabits;
    private javax.swing.JComboBox jComboBoxFlowControl;
    private javax.swing.JComboBox jComboBoxParity;
    private javax.swing.JComboBox jComboBoxPort;
    private javax.swing.JComboBox jComboBoxStopBits;
    private javax.swing.JLabel jLabelBaud;
    private javax.swing.JLabel jLabelDatabits;
    private javax.swing.JLabel jLabelFlow;
    private javax.swing.JLabel jLabelParity;
    private javax.swing.JLabel jLabelPort;
    private javax.swing.JLabel jLabelStopbits;
    // End of variables declaration//GEN-END:variables
    private ParametersSerial config;
}
