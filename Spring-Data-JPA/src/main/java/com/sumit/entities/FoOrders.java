package com.sumit.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "fo_orders")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FoOrders {
	
	@Id
	@Column(name = "ord_internal_ord_no")
	private String intrOrdNo;
	
	@Column(name = "ord_exch_ord_no")
	private String exchOrdNo;
	
	@Column(name = "ord_market_type")
	private String marketType;

}
