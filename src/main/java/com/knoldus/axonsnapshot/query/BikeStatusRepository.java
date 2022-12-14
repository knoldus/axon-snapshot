package com.knoldus.axonsnapshot.query;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface BikeStatusRepository extends JpaRepository<BikeStatus, String> {
}
