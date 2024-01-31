package hr.vsite.java.chatserver.rest;

import hr.vsite.java.chatserver.domain.Group;
import hr.vsite.java.chatserver.domain.GroupService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class GroupRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private GroupService groupService;

//    @MockBean
//    private GroupService service;

    @Test
    void getGroup() throws Exception {
        Group group = new Group();
        group.setGroupName("test");
        groupService.createGroup(group);
//        Mockito.when(service.getGroup("test"))
//        Mockito.when(service.getGroup(Mockito.anyString())) //svejedno koji string
//                .thenThrow(new NullPointerException("test"));
//                        .thenReturn(group);
        mockMvc
                .perform(MockMvcRequestBuilders.get("/groups/test")
                        .contentType("application/json")
                ).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(
                        MockMvcResultMatchers.jsonPath("$.groupName")
                                .value("test"));

    }
}