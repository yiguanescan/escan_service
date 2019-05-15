package com.yiguan.escan.repository.contract;

import com.yiguan.escan.domin.contract.GatheringContractPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GatheringContractPaymentRepository extends JpaRepository<GatheringContractPayment,Integer> {
}
