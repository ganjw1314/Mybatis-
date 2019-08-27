import com.mybatis.mapper.EmployeeMapper;
import com.mybatis.mapper.EmployeeTaskMapper;
import com.mybatis.mapper.TaskMapper;
import com.mybatis.mapper.WorkCarkMapper;
import com.mybatis.model.TEmployee;
import com.mybatis.model.TEmployeeTask;
import com.mybatis.model.TTask;
import com.mybatis.model.TWorkCark;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

public class TaskTest {
    private static SqlSessionFactory sqlSessionException;

    @BeforeClass
    public static void init() {
        try {
            Reader reader = Resources.getResourceAsReader("Mybatis.xml");
            sqlSessionException = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void getTask(){
        SqlSession session = null;
        try {
            //获取sesession会话对象
            session = sqlSessionException.openSession();
            //获取mapper对象
            TaskMapper taskMapper = session.getMapper(TaskMapper.class);
            TTask task = taskMapper.getTask(19);
            System.out.println(task.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Test
    public void getWorkCarkByEmpId(){//根据雇员编号查询工作任务
        SqlSession session = null;
        try {
            //获取sesession会话对象
            session = sqlSessionException.openSession();
            //获取mapper对象
            // SELECT ID,EMP_ID AS empId,REAL_NAME as realName,DEPARTMENT,MOBILE,POSITION,NOTE FROM t_work_cark where emp_id = #{empId};
            WorkCarkMapper workCarkMapper = session.getMapper(WorkCarkMapper.class);
            TWorkCark task = workCarkMapper.getWorkCarkByEmpId(1);
            System.out.println(task.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Test
    public void getEmployeeTaskByEmpId(){
        SqlSession session = null;
        try {
            //获取sesession会话对象
            session = sqlSessionException.openSession();
            //获取mapper对象
            // SELECT ID,EMP_ID,TASK_NAME,TASK_ID,NOTE FROM T_TEMPLOYEE_TASK where emp_id = #{empId};
            EmployeeTaskMapper employeeTaskMapper = session.getMapper(EmployeeTaskMapper.class);
            TEmployeeTask employee = employeeTaskMapper.getEmployeeTaskByEmpId(1);
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
    public void getEmployee(){
        SqlSession session = null;
        try {
            //获取sesession会话对象
            session = sqlSessionException.openSession();
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
}
