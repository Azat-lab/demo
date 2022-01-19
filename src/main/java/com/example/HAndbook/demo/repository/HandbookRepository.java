package com.example.HAndbook.demo.repository;



import com.example.HAndbook.demo.entity.Handbook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface HandbookRepository extends JpaRepository<Handbook, Integer> {
   // @Query(value = "SELECT * FROM Handbook WHERE person_id=?1 AND person_name=?2 AND person_surname=?3 " +
            //"AND phone_number=?4", nativeQuery = true)

    Handbook findByPersonIdAAndPersonNameAndPersonSurnameAndPhoneNumber(int personId, String personName,
                                                                        String personSurname, int phoneNumber);
    Handbook findByPersonId(int personId);
}
