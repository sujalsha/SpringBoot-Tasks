package com.financemanagement.PFMS.Repositories;

import com.financemanagement.PFMS.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Long> {
    @Query(value = "SELECT * FROM pfms_db.users WHERE user_name=?1 and password=?2;",nativeQuery = true)
    List<Users> userSignIn(String userName, String password);
}
