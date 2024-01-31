package hr.vsite.java.chatserver.domain;

import hr.vsite.java.chatserver.db.GroupRepository;
import hr.vsite.java.chatserver.exception.GroupValidationException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class GroupService {

    private final GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public void createGroup(Group group) {
        if (!StringUtils.hasText(group.getGroupName())) {
            throw new GroupValidationException("Group name must be provided");
        }
        groupRepository.save(group);
    }

    public Group getGroup(String groupName) {
        return groupRepository.findById(groupName).orElse(null);
    }

    public void deleteGroup(String groupName) {
        groupRepository.deleteById(groupName);
    }

    public List<Group> searchGroups(String groupName){
        if (StringUtils.hasText(groupName)) {
//            return groupRepository.findAllByGroupNameContaining(groupName);
            return groupRepository.searchGroups(groupName);
        } else {
            return groupRepository.findAll();
        }
    }
}
