package com.sumit.entities;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KeyModel implements Serializable {

    private String messageType;
    //    private String tokenId;
    //private String message;
    //private String contractName;
    private String contractCode;

    private String tmId;
    //private String tradingAcc;

    private String dealerId;
    //private String url;
//    public String marketCode;
//    private String auctionOrdNo;
    private Timestamp receivedDate;

//    private String htmlMessage;

   // private String msgUrl;
}
