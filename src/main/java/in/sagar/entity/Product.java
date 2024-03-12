package in.sagar.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Product {
	@Id
	@GeneratedValue
	private Integer pid;
	@NotBlank(message = "Name is mandatory")
	@Size(min=3,max=16,message = "name should be between 3 to 15")
	private String name;
	@NotNull(message = "Price is mandatory")
	@Positive(message = "price should be in positive number")
	private Double price;
	@NotNull(message = "quantity is mandatory")
	@Positive(message = "price should be in positive number")
	private Integer qty;
	

}
