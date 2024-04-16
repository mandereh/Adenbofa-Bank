package com.adenbofa.adenbofabank.service.impl;

import com.adenbofa.adenbofabank.dto.EmailDetails;

public interface EmailService {
    void sendMailAlert(EmailDetails emailDetails);
    void sendEmailWithAttachment(EmailDetails emailDetails);
}
