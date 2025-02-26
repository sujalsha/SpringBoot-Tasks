package com.contactapp.OCMS.Repository;

import com.contactapp.OCMS.Models.Users;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<Users, Long> {

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM userdb.users WHERE email = ?1",nativeQuery = true)
    public void deleteUser(String email);

    @Modifying
    @Transactional
    @Query(value = "UPDATE userdb.users SET name = ?2, email = ?3 WHERE phone_number = ?1", nativeQuery = true)
    void updateUser(String phoneNumber, String name, String email);

}
