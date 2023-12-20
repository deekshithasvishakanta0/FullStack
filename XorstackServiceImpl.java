package xorstackService;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xorstackDao.XorstackDao;
import xorstackDomain.XorstackDomain;
import xorstackMapper.XorstackMapper;
import xorstackModel.XorstackModel;



@Service("xorstackService")

public class XorstackServiceImpl implements XorstackService{

	
	@Autowired
	XorstackDao xorstackDao;
	
	@Autowired
	XorstackMapper xorstackMapper;
	
	public XorstackServiceImpl() {
	}
	@Override
	public String savexorstack(XorstackModel xorstackModel) throws Exception {
		// TODO Auto-generated method stub 
		try {
			XorstackDomain xorstackDomain=new XorstackDomain();
			BeanUtils.copyProperties(xorstackModel, xorstackDomain);
			
			String response=xorstackDao.savexorstack(xorstackDomain);
			return response;
		}
		catch(Exception e)
		{
			
			e.getMessage();
		}
		return null;
		
	
	}
	@Override
	public String updatexorstack(XorstackModel id) throws Exception {
		// TODO Auto-generated method stub
		try {
			XorstackDomain xorstackDomain = new XorstackDomain();
		BeanUtils.copyProperties(id, xorstackDomain);
		
		
		return XorstackDao.updatexorstack(xorstackDomain);
	} 
		
		catch(Exception e)
		{
			e.getMessage();	
		}
		return null;
	}
	@Override
	public String deletexorstack(int id) throws Exception {
		// TODO Auto-generated method stub
		return xorstackDao.deletexorstack(id);
	}
	
	
	@Override
	public XorstackModel getxorstack(int id) throws Exception {
		// TODO Auto-generated method stub
		
		XorstackDomain xorstackDomain = xorstackDao.getxorstack(id);
		XorstackModel xorstackModel = new XorstackModel();
		
		if (xorstackDomain == null) {
			
			return null;
		}
		
		BeanUtils.copyProperties(xorstackDomain,xorstackModel);
		
		return xorstackModel;
	}
	@Override
	public List<XorstackModel> getxorstack() throws Exception
	{
		// TODO Auto-generated method stub
		List<XorstackDomain> xorstackDomain = xorstackDao.getxorstack();
		
		return xorstackMapper.entityList(xorstackDomain);
		
		
		
	}
	
	
}

