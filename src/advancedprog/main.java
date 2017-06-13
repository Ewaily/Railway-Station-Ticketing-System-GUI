
package advancedprog;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import static javafx.scene.input.KeyCode.T;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class main extends Application{
    
   static AdvancedProg pc = new AdvancedProg ();

   
   //********************* choice box
   
   String getTchoice(ChoiceBox<String> to){
        return to.getValue();
    }
   String getFchoice(ChoiceBox<String> from){
        return from.getValue();
    }
    
    
   
   //*******************************

    
     
    @Override
    public void start (Stage primaryStage) throws FileNotFoundException{
        
        //=========================first stage=============================================
        
        AnchorPane p1 = new AnchorPane();
        HBox hbox1 = new HBox();
        hbox1.setPadding (new Insets(20,20,20,20));
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(0,20,0,20));
        Text home = new Text("Train Ticketing System\n      Clerk Dashboard");
        home.setFont(Font.font("Arial",FontWeight.BOLD,20));
        hbox1.getChildren().add(home);
        
        Button in = new Button ("Log in");
        Button up = new Button ("Register");
        HBox hbox2 = new HBox();
        hbox1.setPadding (new Insets(0,20,20,20));
        hbox2.setSpacing(90);
        hbox2.getChildren().addAll(in,up);
        grid.add(hbox1, 1, 0);
        grid.add(hbox2,1,3);
        p1.getChildren().add(grid);
        Scene scene1 = new Scene(p1);
        primaryStage.setTitle("Clerk Dashboard");
        primaryStage.setScene(scene1);
        primaryStage.show();
        
        
        //========================================Llogin stage=================================
        
        
            
        GridPane ppane = new GridPane();
        ppane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        ppane.setHgap(5.5);
        ppane.setVgap(5.5);

        ppane.add(new Label("ID:"), 0, 0);
        TextField id = new TextField();
        ppane.add(id, 1, 0);
        ppane.add(new Label("PW:"), 0, 1);
        TextField pw = new TextField();
        ppane.add(pw, 1, 1);
        
        Button log = new Button("Login");
        ppane.add(log, 1, 2);
        Button bk = new Button("Back");
        ppane.add(bk, 0, 2);
        GridPane.setHalignment(log, HPos.RIGHT);
        Scene scenee = new Scene(ppane);
        Stage stagee = new Stage();
        stagee.setTitle("Login");
        stagee.setScene(scenee);
        
        bk.setOnAction(e -> {
            
            primaryStage.show();
            stagee.close();
        });
        
        
        //======================================Register clerk=================================
        
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        pane.add(new Label("Username:"), 0, 0);
        TextField signUpName = new TextField();
        pane.add(signUpName, 1, 0);
        pane.add(new Label("ID:"), 0, 1);
        TextField signUpId = new TextField();
        pane.add(signUpId, 1, 1);
        pane.add(new Label("Password:"), 0, 2);
        TextField signUpPass = new TextField();
        pane.add(signUpPass, 1, 2);
        pane.add(new Label("Confirm Password:"), 0, 3);
        TextField confirmpw = new TextField();
        pane.add(confirmpw, 1, 3);
        Button entersign = new Button("Submit");
        pane.add(entersign, 1, 4);
        Button b = new Button("Back");
        pane.add(b, 0, 4);
        GridPane.setHalignment(entersign, HPos.RIGHT);
        Scene scene = new Scene(pane);
        Stage stage = new Stage();
        stage.setTitle("New Clerk");
        stage.setScene(scene);
        
        
        //===============================Error Msg================================
        
        
        Label label5 = new Label("Invalid Entery");
        label5.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        Button b5 = new Button("Re-try");
        Button bb = new Button("Register new Clerk");
        GridPane grid5 = new GridPane();
        grid5.setHgap(10);
        grid5.setVgap(10);
        grid5.setPadding(new Insets(0, 10, 0, 10));
        grid5.add(label5, 1, 0);
        grid5.add(b5, 2, 1);
        grid5.add(bb, 1, 1);
        Scene scene5 = new Scene(grid5);
        Stage stage5 = new Stage();
        stage5.setScene(scene5);
        
        
        //=========================Clerk options=====================================
        
        
        GridPane lpane = new GridPane();
        lpane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        lpane.setHgap(5.5);
        lpane.setVgap(5.5);
        
        Button book = new Button("Ticket booking");
        lpane.add(book,0,0);
        
        
        Button addl = new Button("Add new Station");
        lpane.add(addl, 2, 0);
        
        
        GridPane.setHalignment(log, HPos.RIGHT);
        Scene lscene = new Scene(lpane);
        Stage lstage = new Stage();
        lstage.setTitle("Login");
        lstage.setScene(lscene);
        
        in.setOnAction(e -> {
            stagee.show();
            primaryStage.close();
        });
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //=================================Book ticket=========================================
        
        
        
        
        
        ChoiceBox<String> to = new ChoiceBox<>();
        ChoiceBox<String> from = new ChoiceBox<>();
        
        
    //================================================================
       
        
     //   ChoiceBox<Ticket> Ttchoice = new ChoiceBox<>();
        
        GridPane cpane = new GridPane();
        cpane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        cpane.setHgap(5.5);
        cpane.setVgap(5.5);

        cpane.add(new Label("From:"), 0, 0);
     //   TextField signUpName = new TextField();
        
        
        cpane.add(from, 1, 0);
        cpane.add(new Label("To:"), 0, 1);
      
        cpane.add(to, 1, 1);
       cpane.add(new Label("Quantity"), 0, 2);
        TextField qu = new TextField();
        cpane.add(qu, 1, 2);
     
        Button confirm = new Button("Confirm");
        cpane.add(confirm, 1, 4);
        Button Cancel = new Button("Cancel");
        cpane.add(Cancel, 0, 4);
        GridPane.setHalignment(confirm, HPos.RIGHT);
        Scene bscene = new Scene(cpane);
        Stage bstage = new Stage();
        bstage.setTitle("Booking");
        bstage.setScene(bscene);
        GridPane pr = new GridPane();
        pr.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pr.setHgap(5.5);
        pr.setVgap(5.5);
        
        
         Button prtt = new Button("Print");
        pr.add(prtt, 1, 4);
        Button cccc = new Button("Cancel");
        pr.add(cccc, 0, 4);
        
        
        GridPane.setHalignment(prtt, HPos.RIGHT);
        Scene scenep = new Scene(pr);
        Stage stagep = new Stage();
        stagep.setTitle("Print Preview");
        stagep.setScene(scenep);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //=================================Add new ticket======================================
        
        
        Label bto = new Label("To");
        Label bfrom = new Label("From");
        Label bprice = new Label("Price");
        Label bQuantity = new Label("Quantity");
        TextField btf1 = new TextField();
        TextField btf2 = new TextField();
        TextField btf3 = new TextField();
        TextField btf5 = new TextField();
        Button bookk = new Button("Submit");
        GridPane grid6 = new GridPane();

        grid6.setHgap(10);
        grid6.setVgap(10);
        grid6.setPadding(new Insets(10, 10, 10, 10));
        grid6.add(bto, 0, 0);
        grid6.add(bfrom, 0, 1);
        grid6.add(bprice, 0, 3);
        grid6.add(bQuantity, 0, 2);
        grid6.add(btf1, 1, 0);
        grid6.add(btf2, 1, 1);
        grid6.add(btf5, 1, 2);
        grid6.add(btf3, 1, 3);
        grid6.add(bookk, 1, 4);
        Scene s6 = new Scene(grid6);
        Stage stage6 = new Stage();
        stage6.setScene(s6);
        
        
        
        
        
        
        //========================
        
        Label lg= new Label("Your next step!");
        lg.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        Button bx = new Button("Exit");
        Button ba = new Button("Book Again");
        GridPane gridg = new GridPane();
        gridg.setHgap(10);
        gridg.setVgap(10);
        gridg.setPadding(new Insets(0, 10, 0, 10));
        gridg.add(lg, 1, 0);
        gridg.add(bx, 2, 1);
        gridg.add(ba, 1, 1);
        Scene sceneg = new Scene(gridg);
        Stage stageg = new Stage();
        stageg.setScene(sceneg);
        
        
        
        
        
        
        
        
        //==============================EVENTS HANDELING===============================
        
        //********** submiting new station
        
        
        bookk.setOnAction(e -> {
            String ttoo = btf1.getText();
            String ffoo = btf2.getText();
            String pprr = btf3.getText();
            int prp = Integer.parseInt(pprr);
            String qquu = btf5.getText();
            int qwa = Integer.parseInt(qquu);
            Ticket tk = new Ticket (ttoo, ffoo, qwa,prp);
            
            pc.addTicket(tk);
            
             //*******************
                File logg;
                logg = new File("ticket.txt");
                try{
                    if(logg.exists()==false){
                        System.out.println("We had to make a new file.");
                        logg.createNewFile();
                    }
                    PrintWriter outt = new PrintWriter(new FileWriter(logg, true));
                    
                    outt.append(" "+ttoo+" "+ffoo+" "+prp+" "+qwa);
                    outt.close();
                }catch(IOException f){
                    System.out.println("COULD NOT LOG!!");
                }
            
            
            
            
            
            
            
            
            lstage.show();
            stage6.close();
        });
        
        b.setOnAction(e -> {
            primaryStage.show();
            stage.close();
        });
        
        
        
        
        //******handling home window
        up.setOnAction(e -> {
            stage.show();
            primaryStage.close();
        });
        b.setOnAction(e -> {
            primaryStage.show();
            stage.close();
        });
        
        bb.setOnAction(e -> {
            stage.show();
            stage5.close();
        });
        //********************
         bx.setOnAction(e -> {
            stageg.close();
        });
        //******************handling confirm on booking
        
       confirm.setOnAction(e -> {
           
            
            String TO = getTchoice(to);
            String FROM = getTchoice(from);
            String QU = qu.getText();
            double QQ = Double.parseDouble(QU);
            
             Label l1 = new Label(FROM);
        Label l2 = new Label (TO);
        Label l3 = new Label (QU);   
                
        
        
        pr.add(new Label("From:"), 0, 0);
        pr.add(l1, 1, 0);
        pr.add(l2, 0, 1);
        pr.add(new Label(TO), 1, 1);
        pr.add(new Label("Quantity:"), 0, 2);
        pr.add(l3, 1, 2);
       
        
        stagep.show();
        bstage.close();
        
        
        
        
              
            
            
           
        });
       
       
       
       
        //********* handling register window
        
        entersign.setOnAction(e -> {
            String idd = signUpId.getText();
            String pass = signUpPass.getText();
            String name = signUpName.getText();
            Clerk nnew = new Clerk (name, idd, pass);
            stagee.show();
            stage.close();
        });
        
        b.setOnAction(e -> {
            primaryStage.show();
            stage.close();
        });
        //**************************
        
         ba.setOnAction(e -> {
            bstage.show();
            stageg.close();
        });
       
        
        
        //*********** handeling login
        
        log.setOnAction(e -> {
            String r = id.getText();
            String w = pw.getText();
            if (pc.HasAccount(r, w) == true) {
                lstage.show();
                stagee.close();
            } else {
                 stage5.show();
                stagee.close();
            }
        }
        );
        
        b5.setOnAction(e -> {
            
           stagee.show();
        });
        
        //*****************************************
        
        //add new station button
        addl.setOnAction(e -> {
            
            stage6.show();
            lstage.close();
        });
        
        //******************
        
        
        //handling booking botton
        book.setOnAction(e -> {
        
            try {
                File tFile = new File ("ticket.txt");
                Scanner tscan = new Scanner (tFile);
                
                while (tscan.hasNext()){
                    
                    String T = tscan.next();
                    to.getItems().add(T);
                    String f = tscan.next();
                    from.getItems().add(f);
                    String q = tscan.next();
                    int qq = Integer.parseInt(q);
                    String ppp = tscan.next();
                    double pp = Double.parseDouble(ppp);
                    
                    Ticket t = new Ticket(T, f, qq, pp);
                    pc.ticket.add(t);
                    
                    
                }
                
                bstage.show();
                lstage.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
    });
        
        
        
        //************** register new clerks
        entersign.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                String idd = signUpId.getText();
                String pass = signUpPass.getText();
                String name = signUpName.getText();
                int csh = 0;
                Clerk ccc = new Clerk(name, idd, pass,csh);
                pc.addClerk(ccc);
                
                //*******************
                File log;
                log = new File("clerk.txt");
                try{
                    if(log.exists()==false){
                        System.out.println("We had to make a new file.");
                        log.createNewFile();
                    }
                    PrintWriter out = new PrintWriter(new FileWriter(log, true));
                    
                    out.append(" "+name+" "+idd+" "+pass+" "+csh);
                    out.close();
                }catch(IOException f){
                    System.out.println("COULD NOT LOG!!");
                }
                
                //*************************
                
                stagee.show();
                stage.close();
            }            
        });
        
        
       
       
       
       //********handling prt button
       
        prtt.setOnAction(e -> {
            
            stageg.show();
            stagep.close();
        });
        
        cccc.setOnAction(e -> {
        
               bstage.show();
               stagep.close();
    });
        
       Cancel.setOnAction(e -> {
        
               lstage.show();
               bstage.close();
    });
        
        
    }
    
    
    
    
    
    
    
    
    
    public static void main (String [] args) throws Exception{
    
  
    // Clerks data
    File cFile = new File ("clerk.txt");
    Scanner scan = new Scanner (cFile);
    
    while (scan.hasNext()){
        
        String n = scan.next();
        String i = scan.next();
        
        String p = scan.next();
        String m = scan.next();
        int x = Integer.parseInt(m);
   
        Clerk coc = new Clerk(n, i, p, x);
        pc.clerks.add(coc);
    }
    

    // Tickets data
    
    
  /* File tFile = new File ("ticket.txt");
    Scanner tscan = new Scanner (tFile);
    
    while (tscan.hasNext()){
        
        String T = tscan.next();
        String f = tscan.next();
        String q = tscan.next();
        int qq = Integer.parseInt(q);
        String ppp = tscan.next();
        double pp = Double.parseDouble(ppp);
        
        Ticket t = new Ticket(T, f, qq, pp);
        pc.ticket.add(t);
        
        
    }*/
    
    
    launch(args);
    
    
}
}
