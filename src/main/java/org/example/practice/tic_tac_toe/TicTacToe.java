package org.example.practice.tic_tac_toe;

import javafx.util.Pair;
import org.example.practice.tic_tac_toe.models.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    Deque<Player> players;
    PlayingBoard board;

    public void initializeGame(){
        players = new LinkedList<>();

        PlayingPieceX playingPieceX = new PlayingPieceX(PieceType.X);
        Player player1 = new Player(playingPieceX, "player1");

        PlayingPieceO playingPieceO = new PlayingPieceO(PieceType.O);
        Player player2 = new Player(playingPieceO, "player2");

        players.add(player1);
        players.add(player2);

        board = new PlayingBoard(3);
    }

    public String startGame(){
        boolean noWinner = true;
        while (noWinner){

//          take out the player whose turn and also put the player in list back
            Player playerTurn = players.removeFirst();

//          get free cells from the board
            board.printBoard();
            List<Pair<Integer, Integer>> freeCells = board.getFreeCells();
            if(freeCells.isEmpty()){
                noWinner = false;
                continue;
            }

//          take player input
            System.out.print("Player:" + playerTurn.getName() + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

//          add piece
            boolean pieceAddedSuccessfully = board.addPlyingPiece(playerTurn.getPlayingPiece(), inputRow, inputColumn);
            if(!pieceAddedSuccessfully){
//              player can not insert the piece into this cell, player has to choose another cell
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.getPlayingPiece().getPiece());
            if(winner){
                board.printBoard();
                System.out.println(playerTurn.getName() + " is winner");
                return playerTurn.getName();
            }
        }
        return "tie";
    }

    public boolean isThereWinner(int row, int column, PieceType pieceType){
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagonalMatch = true;
        boolean crossDiagonalMatch = true;

//      row match
        for(int i=0; i<board.getSize(); i++){
            if(board.getBoard()[row][i] == null || board.getBoard()[row][i].getPiece() != pieceType){
                rowMatch = false;
            }
        }

//        for column match
        for(int j=0; j<board.getSize(); j++){
            if(board.getBoard()[j][column] == null || board.getBoard()[j][column].getPiece() != pieceType){
                colMatch = false;
            }
        }

//        for diagonal match
        for(int i=0, j=0; i<board.getSize(); i++, j++){
            if(board.getBoard()[i][j] == null || board.getBoard()[i][j].getPiece() != pieceType){
                diagonalMatch = false;
            }
        }

//        for cross diagonal match
        for(int i=0, j=board.getSize()-1; i<board.getSize(); i++, j--){
            if(board.getBoard()[i][j] == null || board.getBoard()[i][j].getPiece() != pieceType){
                crossDiagonalMatch = false;
            }
        }

        return rowMatch || colMatch || diagonalMatch || crossDiagonalMatch;
    }

}
