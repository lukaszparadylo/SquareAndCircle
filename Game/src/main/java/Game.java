import com.sun.javafx.geom.Rectangle;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.geometry.Pos;

public class Game {

    @FXML
    Button f1, f2, f3, f4, f5, f6, f7, f8, f9;
    @FXML
    Label label;
    int numberOfMoves = 0;
    char[][] moves = new char[3][3];

    public void restartParameters() throws InterruptedException {
        f1.setText(" ");
        f2.setText(" ");
        f3.setText(" ");
        f4.setText(" ");
        f5.setText(" ");
        f6.setText(" ");
        f7.setText(" ");
        f8.setText(" ");
        f9.setText(" ");
        numberOfMoves = 0;
        for (int i = 0; i<moves.length; i++){
            for (int j = 0; j<moves.length; j++){
                moves[i][j] = ' ';
            }
        }
    }

    public char areYouWon() throws InterruptedException {
        numberOfMoves++;
        char won = '?';
        if(numberOfMoves>9){
            restartParameters();
        }

        if((moves[0][0]=='X')&&(moves[0][1]=='X')&&(moves[0][2]=='X')) won = 'X';
        else if((moves[1][0]=='X')&&(moves[1][1]=='X')&&(moves[1][2]=='X')) won = 'X';
        else if((moves[2][0]=='X')&&(moves[2][1]=='X')&&(moves[2][2]=='X')) won = 'X';
        else if((moves[0][0]=='X')&&(moves[1][0]=='X')&&(moves[2][0]=='X')) won = 'X';
        else if((moves[0][1]=='X')&&(moves[1][1]=='X')&&(moves[2][1]=='X')) won = 'X';
        else if((moves[0][2]=='X')&&(moves[1][2]=='X')&&(moves[2][2]=='X')) won = 'X';
        else if((moves[0][0]=='X')&&(moves[1][1]=='X')&&(moves[2][2]=='X')) won = 'X';
        else if((moves[0][2]=='X')&&(moves[1][1]=='X')&&(moves[2][0]=='X')) won = 'X';
        else if((moves[0][0]=='O')&&(moves[0][1]=='O')&&(moves[0][2]=='O')) won = 'O';
        else if((moves[1][0]=='O')&&(moves[1][1]=='O')&&(moves[1][2]=='O')) won = 'O';
        else if((moves[2][0]=='O')&&(moves[2][1]=='O')&&(moves[2][2]=='O')) won = 'O';
        else if((moves[0][0]=='O')&&(moves[1][0]=='O')&&(moves[2][0]=='O')) won = 'O';
        else if((moves[0][1]=='O')&&(moves[1][1]=='O')&&(moves[2][1]=='O')) won = 'O';
        else if((moves[0][2]=='O')&&(moves[1][2]=='O')&&(moves[2][2]=='O')) won = 'O';
        else if((moves[0][0]=='O')&&(moves[1][1]=='O')&&(moves[2][2]=='O')) won = 'O';
        else if((moves[0][2]=='O')&&(moves[1][1]=='O')&&(moves[2][0]=='O')) won = 'O';


        if (won == 'X' || won == 'O'){
            label.setText("Won: "+won);
            Stage window = new Stage();

            window.initModality(Modality.APPLICATION_MODAL);
            window.setTitle("title");
            window.setMaxWidth(250);

            Label label = new Label();
            label.setText("Won: "+won+" \nWould you play again ?");
            Button startAgainButton = new Button("Start");
            startAgainButton.setOnAction(e -> window.close());
            VBox layout = new VBox(10);
            layout.getChildren().addAll(label, startAgainButton);
            layout.setAlignment(Pos.CENTER);

            Scene scene = new Scene(layout);
            window.setScene(scene);
            window.showAndWait();
            restartParameters();
        }
        return won;
    }

    public void field1(ActionEvent event) throws InterruptedException {
        if(numberOfMoves%2==0){
            f1.setText("O");
            moves[0][0] = 'O';
        }else{
            f1.setText("X");
            moves[0][0] = 'X';
        }
        System.out.println(areYouWon());
    }
    public void field2(ActionEvent event) throws InterruptedException {
        if(numberOfMoves%2==0){
            f2.setText("O");
            moves[0][1] = 'O';
        }else{
            f2.setText("X");
            moves[0][1] = 'X';
        }
        System.out.println(areYouWon());
    }
    public void field3(ActionEvent event) throws InterruptedException {
        if(numberOfMoves%2==0){
            f3.setText("O");
            moves[0][2] = 'O';
        }else{
            f3.setText("X");
            moves[0][2] = 'X';
        }
        System.out.println(areYouWon());
    }
    public void field4(ActionEvent event) throws InterruptedException {
        if(numberOfMoves%2==0){
            f4.setText("O");
            moves[1][0] = 'O';
        }else{
            f4.setText("X");
            moves[1][0] = 'X';
        }
        System.out.println(areYouWon());
    }
    public void field5(ActionEvent event) throws InterruptedException {
        if(numberOfMoves%2==0){
            f5.setText("O");
            moves[1][1] = 'O';
        }else{
            f5.setText("X");
            moves[1][1] = 'X';
        }
        System.out.println(areYouWon());
    }
    public void field6(ActionEvent event) throws InterruptedException {
        if(numberOfMoves%2==0){
            f6.setText("O");
            moves[1][2] = 'O';
        }else{
            f6.setText("X");
            moves[1][2] = 'X';
        }
        System.out.println(areYouWon());
    }
    public void field7(ActionEvent event) throws InterruptedException {
        if(numberOfMoves%2==0){
            f7.setText("O");
            moves[2][0] = 'O';
        }else{
            f7.setText("X");
            moves[2][0] = 'X';
        }
        System.out.println(areYouWon());
    }
    public void field8(ActionEvent event) throws InterruptedException {
        if(numberOfMoves%2==0){
            f8.setText("O");
            moves[2][1] = 'O';
        }else{
            f8.setText("X");
            moves[2][1] = 'X';
        }
        System.out.println(areYouWon());
    }
    public void field9(ActionEvent event) throws InterruptedException {
        if(numberOfMoves%2==0){
            f9.setText("O");
            moves[2][2] = 'O';
        }else{
            f9.setText("X");
            moves[2][2] = 'X';
        }
        System.out.println(areYouWon());
    }
}
