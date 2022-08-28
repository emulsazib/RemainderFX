package com.example.remainderfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import static java.lang.Integer.parseInt;

public class HelloController implements Initializable {

    @FXML
    private ChoiceBox remainderNumber;

    @FXML
    private TextField remainderName;

    @FXML
    private TextField remainderDetails;

    @FXML
    private TextField remainderHoure;
    @FXML
    private TextField remainderMinute;
    @FXML
    private TextField remainderSecond;

    @FXML
    private DatePicker remainderDate;

    @FXML
    private Button submitBtn;
    @FXML
    private Button resetBtn;

    @FXML
    private Label localTimeDate;

    @FXML
    private Label remainderOne;

    @FXML
    private Label remainderTwo;

    @FXML
    private Label remainderThree;

    @FXML
    private Label remainderFour;

    @FXML
    private Label remainderFive;

    private Integer[] remainderNumbers={1,2,3,4,5};





    @FXML
    void submitBtn(ActionEvent event) {
        int number= (int) remainderNumber.getValue();
        int houreInMiliSecond=Integer.parseInt(remainderHoure.getText())*3600000;
        int minuteInMiliSecond=Integer.parseInt(remainderMinute.getText())*60000;
        int secondInMiliSecond=Integer.parseInt(remainderSecond.getText())*1000;
        String date=String.valueOf(remainderDate);
        if(number==1){
            remainderOne.setText(remainderName.getText()+" | "+remainderDetails.getText()+" | "+remainderDate.getValue()+" | "+remainderHoure.getText()+":"+remainderMinute.getText()+":"+remainderSecond.getText());
            Remainder remainder =new Remainder(houreInMiliSecond,minuteInMiliSecond,secondInMiliSecond,date);
            remainder.start();
            remainder.cheackRemainder(houreInMiliSecond,minuteInMiliSecond,secondInMiliSecond,date);
        } else if (number==2) {
            remainderTwo.setText(remainderName.getText()+" | "+remainderDetails.getText()+" | "+remainderDate.getValue()+" | "+remainderHoure.getText()+":"+remainderMinute.getText()+":"+remainderSecond.getText());
            Remainder remainder =new Remainder(houreInMiliSecond,minuteInMiliSecond,secondInMiliSecond,date);
            remainder.start();
            remainder.cheackRemainder(houreInMiliSecond,minuteInMiliSecond,secondInMiliSecond,date);
        }else if (number==3) {
            remainderThree.setText(remainderName.getText()+" | "+remainderDetails.getText()+" | "+remainderDate.getValue()+" | "+remainderHoure.getText()+":"+remainderMinute.getText()+":"+remainderSecond.getText());
            Remainder remainder =new Remainder(houreInMiliSecond,minuteInMiliSecond,secondInMiliSecond,date);
            remainder.start();
            remainder.cheackRemainder(houreInMiliSecond,minuteInMiliSecond,secondInMiliSecond,date);
        }else if (number==4) {
            remainderFour.setText(remainderName.getText()+" | "+remainderDetails.getText()+" | "+remainderDate.getValue()+" | "+remainderHoure.getText()+":"+remainderMinute.getText()+":"+remainderSecond.getText());
            Remainder remainder =new Remainder(houreInMiliSecond,minuteInMiliSecond,secondInMiliSecond,date);
            remainder.start();
            remainder.cheackRemainder(houreInMiliSecond,minuteInMiliSecond,secondInMiliSecond,date);
        }else if (number==2) {
            remainderFive.setText(remainderName.getText()+" | "+remainderDetails.getText()+" | "+remainderDate.getValue()+" | "+remainderHoure.getText()+":"+remainderMinute.getText()+":"+remainderSecond.getText());
            Remainder remainder =new Remainder(houreInMiliSecond,minuteInMiliSecond,secondInMiliSecond,date);
            remainder.start();
            remainder.cheackRemainder(houreInMiliSecond,minuteInMiliSecond,secondInMiliSecond,date);
        }else {
            System.out.println("Complete the fild first");
        }

    }
    @FXML
    void resetBtn(ActionEvent event){

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        remainderNumber.getItems().addAll(remainderNumbers);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMM dd,yyyy - HH:mm:ss");
        java.time.LocalDateTime localDateTime= java.time.LocalDateTime.now();
        String time=dateTimeFormatter.format(localDateTime);
        localTimeDate.setText(time);


    }

}
