
package advancedprog;

import java.io.File;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.EventType;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
public class GUI extends Application {
    
    
    private Ticket getTchoice(ChoiceBox<Ticket> tchoice) {
        return tchoice.getValue();
    }
    
    @Override
    public void start (Stage primaryStage){
        
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
        GridPane grid5 = new GridPane();
        grid5.setHgap(10);
        grid5.setVgap(10);
        grid5.setPadding(new Insets(0, 10, 0, 10));
        grid5.add(label5, 1, 0);
        grid5.add(b5, 2, 1);
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
        
        Button cancel = new Button("Cancel Ticket");
        lpane.add(cancel,1,0);
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
        
        
        //=================================Add new ticket======================================
        
        
        Label bPrice = new Label("From");
        Label bName = new Label("To");
        Label bCode = new Label("Price");
        Label bQuantity = new Label("Quantity");
        TextField btf1 = new TextField();
        TextField btf2 = new TextField();
        TextField btf3 = new TextField();
        TextField btf5 = new TextField();
        Button bookk = new Button("Enter");
        GridPane grid6 = new GridPane();

        grid6.setHgap(10);
        grid6.setVgap(10);
        grid6.setPadding(new Insets(10, 10, 10, 10));
        grid6.add(bPrice, 0, 0);
        grid6.add(bName, 0, 1);
        grid6.add(bCode, 0, 2);
        grid6.add(bQuantity, 0, 3);
        grid6.add(btf1, 1, 0);
        grid6.add(btf2, 1, 1);
        grid6.add(btf3, 1, 2);
        grid6.add(btf5, 1, 3);
        grid6.add(bookk, 1, 4);
        Scene s6 = new Scene(grid6);
        Stage stage6 = new Stage();
        stage6.setScene(s6);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //==============================EVENTS HANDELING===============================
        
        //******handling home window
        up.setOnAction(e -> {
            stage.show();
            primaryStage.close();
        });
        b.setOnAction(e -> {
            primaryStage.show();
            stage.close();
        });
        //********************
        
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
        
       //     stage8.show();
            lstage.close();
    });
        
        
    }
    
    
   
    
    
    
 

}


*/