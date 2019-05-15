package com.yiguan.escan.repository.contract;

import com.yiguan.escan.domin.contract.GatheringContractInvoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GatheringContractInvoiceRepository extends JpaRepository<GatheringContractInvoice,Integer> {
}
