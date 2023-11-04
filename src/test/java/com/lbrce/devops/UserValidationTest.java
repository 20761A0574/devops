package com.lbrce.devops;
import org.testng.Assert;
import org.testng.annotations.Test;
public class UserValidationTest {
	
		@Test

		public void testCase1()

		{

			UserValidation uv=new UserValidation();

			Assert.assertEquals(false,uv.check("sravanthi","sravanthi@43"));

		}

		public void testCase2()

		{

			UserValidation uv=new UserValidation();

			Assert.assertEquals(false,uv.check("sravanthi","sravanthi@44"));

		}

		public void testCase3()

		{

			UserValidation uv=new UserValidation();

			Assert.assertEquals(true,uv.check("sravanthi","sravanthi@45"));

		}

		public void testCase4()

		{

			UserValidation uv=new UserValidation();

			Assert.assertEquals(false,uv.check("sravanthi","sravanthi@46"));

		}



	}
