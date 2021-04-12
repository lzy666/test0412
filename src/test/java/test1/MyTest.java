package test1;

/*import cn.appsys.dao.appcategory.AppCategoryMapper;
import cn.appsys.pojo.AppCategory;*/
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    public void init(){
        applicationContext=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }

    @Test
    public void test1(){

       /* AppCategoryMapper categoryMapper = applicationContext.getBean(AppCategoryMapper.class);

        AppCategory category = categoryMapper.selectByPrimaryKey(1L);

        System.out.println("category = " + category);*/

    }




}
