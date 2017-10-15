package	is.ru.hugb;

public	class	HelloWorld	{
	public	static	String	today()	{
					DateTime	today	=	new	DateTime();
					return	today.dayOfWeek().getAsText();
	}
	public	static	void	main(String[]	args)	{
		get("/",	(req,	res)	->	today());
	}
}
