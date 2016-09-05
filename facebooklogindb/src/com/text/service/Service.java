package com.text.service;


	import com.text.bean.Loginbean;
	import com.text.db.Adduser;

	public class Service {
		public void registeruser(Loginbean user)
		{
			Adduser objRegister=new Adduser();
			 String returnmsg=objRegister.RegisterDb(user);
			
			
		}


	
	
}
