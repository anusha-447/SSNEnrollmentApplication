package com.ssa.generators;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class SSNGenerator implements IdentifierGenerator  {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix = "532112";
	    Connection connection = session.connection();
		
		try {
	        Statement statement=connection.createStatement();

	        ResultSet rs=statement.executeQuery("select MAX(ssn_number) as Id from user_enrollment");

	        if(rs.next())
	        {
	            Long id=rs.getLong(1)+1;
	           
	            String generatedId = prefix + new Long(id).toString();
	            return Long.parseLong(generatedId);
	        }
	    } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
		return null;
	}

}
