package org.example.practice.tic_tac_toe.models;

public class PlayingPiece {

    PieceType piece;

    PlayingPiece(PieceType pieceType){
        piece = pieceType;
    }

    public PieceType getPiece() {
        return piece;
    }

}
