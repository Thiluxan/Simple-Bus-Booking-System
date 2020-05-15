public class welcome extends javax.swing.JFrame {
    public welcome() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ticketBooking = new javax.swing.JButton();
        clearSeats = new javax.swing.JButton();
        addSeats = new javax.swing.JButton();
        cancelBooking = new javax.swing.JButton();
        manageBus = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("XYZ Bus Booking");
        setBackground(new java.awt.Color(56, 65, 72));

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusCycleRoot(true);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("XYZ BUS BOOKING");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        ticketBooking.setBackground(java.awt.SystemColor.activeCaptionBorder);
        ticketBooking.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ticketBooking.setForeground(new java.awt.Color(0, 0, 0));
        ticketBooking.setText("TICKET BOOKING");
        ticketBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketBookingActionPerformed(evt);
            }
        });

        clearSeats.setBackground(java.awt.SystemColor.activeCaptionBorder);
        clearSeats.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        clearSeats.setForeground(new java.awt.Color(0, 0, 0));
        clearSeats.setText("CLEAR SEATS");
        clearSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearSeatsActionPerformed(evt);
            }
        });

        addSeats.setBackground(java.awt.SystemColor.activeCaptionBorder);
        addSeats.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addSeats.setForeground(new java.awt.Color(0, 0, 0));
        addSeats.setText("ADD SEATS");
        addSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSeatsActionPerformed(evt);
            }
        });

        cancelBooking.setBackground(java.awt.SystemColor.activeCaptionBorder);
        cancelBooking.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        cancelBooking.setForeground(new java.awt.Color(0, 0, 0));
        cancelBooking.setText("CANCEL BOOKING");
        cancelBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBookingActionPerformed(evt);
            }
        });

        manageBus.setBackground(java.awt.SystemColor.activeCaptionBorder);
        manageBus.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        manageBus.setForeground(new java.awt.Color(0, 0, 0));
        manageBus.setText("MANAGE BUS");
        manageBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageBusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manageBus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ticketBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearSeats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addSeats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(manageBus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ticketBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(clearSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(addSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(cancelBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ticketBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketBookingActionPerformed
        // TODO add your handling code here:
        TicketBook tb = new TicketBook();
        tb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ticketBookingActionPerformed

    private void clearSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearSeatsActionPerformed
        // TODO add your handling code here:
        ClearSeats cs = new ClearSeats();
        cs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_clearSeatsActionPerformed

    private void addSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSeatsActionPerformed
        // TODO add your handling code here:
        AddSeats seats = new AddSeats();
        seats.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addSeatsActionPerformed

    private void cancelBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBookingActionPerformed
        // TODO add your handling code here:
        CancelBooking cb = new CancelBooking();
        cb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelBookingActionPerformed

    private void manageBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageBusActionPerformed
        ManageBus ab = new ManageBus();
        ab.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_manageBusActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSeats;
    private javax.swing.JButton cancelBooking;
    private javax.swing.JButton clearSeats;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton manageBus;
    private javax.swing.JButton ticketBooking;
    // End of variables declaration//GEN-END:variables
}
