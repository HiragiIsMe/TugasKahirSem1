/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import Utils.dbConnection;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hirag
 */
public class MasterBarang extends javax.swing.JPanel {
    private List<Integer> id_unit = new ArrayList<>();
    private List<String> unitt = new ArrayList<>();
    private List<Integer> id = new ArrayList<>();
    private List<String> code = new ArrayList<>();
    private int selID;
    private int cond;
    private String valKode;
    public MasterBarang() {
        initComponents();
        DefaultTableCellRenderer headRender = new DefaultTableCellRenderer();
        headRender.setForeground(new Color(255,246,244));
        headRender.setBackground(new Color(248,111,3));
        MainTable.getTableHeader().setDefaultRenderer(headRender);
        loadUnit();
        loadTable();
        MainPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MainTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        kode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        unit = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        hargajual = new javax.swing.JTextField();
        jPanelLog = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanelLog1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanelLog2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanelLog3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanelLog4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setBackground(new java.awt.Color(255, 246, 244));

        MainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Stok", "Unit", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MainTable.setFocusable(false);
        MainTable.setRowHeight(25);
        MainTable.setSelectionBackground(new java.awt.Color(248, 111, 3));
        MainTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        MainTable.getTableHeader().setReorderingAllowed(false);
        MainTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MainTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(248, 111, 3));
        jLabel1.setText("Master Barang");

        MainPanel.setBackground(new java.awt.Color(255, 246, 244));
        MainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 112, 4)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(248, 111, 3));
        jLabel3.setText("Kode Barang");

        kode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 112, 4)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(248, 111, 3));
        jLabel4.setText("Nama Barang");

        nama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 112, 4)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(248, 111, 3));
        jLabel5.setText("Unit");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(248, 111, 3));
        jLabel6.setText("Harga Jual");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        hargajual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 112, 4)));
        hargajual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hargajualKeyTyped(evt);
            }
        });

        jPanelLog.setBackground(new java.awt.Color(248, 111, 3));
        jPanelLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLogMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 246, 244));
        jLabel7.setText("Batal");

        javax.swing.GroupLayout jPanelLogLayout = new javax.swing.GroupLayout(jPanelLog);
        jPanelLog.setLayout(jPanelLogLayout);
        jPanelLogLayout.setHorizontalGroup(
            jPanelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
            .addGroup(jPanelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLogLayout.createSequentialGroup()
                    .addGap(0, 35, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 36, Short.MAX_VALUE)))
        );
        jPanelLogLayout.setVerticalGroup(
            jPanelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLogLayout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 7, Short.MAX_VALUE)))
        );

        jPanelLog1.setBackground(new java.awt.Color(248, 111, 3));
        jPanelLog1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLog1MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 246, 244));
        jLabel8.setText("Simpan");

        javax.swing.GroupLayout jPanelLog1Layout = new javax.swing.GroupLayout(jPanelLog1);
        jPanelLog1.setLayout(jPanelLog1Layout);
        jPanelLog1Layout.setHorizontalGroup(
            jPanelLog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(jPanelLog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLog1Layout.createSequentialGroup()
                    .addGap(0, 27, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 26, Short.MAX_VALUE)))
        );
        jPanelLog1Layout.setVerticalGroup(
            jPanelLog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanelLog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLog1Layout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 7, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(kode)
                    .addComponent(nama)
                    .addComponent(unit, 0, 263, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(MainPanelLayout.createSequentialGroup()
                            .addComponent(jPanelLog1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(hargajual, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kode, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargajual, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelLog1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanelLog2.setBackground(new java.awt.Color(248, 111, 3));
        jPanelLog2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLog2MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 246, 244));
        jLabel9.setText("Tambah");

        javax.swing.GroupLayout jPanelLog2Layout = new javax.swing.GroupLayout(jPanelLog2);
        jPanelLog2.setLayout(jPanelLog2Layout);
        jPanelLog2Layout.setHorizontalGroup(
            jPanelLog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
            .addGroup(jPanelLog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLog2Layout.createSequentialGroup()
                    .addGap(0, 27, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addGap(0, 26, Short.MAX_VALUE)))
        );
        jPanelLog2Layout.setVerticalGroup(
            jPanelLog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanelLog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLog2Layout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addGap(0, 7, Short.MAX_VALUE)))
        );

        jPanelLog3.setBackground(new java.awt.Color(82, 95, 225));
        jPanelLog3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLog3MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 246, 244));
        jLabel10.setText("Ubah");

        javax.swing.GroupLayout jPanelLog3Layout = new javax.swing.GroupLayout(jPanelLog3);
        jPanelLog3.setLayout(jPanelLog3Layout);
        jPanelLog3Layout.setHorizontalGroup(
            jPanelLog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
            .addGroup(jPanelLog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLog3Layout.createSequentialGroup()
                    .addGap(0, 27, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(0, 26, Short.MAX_VALUE)))
        );
        jPanelLog3Layout.setVerticalGroup(
            jPanelLog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanelLog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLog3Layout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(0, 7, Short.MAX_VALUE)))
        );

        jPanelLog4.setBackground(new java.awt.Color(255, 0, 51));
        jPanelLog4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLog4MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 246, 244));
        jLabel11.setText("Hapus");

        javax.swing.GroupLayout jPanelLog4Layout = new javax.swing.GroupLayout(jPanelLog4);
        jPanelLog4.setLayout(jPanelLog4Layout);
        jPanelLog4Layout.setHorizontalGroup(
            jPanelLog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
            .addGroup(jPanelLog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLog4Layout.createSequentialGroup()
                    .addGap(0, 27, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addGap(0, 26, Short.MAX_VALUE)))
        );
        jPanelLog4Layout.setVerticalGroup(
            jPanelLog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanelLog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLog4Layout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addGap(0, 7, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelLog2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanelLog3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanelLog4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelLog2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelLog4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelLog3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    void loadUnit(){
        DefaultComboBoxModel data = new DefaultComboBoxModel<>();
        String query = "select * from unit";
        ResultSet rs = dbConnection.getData(query);
        try{
            while(rs.next()){
                id_unit.add(rs.getInt("id"));
                unitt.add(rs.getString("unit"));
                data.addElement(rs.getString("unit"));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.toString());
        }
        unit.setModel(data);
    }
    void loadTable(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("KodeBarang");
        tbl.addColumn("NamaBarang");
        tbl.addColumn("StokBarang");
        tbl.addColumn("UnitBarang");
        tbl.addColumn("HargaBarang");
        try{
            String query = "select * from barang join unit on barang.id_unit = unit.id order by barang.id asc";
            ResultSet rs = dbConnection.getData(query);
            while(rs.next()){
                id.add(rs.getInt("id"));
                String kd = rs.getString("kode");
                code.add(kd);
                String brg = rs.getString("nama");
                String stk = rs.getString("stok");
                String unit = rs.getString("unit");
                String hrg = rs.getString("harga");
                
                tbl.addRow(new Object[]{kd,brg,stk,unit,hrg});
                MainTable.setModel(tbl);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,e.toString());
        }
    }
    void Clear(){
        kode.setText("");
        nama.setText("");
        hargajual.setText("");
    }
    boolean validateIn(){
        if(kode.getText().equals("") ||  nama.getText().equals("") || hargajual.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Semua Form Wajib Diisi");
            return false;
        }
        for(int i = 0; i < code.size(); i++){
            if(kode.getText().equals(code.get(i))){
                JOptionPane.showMessageDialog(this, "Kode Telah Digunakan");
                return false;
            }
        }
        return true;
    }
    boolean validateUp(){
        if(kode.getText().equals("") ||  nama.getText().equals("") || hargajual.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Semua Form Wajib Diisi");
            return false;
        }
        if(!kode.getText().equals(valKode)){
            for(int i = 0; i < code.size(); i++){
                if(kode.getText().equals(code.get(i))){
                    JOptionPane.showMessageDialog(this, "Kode Telah Digunakan");
                }
            }
        }
        return true;
    }
    private void jPanelLog2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLog2MouseClicked
        MainPanel.setVisible(true);
        cond = 1;
        Clear();
    }//GEN-LAST:event_jPanelLog2MouseClicked

    private void jPanelLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLogMouseClicked
        Clear();
        MainPanel.setVisible(false);
        selID = 0;
        cond = 0;
    }//GEN-LAST:event_jPanelLogMouseClicked

    private void hargajualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hargajualKeyTyped
        char input = evt.getKeyChar();
        
        if(!Character.isDigit(input)){
            evt.consume();
        }
    }//GEN-LAST:event_hargajualKeyTyped

    private void jPanelLog3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLog3MouseClicked
        if(selID == 0){
            JOptionPane.showMessageDialog(this, "Silahkan Pilih Baris Untuk Di Ubah");
        }else{
            MainPanel.setVisible(true);
            cond = 2;
        }
    }//GEN-LAST:event_jPanelLog3MouseClicked

    private void jPanelLog1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLog1MouseClicked
         if(cond == 1 && validateIn()){
            try{
                String kd = kode.getText();
                String nm = nama.getText();
                int yunit = id_unit.get(unit.getSelectedIndex());
                int harga = Integer.parseInt(hargajual.getText());
                System.out.println(yunit);
                String query = "insert into barang (kode,nama,stok,id_unit,harga) values('"+ kd +"', '"+ nm +"', 0 ,"+ yunit +", "+ harga +")";
                Statement st = dbConnection.getConn().createStatement();
                st.executeUpdate(query);
                st.close();
                JOptionPane.showMessageDialog(this, "Data Berhasil Ditambah");
                
                id.clear();
                id_unit.clear();
                code.clear();
                unitt.clear();
                loadTable();
                loadUnit();
                Clear();
                MainPanel.setVisible(false);
                selID = 0;
                valKode = "";
                cond = 0;
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e.toString());
            }
        }
        
        if(cond == 2 && validateUp()){
            try{
                String kd = kode.getText();
                String nm = nama.getText();
                int yunit = id_unit.get(unit.getSelectedIndex());
                int harga = Integer.parseInt(hargajual.getText());
                System.out.println(yunit);
                String query = "update barang set kode = '"+ kd +"', nama = '"+ nm +"', id_unit = "+ yunit +", harga = "+ harga +" where id = "+ selID +"";
                Statement st = dbConnection.getConn().createStatement();
                st.executeUpdate(query);
                st.close();
                JOptionPane.showMessageDialog(this, "Data Berhasil Ditambah");
                
                id.clear();
                id_unit.clear();
                code.clear();
                unitt.clear();
                loadTable();
                loadUnit();
                Clear();
                MainPanel.setVisible(false);
                selID = 0;
                valKode = "";
                cond = 0;
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e.toString());
            }
        }
    }//GEN-LAST:event_jPanelLog1MouseClicked

    private void jPanelLog4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLog4MouseClicked
         if(selID == 0){
            JOptionPane.showMessageDialog(this, "Silahkan Pilih Baris Untuk Di Hapus");
        }else{
            int result = JOptionPane.showConfirmDialog(null, "Yakin Ingin Mengapus Data Tersebut?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION){
                try{
                    String query = "delete from barang where id="+ selID +"";
                    Statement state = dbConnection.getConn().createStatement();
                    state.executeUpdate(query);
                    state.close();
                    JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                    id.clear();
                    id_unit.clear();
                    code.clear();
                    unitt.clear();
                    loadTable();
                    loadUnit();
                    selID = 0;

                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
            }  
        }
    }//GEN-LAST:event_jPanelLog4MouseClicked

    private void MainTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainTableMouseClicked
        DefaultTableModel tbl = (DefaultTableModel)MainTable.getModel();
        selID = id.get(MainTable.getSelectedRow());
        kode.setText(tbl.getValueAt(MainTable.getSelectedRow(), 0).toString());
        valKode = kode.getText();
        nama.setText(tbl.getValueAt(MainTable.getSelectedRow(), 1).toString());
        unit.setSelectedIndex(unitt.indexOf(tbl.getValueAt(MainTable.getSelectedRow(), 3).toString()));
        hargajual.setText(tbl.getValueAt(MainTable.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_MainTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTable MainTable;
    private javax.swing.JTextField hargajual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelLog;
    private javax.swing.JPanel jPanelLog1;
    private javax.swing.JPanel jPanelLog2;
    private javax.swing.JPanel jPanelLog3;
    private javax.swing.JPanel jPanelLog4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kode;
    private javax.swing.JTextField nama;
    private javax.swing.JComboBox<String> unit;
    // End of variables declaration//GEN-END:variables
}
