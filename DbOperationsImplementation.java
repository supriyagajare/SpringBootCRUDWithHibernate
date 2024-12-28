package Repository;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.example.Entity.User;

import config.HibernateConfig;

@Repository
public class DbOperationsImplementation implements DbOperations
{

	@Override
	public User getUserDetails(Long id) 
	{
		User us = new User();
		try ( 
				Session session = HibernateConfig.getSessionFactory().openSession()  //This is Try with Resources , This is mostly used 
			)		
		{
			
//			INSERT************************************************
			
//			us.setName("Sarika");
//			us.setEmail("sari@mm.com");
//			us.setPassword("sarika@123");
//			us.setGender("Female");
//			us.setCity("Sangli");

//			session.save(us);
			
			
//			SELECT***************************************************
			
			us = session.get(User.class, id);		//SELECT
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return us;
	}

	
}
