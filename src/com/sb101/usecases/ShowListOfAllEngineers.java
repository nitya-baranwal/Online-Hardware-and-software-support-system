package com.sb101.usecases;

import java.util.List;

import com.sb101.beans.Engineer;
import com.sb101.dao.HodDAO;
import com.sb101.dao.HodDAOImpl;
import com.sb101.exceptions.EngineerException;

public class ShowListOfAllEngineers {

     public static void main() {
    	 
    	 HodDAO dao = new HodDAOImpl();
    	 
    	 try {
			List<Engineer> engineersList = dao.listAllRegisteredEngineers();
			
			engineersList.forEach(e -> System.out.println(e));
		} catch (EngineerException e) {
			
			System.out.println(e.getMessage());
		}
    	 
    	 
    	 
     }
}
