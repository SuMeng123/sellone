package com.imooc.sellone.repository;

import com.imooc.sellone.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {
    SellerInfo findByOpenid(String openid);
}
