
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CancelBooking extends javax.swing.JFrame {

    public CancelBooking() {
        initComponents();
        Connect();
    }
    
    Connection con;
    PreparedStatement st,check,pst;
    ResultSet rs,rst;
    private String seat;
    private String bookingDate;
    private String busName;
    
    public void Connect(){
        try{
            String url = "jdbc:mysql://localhost/busbooking";
            String username = "root";
            String password = "Luxan@22";
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url,username,password);
            
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    
    public void loadTable(){
         SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
        String date = date_format.format(viewDate.getDate());
        String busName = viewBus.getSelectedItem().toString();
        String query = "SELECT bus.busName,bus.seats,bus.date,bus.status,seats.customer,seats.mobile FROM bus"
                + " Left JOIN seats ON bus.busName = seats.busname AND bus.seats = seats.seatno AND bus.date = seats.date WHERE bus.date = ? AND bus.busName = ?";
        try {
            check = con.prepareStatement("SELECT * FROM bus WHERE busName = ? AND date = ?");
            check.setString(1,busName);
            check.setString(2,date);
            rs = check.executeQuery();
            if(!rs.next()){
                JOptionPane.showMessageDialog(this, "Bookings are not yet opened");
            }
            else{
                st = con.prepareStatement(query);
                st.setString(1,date);
                st.setString(2,busName);
                rst = st.executeQuery();
            
                ResultSetMetaData rms =rst.getMetaData();
            
                int c;
                c = rms.getColumnCount();
                DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
                d.setRowCount(0);
            
                while(rst.next()){
                    Vector v2 = new Vector();
                    for(int i=1;i<=c;i++){
                        v2.add(rst.getString(1));
                        v2.add(rst.getInt(2));
                        v2.add(rst.getString(4));
                        v2.add(rst.getString(5));
                        v2.add(rst.getInt(6));
                        v2.add(rst.getString(3));
                    }
                    d.addRow(v2);
                }               
            }

            
        } catch (SQLException ex) {
            Logger.getLogger(TicketBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        viewDate = new com.toedter.calendar.JDateChooser();
        viewBus = new javax.swing.JComboBox<>();
        viewButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        home = new javax.swing.JButton();
        cancelBooking = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.textHighlight);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 42)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("XYZ - CANCEL BOOKING");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        viewBus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PPN", "PPT", "NCG" }));

        viewButton.setBackground(java.awt.SystemColor.activeCaptionBorder);
        viewButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        viewButton.setForeground(new java.awt.Color(0, 0, 0));
        viewButton.setText("VIEW");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bus", "Seat No", "Status", "Customer", "Mobile", "Date"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        home.setBackground(java.awt.SystemColor.activeCaptionBorder);
        home.setForeground(new java.awt.Color(0, 0, 0));
        home.setText("HOME");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        cancelBooking.setBackground(java.awt.SystemColor.activeCaptionBorder);
        cancelBooking.setForeground(new java.awt.Color(0, 0, 0));
        cancelBooking.setText("CANCEL BOOKING");
        cancelBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBookingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(viewDate, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(viewBus, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(viewBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewButton)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(home)
                    .addComponent(cancelBooking))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        loadTable();
        
    }//GEN-LAST:event_viewButtonActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        welcome w = new welcome();
        w.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

    private void cancelBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBookingActionPerformed
        try {
            st = con.prepareStatement("DELETE FROM seats WHERE seatno = ? AND date = ? AND busname = ?");
            st.setString(1,seat);
            st.setString(2,bookingDate);
            st.setString(3,busName);
            st.executeUpdate();
            
            pst = con.prepareStatement("UPDATE bus SET status=? WHERE seats = ? AND date = ? AND busName = ?");
            pst.setString(1,"available");
            pst.setString(2,seat);
            pst.setString(3,bookingDate);
            pst.setString(4,busName);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Booking Cancelled");
            loadTable();
        } catch (SQLException ex) {
            Logger.getLogger(CancelBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_cancelBookingActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        int selected = jTable1.getSelectedRow();
        
        String status = d1.getValueAt(selected, 2).toString();
        
        if(!status.equals("available")){
            seat = d1.getValueAt(selected, 1).toString();
            bookingDate = d1.getValueAt(selected, 5).toString();
            busName = d1.getValueAt(selected, 0).toString();
        }
        else{
            JOptionPane.showMessageDialog(this,"Seat Already Empty");
        }
    }//GEN-LAST:event_jTable1MouseClicked


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBooking;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> viewBus;
    private javax.swing.JButton viewButton;
    private com.toedter.calendar.JDateChooser viewDate;
    // End of variables declaration//GEN-END:variables
}
