package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    private static String name;

    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("What is your name!");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Hello, " + name);
        System.out.println("Are you alive?");
        int life = 9;

        while (life > 0) {
            if (!Answer()) {
                life--;
                if (life == 0) {
                    System.out.println("The End");
                    return;
                } else
                    System.out.println("You died! Try again (" + life + ")");
            }

            System.out.println("Do you wanna eat?");
            if (Answer()) {
                IWonnaEat();
            }

            System.out.println("Do you need go to restroom?");
            if (Answer()) {
                INeedWC();
            }

            System.out.println("Are people here?");
            if (Answer()) {
                GoToPeople();
            } else {
                System.out.println("It is time to have a fun!");
            }


            System.out.println("It is time to go to sleep");
            System.out.println("Wake up");
            System.out.println("Are you alive?");


        }
    }

    public static boolean Answer(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
            String answer = scanner.nextLine();
            if (answer.equals("no")) {
                return false;
            }
            if (answer.equals("yes")) {
                return true;
            } else {
                System.out.println("Give me exactly answer,please, yes or no?");
            }
        }
    }


    public static void IWonnaEat(){
        System.out.println("Is there food in your plate?");
        if (Answer()){
            System.out.println("Are you sure you can eat it?");
            if (Answer()) {
                System.out.println("Bon appetit");
                return;
            }
            System.out.println("So...If you wanna eat to much...try it");
        }
        System.out.println("Check the table. Did you find something?");
        if (Answer()){
            System.out.println("Are you sure you can eat it?");
            if (Answer()) {
                System.out.println("Bon appetit");
            }
            else {
                System.out.println("So...If you wanna eat to much...try it");
                return;
            }
        }
        else {
            System.out.println("So...If you wanna eat to much...try it");
            return;
        }
        Random rnd = new Random();
        if (rnd.nextInt(2) == 1) {
            System.out.println("Congratulations! You are full.");
        }
        else {
            System.out.println("Someone saw you on the table");
            System.out.println("Do not cry =), you deserve it");
        }
    }

    public static void INeedWC(){
        System.out.println("You are tired to much to go to bathroom");
        if (!Answer()){
            System.out.println("May be You will use flowers?");
            if (Answer()){
                System.out.println("Congratulations!");
                return;
            }
        }
        System.out.println("Go to bathroom. \nIs toilet full ?");
        if(!Answer()){
            System.out.println("Congratulations!");
            return;
        }
        System.out.println("In this case-carpet is good idea!");
        Random rnd = new Random();
        if (rnd.nextInt(2) == 1) {
            System.out.println("I think nobody saw it. Do not care.");
        }
        else {
            System.out.println("Somebody saw that you did");
            System.out.println("It is hurt but you deserve it");
        }
    }

    public static void GoToPeople(){
        System.out.println("Do People like you");
        if (Answer()){
            System.out.println("Smile");
        }
        else {
            System.out.println("Try to be a little bit more friendly");
        }
        System.out.println("Did they like it?");
        if (Answer()) {
            System.out.println("Wait the reaction");
        }
        else {
            System.out.println("Go away, " + name);
            return;
        }
        System.out.println("Are they giving to you their love?");
        if (!Answer()){
            System.out.println("Go away, " + name);
        }
        else{
            System.out.println("Enjoy it!");
        }
    }


}
