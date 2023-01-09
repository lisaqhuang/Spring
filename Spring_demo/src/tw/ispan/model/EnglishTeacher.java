package tw.ispan.model;

public class EnglishTeacher implements Teacher {

	@Override
	public void teach(String content) {
		
		System.out.println("Teach English" + content);

	}

}
