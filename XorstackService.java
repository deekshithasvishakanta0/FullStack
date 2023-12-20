package xorstackService;


import java.util.List;

import xorstackModel.XorstackModel;

public interface XorstackService {

	public String savexorstack(XorstackModel xorstackModel)throws Exception;

	public String updatexorstack(XorstackModel id) throws Exception;
	
	public String deletexorstack(int id) throws Exception;
	
	public XorstackModel getxorstack(int id) throws Exception;
	
	public List<XorstackModel> getxorstack() throws Exception;
	
}
