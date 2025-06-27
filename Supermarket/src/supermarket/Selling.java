/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supermarket;

import java.awt.Frame;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public final class Selling extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Selling.class.getName());

    /**
     * Creates new form Selling
     */
    public Selling() {
        initComponents();
        SelectProduct();
        GetCat();
    }
    
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    
    public void SelectProduct(){
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/Supermarket","Employee","1234");
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM PRODUCTS ORDER BY ID");
            ProductTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void GetCat()
    {
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/Supermarket","Employee","1234");
            st = con.createStatement();
            String query = "SELECT * FROM CATEGORIES ORDER BY ID";
            rs = st.executeQuery(query);
            while(rs.next())
            {
                String MyCat = rs.getString("NAME");
                ProductCategoryComboBox.addItem(MyCat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ProductNameField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ProductQuantityField = new javax.swing.JTextField();
        ProductCategoryComboBox = new javax.swing.JComboBox<>();
        RefreshButton = new javax.swing.JButton();
        PrintButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BillOutputText = new javax.swing.JTextArea();
        GrdtotLbl = new javax.swing.JLabel();
        FilterButton = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        ExitButton = new javax.swing.JLabel();
        LogOutButton = new javax.swing.JLabel();
        MinimizeButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 102));
        jLabel13.setText("BILLING POINT");
        jLabel13.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 102));
        jLabel9.setText("NAME");

        ProductNameField.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        ProductNameField.setForeground(new java.awt.Color(0, 153, 102));

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 102));
        jLabel10.setText("QUANTITY");

        ProductQuantityField.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        ProductQuantityField.setForeground(new java.awt.Color(0, 153, 102));

        ProductCategoryComboBox.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        ProductCategoryComboBox.setForeground(new java.awt.Color(0, 153, 102));
        ProductCategoryComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ProductCategoryComboBoxItemStateChanged(evt);
            }
        });
        ProductCategoryComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductCategoryComboBoxMouseClicked(evt);
            }
        });

        RefreshButton.setBackground(new java.awt.Color(0, 153, 102));
        RefreshButton.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        RefreshButton.setForeground(new java.awt.Color(255, 255, 255));
        RefreshButton.setText("Refresh");
        RefreshButton.setBorder(null);
        RefreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshButtonMouseClicked(evt);
            }
        });
        RefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshButtonActionPerformed(evt);
            }
        });

        PrintButton.setBackground(new java.awt.Color(0, 153, 102));
        PrintButton.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        PrintButton.setForeground(new java.awt.Color(255, 255, 255));
        PrintButton.setText("Print");
        PrintButton.setBorder(null);
        PrintButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintButtonMouseClicked(evt);
            }
        });
        PrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintButtonActionPerformed(evt);
            }
        });

        AddButton.setBackground(new java.awt.Color(0, 153, 102));
        AddButton.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("Add to bill");
        AddButton.setBorder(null);
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        ClearButton.setBackground(new java.awt.Color(0, 153, 102));
        ClearButton.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        ClearButton.setForeground(new java.awt.Color(255, 255, 255));
        ClearButton.setText("Clear");
        ClearButton.setBorder(null);
        ClearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearButtonMouseClicked(evt);
            }
        });
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        ProductTable.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "QUANTITY", "PRICE", "CATEGORY"
            }
        ));
        ProductTable.setRowHeight(25);
        ProductTable.setSelectionBackground(new java.awt.Color(0, 153, 102));
        ProductTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ProductTable);

        jLabel16.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 102));
        jLabel16.setText("FINAL BILL");

        BillOutputText.setColumns(20);
        BillOutputText.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        BillOutputText.setForeground(new java.awt.Color(0, 153, 102));
        BillOutputText.setRows(5);
        jScrollPane1.setViewportView(BillOutputText);

        GrdtotLbl.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        GrdtotLbl.setForeground(new java.awt.Color(0, 153, 102));
        GrdtotLbl.setToolTipText("");

        FilterButton.setBackground(new java.awt.Color(0, 153, 102));
        FilterButton.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        FilterButton.setForeground(new java.awt.Color(255, 255, 255));
        FilterButton.setText("Filter");
        FilterButton.setBorder(null);
        FilterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FilterButtonMouseClicked(evt);
            }
        });
        FilterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterButtonActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 102));
        jLabel17.setText("PRODUCTS LIST");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(307, 307, 307))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel9)
                .addGap(26, 26, 26)
                .addComponent(ProductNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(36, 36, 36)
                .addComponent(ProductQuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(ProductCategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(FilterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(125, 125, 125)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel16)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(281, 281, 281))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(PrintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(GrdtotLbl)
                        .addGap(99, 99, 99))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel13)
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ProductQuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(ProductNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProductCategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(GrdtotLbl)
                .addGap(18, 18, 18)
                .addComponent(PrintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        ExitButton.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 20)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("X");
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonMouseClicked(evt);
            }
        });

        LogOutButton.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        LogOutButton.setForeground(new java.awt.Color(255, 255, 255));
        LogOutButton.setText("Log out");
        LogOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutButtonMouseClicked(evt);
            }
        });

        MinimizeButton.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 20)); // NOI18N
        MinimizeButton.setForeground(new java.awt.Color(255, 255, 255));
        MinimizeButton.setText("_");
        MinimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(MinimizeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ExitButton)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(LogOutButton)
                        .addGap(398, 398, 398))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExitButton)
                    .addComponent(MinimizeButton))
                .addGap(4, 4, 4)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LogOutButton)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_ExitButtonMouseClicked
    
    int PrId, newQty, AvailQty;
    double UPrice, ProdTot = 0.0,GrdTot = 0.0;
    
    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
        int MyIndex = ProductTable.getSelectedRow();
        PrId = Integer.parseInt(model.getValueAt(MyIndex, 0).toString());
        ProductNameField.setText(model.getValueAt(MyIndex, 1).toString());
        AvailQty = Integer.parseInt(model.getValueAt(MyIndex, 2).toString());
        newQty = AvailQty - Integer.parseInt(ProductQuantityField.getText());
        UPrice = Double.parseDouble(model.getValueAt(MyIndex, 3).toString());
    }//GEN-LAST:event_ProductTableMouseClicked

    public void UpdateQuantity(){
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/Supermarket","Employee","1234");
            String Query = "UPDATE PRODUCTS SET QUANTITY="+newQty+" WHERE ID="+PrId;
            Statement Add = con.createStatement();
            Add.executeUpdate(Query);
            SelectProduct();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void ClearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearButtonMouseClicked
        ProductNameField.setText("");
        ProductQuantityField.setText("");
    }//GEN-LAST:event_ClearButtonMouseClicked

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddButtonActionPerformed

    int i = 0;
    
    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        if(ProductQuantityField.getText().isEmpty() || ProductNameField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing information");
        }
        else if(AvailQty <= Integer.parseInt(ProductQuantityField.getText()))
        {
            System.out.println(AvailQty+" ---- "+Integer.valueOf(ProductQuantityField.getText()));
            JOptionPane.showMessageDialog(this, "Not enough in stock");
        }
        else
        {
            i++;
            ProdTot = UPrice * Double.parseDouble(ProductQuantityField.getText());
            GrdTot = GrdTot + ProdTot;
            
            if(i == 1)
            {
                BillOutputText.setText(BillOutputText.getText()+"              ----------YOUR SUPERMARKET----------\nNUM     PRODUCT     PRICE     QUANTITY     TOTAL\n"+i+"        "+ProductNameField.getText()+"        "+UPrice+"        "+ProductQuantityField.getText()+"        "+new DecimalFormat("##.##").format(ProdTot)+"\n");
            }
            else
            {
                BillOutputText.setText(BillOutputText.getText()+i+"        "+ProductNameField.getText()+"        "+UPrice+"        "+ProductQuantityField.getText()+"        "+new DecimalFormat("##.##").format(ProdTot)+"\n");
            }
            GrdtotLbl.setText("Grand total: "+new DecimalFormat("##.##").format(GrdTot));
            UpdateQuantity();
        }
    }//GEN-LAST:event_AddButtonMouseClicked

    private void PrintButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintButtonMouseClicked
        try{
            BillOutputText.print();
        } catch(PrinterException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_PrintButtonMouseClicked

    private void RefreshButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshButtonMouseClicked
        SelectProduct();
    }//GEN-LAST:event_RefreshButtonMouseClicked

    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RefreshButtonActionPerformed

    private void PrintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintButtonActionPerformed

    private void LogOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutButtonMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogOutButtonMouseClicked

    private void ProductCategoryComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductCategoryComboBoxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductCategoryComboBoxMouseClicked

    private void ProductCategoryComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ProductCategoryComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductCategoryComboBoxItemStateChanged

    private void FilterButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilterButtonMouseClicked
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/Supermarket","Employee","1234");
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM PRODUCTS WHERE CATEGORY='"+ProductCategoryComboBox.getSelectedItem().toString()+"'");
            ProductTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_FilterButtonMouseClicked

    private void FilterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterButtonActionPerformed

    private void MinimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeButtonMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_MinimizeButtonMouseClicked

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Selling().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextArea BillOutputText;
    private javax.swing.JButton ClearButton;
    private javax.swing.JLabel ExitButton;
    private javax.swing.JButton FilterButton;
    private javax.swing.JLabel GrdtotLbl;
    private javax.swing.JLabel LogOutButton;
    private javax.swing.JLabel MinimizeButton;
    private javax.swing.JButton PrintButton;
    private javax.swing.JComboBox<String> ProductCategoryComboBox;
    private javax.swing.JTextField ProductNameField;
    private javax.swing.JTextField ProductQuantityField;
    private javax.swing.JTable ProductTable;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
