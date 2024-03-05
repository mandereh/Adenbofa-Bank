package com.adenbofa.adenbofabank.service.impl;

import com.adenbofa.adenbofabank.dto.BankResponse;
import com.adenbofa.adenbofabank.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
}
