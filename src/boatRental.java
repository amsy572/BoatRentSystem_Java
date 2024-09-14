

public class boatRental extends MainWindow {
    String Boat;
    String Date;
    String Time ;
    String Start;
    String End;
    
    
    
    public void userChoice(){
        try{
          if(Boat_Input.getSelectedItem().equals("Pontoon Boat")){
            total.setText("Total Cost: 5.60");
        }else if(Boat_Input.getSelectedItem().equals("Speed Boat")){ 
            total.setText("Total Cost: 22.50");
        }else if(Boat_Input.getSelectedItem().equals("Yacht Boat")){
            total.setText("Total Cost: 80.40");
        }
        else if(Boat_Input.getSelectedItem().equals("Fishing Boat")){
            total.setText("Total Cost: 2.30");
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
       Thanks.setText("Thank you for booking with us");
       Receipt.setText("-------------Receipt--------------");
       Type.setText("Boat Type: "+Boat);
       dateL.setText("Date: "+Date);
       timeL.setText("Time: "+Time);
       portL.setText("Port: "+Start);
       desL.setText("Destination: "+End);
       
}

}