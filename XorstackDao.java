 package xorstackDao;

import java.util.List;

import xorstackDomain.XorstackDomain;

public interface XorstackDao {
	
	public String savexorstack(XorstackDomain xorstackDomain)throws Exception;
	
	public String updatexorstack(XorstackDomain id) throws Exception;
	
	public String deletexorstack(int id) throws Exception;
	
	public XorstackDomain getxorstack(int id) throws Exception;
	
	public List<XorstackDomain> getxorstack() throws Exception;

}
