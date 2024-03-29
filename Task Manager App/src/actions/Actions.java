package actions;

public abstract class Actions {
	public static final int CREATE_NEW_TASK = 1;
	public static final int VIEW_TASK = 2;
	public static final int VIEW_ALL_TASKS = 3;
	public static final int MODIFY_TASK = 4;
	public static final int DELETE_TASK = 5;
	public static final int SORT_TASKS = 6;
	public static final int FILTER_TASKS = 7;
	public static final int DOWNLOAD = 8;
	public static final int QUIT = 9;
	
	
	public abstract void displayMessage();
	
	public abstract String userInput();
	
	public abstract void doAction(String action);

}