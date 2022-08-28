package com.example.remainderfx;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.lang.Thread.sleep;

public class Remainder extends Thread {
    private int houre;
    private int minute;
    private int second;
    private String date;

    public Remainder(int houre, int minute, int second, String date) {
        this.houre = houre;
        this.minute = minute;
        this.second = second;
        this.date = date;
    }

    public int getHoure() {
        return houre;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String getDate() {
        return date;
    }
    public void cheackRemainder(int houre,int minute,int second,String date){

            LocalDateTime localDateTime=LocalDateTime.now();
            int localHoureinMiniSecond=localDateTime.getHour()*3600000;
            int localMinuteinMiliSecond=localDateTime.getMinute()*60000;
            int localSecondinMiliSecond=localDateTime.getSecond()*1000;
            String localDate=localDateTime.getMonthValue()+"/"+localDateTime.getDayOfMonth()+"/"+localDateTime.getYear();

            int houreDeference=houre-localHoureinMiniSecond;
            int minuteDeference=minute-localMinuteinMiliSecond;
            int secondDeference=second-localSecondinMiliSecond;

            if((houre>=localHoureinMiniSecond)||(minute>=localMinuteinMiliSecond)||(second>=localMinuteinMiliSecond)||localDate.equals(date)){
                try {
                    sleep(houreDeference+minuteDeference+secondDeference);
                    File file=new File("src/main/java/com/example/remainderfx/Alarm/alarm.mp3");
                    try{
                        AudioInputStream audioStream= AudioSystem.getAudioInputStream(file);
                        Clip clip=AudioSystem.getClip();
                        clip.open(audioStream);
                    }catch (Exception e){
                        System.out.println(e);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }else {
                System.out.println("This is not the time");
            }
        }



}
