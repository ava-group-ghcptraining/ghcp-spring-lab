package main.java.com.avanade.ghcopilottrainingspringboot.repositories;

import com.avanade.ghcopilottrainingspringboot.models.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMeetingRepository extends JpaRepository<Meeting, Long> {
}
