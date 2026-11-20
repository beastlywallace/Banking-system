package com.banking.account_service.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAccountRequest {


    @NotBlank(message ="Account holder name is required")
    private String accountHolderName;

    @NotBlank(message ="Email is required")
    @Email(message = "invalid email format")
    private String email;

    @NotBlank(message ="phone is required")
    private String phone;

    @NotBlank(message ="Account type  is required")
    private String accountType;


    @NotNull(message = "Initial Deposit is required")
    @Positive(message = "Initial Deposit must be positive")
    private BigDecimal initialDeposit;



}
