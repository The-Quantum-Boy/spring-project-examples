package com.sumit.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "fo_messages")
@Data
@IdClass(KeyModel.class)
public class MessageModel {


	@Id
    @Column(name = "msg_message_type")
    private String messageType;


    @Column(name = "msg_message")
    private String message;

    @Id
    @Column(name = "msg_contract_code")
    private String contractCode;

	@Id
    @Column(name = "msg_tm_id")
    private String tmId;


    @Column(name = "msg_trd_acc_no")
    private String tradingAcc;

	@Id
    @Column(name = "msg_dealer_id")
    private String dealerId;

	@Id
    @Column(name = "msg_received_dt")
    private Timestamp receivedDate;

    @Column(name = "msg_url")
    private String msgUrl;

	@Transient
	private String tokenId;

	@Transient
	public String marketCode;

	@Transient
	private String auctionOrdNo;

	@Transient
	private String htmlMessage;

	@Transient
	private String shortMessage;
}
