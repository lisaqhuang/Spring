package tw.hibernatedemo.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
	
	@Autowired
	private SessionFactory factory;
	
	
	
	public Member findByNameAndPassword(String memberName,String memberPwd) {
		Session session = factory.getCurrentSession();
		String queryStr = "from Member m where m.memberName = :pName and m.memberPwd = :pwd";
		
		try {
			Member result = session.createQuery(queryStr, Member.class)
					        .setParameter("pName", memberName)
					        .setParameter("pwd", memberPwd)
					        .getSingleResult();
			return result;
		} catch (Exception e) {
			
			System.out.println("沒有這筆資料");
			System.out.println(e);
			return null;
		}
		
	}

}
