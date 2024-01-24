package hr.vsite.java.chatserver.db;

import hr.vsite.java.chatserver.domain.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupRepository
        extends JpaRepository<Group, String>,
        GroupCustomRepository {

    List<Group> findAllByGroupNameContaining(String groupName);

}
