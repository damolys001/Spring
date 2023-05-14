package model;

import lombok.Data;


public @Data class CardModel {

    private String solId; 
    private String cardPan;
    private String accountName;
    private String requestDate;
    private String cardId;
    private String userId;
    private String printedBy;
    private String printedDate;
    private String status;
}
