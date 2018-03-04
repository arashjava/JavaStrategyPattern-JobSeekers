package strategy;

public interface Jobs {
   String job();
}


class JavaDev implements Jobs{
	public String job() {
		return "Java Developer";
	}
}


class JavaFullStack implements Jobs{
	public String job() {
		return "Java Full-Stack Developer";
	}
}

class PhpJavaFullStack implements Jobs{
	public String job() {
		return "PHP-Java Full-Stack Developer";
	}
}

class PythonJavaFullStack implements Jobs{
	public String job() {
		return "Python-Java Full-Stack Developer";
	}
}

class PythonFullStack implements Jobs{
	public String job() {
		return "Python Full-Stack Developer";
	}
}

class PythonDev implements Jobs{
	public String job() {
		return "Python Full-Stack Developer";
	}
}

class PhpFullStack implements Jobs{
	public String job() {
		return "PHP Full-Stack Developer";
	}
}

class PhpPythonFullStack implements Jobs{
	public String job() {
		return "PHP-Python Full-Stack Developer";
	}
}

