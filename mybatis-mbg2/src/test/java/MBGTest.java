import com.gy.mybatis.mapper.EmpMapper;
import com.gy.mybatis.pojo.Emp;
import com.gy.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author Guyue
 * @date 2023/8/1 16:30
 */
public class MBGTest {

    @Test
    public void testMBG() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        // 根据id查询数据
        /*Emp emp = mapper.selectByPrimaryKey(1);
        System.out.println(emp);*/
        // 查询所有数据
        /*List<Emp> list = mapper.selectByExample(null);
        list.forEach(System.out::println);*/
        // 根据条件查询数据
        /*EmpExample example = new EmpExample();
        example.createCriteria().andEmpNameEqualTo("张三").andAgeGreaterThanOrEqualTo(20);
        example.or().andGenderEqualTo("男");
        List<Emp> list = mapper.selectByExample(example);
        list.forEach(System.out::println);*/
        Emp emp = new Emp(1, "小黑", null, "女");
        // 测试普通修改功能
        // mapper.updateByPrimaryKey(emp);
        // 选择性修改
        mapper.updateByPrimaryKeySelective(emp);
    }
}
