package com.HospitalManagement.Service;

import com.HospitalManagement.Payload.BillingDto;

import java.util.List;

public interface BillingService {
    List<BillingDto> getAllBillings();
    BillingDto getBillingById(Long id);
    BillingDto createBilling(BillingDto billingDto);
    BillingDto updateBilling(Long id, BillingDto billingDto);
    void deleteBilling(Long id);
}

