package hr.vsite.java.chatserver.rest;

import hr.vsite.java.chatserver.domain.Group;
import hr.vsite.java.chatserver.domain.GroupService;
import org.springframework.web.bind.annotation.*;

@RestController
public class GroupRestController {

    private final GroupService groupService;

    public GroupRestController(GroupService groupService) {
        this.groupService = groupService;
    }

    @PostMapping("/groups")
    public void createGroup(@RequestBody GroupDTO groupDTO) {
        Group group = new Group();
        group.setGroupName(groupDTO.getGroupName());
        groupService.createGroup(group);
    }

    @GetMapping("/groups/{groupName}")
    public GroupDTO getGroup(@PathVariable String groupName) {
        Group group = groupService.getGroup(groupName);
        if (group == null) {
            return null;
        }
        return new GroupDTO(group.getGroupName());
    }
}
