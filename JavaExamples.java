public class JavaExamples
{
	int questionNo;
	string category;
	String text;
	
	
	public void setQuestionNo(int Qno)
	{
	  this.questionNo=Qno;
		
	}
	public void setCategory(String category)
	{
		this.category=category;
		
	}
	public void setText(String text)
	{
		this.text=text;
		
	}
	
	public int getQuestionNo()
	{
	      return questionNo;
	} 
	public String getCategory()
	{
		return category;
	}
	public String getText()
	{   
	    return text ; 
	}
	
	public void addQuestionNo(int QuestionNo)
	{
		 this.questionNo=QuestionNo;	
		 
	
	}
	public void removeQuestionNo()
	{
		 this.questionNo=0;	
		 
	
	}
	public void editQuestionNo(int QuestionNo)
	{
		 this.questionNo=QuestionNo;	
		 
	
	}
	
}	