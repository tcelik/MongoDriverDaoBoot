package org.csystem.mongoboot.repository;

import org.csystem.mongoboot.model.WishInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWishInfoRepository extends MongoRepository<WishInfo, String> {

}
