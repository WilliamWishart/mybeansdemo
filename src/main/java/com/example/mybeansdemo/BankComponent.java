package com.example.mybeansdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class BankComponent {

  @Autowired
  private List<BankAccountService> services;

  public void deposit(Double amount, String serviceName) {
    log.info("deposit {} {} ", amount, serviceName);
    for (BankAccountService service : services) {
      if (service instanceof SavingsAccountService && serviceName.equals("savings")) {
        SavingsAccountService sa = (SavingsAccountService) service;
        sa.deposit(amount);
        break;

      } else if (service instanceof CurrentAccountService && serviceName.equals("Current")) {
        CurrentAccountService sa = (CurrentAccountService) service;
        sa.deposit(amount);
        break;

      }
    }
  }
}
