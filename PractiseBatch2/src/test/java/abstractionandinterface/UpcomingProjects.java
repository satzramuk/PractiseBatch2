package abstractionandinterface;

public interface UpcomingProjects {
	
	String upcomingprojects ="New System";
	
	public abstract void demoproject();

	
	
	default void emp() {
		System.out.println("Employees");
	}

}
