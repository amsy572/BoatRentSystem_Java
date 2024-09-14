
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author AMSY
 */
public class MainWindow extends javax.swing.JFrame {
    
    
    
    
    String Boat,Date,Time,Start,End;
    
    ImageIcon icon,potooni;
    Image image;    
    Icon i;
    
    
    
    public void userChoice(){
        try{
          if(Boat_Input.getSelectedItem().equals("Pontoon Boat")){
              icon = new ImageIcon(getClass().getResource("/img/potoon.png"));
              image = icon.getImage().getScaledInstance(Type.getWidth(), Type.getHeight(), Image.SCALE_SMOOTH);
              Type.setIcon(new ImageIcon(image));
              
            total.setText("Total Cost: 5.60");
        }else if(Boat_Input.getSelectedItem().equals("Speed Boat")){ 
            total.setText("Total Cost: 22.50");
            icon = new ImageIcon(getClass().getResource("/img/speed.png"));
              image = icon.getImage().getScaledInstance(Type.getWidth(), Type.getHeight(), Image.SCALE_SMOOTH);
              Type.setIcon(new ImageIcon(image));
              
        }else if(Boat_Input.getSelectedItem().equals("Yacht Boat")){
            total.setText("Total Cost: 80.40");
            icon = new ImageIcon(getClass().getResource("/img/yacht.png"));
              image = icon.getImage().getScaledInstance(Type.getWidth(), Type.getHeight(), Image.SCALE_SMOOTH);
              Type.setIcon(new ImageIcon(image));
        }
        else if(Boat_Input.getSelectedItem().equals("Fishing Boat")){
            total.setText("Total Cost: 2.30");
            icon = new ImageIcon(getClass().getResource("/img/fishing.png"));
              image = icon.getImage().getScaledInstance(Type.getWidth(), Type.getHeight(), Image.SCALE_SMOOTH);
              Type.setIcon(new ImageIcon(image));
        }else{
            System.out.print("erro");
        }
        } catch (Exception e){
            System.out.print(e);
        }
        
        
       
        
         Boat = Boat_Input.getSelectedItem().toString();
         Date = Date_Input.getSelectedItem().toString();
         Time = Time_Input.getSelectedItem().toString();
         Start = Start_Input.getSelectedItem().toString();
         End = End_Input.getSelectedItem().toString();
        
        
       
    }
    public void printDetails(){
        
        try{
          if(Boat_Input.getSelectedItem().equals("SELECT")){
              JOptionPane.showMessageDialog(null, "Please Select a Boat");
              
        }else if(Date_Input.getSelectedItem().equals("SELECT")){ 
            JOptionPane.showMessageDialog(null, "Please Select a Date");
        }else if(Time_Input.getSelectedItem().equals("SELECT")){
           JOptionPane.showMessageDialog(null, "Please Select a Time");
        }
        else if(Start_Input.getSelectedItem().equals("SELECT")){
          JOptionPane.showMessageDialog(null, "Please Select Start a Location");
        }
        else if(End_Input.getSelectedItem().equals("SELECT")){
          JOptionPane.showMessageDialog(null, "Please Select End a Location");
        }
        else{
            userChoice();
            Thanks.setText("Thank you for booking with us");
            Receipt.setText("-------------Receipt--------------");
            typ.setText("Type: "+Boat);

            dateL.setText("Date: "+Date);
            timeL.setText("Time: "+Time);
            portL.setText("Port: "+Start);
            desL.setText("Destination: "+End);
        }
        } catch (Exception e){
            System.out.print(e);
        }
        
        
        
        
       
        
        
        
       
       
}
    
   
  
    
    
    
    
    

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        
        
        
        i = potoon.getIcon();
        icon = (ImageIcon)i;
        image = icon.getImage().getScaledInstance(potoon.getWidth(), potoon.getHeight(), Image.SCALE_SMOOTH);
        potoon.setIcon(new ImageIcon(image));
       
        i = speed.getIcon();
        icon = (ImageIcon)i;
       image = icon.getImage().getScaledInstance(speed.getWidth(), speed.getHeight(), Image.SCALE_SMOOTH);
       speed.setIcon(new ImageIcon(image));
       
       
      
       
       
       
       
       i = Fishing.getIcon();
        icon = (ImageIcon)i;
       image = icon.getImage().getScaledInstance(Fishing.getWidth(), Fishing.getHeight(), Image.SCALE_SMOOTH);
       Fishing.setIcon(new ImageIcon(image));
       
       i = Yacht.getIcon();
        icon = (ImageIcon)i;
       image = icon.getImage().getScaledInstance(Yacht.getWidth(), Yacht.getHeight(), Image.SCALE_SMOOTH);
       Yacht.setIcon(new ImageIcon(image));
       
       
       
       
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Boat_Input = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Date_Input = new javax.swing.JComboBox<>();
        Time_Input = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Start_Input = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        End_Input = new javax.swing.JComboBox<>();
        Rent_Btn = new javax.swing.JButton();
        Cancel_Btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Thanks = new javax.swing.JLabel();
        Receipt = new javax.swing.JLabel();
        Type = new javax.swing.JLabel();
        dateL = new javax.swing.JLabel();
        timeL = new javax.swing.JLabel();
        portL = new javax.swing.JLabel();
        desL = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        typ = new javax.swing.JLabel();
        potoon = new javax.swing.JLabel();
        Fishing = new javax.swing.JLabel();
        speed = new javax.swing.JLabel();
        Yacht = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rent a boat");
        jLabel1.setOpaque(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Boat Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Boat");

        Boat_Input.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "Pontoon Boat", "Speed Boat", "Yacht Boat", "Fishing Boat" }));
        Boat_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boat_InputActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date");

        Date_Input.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "Friday", "Monday", "Tuesday", "Wednesday" }));

        Time_Input.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "8am   1pm", "9am   2pm", "10am   3pm", "11am   4pm", "12am   5pm" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Time");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Starting Location");

        Start_Input.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "Lagos Port", "Kaduna Port", "Lekki Port", "Abuja Port" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ending Location");

        End_Input.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "Lagos Port", "Kaduna Port", "Lekki Port", "Abuja Port" }));
        End_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                End_InputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Boat_Input, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Date_Input, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Time_Input, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Start_Input, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(133, Short.MAX_VALUE))
            .addComponent(End_Input, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boat_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Date_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Time_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Start_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(End_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        Rent_Btn.setBackground(new java.awt.Color(0, 102, 102));
        Rent_Btn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Rent_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Rent_Btn.setText("Rent");
        Rent_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rent_BtnActionPerformed(evt);
            }
        });

        Cancel_Btn.setBackground(new java.awt.Color(153, 0, 0));
        Cancel_Btn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Cancel_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Cancel_Btn.setText("Cancel");
        Cancel_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_BtnActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        Thanks.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        Thanks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Receipt.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        Receipt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Type.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        Type.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        dateL.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        dateL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        timeL.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        timeL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        portL.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        portL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        desL.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        desL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        total.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        total.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        typ.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Receipt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dateL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(timeL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(portL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(desL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(Thanks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(typ, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Type, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Thanks, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Receipt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Type, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(typ, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addComponent(dateL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(timeL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(portL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(desL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        potoon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/potoon.png"))); // NOI18N
        potoon.setText("jLabel8");

        Fishing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fishing.png"))); // NOI18N
        Fishing.setText("jLabel8");

        speed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/speed.png"))); // NOI18N
        speed.setText("jLabel8");

        Yacht.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/yacht.png"))); // NOI18N
        Yacht.setText("jLabel8");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pontoon Boat");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Speed Boat");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Yacht Boat");

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fishing Boat");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Build by Amsy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Rent_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(Cancel_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(26, 26, 26))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(potoon, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                                .addComponent(speed, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Fishing, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Yacht, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(23, 23, 23)))))
                        .addGap(18, 18, 18)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(427, 427, 427))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(speed, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(potoon, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Fishing, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Yacht, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9))
                            .addGap(46, 46, 46))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rent_Btn)
                    .addComponent(Cancel_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Rent_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rent_BtnActionPerformed

        
        printDetails();
    }//GEN-LAST:event_Rent_BtnActionPerformed

    private void End_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_End_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_End_InputActionPerformed

    private void Boat_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boat_InputActionPerformed

    }//GEN-LAST:event_Boat_InputActionPerformed

    private void Cancel_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_BtnActionPerformed
               // TODO add your handling code here:
               System.exit(0);
    }//GEN-LAST:event_Cancel_BtnActionPerformed

    
    
    
    
    
    
    
    
    
    
         

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    
    
   
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> Boat_Input;
    private javax.swing.JButton Cancel_Btn;
    public javax.swing.JComboBox<String> Date_Input;
    public javax.swing.JComboBox<String> End_Input;
    private javax.swing.JLabel Fishing;
    public javax.swing.JLabel Receipt;
    private javax.swing.JButton Rent_Btn;
    public javax.swing.JComboBox<String> Start_Input;
    public javax.swing.JLabel Thanks;
    public javax.swing.JComboBox<String> Time_Input;
    public javax.swing.JLabel Type;
    private javax.swing.JLabel Yacht;
    public javax.swing.JLabel dateL;
    public javax.swing.JLabel desL;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel portL;
    private javax.swing.JLabel potoon;
    private javax.swing.JLabel speed;
    public javax.swing.JLabel timeL;
    public javax.swing.JLabel total;
    private javax.swing.JLabel typ;
    // End of variables declaration//GEN-END:variables
}
