package hr.vsite.java.chatserver.db;

import hr.vsite.java.chatserver.domain.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, String> {
}
