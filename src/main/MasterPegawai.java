/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import Utils.PasswordHash;
import Utils.dbConnection;
import java.sql.Statement;
import java.sql.SQLException;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hirag
 */
public class MasterPegawai extends javax.swing.JPanel {
    private int cond;
    private List<Integer> id = new ArrayList<>();
    private List<String> uname = new ArrayList<>();
    private String valUname;
    private int selID = 0;
    public MasterPegawai() {
        initComponents();
        DefaultTableCellRenderer headRender = new DefaultTableCellRenderer();
        headRender.setForeground(new Color(255,246,244));
        headRender.setBackground(new Color(248,111,3));
        MainTable.getTableHeader().setDefaultRenderer(headRender);
        MainPanel.setVisible(false);
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        MainTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        role = new javax.swing.JComboBox<>();
        save = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        can = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        in = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        up = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        del = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 246, 244));

        MainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        MainTable.setRowHeight(25);
        MainTable.setSelectionBackground(new java.awt.Color(248, 111, 3));
        MainTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MainTable);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(248, 111, 3));
        jLabel3.setText("Master Pegawai");

        MainPanel.setBackground(new java.awt.Color(255, 246, 244));
        MainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 111, 3)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(248, 111, 3));
        jLabel4.setText("Nama");

        nama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 112, 4)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(248, 111, 3));
        jLabel5.setText("Username");

        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 112, 4)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(248, 111, 3));
        jLabel6.setText("Password");

        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 111, 3)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(248, 111, 3));
        jLabel7.setText("Role");

        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Kasir" }));

        save.setBackground(new java.awt.Color(248, 111, 3));
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 246, 244));
        jLabel8.setText("Simpan");

        javax.swing.GroupLayout saveLayout = new javax.swing.GroupLayout(save);
        save.setLayout(saveLayout);
        saveLayout.setHorizontalGroup(
            saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(saveLayout.createSequentialGroup()
                    .addGap(0, 27, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 26, Short.MAX_VALUE)))
        );
        saveLayout.setVerticalGroup(
            saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(saveLayout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 7, Short.MAX_VALUE)))
        );

        can.setBackground(new java.awt.Color(248, 111, 3));
        can.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 246, 244));
        jLabel12.setText("Batal");

        javax.swing.GroupLayout canLayout = new javax.swing.GroupLayout(can);
        can.setLayout(canLayout);
        canLayout.setHorizontalGroup(
            canLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
            .addGroup(canLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(canLayout.createSequentialGroup()
                    .addGap(0, 35, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addGap(0, 36, Short.MAX_VALUE)))
        );
        canLayout.setVerticalGroup(
            canLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(canLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(canLayout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addGap(0, 7, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6)
                        .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(nama))
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(can, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addComponent(role, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(can, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        in.setBackground(new java.awt.Color(248, 111, 3));
        in.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 246, 244));
        jLabel9.setText("Tambah");

        javax.swing.GroupLayout inLayout = new javax.swing.GroupLayout(in);
        in.setLayout(inLayout);
        inLayout.setHorizontalGroup(
            inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
            .addGroup(inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(inLayout.createSequentialGroup()
                    .addGap(0, 27, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addGap(0, 26, Short.MAX_VALUE)))
        );
        inLayout.setVerticalGroup(
            inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(inLayout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addGap(0, 7, Short.MAX_VALUE)))
        );

        up.setBackground(new java.awt.Color(82, 95, 225));
        up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 246, 244));
        jLabel10.setText("Ubah");

        javax.swing.GroupLayout upLayout = new javax.swing.GroupLayout(up);
        up.setLayout(upLayout);
        upLayout.setHorizontalGroup(
            upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
            .addGroup(upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(upLayout.createSequentialGroup()
                    .addGap(0, 27, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(0, 26, Short.MAX_VALUE)))
        );
        upLayout.setVerticalGroup(
            upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(upLayout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(0, 7, Short.MAX_VALUE)))
        );

        del.setBackground(new java.awt.Color(255, 0, 51));
        del.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 246, 244));
        jLabel11.setText("Hapus");

        javax.swing.GroupLayout delLayout = new javax.swing.GroupLayout(del);
        del.setLayout(delLayout);
        delLayout.setHorizontalGroup(
            delLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
            .addGroup(delLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(delLayout.createSequentialGroup()
                    .addGap(0, 27, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addGap(0, 26, Short.MAX_VALUE)))
        );
        delLayout.setVerticalGroup(
            delLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(delLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(delLayout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addGap(0, 7, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                        .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(306, 306, 306)
                    .addComponent(jLabel3)
                    .addContainerGap(325, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jLabel3)
                    .addContainerGap(583, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    void loadTable(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nama");
        tbl.addColumn("Username");
        tbl.addColumn("Role");
        try{
            String query = "select * from users";
            ResultSet rs = dbConnection.getData(query);
            while(rs.next()){
                String role;
                id.add(rs.getInt("id"));
                uname.add(rs.getString("username"));
                if(rs.getInt("role") == 1){
                    role = "Admin";
                }else{
                    role = "Kasir";
                }
                tbl.addRow(new Object[]{rs.getString("nama"), rs.getString("username"), role});
                MainTable.setModel(tbl);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }
    void Clear(){
        nama.setText("");
        username.setText("");
        password.setText("");
    }
    boolean validateIn(){
        if(nama.getText().equals("") || username.getText().equals("") || password.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Semua Form Wajib Diisi");
            return false;
        }
        for(int i = 0; i < uname.size(); i++){
            if(username.getText().equals(uname.get(i))){
                JOptionPane.showMessageDialog(this, "Username Telah Digunakan");
                return false;
            }
        }
        if(password.getText().length() < 8){
            JOptionPane.showMessageDialog(this, "Password Harus 8 Character Atau Lebih");
            return false;
        }
        return true;
    }
    boolean validateUp(){
        if(nama.getText().equals("") || username.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Semua Form Wajib Diisi");
            return false;
        }
        if(!username.getText().equals(valUname)){
            for(int i = 0; i < uname.size(); i++){
                if(username.getText().equals(uname.get(i))){
                    JOptionPane.showMessageDialog(this, "Username Telah Digunakan");
                    return false;
                   }
            }
        }
        if(!password.getText().equals("") && password.getText().length() < 8){
            JOptionPane.showMessageDialog(this, "Password Harus 8 Character Atau Lebih");
            return false;
        }
        return true;
    }
    private void inMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inMouseClicked
        MainPanel.setVisible(true);
        cond = 1;
    }//GEN-LAST:event_inMouseClicked

    private void canMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canMouseClicked
        Clear();
        MainPanel.setVisible(false);
        selID = 0;
        valUname = "";
        cond = 0;
    }//GEN-LAST:event_canMouseClicked

    private void MainTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainTableMouseClicked
        DefaultTableModel tbl = (DefaultTableModel)MainTable.getModel();
        selID = id.get(MainTable.getSelectedRow());
        nama.setText(tbl.getValueAt(MainTable.getSelectedRow(), 0).toString());
        username.setText(tbl.getValueAt(MainTable.getSelectedRow(), 1).toString());
        valUname = username.getText();
        if(tbl.getValueAt(MainTable.getSelectedRow(), 2).toString().equals("Admin")){
            role.setSelectedIndex(0);
        }else{
            role.setSelectedIndex(1);
        }
    }//GEN-LAST:event_MainTableMouseClicked

    private void upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upMouseClicked
        if(selID == 0){
            JOptionPane.showMessageDialog(this, "Silahkan Pilih Baris Untuk Di Ubah");
        }else{
            MainPanel.setVisible(true);
            cond = 2;
        }
    }//GEN-LAST:event_upMouseClicked

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        if(cond == 1 && validateIn()){
               
            try{
                String n = nama.getText();
                String u = username.getText();
                String p = PasswordHash.encrypt(password.getText());
                int r;
                if(role.getSelectedIndex() == 0){
                    r = 1;
                }else{
                    r = 2;
                }
                
                String query = "insert into users (nama,username,password,role) values('"+ n +"', '"+ u +"', '"+ p +"', "+ r +")";
                Statement st = dbConnection.getConn().createStatement();
                st.executeUpdate(query);
                st.close();
                JOptionPane.showMessageDialog(this, "Data Berhasil Ditambah");
                
                id.clear();
                uname.clear();
                loadTable();
                Clear();
                MainPanel.setVisible(false);
                selID = 0;
                valUname = "";
                cond = 0;
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e.toString());
            }
        }
        
        if(cond == 2 && validateUp()){
            try{
                String n = nama.getText();
                String u = username.getText();
                String p = PasswordHash.encrypt(password.getText());
                int r;
                if(role.getSelectedIndex() == 0){
                    r = 1;
                }else{
                    r = 2;
                }
                
                if(password.getText().equals("")){
                    String query = "update users set nama = '"+ n +"', username = '"+ u +"', role = "+ r +" where id = "+ selID +"";
                    Statement st = dbConnection.getConn().createStatement();
                    st.executeUpdate(query);
                    st.close();
                    JOptionPane.showMessageDialog(this, "Data Berhasil DiUbah");
                }else{
                    String query = "update users set nama = '"+ n +"', username = '"+ u +"', password = '"+ p +"', role = "+ r +" where id = "+ selID +"";
                    Statement st = dbConnection.getConn().createStatement();
                    st.executeUpdate(query);
                    st.close();
                    JOptionPane.showMessageDialog(this, "Data Berhasil DiUbah");
                }
                
                id.clear();
                uname.clear();
                loadTable();
                Clear();
                MainPanel.setVisible(false);
                selID = 0;
                valUname = "";
                cond = 0;
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e.toString());
            }
        }
    }//GEN-LAST:event_saveMouseClicked

    private void delMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delMouseClicked
        if(selID == 0){
            JOptionPane.showMessageDialog(this, "Silahkan Pilih Baris Untuk Di Hapus");
        }else{
            int result = JOptionPane.showConfirmDialog(null, "Yakin Ingin Menghapus Data Tersebut?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION){
                try{
                    String query = "delete from users where id="+ selID +"";
                    Statement state = dbConnection.getConn().createStatement();
                    state.executeUpdate(query);
                    state.close();
                    JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                    id.clear();
                    uname.clear();
                    loadTable();
                    selID = 0;
                }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
            }
        }
    }//GEN-LAST:event_delMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTable MainTable;
    private javax.swing.JPanel can;
    private javax.swing.JPanel del;
    private javax.swing.JPanel in;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JPanel save;
    private javax.swing.JPanel up;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
