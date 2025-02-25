package com.gymmembership.gymmembership.Repository;

import com.gymmembership.gymmembership.Models.GymMembers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GymMembersRepository extends JpaRepository<GymMembers, Long> {
}
