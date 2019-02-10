package xyz.huizhe.lotterydraw.service.impl; 

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.huizhe.lotterydraw.service.ActivityService;
import xyz.huizhe.lotterydraw.service.ParticipantService;
import xyz.huizhe.lotterydraw.vo.Participant;

/** 
* ParticipantServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 10, 2019</pre> 
* @version 1.0 
*/
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ParticipantServiceImplTest { 

    @Autowired
    private ParticipantService service;
    @Autowired
    private ActivityService activityService;

    private Participant participant;

    private Integer activityId;

    private Integer participantId;
    @Before
    public void before() throws Exception {
        activityId = activityService.getTheLast();
        participantId = service.getTheLast();
        participant = new Participant();
        participant.setActivityId(activityId);
        participant.setAvatarUrl("123123");
        participant.setNickname("huizhe");
        participant.setPhone("123123123");
        participant.setType("韶关学院");
        participant.setUsername("huizhe");
    }
    
    @After
    public void after() throws Exception { 
    } 
    
        /** 
    * 
    * Method: findOneById(int id) 
    * 
    */ 
    @Test
    public void testFindOneById() throws Exception {
        Assert.assertEquals(200, service.findOneById(participantId).getStatus());
    } 
    
        /** 
    * 
    * Method: addInfo(Participant info) 
    * 
    */ 
    @Test
    public void testAddInfo() throws Exception {
        Assert.assertEquals(200, service.addInfo(participant).getStatus());
    } 
    
        /** 
    * 
    * Method: updateInfo(Participant info) 
    * 
    */ 
    @Test
    public void testUpdateInfo() throws Exception {
        participant.setParticipantsId(participantId);
        Assert.assertEquals(200, service.updateInfo(participant).getStatus());
    } 
    
        /** 
    * 
    * Method: deleteById(int id) 
    * 
    */ 
    @Test
    public void testZDeleteById() throws Exception {
        Assert.assertEquals(200, service.deleteById(participantId).getStatus());
    } 
    
        /** 
    * 
    * Method: getTheLast() 
    * 
    */ 
    @Test
    public void testGetTheLast() throws Exception {
        System.out.println(service.getTheLast());
    } 
    
        /** 
    * 
    * Method: getAll(int pageNum, int pageSize) 
    * 
    */ 
    @Test
    public void testGetAll() throws Exception {
        System.out.println(service.getAll(1, 10));
    } 
    
        /** 
    * 
    * Method: getAllByActivityId(int activityId, int pageNum, int pageSize) 
    * 
    */ 
    @Test
    public void testGetAllByActivityId() throws Exception {
        System.out.println(service.getAllByActivityId(activityId, 1, 10));
    } 
    
        
    } 
