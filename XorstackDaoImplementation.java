package xorstackDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.atpl.demo.exception.MmgRestException.DELETE_FAILED;
import com.atpl.demo.exception.MmgRestException.UPDATE_FAILED;

import xorstackDomain.XorstackDomain;




@Repository
public class XorstackDaoImplementation implements XorstackDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public String savexorstack(XorstackDomain xorstackDomain) throws Exception {
		
		try {

			String sql = "insert into xorstack(id,firstName,middleName,lastName) values(?,?,?,?)";

			int res = jdbcTemplate.update(sql, new Object[] { xorstackDomain.getId(), xorstackDomain.getFirstName(),
					xorstackDomain.getMiddleName(), xorstackDomain.getLastName() });
			if (res == 1)
			{
				
				return "Success";

			} else
			{
				
				return "Failure";
			
			}
		}
		catch (Exception e) 
		{

			e.getMessage();
		}

		return null;
	}
	
	@Override
	public String updatexorstack(XorstackDomain xorstackDomain) throws Exception {
		try {
			
			String sql = "UPDATE xorstack SET firstName=?, lastName=?, middleName=? where id = ?";
			int res = jdbcTemplate.update(sql, new Object[] { xorstackDomain.getFirstName(),xorstackDomain.getLastName()
					,xorstackDomain.getMiddleName(), xorstackDomain.getId()});
			if (res == 1) 
			{
				
				return "Updated Successfully";
			}
			else
				
				throw new UPDATE_FAILED("Deekshitha Update Failed");
		} 
		catch (Exception e) 
		{
		e.getMessage();
			
			throw new BACKEND_SERVER_ERROR();
		}
	}

	@Override
	public String deletexorstack(int id) throws Exception {
		// TODO Auto-generated method stub
		try {
			String sql = "DELETE FROM xorstack WHERE id=?";
			int res = jdbcTemplate.update(sql, new Object[] { id });
			
			if (res == 1) 
			{
				
				return "Deleted successfully";
			}
			else
				
				throw new DELETE_FAILED("xorstack Delete Failed");
		} 
		catch (Exception e)
		{
			e.getMessage();
			
			throw new BACKEND_SERVER_ERROR();
		}
			
	}

	@Override
	public XorstackDomain getxorstack(int id) throws Exception {
		// TODO Auto-generated method stub
		try {
			
			String sql = "SELECT * FROM xorstack where id=?";
			 
			return (XorstackDomain) jdbcTemplate.queryForObject(sql, new Object[] { id },
					new BeanPropertyRowMapper<XorstackDomain>(XorstackDomain.class));
		} 
		catch (EmptyResultDataAccessException e) 
		{
			
			e.getMessage();
		
		}
		return null;
		
	}

	@Override
	public List<XorstackDomain> getxorstack() throws Exception {
		// TODO Auto-generated method stub
		
		try {
			String sql = "SELECT * FROM xorstack";
			List<XorstackDomain> bank = jdbcTemplate.query(sql, new Object[] {},
					new BeanPropertyRowMapper<XorstackDomain>(XorstackDomain.class));
			
			return bank;
		}
		catch (EmptyResultDataAccessException e) 
		{
			e.getMessage();
		} 

		return null;
	}

}
