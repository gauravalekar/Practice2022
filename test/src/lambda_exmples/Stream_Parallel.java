package lambda_exmples;

import java.util.Arrays;
import java.util.List;

class student {
	String name;
	int score;
	
	
	student(String name, int score){
		
		this.name = name;
		this.score = score;		
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}
	
}

public class Stream_Parallel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<student> stlist = Arrays.asList(
								new student("david",82),
								new student("bob",90),
								new student("john",65),
								new student("eric",85));

		// Sequential stream
//		stlist.stream().filter(s->s.getScore()>=80).limit(3).forEach(st->System.out.println(st.getName()+" "+st.getScore()));
		
		
		// Parallel stream
		
		stlist.parallelStream().filter(ss->ss.getScore()>=80).limit(3).forEach(stt->System.out.println(stt.getName()+"  "+stt.getScore()));
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
				
				
				
				
				
				
				
		

	}

}
