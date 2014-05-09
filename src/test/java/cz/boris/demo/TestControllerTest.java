package cz.boris.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Boris on 23.4.2014.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = Application.class)
public class TestControllerTest {

    @Autowired
    WebApplicationContext ctx;

    MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
    }

    @Test
    public void simpleTest() throws Exception {
        mockMvc.perform(get("/test")).andExpect(status().isOk()).andExpect(content().contentType("application/json;charset=UTF-8"));
    }

    @Test
    public void contentTest() throws Exception {
        mockMvc.perform(get("/test")).andExpect(status().isOk()).andExpect(content().string(containsString("Apple Mac Book")));
    }

    @Test
    public void usersTest() throws Exception {
        mockMvc.perform(get("/users")).andExpect(status().isOk()).andExpect(content().contentType("application/json;charset=UTF-8"));
    }
}
