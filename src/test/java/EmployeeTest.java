import com.mybatis.bo.TRole;
import com.mybatis.bo.TUser;
import com.mybatis.mapers.TRoleMapper;
import com.mybatis.mapers.TUserMapper;
import com.mybatis.mapper.EmployeeMapper;
import com.mybatis.model.TEmployee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.Date;
import java.util.UUID;

public class EmployeeTest {

    private static SqlSessionFactory sqlSessionFactory = null;//会话工程
    @BeforeClass
    public static void init(){//初始化，打开会话工厂
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("Mybatis.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getEmployee(){//根据雇员编号查询用户信息
        SqlSession session = null;
        try {
            //获取sesession会话对象
            session = sqlSessionFactory.openSession();
            //获取mapper对象
            // SELECT ID,EMP_ID,TASK_NAME,TASK_ID,NOTE FROM T_TEMPLOYEE_TASK where emp_id = #{empId};
            EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

            TEmployee employee = employeeMapper.getEmployeeById(1);
            System.out.println(employee.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Test
    public void getEmployee1(){//根据雇员编号查询用户信息
        SqlSession session = null;
        try {
            //获取sesession会话对象
            session = sqlSessionFactory.openSession();
            //获取mapper对象
            // SELECT ID,EMP_ID,TASK_NAME,TASK_ID,NOTE FROM T_TEMPLOYEE_TASK where emp_id = #{empId};
            EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

            TEmployee employee = employeeMapper.getEmployeeById1(1);
            System.out.println(employee.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Test
    public void insertRole(){//插入角色信息
        SqlSession sqlSession = null;//打开会话
        try{
            sqlSession = sqlSessionFactory.openSession();//打开会话
            TRoleMapper roleMapper = sqlSession.getMapper(TRoleMapper.class);
            TRole role = new TRole();
            role.setRoleId(UUID.randomUUID().toString());
            role.setRoleName("权限管理员");
            role.setNote("权限");
            roleMapper.insertRole(role);
            sqlSession.commit();//提交事务
        }catch (Exception e){
            e.printStackTrace();
            if (sqlSession == null){
                sqlSession.rollback();//回滚事务
            }
        }finally {//关闭会话
            if (sqlSession != null){
                sqlSession.close();
            }
        }
    }

    @Test
    public void insertUser(){//插入用户信息
        SqlSession sqlSession = null;//打开会话
        try{
            sqlSession = sqlSessionFactory.openSession();//打开会话
            TUserMapper userMapper = sqlSession.getMapper(TUserMapper.class);
            TUser user = new TUser();
            user.setUserId(UUID.randomUUID().toString());
            user.setBirthday(new Date());
            user.setEmail("2543312@qq.com");
            user.setMobile("14564654423");
            user.setRealName("电动车");
            user.setSex(1);
            user.setUserName("黄蛙萨");
            user.setNote("用户");
            userMapper.insertUser(user);//插入数据
            sqlSession.commit();//提交事务
        }catch (Exception e){
            e.printStackTrace();
            if (sqlSession == null){
                sqlSession.rollback();//回滚事务
            }
        }finally {//关闭会话
            if (sqlSession != null){
                sqlSession.close();
            }
        }
    }

    @Test
    public void getRoleUser(){// 测试角色和用户信息
        SqlSession sqlSession = null;
        try {
            //获取sesession会话对象
            sqlSession = sqlSessionFactory.openSession();
            //获取mapper对象
            TRoleMapper roleMapper = sqlSession.getMapper(TRoleMapper.class);
            TRole role = roleMapper.getRole("825f5a73-0e4f-4a1e-b0ec-5f9f837b6ed4");////根据角色编号查询角色信息
            System.out.println("该角色对应的用户信息："+role.getUserList());
            TUserMapper userMapper = sqlSession.getMapper(TUserMapper.class);
            TUser user = userMapper.getUser("469f0231-c9cc-4927-aded-a6c2ea13cb0d");////根据用户编号查询用户信息
            System.out.println("用户信息："+user.toString());
            System.out.println("该用户拥有的权限信息："+ user.getRoleList());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

}
