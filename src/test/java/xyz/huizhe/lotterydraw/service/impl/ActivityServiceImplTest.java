package xyz.huizhe.lotterydraw.service.impl; 

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.huizhe.lotterydraw.service.ActivityService;
import xyz.huizhe.lotterydraw.vo.Activity;

import java.util.Date;

/** 
* ActivityServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 10, 2019</pre> 
* @version 1.0 
*/
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ActivityServiceImplTest { 

    @Autowired
    private ActivityService service;
    private Activity activity;
    private Integer id;

    @Before
    public void before() throws Exception {
        activity = new Activity();
        activity.setActivityName("活动");
        activity.setType((short)1);
        activity.setDrawAt(new Date());
        id = service.getTheLast();
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
        Assert.assertEquals(200, service.findOneById(id).getStatus());
    } 
    
        /** 
    * 
    * Method: addInfo(Activity info) 
    * 
    */ 
    @Test
    public void testAddInfo() throws Exception { 
        Assert.assertEquals(200, service.addInfo(activity).getStatus());
    } 
    
        /** 
    * 
    * Method: updateInfo(Activity info) 
    * 
    */ 
    @Test
    public void testUpdateInfo() throws Exception {
        activity.setActivityId(id);
        Assert.assertEquals(200, service.updateInfo(activity).getStatus());
    } 
    
        /** 
    * 
    * Method: deleteById(int id) 
    * 
    */ 
    @Test
    public void testZDeleteById() throws Exception {
        //Assert.assertEquals(200, service.deleteById(id).getStatus());
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
    
        
    } 
