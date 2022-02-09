package com.zee.zee5app.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.zee.zee5app.utils.CustomListSerializer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "login")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
//property = "userName")

public class Login implements Comparable<Login>{
	
	@Id
	@Column(name = "username")
	private String userName;
    @NotBlank
	private String password;

	@Override
	public int compareTo(Login o) {
		// TODO Auto-generated method stub
		return this.userName.compareTo(o.getUserName());
	}
	
	@OneToOne
    //@OneToOne(fetch=FetchType.LAZY)
  //  @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
  //  @JsonSerialize(using = CustomListSerialUser.class)
    @JoinColumn(name = "regId")
    @JsonProperty(access=Access.WRITE_ONLY)
	private Register register;

}