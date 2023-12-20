package xorstackMapper;

import java.util.List;


import org.springframework.stereotype.Component;

import com.atpl.demo.mapper.AbstractModelMapper;

import xorstackDomain.XorstackDomain;
import xorstackModel.XorstackModel;

@Component
public class XorstackMapper extends AbstractModelMapper<XorstackModel, XorstackDomain>
{

	public Class<XorstackModel> entityType() {
		// TODO Auto-generated method stub
		return XorstackModel.class;
	}

	public Class<XorstackDomain> modelType() {
		// TODO Auto-generated method stub
		return XorstackDomain.class;
	}

	public List<XorstackModel> entityList(List<XorstackDomain> xorstackDomain) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
