package com.infy.springbootrestapicrud.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
//@ToString
//@Setter
//@Getter
//@EqualsAndHashCode
@Entity
public class Product {
	@Id
	private Integer productId;
	private String productName;
	private String productBrand;
	private String productPrice;

}
