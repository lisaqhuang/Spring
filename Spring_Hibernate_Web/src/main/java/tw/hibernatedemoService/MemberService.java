package tw.hibernatedemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.hibernatedemo.model.Member;
import tw.hibernatedemo.model.MemberDao;

@Service
public class MemberService {
	
	@Autowired
	private MemberDao mDao;
	
	public MemberService() {
		
		this.mDao = new MemberDao();//此處不用session因為filter處開session
	}

	public Member checkLogin(String loginName,String loginPwd) {
		
		Member member = mDao.findByNameAndPassword(loginName, loginPwd);
		
		if(member != null) {
			return member;
		}
		return null;
	}
}
