import com.mybatis.mapper.RoleMapper;
import com.mybatis.model.Role;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoleTest {
    private static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void init() {
        try {
            Reader reader = Resources.getResourceAsReader("Mybatis.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public  void selectRole(){//根据id查询角色信息
        SqlSession session = null;
        try {
            //获取sesession会话对象
            session = sqlSessionFactory.openSession();
            //获取mapper对象
            RoleMapper roleMapper = session.getMapper(RoleMapper.class);
            Role role = roleMapper.findRoleById(1);//获取用户信息对象
            System.out.println(role.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Test
    public  void insertRole(){//插入
        SqlSession sqlSession = null;
        try {
            //获取sesession会话对象
            sqlSession = sqlSessionFactory.openSession();
            //mapper对象
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = new Role();
//            role.setId(1);
            role.setRoleName("普通管理员");
            role.setNote("可以操作部分的功能");
            int num = roleMapper.insertRole(role);//插入
            sqlSession.commit();//提交事务
            System.out.println("插入的数据个数："+num);
            //获取mapper对象
        }catch (Exception e){
            e.printStackTrace();
            if (sqlSession != null){
                sqlSession.rollback();//回滚事务
            }
        }finally {//关闭链接
            if (sqlSession != null){
                sqlSession.close();
            }
        }
    }

    @Test
    public  void updateRole(){//更新
        SqlSession sqlSession = null;
        try {
            //获取sesession会话对象
            sqlSession = sqlSessionFactory.openSession();
            //mapper对象
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.findRoleById(1);
            System.out.println(role.toString());
            if (role != null){
                role.setRoleName("超级管理员");
                int num = roleMapper.updateRole(role);
                sqlSession.commit();//提交事务
                System.out.println("更新的数据个数："+num);
            }
            //获取mapper对象
        }catch (Exception e){
            e.printStackTrace();
            if (sqlSession != null){
                sqlSession.rollback();//回滚事务
            }
        }finally {//关闭链接
            if (sqlSession != null){
                sqlSession.close();
            }
        }
    }

    @Test
    public  void deleteRole(){//删除
        SqlSession sqlSession = null;
        try {
            //获取sesession会话对象
            sqlSession = sqlSessionFactory.openSession();
            //mapper对象
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            int num = roleMapper.deleteRole(1);
            sqlSession.commit();//提交事务
            //获取mapper对象
            System.out.println("删除的数据个数："+num);
        }catch (Exception e){
            e.printStackTrace();
            if (sqlSession != null){
                sqlSession.rollback();//回滚事务
            }
        }finally {//关闭链接
            if (sqlSession != null){
                sqlSession.close();
            }
        }
    }

    @Test
    public  void findRolesByMap(){//根据角色名称进行模糊查询角色信息
        SqlSession session = null;
        try {
            //获取sesession会话对象
            session = sqlSessionFactory.openSession();
            //获取mapper对象
            RoleMapper roleMapper = session.getMapper(RoleMapper.class);
            Map<String, Object> parameterMap = new HashMap<String, Object>();
           parameterMap.put("roleName", "管理员");
           List<Role> roleList =  roleMapper.findRolesByMap(parameterMap);
           for (int i = 0; i < roleList.size(); i++){
               Role role = roleList.get(i);
               System.out.println(role.toString());
           }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

}
