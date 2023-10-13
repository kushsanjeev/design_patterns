package org.example.practice.tic_tac_toe.models;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class PlayingBoard {
    int size;
    PlayingPiece[][] board;

    public PlayingBoard(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public PlayingPiece[][] getBoard() {
        return board;
    }

    public void setBoard(PlayingPiece[][] board) {
        this.board = board;
    }

    public boolean addPlyingPiece(PlayingPiece playingPiece, int row, int col){
        if(board[row][col] != null){
            return false;
        }
        board[row][col] = playingPiece;
        return true;
    }

    public List<Pair<Integer, Integer>> getFreeCells(){
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();

        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                if(board[i][j] == null){
                    Pair<Integer, Integer> rowColumn = new Pair<>(i, j);
                    freeCells.add(rowColumn);
                }
            }
        }
        return freeCells;
    }

    public void printBoard(){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(board[i][j] != null){
                    System.out.print(board[i][j].getPiece().name() + "    ");
                }
                else {
                    System.out.print("    ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
