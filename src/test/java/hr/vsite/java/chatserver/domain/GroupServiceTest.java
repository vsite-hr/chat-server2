package hr.vsite.java.chatserver.domain;

import hr.vsite.java.chatserver.exception.GroupValidationException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GroupServiceTest {

    @Autowired
    private GroupService groupService;

    @Test
    void createGroup() {
        Group group = new Group();
        group.setGroupName("test");
        groupService.createGroup(group);

        Group group2 = groupService.getGroup("test");
        assertNotNull(group2);
        Assertions.assertThat(group2).isNotNull();

        assertEquals("test", group2.getGroupName());

        Assertions.assertThat(group2)
                .usingRecursiveComparison()
                .isEqualTo(group);
    }

    @Test
    void createGroupNameIsNull() {
        Group group = new Group();
        org.junit.jupiter.api.Assertions.
                assertThrows(GroupValidationException.class,
                        () -> groupService.createGroup(group));
        Assertions
                .assertThatExceptionOfType(GroupValidationException.class)
                        .isThrownBy(() -> groupService.createGroup(group));
    }

    @Test
    void createGroupAndGroupIsNull() {
        Assertions
                .assertThatExceptionOfType(NullPointerException.class)
                .isThrownBy(() -> groupService.createGroup(null));
    }
}