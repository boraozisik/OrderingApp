
package orderingapp;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JOptionPane;


/**
 *
 * @author Bora
 */
public class Ordering extends javax.swing.JFrame {
    Map<String,Integer> orders = new LinkedHashMap<String, Integer>();
   
    public Ordering() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fish = new javax.swing.JCheckBox();
        chicken = new javax.swing.JCheckBox();
        burger = new javax.swing.JCheckBox();
        meat = new javax.swing.JCheckBox();
        salad = new javax.swing.JCheckBox();
        coke = new javax.swing.JCheckBox();
        ayran = new javax.swing.JCheckBox();
        soda = new javax.swing.JCheckBox();
        beer = new javax.swing.JCheckBox();
        wine = new javax.swing.JCheckBox();
        showOrders = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(415, 325));
        getContentPane().setLayout(null);

        jLabel6.setForeground(new java.awt.Color(0, 255, 102));
        jLabel6.setText("MENU");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 20, 50, 16);

        jLabel7.setForeground(new java.awt.Color(51, 255, 51));
        jLabel7.setText("FOODS");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 40, 50, 16);

        jLabel8.setForeground(new java.awt.Color(51, 255, 51));
        jLabel8.setText("DRINKS");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(270, 40, 50, 20);

        fish.setText("Fish - 50 TL");
        getContentPane().add(fish);
        fish.setBounds(30, 70, 110, 25);

        chicken.setText("Chicken - 35 TL");
        getContentPane().add(chicken);
        chicken.setBounds(30, 100, 120, 25);

        burger.setText("Burger - 40 TL");
        burger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burgerActionPerformed(evt);
            }
        });
        getContentPane().add(burger);
        burger.setBounds(30, 130, 110, 25);

        meat.setText("Meat - 50 TL");
        getContentPane().add(meat);
        meat.setBounds(30, 160, 110, 25);

        salad.setText("Salad - 25 TL");
        getContentPane().add(salad);
        salad.setBounds(30, 190, 110, 25);

        coke.setText("Coke - 7 TL");
        getContentPane().add(coke);
        coke.setBounds(270, 70, 100, 25);

        ayran.setText("Ayran - 4 TL");
        getContentPane().add(ayran);
        ayran.setBounds(270, 100, 100, 25);

        soda.setText("Soda - 7 TL");
        getContentPane().add(soda);
        soda.setBounds(270, 130, 100, 25);

        beer.setText("Beer - 25 TL");
        getContentPane().add(beer);
        beer.setBounds(270, 160, 100, 25);

        wine.setText("Wine - 40 TL");
        getContentPane().add(wine);
        wine.setBounds(270, 190, 100, 25);

        showOrders.setText("Show orders");
        showOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showOrdersActionPerformed(evt);
            }
        });
        getContentPane().add(showOrders);
        showOrders.setBounds(70, 240, 250, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderingapp/ap.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void burgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burgerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_burgerActionPerformed
    public void showOrders(){
        String message = "";
        int price = 0;
        if(orders.isEmpty()){
            message = "You don't have any order.";
        }
        else{
            message += "***Orders***\n";
            for(Map.Entry<String, Integer> entry: orders.entrySet()){
                message += entry.getKey() + "\n";
                price += entry.getValue();
        }
            message += "Total price: " +price;
        }
        JOptionPane.showMessageDialog(this, message);
    }
    private void showOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showOrdersActionPerformed
       if(fish.isSelected()){
           orders.put("Fish",50);
       }
       else{
           orders.remove("Fish");
       }
       if(chicken.isSelected()){
           orders.put("Chicken",35);
       }
       else{
           orders.remove("Chicken");
       }
       if(burger.isSelected()){
           orders.put("Burger",40);
       }
       else{
           orders.remove("Burger");
       }
       if(meat.isSelected()){
           orders.put("Meat",50);
       }
       else{
           orders.remove("Meat");
       }
       if(salad.isSelected()){
           orders.put("Salad",25);
       }
       else{
           orders.remove("Salad");
       }
       if(coke.isSelected()){
           orders.put("Coke",7);
       }
       else{
           orders.remove("Coke");
       }
       if(ayran.isSelected()){
           orders.put("Ayran",4);
       }
       else{
           orders.remove("Ayran");
       }
       if(soda.isSelected()){
           orders.put("Soda",7);
       }
       else{
           orders.remove("Soda");
       }
       if(beer.isSelected()){
           orders.put("Beer",25);
       }
       else{
           orders.remove("Beer");
       }
       if(wine.isSelected()){
           orders.put("Wine",40);
       }
       else{
           orders.remove("Wine");
       }
       showOrders(); 
    }//GEN-LAST:event_showOrdersActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ordering().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ayran;
    private javax.swing.JCheckBox beer;
    private javax.swing.JCheckBox burger;
    private javax.swing.JCheckBox chicken;
    private javax.swing.JCheckBox coke;
    private javax.swing.JCheckBox fish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JCheckBox meat;
    private javax.swing.JCheckBox salad;
    private javax.swing.JButton showOrders;
    private javax.swing.JCheckBox soda;
    private javax.swing.JCheckBox wine;
    // End of variables declaration//GEN-END:variables
}
