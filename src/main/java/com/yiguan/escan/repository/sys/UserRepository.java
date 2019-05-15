package com.yiguan.escan.repository.sys;

import com.yiguan.escan.domin.sys.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    User findByLoginName(String loginNme);

}
