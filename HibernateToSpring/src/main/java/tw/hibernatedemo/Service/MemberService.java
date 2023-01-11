package tw.hibernatedemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tw.hibernatedemo.model.Member;
import tw.hibernatedemo.model.MemberDao;

@Service
@Transactional(readOnly=true)
public class MemberService {
	
	@Autowired
	private MemberDao mDao;
	
//	public MemberService() {
//		
//		this.mDao = new MemberDao();//此處不用session因為filter處開session
//	}

	public Member checkLogin(String loginName,String loginPwd) {
		
		Member member = mDao.findByNameAndPassword(loginName, loginPwd);
		
		if(member != null) {
			return member;
		}
		return null;
	}
}
