package com.yiguan.escan.repository.contract;

import com.yiguan.escan.domin.contract.GatheringContractHis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GatheringContractHisRepository extends JpaRepository<GatheringContractHis,Integer> {
}
