package com.example.mybeansdemo;

import org.springframework.beans.factory.annotation.Autowired;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CurrentAccountService implements BankAccountService {

  @Autowired
  private BankRepository repo;

  @Override
  public void deposit(Double amount) {
    log.info("Current Account - Added {}", amount);
    repo.saveTransaction(amount * 0.1);
  }

}
