package com.openforum.qun.Repository;

import com.openforum.qun.Models.UpvotesId;
import com.openforum.qun.Models.Upvotes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpvotesJpaRepository extends JpaRepository<Upvotes, UpvotesId> {
}
